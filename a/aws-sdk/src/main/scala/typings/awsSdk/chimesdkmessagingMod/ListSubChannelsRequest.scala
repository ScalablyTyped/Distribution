package typings.awsSdk.chimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSubChannelsRequest extends StObject {
  
  /**
    * The ARN of elastic channel.
    */
  var ChannelArn: ChimeArn
  
  /**
    * The AppInstanceUserArn of the user making the API call.
    */
  var ChimeBearer: ChimeArn
  
  /**
    * The maximum number of sub-channels that you want to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.chimesdkmessagingMod.MaxResults] = js.undefined
  
  /**
    * The token passed by previous API calls until all requested sub-channels are returned.
    */
  var NextToken: js.UndefOr[typings.awsSdk.chimesdkmessagingMod.NextToken] = js.undefined
}
object ListSubChannelsRequest {
  
  inline def apply(ChannelArn: ChimeArn, ChimeBearer: ChimeArn): ListSubChannelsRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any], ChimeBearer = ChimeBearer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSubChannelsRequest]
  }
  
  extension [Self <: ListSubChannelsRequest](x: Self) {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChimeBearer(value: ChimeArn): Self = StObject.set(x, "ChimeBearer", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
