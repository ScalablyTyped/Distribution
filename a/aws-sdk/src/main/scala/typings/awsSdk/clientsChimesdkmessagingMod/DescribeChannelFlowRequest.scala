package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeChannelFlowRequest extends StObject {
  
  /**
    * The ARN of the channel flow.
    */
  var ChannelFlowArn: ChimeArn
}
object DescribeChannelFlowRequest {
  
  inline def apply(ChannelFlowArn: ChimeArn): DescribeChannelFlowRequest = {
    val __obj = js.Dynamic.literal(ChannelFlowArn = ChannelFlowArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeChannelFlowRequest]
  }
  
  extension [Self <: DescribeChannelFlowRequest](x: Self) {
    
    inline def setChannelFlowArn(value: ChimeArn): Self = StObject.set(x, "ChannelFlowArn", value.asInstanceOf[js.Any])
  }
}
