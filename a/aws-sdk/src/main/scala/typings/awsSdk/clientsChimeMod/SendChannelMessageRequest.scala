package typings.awsSdk.clientsChimeMod

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
  var ChimeBearer: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The Idempotency token for each client request.
    */
  var ClientRequestToken: typings.awsSdk.clientsChimeMod.ClientRequestToken
  
  /**
    * The content of the message.
    */
  var Content: NonEmptyContent
  
  /**
    * The optional metadata for each message.
    */
  var Metadata: js.UndefOr[typings.awsSdk.clientsChimeMod.Metadata] = js.undefined
  
  /**
    * Boolean that controls whether the message is persisted on the back end. Required.
    */
  var Persistence: ChannelMessagePersistenceType
  
  /**
    * The type of message, STANDARD or CONTROL.
    */
  var Type: ChannelMessageType
}
object SendChannelMessageRequest {
  
  inline def apply(
    ChannelArn: ChimeArn,
    ClientRequestToken: ClientRequestToken,
    Content: NonEmptyContent,
    Persistence: ChannelMessagePersistenceType,
    Type: ChannelMessageType
  ): SendChannelMessageRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any], ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], Persistence = Persistence.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendChannelMessageRequest]
  }
  
  extension [Self <: SendChannelMessageRequest](x: Self) {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChimeBearer(value: ChimeArn): Self = StObject.set(x, "ChimeBearer", value.asInstanceOf[js.Any])
    
    inline def setChimeBearerUndefined: Self = StObject.set(x, "ChimeBearer", js.undefined)
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setContent(value: NonEmptyContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    inline def setPersistence(value: ChannelMessagePersistenceType): Self = StObject.set(x, "Persistence", value.asInstanceOf[js.Any])
    
    inline def setType(value: ChannelMessageType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
