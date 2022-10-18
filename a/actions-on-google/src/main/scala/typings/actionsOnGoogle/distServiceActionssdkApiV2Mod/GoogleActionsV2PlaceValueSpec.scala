package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2PlaceValueSpec extends StObject {
  
  /**
    * Speech configuration for askForPlace dialog. The extension should be used
    * to define the PlaceDialogSpec configuration.
    */
  var dialogSpec: js.UndefOr[GoogleActionsV2DialogSpec] = js.undefined
}
object GoogleActionsV2PlaceValueSpec {
  
  inline def apply(): GoogleActionsV2PlaceValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2PlaceValueSpec]
  }
  
  extension [Self <: GoogleActionsV2PlaceValueSpec](x: Self) {
    
    inline def setDialogSpec(value: GoogleActionsV2DialogSpec): Self = StObject.set(x, "dialogSpec", value.asInstanceOf[js.Any])
    
    inline def setDialogSpecUndefined: Self = StObject.set(x, "dialogSpec", js.undefined)
  }
}
