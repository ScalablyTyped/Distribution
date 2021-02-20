package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelMessageSummary extends StObject {
  
  /**
    * The content of the message summary.
    */
  var Content: js.UndefOr[typings.awsSdk.chimeMod.Content] = js.native
  
  /**
    * The time at which the message summary was created.
    */
  var CreatedTimestamp: js.UndefOr[Timestamp] = js.native
  
  var LastEditedTimestamp: js.UndefOr[Timestamp] = js.native
  
  var LastUpdatedTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * The ID of the message summary.
    */
  var MessageId: js.UndefOr[typings.awsSdk.chimeMod.MessageId] = js.native
  
  /**
    * The metadata of the message summary.
    */
  var Metadata: js.UndefOr[typings.awsSdk.chimeMod.Metadata] = js.native
  
  /**
    * Redacts the content of a message summary.
    */
  var Redacted: js.UndefOr[NonNullableBoolean] = js.native
  
  /**
    * The sender of the message summary.
    */
  var Sender: js.UndefOr[Identity] = js.native
  
  /**
    * The type of message summary.
    */
  var Type: js.UndefOr[ChannelMessageType] = js.native
}
object ChannelMessageSummary {
  
  @scala.inline
  def apply(): ChannelMessageSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelMessageSummary]
  }
  
  @scala.inline
  implicit class ChannelMessageSummaryMutableBuilder[Self <: ChannelMessageSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: Content): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    @scala.inline
    def setCreatedTimestamp(value: Timestamp): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setLastEditedTimestamp(value: Timestamp): Self = StObject.set(x, "LastEditedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastEditedTimestampUndefined: Self = StObject.set(x, "LastEditedTimestamp", js.undefined)
    
    @scala.inline
    def setLastUpdatedTimestamp(value: Timestamp): Self = StObject.set(x, "LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "LastUpdatedTimestamp", js.undefined)
    
    @scala.inline
    def setMessageId(value: MessageId): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageIdUndefined: Self = StObject.set(x, "MessageId", js.undefined)
    
    @scala.inline
    def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    @scala.inline
    def setRedacted(value: NonNullableBoolean): Self = StObject.set(x, "Redacted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedactedUndefined: Self = StObject.set(x, "Redacted", js.undefined)
    
    @scala.inline
    def setSender(value: Identity): Self = StObject.set(x, "Sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderUndefined: Self = StObject.set(x, "Sender", js.undefined)
    
    @scala.inline
    def setType(value: ChannelMessageType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
