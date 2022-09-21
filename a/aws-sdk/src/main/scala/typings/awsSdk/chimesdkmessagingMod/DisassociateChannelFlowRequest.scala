package typings.awsSdk.chimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateChannelFlowRequest extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: ChimeArn
  
  /**
    * The ARN of the channel flow.
    */
  var ChannelFlowArn: ChimeArn
  
  /**
    * The AppInstanceUserArn of the user making the API call.
    */
  var ChimeBearer: ChimeArn
}
object DisassociateChannelFlowRequest {
  
  inline def apply(ChannelArn: ChimeArn, ChannelFlowArn: ChimeArn, ChimeBearer: ChimeArn): DisassociateChannelFlowRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any], ChannelFlowArn = ChannelFlowArn.asInstanceOf[js.Any], ChimeBearer = ChimeBearer.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateChannelFlowRequest]
  }
  
  extension [Self <: DisassociateChannelFlowRequest](x: Self) {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChannelFlowArn(value: ChimeArn): Self = StObject.set(x, "ChannelFlowArn", value.asInstanceOf[js.Any])
    
    inline def setChimeBearer(value: ChimeArn): Self = StObject.set(x, "ChimeBearer", value.asInstanceOf[js.Any])
  }
}
