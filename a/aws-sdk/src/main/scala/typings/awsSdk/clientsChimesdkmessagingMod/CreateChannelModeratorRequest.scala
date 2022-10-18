package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateChannelModeratorRequest extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: ChimeArn
  
  /**
    * The AppInstanceUserArn of the moderator.
    */
  var ChannelModeratorArn: ChimeArn
  
  /**
    * The AppInstanceUserArn of the user that makes the API call.
    */
  var ChimeBearer: ChimeArn
}
object CreateChannelModeratorRequest {
  
  inline def apply(ChannelArn: ChimeArn, ChannelModeratorArn: ChimeArn, ChimeBearer: ChimeArn): CreateChannelModeratorRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any], ChannelModeratorArn = ChannelModeratorArn.asInstanceOf[js.Any], ChimeBearer = ChimeBearer.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateChannelModeratorRequest]
  }
  
  extension [Self <: CreateChannelModeratorRequest](x: Self) {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChannelModeratorArn(value: ChimeArn): Self = StObject.set(x, "ChannelModeratorArn", value.asInstanceOf[js.Any])
    
    inline def setChimeBearer(value: ChimeArn): Self = StObject.set(x, "ChimeBearer", value.asInstanceOf[js.Any])
  }
}
