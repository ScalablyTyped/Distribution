package typings.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBuiltinIntentRequest extends StObject {
  
  /**
    * The unique identifier for a built-in intent. To find the signature for an intent, see Standard Built-in Intents in the Alexa Skills Kit.
    */
  var signature: BuiltinIntentSignature
}
object GetBuiltinIntentRequest {
  
  inline def apply(signature: BuiltinIntentSignature): GetBuiltinIntentRequest = {
    val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBuiltinIntentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBuiltinIntentRequest] (val x: Self) extends AnyVal {
    
    inline def setSignature(value: BuiltinIntentSignature): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
