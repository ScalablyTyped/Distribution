package typings.awsSdk.clientsStsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecodeAuthorizationMessageResponse extends StObject {
  
  /**
    * The API returns a response with the decoded message.
    */
  var DecodedMessage: js.UndefOr[decodedMessageType] = js.undefined
}
object DecodeAuthorizationMessageResponse {
  
  inline def apply(): DecodeAuthorizationMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecodeAuthorizationMessageResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DecodeAuthorizationMessageResponse] (val x: Self) extends AnyVal {
    
    inline def setDecodedMessage(value: decodedMessageType): Self = StObject.set(x, "DecodedMessage", value.asInstanceOf[js.Any])
    
    inline def setDecodedMessageUndefined: Self = StObject.set(x, "DecodedMessage", js.undefined)
  }
}
