package typings.awsSdk.chimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelMessage extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The message content.
    */
  var Content: js.UndefOr[typings.awsSdk.chimesdkmessagingMod.Content] = js.undefined
  
  /**
    * The time at which the message was created.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time at which a message was edited.
    */
  var LastEditedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time at which a message was updated.
    */
  var LastUpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The attributes for the message, used for message filtering along with a FilterRule defined in the PushNotificationPreferences.
    */
  var MessageAttributes: js.UndefOr[MessageAttributeMap] = js.undefined
  
  /**
    * The ID of a message.
    */
  var MessageId: js.UndefOr[typings.awsSdk.chimesdkmessagingMod.MessageId] = js.undefined
  
  /**
    * The message metadata.
    */
  var Metadata: js.UndefOr[typings.awsSdk.chimesdkmessagingMod.Metadata] = js.undefined
  
  /**
    * The persistence setting for a channel message.
    */
  var Persistence: js.UndefOr[ChannelMessagePersistenceType] = js.undefined
  
  /**
    * Hides the content of a message.
    */
  var Redacted: js.UndefOr[NonNullableBoolean] = js.undefined
  
  /**
    * The message sender.
    */
  var Sender: js.UndefOr[Identity] = js.undefined
  
  /**
    * The status of the channel message.
    */
  var Status: js.UndefOr[ChannelMessageStatusStructure] = js.undefined
  
  /**
    * The ID of the SubChannel.
    */
  var SubChannelId: js.UndefOr[typings.awsSdk.chimesdkmessagingMod.SubChannelId] = js.undefined
  
  /**
    * The message type.
    */
  var Type: js.UndefOr[ChannelMessageType] = js.undefined
}
object ChannelMessage {
  
  inline def apply(): ChannelMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelMessage]
  }
  
  extension [Self <: ChannelMessage](x: Self) {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChannelArnUndefined: Self = StObject.set(x, "ChannelArn", js.undefined)
    
    inline def setContent(value: Content): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setLastEditedTimestamp(value: js.Date): Self = StObject.set(x, "LastEditedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastEditedTimestampUndefined: Self = StObject.set(x, "LastEditedTimestamp", js.undefined)
    
    inline def setLastUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "LastUpdatedTimestamp", js.undefined)
    
    inline def setMessageAttributes(value: MessageAttributeMap): Self = StObject.set(x, "MessageAttributes", value.asInstanceOf[js.Any])
    
    inline def setMessageAttributesUndefined: Self = StObject.set(x, "MessageAttributes", js.undefined)
    
    inline def setMessageId(value: MessageId): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "MessageId", js.undefined)
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    inline def setPersistence(value: ChannelMessagePersistenceType): Self = StObject.set(x, "Persistence", value.asInstanceOf[js.Any])
    
    inline def setPersistenceUndefined: Self = StObject.set(x, "Persistence", js.undefined)
    
    inline def setRedacted(value: NonNullableBoolean): Self = StObject.set(x, "Redacted", value.asInstanceOf[js.Any])
    
    inline def setRedactedUndefined: Self = StObject.set(x, "Redacted", js.undefined)
    
    inline def setSender(value: Identity): Self = StObject.set(x, "Sender", value.asInstanceOf[js.Any])
    
    inline def setSenderUndefined: Self = StObject.set(x, "Sender", js.undefined)
    
    inline def setStatus(value: ChannelMessageStatusStructure): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setSubChannelId(value: SubChannelId): Self = StObject.set(x, "SubChannelId", value.asInstanceOf[js.Any])
    
    inline def setSubChannelIdUndefined: Self = StObject.set(x, "SubChannelId", js.undefined)
    
    inline def setType(value: ChannelMessageType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
