package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChannelMembershipsResponse extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The information for the requested channel memberships.
    */
  var ChannelMemberships: js.UndefOr[ChannelMembershipSummaryList] = js.undefined
  
  /**
    * The token passed by previous API calls until all requested channel memberships are returned.
    */
  var NextToken: js.UndefOr[typings.awsSdk.chimeMod.NextToken] = js.undefined
}
object ListChannelMembershipsResponse {
  
  @scala.inline
  def apply(): ListChannelMembershipsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChannelMembershipsResponse]
  }
  
  @scala.inline
  implicit class ListChannelMembershipsResponseMutableBuilder[Self <: ListChannelMembershipsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelArnUndefined: Self = StObject.set(x, "ChannelArn", js.undefined)
    
    @scala.inline
    def setChannelMemberships(value: ChannelMembershipSummaryList): Self = StObject.set(x, "ChannelMemberships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelMembershipsUndefined: Self = StObject.set(x, "ChannelMemberships", js.undefined)
    
    @scala.inline
    def setChannelMembershipsVarargs(value: ChannelMembershipSummary*): Self = StObject.set(x, "ChannelMemberships", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
