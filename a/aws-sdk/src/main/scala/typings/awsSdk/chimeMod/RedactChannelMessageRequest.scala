package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedactChannelMessageRequest extends StObject {
  
  /**
    * The ARN of the channel containing the messages that you want to redact.
    */
  var ChannelArn: ChimeArn
  
  /**
    * The ID of the message being redacted.
    */
  var MessageId: typings.awsSdk.chimeMod.MessageId
}
object RedactChannelMessageRequest {
  
  @scala.inline
  def apply(ChannelArn: ChimeArn, MessageId: MessageId): RedactChannelMessageRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any], MessageId = MessageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedactChannelMessageRequest]
  }
  
  @scala.inline
  implicit class RedactChannelMessageRequestMutableBuilder[Self <: RedactChannelMessageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageId(value: MessageId): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
  }
}
