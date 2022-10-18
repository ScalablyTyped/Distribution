package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetChannelMessageStatusRequest extends StObject {
  
  /**
    * The ARN of the channel
    */
  var ChannelArn: ChimeArn
  
  /**
    * The AppInstanceUserArn of the user making the API call.
    */
  var ChimeBearer: ChimeArn
  
  /**
    * The ID of the message.
    */
  var MessageId: typings.awsSdk.clientsChimesdkmessagingMod.MessageId
  
  /**
    * The ID of the SubChannel in the request.  Only required when getting message status in a SubChannel that the user belongs to. 
    */
  var SubChannelId: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.SubChannelId] = js.undefined
}
object GetChannelMessageStatusRequest {
  
  inline def apply(ChannelArn: ChimeArn, ChimeBearer: ChimeArn, MessageId: MessageId): GetChannelMessageStatusRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any], ChimeBearer = ChimeBearer.asInstanceOf[js.Any], MessageId = MessageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChannelMessageStatusRequest]
  }
  
  extension [Self <: GetChannelMessageStatusRequest](x: Self) {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChimeBearer(value: ChimeArn): Self = StObject.set(x, "ChimeBearer", value.asInstanceOf[js.Any])
    
    inline def setMessageId(value: MessageId): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    inline def setSubChannelId(value: SubChannelId): Self = StObject.set(x, "SubChannelId", value.asInstanceOf[js.Any])
    
    inline def setSubChannelIdUndefined: Self = StObject.set(x, "SubChannelId", js.undefined)
  }
}
