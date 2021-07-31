package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetChannelMessageRequest extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: ChimeArn
  
  /**
    * The ID of the message.
    */
  var MessageId: typings.awsSdk.chimeMod.MessageId
}
object GetChannelMessageRequest {
  
  @scala.inline
  def apply(ChannelArn: ChimeArn, MessageId: MessageId): GetChannelMessageRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any], MessageId = MessageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChannelMessageRequest]
  }
  
  @scala.inline
  implicit class GetChannelMessageRequestMutableBuilder[Self <: GetChannelMessageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageId(value: MessageId): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
  }
}
