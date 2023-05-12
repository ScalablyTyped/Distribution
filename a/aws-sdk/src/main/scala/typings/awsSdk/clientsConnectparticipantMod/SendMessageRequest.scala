package typings.awsSdk.clientsConnectparticipantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendMessageRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see Making retries safe with idempotent APIs.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsConnectparticipantMod.ClientToken] = js.undefined
  
  /**
    * The authentication token associated with the connection.
    */
  var ConnectionToken: ParticipantToken
  
  /**
    * The content of the message.    For text/plain and text/markdown, the Length Constraints are Minimum of 1, Maximum of 1024.    For application/json, the Length Constraints are Minimum of 1, Maximum of 12000.    For application/vnd.amazonaws.connect.message.interactive.response, the Length Constraints are Minimum of 1, Maximum of 12288.  
    */
  var Content: ChatContent
  
  /**
    * The type of the content. Supported types are text/plain, text/markdown, application/json, and application/vnd.amazonaws.connect.message.interactive.response.
    */
  var ContentType: ChatContentType
}
object SendMessageRequest {
  
  inline def apply(ConnectionToken: ParticipantToken, Content: ChatContent, ContentType: ChatContentType): SendMessageRequest = {
    val __obj = js.Dynamic.literal(ConnectionToken = ConnectionToken.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendMessageRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setConnectionToken(value: ParticipantToken): Self = StObject.set(x, "ConnectionToken", value.asInstanceOf[js.Any])
    
    inline def setContent(value: ChatContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: ChatContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
  }
}
