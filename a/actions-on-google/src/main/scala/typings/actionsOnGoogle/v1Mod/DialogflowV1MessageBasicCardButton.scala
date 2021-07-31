package typings.actionsOnGoogle.v1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogflowV1MessageBasicCardButton extends StObject {
  
  var openUrlAction: js.UndefOr[DialogflowV1MessageBasicCardButtonAction] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object DialogflowV1MessageBasicCardButton {
  
  @scala.inline
  def apply(): DialogflowV1MessageBasicCardButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1MessageBasicCardButton]
  }
  
  @scala.inline
  implicit class DialogflowV1MessageBasicCardButtonMutableBuilder[Self <: DialogflowV1MessageBasicCardButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpenUrlAction(value: DialogflowV1MessageBasicCardButtonAction): Self = StObject.set(x, "openUrlAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUrlActionUndefined: Self = StObject.set(x, "openUrlAction", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
