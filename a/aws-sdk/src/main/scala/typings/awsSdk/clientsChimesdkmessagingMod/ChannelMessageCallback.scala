package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelMessageCallback extends StObject {
  
  /**
    * The message content.
    */
  var Content: js.UndefOr[NonEmptyContent] = js.undefined
  
  /**
    * The content type of the call-back message.
    */
  var ContentType: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.ContentType] = js.undefined
  
  /**
    * The attributes for the message, used for message filtering along with a FilterRule defined in the PushNotificationPreferences. 
    */
  var MessageAttributes: js.UndefOr[MessageAttributeMap] = js.undefined
  
  /**
    * The message ID.
    */
  var MessageId: typings.awsSdk.clientsChimesdkmessagingMod.MessageId
  
  /**
    * The message metadata.
    */
  var Metadata: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.Metadata] = js.undefined
  
  /**
    * The push notification configuration of the message.
    */
  var PushNotification: js.UndefOr[PushNotificationConfiguration] = js.undefined
  
  /**
    * The ID of the SubChannel.
    */
  var SubChannelId: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.SubChannelId] = js.undefined
}
object ChannelMessageCallback {
  
  inline def apply(MessageId: MessageId): ChannelMessageCallback = {
    val __obj = js.Dynamic.literal(MessageId = MessageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelMessageCallback]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelMessageCallback] (val x: Self) extends AnyVal {
    
    inline def setContent(value: NonEmptyContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: ContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    inline def setMessageAttributes(value: MessageAttributeMap): Self = StObject.set(x, "MessageAttributes", value.asInstanceOf[js.Any])
    
    inline def setMessageAttributesUndefined: Self = StObject.set(x, "MessageAttributes", js.undefined)
    
    inline def setMessageId(value: MessageId): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    inline def setPushNotification(value: PushNotificationConfiguration): Self = StObject.set(x, "PushNotification", value.asInstanceOf[js.Any])
    
    inline def setPushNotificationUndefined: Self = StObject.set(x, "PushNotification", js.undefined)
    
    inline def setSubChannelId(value: SubChannelId): Self = StObject.set(x, "SubChannelId", value.asInstanceOf[js.Any])
    
    inline def setSubChannelIdUndefined: Self = StObject.set(x, "SubChannelId", js.undefined)
  }
}
