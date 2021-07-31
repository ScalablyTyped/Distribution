package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateChannelMessageResponse extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The ID string of the message being updated.
    */
  var MessageId: js.UndefOr[typings.awsSdk.chimeMod.MessageId] = js.undefined
}
object UpdateChannelMessageResponse {
  
  @scala.inline
  def apply(): UpdateChannelMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateChannelMessageResponse]
  }
  
  @scala.inline
  implicit class UpdateChannelMessageResponseMutableBuilder[Self <: UpdateChannelMessageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelArnUndefined: Self = StObject.set(x, "ChannelArn", js.undefined)
    
    @scala.inline
    def setMessageId(value: MessageId): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageIdUndefined: Self = StObject.set(x, "MessageId", js.undefined)
  }
}
