package typings.awsSdk.chimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChannelsAssociatedWithChannelFlowRequest extends StObject {
  
  /**
    * The ARN of the channel flow.
    */
  var ChannelFlowArn: ChimeArn
  
  /**
    * The maximum number of channels that you want to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.chimesdkmessagingMod.MaxResults] = js.undefined
  
  /**
    * The token passed by previous API calls until all requested channels are returned.
    */
  var NextToken: js.UndefOr[typings.awsSdk.chimesdkmessagingMod.NextToken] = js.undefined
}
object ListChannelsAssociatedWithChannelFlowRequest {
  
  inline def apply(ChannelFlowArn: ChimeArn): ListChannelsAssociatedWithChannelFlowRequest = {
    val __obj = js.Dynamic.literal(ChannelFlowArn = ChannelFlowArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChannelsAssociatedWithChannelFlowRequest]
  }
  
  extension [Self <: ListChannelsAssociatedWithChannelFlowRequest](x: Self) {
    
    inline def setChannelFlowArn(value: ChimeArn): Self = StObject.set(x, "ChannelFlowArn", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
