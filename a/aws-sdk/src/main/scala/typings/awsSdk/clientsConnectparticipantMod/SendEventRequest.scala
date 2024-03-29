package typings.awsSdk.clientsConnectparticipantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendEventRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see Making retries safe with idempotent APIs.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsConnectparticipantMod.ClientToken] = js.undefined
  
  /**
    * The authentication token associated with the participant's connection.
    */
  var ConnectionToken: ParticipantToken
  
  /**
    * The content of the event to be sent (for example, message text). For content related to message receipts, this is supported in the form of a JSON string. Sample Content: "{\"messageId\":\"11111111-aaaa-bbbb-cccc-EXAMPLE01234\"}"
    */
  var Content: js.UndefOr[ChatContent] = js.undefined
  
  /**
    * The content type of the request. Supported types are:   application/vnd.amazonaws.connect.event.typing   application/vnd.amazonaws.connect.event.connection.acknowledged   application/vnd.amazonaws.connect.event.message.delivered   application/vnd.amazonaws.connect.event.message.read  
    */
  var ContentType: ChatContentType
}
object SendEventRequest {
  
  inline def apply(ConnectionToken: ParticipantToken, ContentType: ChatContentType): SendEventRequest = {
    val __obj = js.Dynamic.literal(ConnectionToken = ConnectionToken.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendEventRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendEventRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setConnectionToken(value: ParticipantToken): Self = StObject.set(x, "ConnectionToken", value.asInstanceOf[js.Any])
    
    inline def setContent(value: ChatContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: ChatContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
  }
}
