package typings.awsSdk.chimeMod

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
  var Content: js.UndefOr[typings.awsSdk.chimeMod.Content] = js.undefined
  
  /**
    * The time at which the message was created.
    */
  var CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The time at which a message was edited.
    */
  var LastEditedTimestamp: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The time at which a message was updated.
    */
  var LastUpdatedTimestamp: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The ID of a message.
    */
  var MessageId: js.UndefOr[typings.awsSdk.chimeMod.MessageId] = js.undefined
  
  /**
    * The message metadata.
    */
  var Metadata: js.UndefOr[typings.awsSdk.chimeMod.Metadata] = js.undefined
  
  var Persistence: js.UndefOr[ChannelMessagePersistenceType] = js.undefined
  
  /**
    * Hides the content of a message. The message still exists on the back end, but this action only returns metadata.
    */
  var Redacted: js.UndefOr[NonNullableBoolean] = js.undefined
  
  /**
    * The message sender.
    */
  var Sender: js.UndefOr[Identity] = js.undefined
  
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
    
    inline def setCreatedTimestamp(value: Timestamp): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setLastEditedTimestamp(value: Timestamp): Self = StObject.set(x, "LastEditedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastEditedTimestampUndefined: Self = StObject.set(x, "LastEditedTimestamp", js.undefined)
    
    inline def setLastUpdatedTimestamp(value: Timestamp): Self = StObject.set(x, "LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "LastUpdatedTimestamp", js.undefined)
    
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
    
    inline def setType(value: ChannelMessageType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
