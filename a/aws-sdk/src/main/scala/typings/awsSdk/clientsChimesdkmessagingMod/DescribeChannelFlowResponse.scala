package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeChannelFlowResponse extends StObject {
  
  /**
    * The channel flow details.
    */
  var ChannelFlow: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.ChannelFlow] = js.undefined
}
object DescribeChannelFlowResponse {
  
  inline def apply(): DescribeChannelFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeChannelFlowResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeChannelFlowResponse] (val x: Self) extends AnyVal {
    
    inline def setChannelFlow(value: ChannelFlow): Self = StObject.set(x, "ChannelFlow", value.asInstanceOf[js.Any])
    
    inline def setChannelFlowUndefined: Self = StObject.set(x, "ChannelFlow", js.undefined)
  }
}
