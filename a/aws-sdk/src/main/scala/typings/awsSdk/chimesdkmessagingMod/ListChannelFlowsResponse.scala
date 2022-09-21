package typings.awsSdk.chimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChannelFlowsResponse extends StObject {
  
  /**
    * The information about each channel flow.
    */
  var ChannelFlows: js.UndefOr[ChannelFlowSummaryList] = js.undefined
  
  /**
    * The token passed by previous API calls until all requested channels are returned.
    */
  var NextToken: js.UndefOr[typings.awsSdk.chimesdkmessagingMod.NextToken] = js.undefined
}
object ListChannelFlowsResponse {
  
  inline def apply(): ListChannelFlowsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChannelFlowsResponse]
  }
  
  extension [Self <: ListChannelFlowsResponse](x: Self) {
    
    inline def setChannelFlows(value: ChannelFlowSummaryList): Self = StObject.set(x, "ChannelFlows", value.asInstanceOf[js.Any])
    
    inline def setChannelFlowsUndefined: Self = StObject.set(x, "ChannelFlows", js.undefined)
    
    inline def setChannelFlowsVarargs(value: ChannelFlowSummary*): Self = StObject.set(x, "ChannelFlows", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
