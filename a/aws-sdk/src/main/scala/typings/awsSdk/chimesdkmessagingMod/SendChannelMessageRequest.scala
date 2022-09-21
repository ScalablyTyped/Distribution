package typings.awsSdk.chimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendChannelMessageRequest extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: ChimeArn
  
  /**
    * The AppInstanceUserArn of the user that makes the API call.
    */
  var ChimeBearer: ChimeArn
  
  /**
    * The Idempotency token for each client request.
    */
  var ClientRequestToken: typings.awsSdk.chimesdkmessagingMod.ClientRequestToken
  
  /**
    * The content of the message.
    */
  var Content: NonEmptyContent
  
  /**
    * The attributes for the message, used for message filtering along with a FilterRule defined in the PushNotificationPreferences.
    */
  var MessageAttributes: js.UndefOr[MessageAttributeMap] = js.undefined
  
  /**
    * The optional metadata for each message.
    */
  var Metadata: js.UndefOr[typings.awsSdk.chimesdkmessagingMod.Metadata] = js.undefined
  
  /**
    * Boolean that controls whether the message is persisted on the back end. Required.
    */
  var Persistence: ChannelMessagePersistenceType
  
  /**
    * The push notification configuration of the message.
    */
  var PushNotification: js.UndefOr[PushNotificationConfiguration] = js.undefined
  
  /**
    * The ID of the SubChannel in the request.
    */
  var SubChannelId: js.UndefOr[typings.awsSdk.chimesdkmessagingMod.SubChannelId] = js.undefined
  
  /**
    * The type of message, STANDARD or CONTROL.
    */
  var Type: ChannelMessageType
}
object SendChannelMessageRequest {
  
  inline def apply(
    ChannelArn: ChimeArn,
    ChimeBearer: ChimeArn,
    ClientRequestToken: ClientRequestToken,
    Content: NonEmptyContent,
    Persistence: ChannelMessagePersistenceType,
    Type: ChannelMessageType
  ): SendChannelMessageRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any], ChimeBearer = ChimeBearer.asInstanceOf[js.Any], ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], Persistence = Persistence.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendChannelMessageRequest]
  }
  
  extension [Self <: SendChannelMessageRequest](x: Self) {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChimeBearer(value: ChimeArn): Self = StObject.set(x, "ChimeBearer", value.asInstanceOf[js.Any])
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setContent(value: NonEmptyContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setMessageAttributes(value: MessageAttributeMap): Self = StObject.set(x, "MessageAttributes", value.asInstanceOf[js.Any])
    
    inline def setMessageAttributesUndefined: Self = StObject.set(x, "MessageAttributes", js.undefined)
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    inline def setPersistence(value: ChannelMessagePersistenceType): Self = StObject.set(x, "Persistence", value.asInstanceOf[js.Any])
    
    inline def setPushNotification(value: PushNotificationConfiguration): Self = StObject.set(x, "PushNotification", value.asInstanceOf[js.Any])
    
    inline def setPushNotificationUndefined: Self = StObject.set(x, "PushNotification", js.undefined)
    
    inline def setSubChannelId(value: SubChannelId): Self = StObject.set(x, "SubChannelId", value.asInstanceOf[js.Any])
    
    inline def setSubChannelIdUndefined: Self = StObject.set(x, "SubChannelId", js.undefined)
    
    inline def setType(value: ChannelMessageType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
