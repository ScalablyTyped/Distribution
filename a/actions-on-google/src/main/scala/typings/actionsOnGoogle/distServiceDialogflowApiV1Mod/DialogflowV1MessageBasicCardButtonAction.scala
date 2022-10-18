package typings.actionsOnGoogle.distServiceDialogflowApiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogflowV1MessageBasicCardButtonAction extends StObject {
  
  var url: js.UndefOr[String] = js.undefined
}
object DialogflowV1MessageBasicCardButtonAction {
  
  inline def apply(): DialogflowV1MessageBasicCardButtonAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1MessageBasicCardButtonAction]
  }
  
  extension [Self <: DialogflowV1MessageBasicCardButtonAction](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
