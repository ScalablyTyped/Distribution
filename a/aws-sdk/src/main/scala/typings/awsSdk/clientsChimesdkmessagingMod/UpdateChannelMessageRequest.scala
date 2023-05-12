package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateChannelMessageRequest extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: ChimeArn
  
  /**
    * The ARN of the AppInstanceUser or AppInstanceBot that makes the API call.
    */
  var ChimeBearer: ChimeArn
  
  /**
    * The content of the message being updated.
    */
  var Content: NonEmptyContent
  
  /**
    * The content type of the channel message.
    */
  var ContentType: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.ContentType] = js.undefined
  
  /**
    * The ID string of the message being updated.
    */
  var MessageId: typings.awsSdk.clientsChimesdkmessagingMod.MessageId
  
  /**
    * The metadata of the message being updated.
    */
  var Metadata: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.Metadata] = js.undefined
  
  /**
    * The ID of the SubChannel in the request.  Only required when updating messages in a SubChannel that the user belongs to. 
    */
  var SubChannelId: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.SubChannelId] = js.undefined
}
object UpdateChannelMessageRequest {
  
  inline def apply(ChannelArn: ChimeArn, ChimeBearer: ChimeArn, Content: NonEmptyContent, MessageId: MessageId): UpdateChannelMessageRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any], ChimeBearer = ChimeBearer.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], MessageId = MessageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateChannelMessageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateChannelMessageRequest] (val x: Self) extends AnyVal {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChimeBearer(value: ChimeArn): Self = StObject.set(x, "ChimeBearer", value.asInstanceOf[js.Any])
    
    inline def setContent(value: NonEmptyContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: ContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    inline def setMessageId(value: MessageId): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    inline def setSubChannelId(value: SubChannelId): Self = StObject.set(x, "SubChannelId", value.asInstanceOf[js.Any])
    
    inline def setSubChannelIdUndefined: Self = StObject.set(x, "SubChannelId", js.undefined)
  }
}
