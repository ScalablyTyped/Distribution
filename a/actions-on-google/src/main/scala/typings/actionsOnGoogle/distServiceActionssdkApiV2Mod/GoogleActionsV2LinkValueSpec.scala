package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2LinkValueSpec extends StObject {
  
  var dialogSpec: js.UndefOr[GoogleActionsV2DialogSpec] = js.undefined
  
  /**
    * Destination that the app should link to. Could be a web URL, a
    * conversational link or an Android intent. A web URL is used to handoff the
    * flow to some website. A conversational link is used to provide a deep link
    * into another AoG app. An Android intent URI is used to trigger an Android
    * intent. This requires the package_name to be specified.
    */
  var openUrlAction: js.UndefOr[GoogleActionsV2UiElementsOpenUrlAction] = js.undefined
}
object GoogleActionsV2LinkValueSpec {
  
  inline def apply(): GoogleActionsV2LinkValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2LinkValueSpec]
  }
  
  extension [Self <: GoogleActionsV2LinkValueSpec](x: Self) {
    
    inline def setDialogSpec(value: GoogleActionsV2DialogSpec): Self = StObject.set(x, "dialogSpec", value.asInstanceOf[js.Any])
    
    inline def setDialogSpecUndefined: Self = StObject.set(x, "dialogSpec", js.undefined)
    
    inline def setOpenUrlAction(value: GoogleActionsV2UiElementsOpenUrlAction): Self = StObject.set(x, "openUrlAction", value.asInstanceOf[js.Any])
    
    inline def setOpenUrlActionUndefined: Self = StObject.set(x, "openUrlAction", js.undefined)
  }
}
