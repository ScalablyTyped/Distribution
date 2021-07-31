package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateChannelMessageRequest extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: ChimeArn
  
  /**
    * The content of the message being updated.
    */
  var Content: js.UndefOr[typings.awsSdk.chimeMod.Content] = js.undefined
  
  /**
    * The ID string of the message being updated.
    */
  var MessageId: typings.awsSdk.chimeMod.MessageId
  
  /**
    * The metadata of the message being updated.
    */
  var Metadata: js.UndefOr[typings.awsSdk.chimeMod.Metadata] = js.undefined
}
object UpdateChannelMessageRequest {
  
  @scala.inline
  def apply(ChannelArn: ChimeArn, MessageId: MessageId): UpdateChannelMessageRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any], MessageId = MessageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateChannelMessageRequest]
  }
  
  @scala.inline
  implicit class UpdateChannelMessageRequestMutableBuilder[Self <: UpdateChannelMessageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: Content): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    @scala.inline
    def setMessageId(value: MessageId): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
  }
}
