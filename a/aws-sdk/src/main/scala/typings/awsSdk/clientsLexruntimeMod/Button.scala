package typings.awsSdk.clientsLexruntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Button extends StObject {
  
  /**
    * Text that is visible to the user on the button.
    */
  var text: ButtonTextStringWithLength
  
  /**
    * The value sent to Amazon Lex when a user chooses the button. For example, consider button text "NYC." When the user chooses the button, the value sent can be "New York City."
    */
  var value: ButtonValueStringWithLength
}
object Button {
  
  inline def apply(text: ButtonTextStringWithLength, value: ButtonValueStringWithLength): Button = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
  
  extension [Self <: Button](x: Self) {
    
    inline def setText(value: ButtonTextStringWithLength): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ButtonValueStringWithLength): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
