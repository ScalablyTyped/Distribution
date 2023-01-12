package typings.awsSdk.clientsStsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecodeAuthorizationMessageRequest extends StObject {
  
  /**
    * The encoded message that was returned with the response.
    */
  var EncodedMessage: encodedMessageType
}
object DecodeAuthorizationMessageRequest {
  
  inline def apply(EncodedMessage: encodedMessageType): DecodeAuthorizationMessageRequest = {
    val __obj = js.Dynamic.literal(EncodedMessage = EncodedMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodeAuthorizationMessageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DecodeAuthorizationMessageRequest] (val x: Self) extends AnyVal {
    
    inline def setEncodedMessage(value: encodedMessageType): Self = StObject.set(x, "EncodedMessage", value.asInstanceOf[js.Any])
  }
}
