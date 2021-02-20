package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2UiElementsButton extends StObject {
  
  /**
    * Action to take when a user taps on the button.
    * Required.
    */
  var openUrlAction: js.UndefOr[GoogleActionsV2UiElementsOpenUrlAction] = js.native
  
  /**
    * Title of the button.
    * Required.
    */
  var title: js.UndefOr[String] = js.native
}
object GoogleActionsV2UiElementsButton {
  
  @scala.inline
  def apply(): GoogleActionsV2UiElementsButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsButton]
  }
  
  @scala.inline
  implicit class GoogleActionsV2UiElementsButtonMutableBuilder[Self <: GoogleActionsV2UiElementsButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpenUrlAction(value: GoogleActionsV2UiElementsOpenUrlAction): Self = StObject.set(x, "openUrlAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUrlActionUndefined: Self = StObject.set(x, "openUrlAction", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
