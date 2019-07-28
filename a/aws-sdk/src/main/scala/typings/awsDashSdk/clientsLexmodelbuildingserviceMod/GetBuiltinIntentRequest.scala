package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBuiltinIntentRequest extends js.Object {
  /**
    * The unique identifier for a built-in intent. To find the signature for an intent, see Standard Built-in Intents in the Alexa Skills Kit.
    */
  var signature: BuiltinIntentSignature
}

object GetBuiltinIntentRequest {
  @scala.inline
  def apply(signature: BuiltinIntentSignature): GetBuiltinIntentRequest = {
    val __obj = js.Dynamic.literal(signature = signature)
  
    __obj.asInstanceOf[GetBuiltinIntentRequest]
  }
}

