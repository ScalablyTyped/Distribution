package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2UiElementsButton extends StObject {
  
  /**
    * Action to take when a user taps on the button.
    * Required.
    */
  var openUrlAction: js.UndefOr[GoogleActionsV2UiElementsOpenUrlAction] = js.undefined
  
  /**
    * Title of the button.
    * Required.
    */
  var title: js.UndefOr[String] = js.undefined
}
object GoogleActionsV2UiElementsButton {
  
  inline def apply(): GoogleActionsV2UiElementsButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsButton]
  }
  
  extension [Self <: GoogleActionsV2UiElementsButton](x: Self) {
    
    inline def setOpenUrlAction(value: GoogleActionsV2UiElementsOpenUrlAction): Self = StObject.set(x, "openUrlAction", value.asInstanceOf[js.Any])
    
    inline def setOpenUrlActionUndefined: Self = StObject.set(x, "openUrlAction", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
