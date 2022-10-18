package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChannelModeratorsRequest extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: ChimeArn
  
  /**
    * The AppInstanceUserArn of the user that makes the API call.
    */
  var ChimeBearer: ChimeArn
  
  /**
    * The maximum number of moderators that you want returned.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.MaxResults] = js.undefined
  
  /**
    * The token passed by previous API calls until all requested moderators are returned.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.NextToken] = js.undefined
}
object ListChannelModeratorsRequest {
  
  inline def apply(ChannelArn: ChimeArn, ChimeBearer: ChimeArn): ListChannelModeratorsRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any], ChimeBearer = ChimeBearer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChannelModeratorsRequest]
  }
  
  extension [Self <: ListChannelModeratorsRequest](x: Self) {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChimeBearer(value: ChimeArn): Self = StObject.set(x, "ChimeBearer", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
