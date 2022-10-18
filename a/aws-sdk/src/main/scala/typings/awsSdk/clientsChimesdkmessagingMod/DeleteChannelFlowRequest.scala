package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteChannelFlowRequest extends StObject {
  
  /**
    * The ARN of the channel flow.
    */
  var ChannelFlowArn: ChimeArn
}
object DeleteChannelFlowRequest {
  
  inline def apply(ChannelFlowArn: ChimeArn): DeleteChannelFlowRequest = {
    val __obj = js.Dynamic.literal(ChannelFlowArn = ChannelFlowArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteChannelFlowRequest]
  }
  
  extension [Self <: DeleteChannelFlowRequest](x: Self) {
    
    inline def setChannelFlowArn(value: ChimeArn): Self = StObject.set(x, "ChannelFlowArn", value.asInstanceOf[js.Any])
  }
}
