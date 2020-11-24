package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelMessage extends js.Object {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.native
  
  /**
    * The message content.
    */
  var Content: js.UndefOr[typings.awsSdk.chimeMod.Content] = js.native
  
  /**
    * The time at which the message was created.
    */
  var CreatedTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * The time at which a message was edited.
    */
  var LastEditedTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * The time at which a message was updated.
    */
  var LastUpdatedTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * The ID of a message.
    */
  var MessageId: js.UndefOr[typings.awsSdk.chimeMod.MessageId] = js.native
  
  /**
    * The message metadata.
    */
  var Metadata: js.UndefOr[typings.awsSdk.chimeMod.Metadata] = js.native
  
  var Persistence: js.UndefOr[ChannelMessagePersistenceType] = js.native
  
  /**
    * Hides the content of a message. The message still exists on the back end, but this action only returns metadata.
    */
  var Redacted: js.UndefOr[NonNullableBoolean] = js.native
  
  /**
    * The message sender.
    */
  var Sender: js.UndefOr[Identity] = js.native
  
  /**
    * The message type.
    */
  var Type: js.UndefOr[ChannelMessageType] = js.native
}
object ChannelMessage {
  
  @scala.inline
  def apply(): ChannelMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelMessage]
  }
  
  @scala.inline
  implicit class ChannelMessageOps[Self <: ChannelMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = this.set("ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelArn: Self = this.set("ChannelArn", js.undefined)
    
    @scala.inline
    def setContent(value: Content): Self = this.set("Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("Content", js.undefined)
    
    @scala.inline
    def setCreatedTimestamp(value: Timestamp): Self = this.set("CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTimestamp: Self = this.set("CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setLastEditedTimestamp(value: Timestamp): Self = this.set("LastEditedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastEditedTimestamp: Self = this.set("LastEditedTimestamp", js.undefined)
    
    @scala.inline
    def setLastUpdatedTimestamp(value: Timestamp): Self = this.set("LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedTimestamp: Self = this.set("LastUpdatedTimestamp", js.undefined)
    
    @scala.inline
    def setMessageId(value: MessageId): Self = this.set("MessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageId: Self = this.set("MessageId", js.undefined)
    
    @scala.inline
    def setMetadata(value: Metadata): Self = this.set("Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("Metadata", js.undefined)
    
    @scala.inline
    def setPersistence(value: ChannelMessagePersistenceType): Self = this.set("Persistence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersistence: Self = this.set("Persistence", js.undefined)
    
    @scala.inline
    def setRedacted(value: NonNullableBoolean): Self = this.set("Redacted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedacted: Self = this.set("Redacted", js.undefined)
    
    @scala.inline
    def setSender(value: Identity): Self = this.set("Sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSender: Self = this.set("Sender", js.undefined)
    
    @scala.inline
    def setType(value: ChannelMessageType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
