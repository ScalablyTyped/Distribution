package typings.awsSdk.clientsLexruntimev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Button extends StObject {
  
  /**
    * The text that is displayed on the button.
    */
  var text: ButtonText
  
  /**
    * The value returned to Amazon Lex V2 when a user chooses the button.
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
