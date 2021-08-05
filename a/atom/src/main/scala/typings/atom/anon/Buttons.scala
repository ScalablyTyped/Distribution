package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buttons extends StObject {
  
  var buttons: js.UndefOr[js.Array[String]] = js.undefined
  
  var detailedMessage: js.UndefOr[String] = js.undefined
  
  var message: String
}
object Buttons {
  
  inline def apply(message: String): Buttons = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buttons]
  }
  
  extension [Self <: Buttons](x: Self) {
    
    inline def setButtons(value: js.Array[String]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: String*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    inline def setDetailedMessage(value: String): Self = StObject.set(x, "detailedMessage", value.asInstanceOf[js.Any])
    
    inline def setDetailedMessageUndefined: Self = StObject.set(x, "detailedMessage", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
