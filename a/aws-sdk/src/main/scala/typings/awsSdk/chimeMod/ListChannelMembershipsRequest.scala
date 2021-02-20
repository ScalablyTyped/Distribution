package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListChannelMembershipsRequest extends StObject {
  
  /**
    * The maximum number of channel memberships that you want returned.
    */
  var ChannelArn: ChimeArn = js.native
  
  /**
    * The maximum number of channel memberships that you want returned.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.chimeMod.MaxResults] = js.native
  
  /**
    * The token passed by previous API calls until all requested channel memberships are returned..
    */
  var NextToken: js.UndefOr[typings.awsSdk.chimeMod.NextToken] = js.native
  
  /**
    * The membership type of a user, DEFAULT or HIDDEN. Default members are always returned as part of ListChannelMemberships. Hidden members are only returned if the type filter in ListChannelMemberships equals HIDDEN. Otherwise hidden members are not returned.
    */
  var Type: js.UndefOr[ChannelMembershipType] = js.native
}
object ListChannelMembershipsRequest {
  
  @scala.inline
  def apply(ChannelArn: ChimeArn): ListChannelMembershipsRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChannelMembershipsRequest]
  }
  
  @scala.inline
  implicit class ListChannelMembershipsRequestMutableBuilder[Self <: ListChannelMembershipsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setType(value: ChannelMembershipType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
