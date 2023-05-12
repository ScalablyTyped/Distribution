package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelMessageSummary extends StObject {
  
  /**
    * The content of the message.
    */
  var Content: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.Content] = js.undefined
  
  /**
    * The content type of the channel messsage listed in the summary.
    */
  var ContentType: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.ContentType] = js.undefined
  
  /**
    * The time at which the message summary was created.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time at which a message was last edited.
    */
  var LastEditedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time at which a message was last updated.
    */
  var LastUpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The message attribues listed in a the summary of a channel message.
    */
  var MessageAttributes: js.UndefOr[MessageAttributeMap] = js.undefined
  
  /**
    * The ID of the message.
    */
  var MessageId: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.MessageId] = js.undefined
  
  /**
    * The metadata of the message.
    */
  var Metadata: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.Metadata] = js.undefined
  
  /**
    * Indicates whether a message was redacted.
    */
  var Redacted: js.UndefOr[NonNullableBoolean] = js.undefined
  
  /**
    * The message sender.
    */
  var Sender: js.UndefOr[Identity] = js.undefined
  
  /**
    * The message status. The status value is SENT for messages sent to a channel without a channel flow. For channels associated with channel flow, the value determines the processing stage.
    */
  var Status: js.UndefOr[ChannelMessageStatusStructure] = js.undefined
  
  /**
    * The type of message.
    */
  var Type: js.UndefOr[ChannelMessageType] = js.undefined
}
object ChannelMessageSummary {
  
  inline def apply(): ChannelMessageSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelMessageSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelMessageSummary] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Content): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: ContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
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
    
    inline def setRedacted(value: NonNullableBoolean): Self = StObject.set(x, "Redacted", value.asInstanceOf[js.Any])
    
    inline def setRedactedUndefined: Self = StObject.set(x, "Redacted", js.undefined)
    
    inline def setSender(value: Identity): Self = StObject.set(x, "Sender", value.asInstanceOf[js.Any])
    
    inline def setSenderUndefined: Self = StObject.set(x, "Sender", js.undefined)
    
    inline def setStatus(value: ChannelMessageStatusStructure): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setType(value: ChannelMessageType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
