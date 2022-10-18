package typings.actionsOnGoogle.distServiceDialogflowApiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogflowV1Button extends StObject {
  
  var postback: js.UndefOr[String] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object DialogflowV1Button {
  
  inline def apply(): DialogflowV1Button = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1Button]
  }
  
  extension [Self <: DialogflowV1Button](x: Self) {
    
    inline def setPostback(value: String): Self = StObject.set(x, "postback", value.asInstanceOf[js.Any])
    
    inline def setPostbackUndefined: Self = StObject.set(x, "postback", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
