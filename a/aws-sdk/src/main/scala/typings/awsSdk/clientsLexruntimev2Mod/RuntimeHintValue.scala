package typings.awsSdk.clientsLexruntimev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuntimeHintValue extends StObject {
  
  /**
    * The phrase that Amazon Lex V2 should look for in the user's input to the bot.
    */
  var phrase: RuntimeHintPhrase
}
object RuntimeHintValue {
  
  inline def apply(phrase: RuntimeHintPhrase): RuntimeHintValue = {
    val __obj = js.Dynamic.literal(phrase = phrase.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeHintValue]
  }
  
  extension [Self <: RuntimeHintValue](x: Self) {
    
    inline def setPhrase(value: RuntimeHintPhrase): Self = StObject.set(x, "phrase", value.asInstanceOf[js.Any])
  }
}
