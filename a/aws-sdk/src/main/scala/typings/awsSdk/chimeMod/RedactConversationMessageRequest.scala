package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedactConversationMessageRequest extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  
  /**
    * The conversation ID.
    */
  var ConversationId: NonEmptyString = js.native
  
  /**
    * The message ID.
    */
  var MessageId: NonEmptyString = js.native
}
object RedactConversationMessageRequest {
  
  @scala.inline
  def apply(AccountId: NonEmptyString, ConversationId: NonEmptyString, MessageId: NonEmptyString): RedactConversationMessageRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], ConversationId = ConversationId.asInstanceOf[js.Any], MessageId = MessageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedactConversationMessageRequest]
  }
  
  @scala.inline
  implicit class RedactConversationMessageRequestMutableBuilder[Self <: RedactConversationMessageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversationId(value: NonEmptyString): Self = StObject.set(x, "ConversationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageId(value: NonEmptyString): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
  }
}
