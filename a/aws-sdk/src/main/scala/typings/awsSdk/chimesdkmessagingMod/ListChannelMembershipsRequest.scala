package typings.awsSdk.chimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChannelMembershipsRequest extends StObject {
  
  /**
    * The maximum number of channel memberships that you want returned.
    */
  var ChannelArn: ChimeArn
  
  /**
    * The AppInstanceUserArn of the user that makes the API call.
    */
  var ChimeBearer: ChimeArn
  
  /**
    * The maximum number of channel memberships that you want returned.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.chimesdkmessagingMod.MaxResults] = js.undefined
  
  /**
    * The token passed by previous API calls until all requested channel memberships are returned.
    */
  var NextToken: js.UndefOr[typings.awsSdk.chimesdkmessagingMod.NextToken] = js.undefined
  
  /**
    * The ID of the SubChannel in the request.  Only required when listing a user's memberships in a particular sub-channel of an elastic channel. 
    */
  var SubChannelId: js.UndefOr[typings.awsSdk.chimesdkmessagingMod.SubChannelId] = js.undefined
  
  /**
    * The membership type of a user, DEFAULT or HIDDEN. Default members are returned as part of ListChannelMemberships if no type is specified. Hidden members are only returned if the type filter in ListChannelMemberships equals HIDDEN.
    */
  var Type: js.UndefOr[ChannelMembershipType] = js.undefined
}
object ListChannelMembershipsRequest {
  
  inline def apply(ChannelArn: ChimeArn, ChimeBearer: ChimeArn): ListChannelMembershipsRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any], ChimeBearer = ChimeBearer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChannelMembershipsRequest]
  }
  
  extension [Self <: ListChannelMembershipsRequest](x: Self) {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChimeBearer(value: ChimeArn): Self = StObject.set(x, "ChimeBearer", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSubChannelId(value: SubChannelId): Self = StObject.set(x, "SubChannelId", value.asInstanceOf[js.Any])
    
    inline def setSubChannelIdUndefined: Self = StObject.set(x, "SubChannelId", js.undefined)
    
    inline def setType(value: ChannelMembershipType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
