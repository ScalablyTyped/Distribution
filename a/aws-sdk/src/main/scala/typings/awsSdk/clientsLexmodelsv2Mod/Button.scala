package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Button extends StObject {
  
  /**
    * The text that appears on the button. Use this to tell the user what value is returned when they choose this button.
    */
  var text: ButtonText
  
  /**
    * The value returned to Amazon Lex when the user chooses this button. This must be one of the slot values configured for the slot.
    */
  var value: ButtonValue
}
object Button {
  
  inline def apply(text: ButtonText, value: ButtonValue): Button = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
  
  extension [Self <: Button](x: Self) {
    
    inline def setText(value: ButtonText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ButtonValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
