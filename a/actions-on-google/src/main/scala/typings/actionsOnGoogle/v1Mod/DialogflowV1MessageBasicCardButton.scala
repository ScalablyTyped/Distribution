package typings.actionsOnGoogle.v1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogflowV1MessageBasicCardButton extends StObject {
  
  var openUrlAction: js.UndefOr[DialogflowV1MessageBasicCardButtonAction] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object DialogflowV1MessageBasicCardButton {
  
  inline def apply(): DialogflowV1MessageBasicCardButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1MessageBasicCardButton]
  }
  
  extension [Self <: DialogflowV1MessageBasicCardButton](x: Self) {
    
    inline def setOpenUrlAction(value: DialogflowV1MessageBasicCardButtonAction): Self = StObject.set(x, "openUrlAction", value.asInstanceOf[js.Any])
    
    inline def setOpenUrlActionUndefined: Self = StObject.set(x, "openUrlAction", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
