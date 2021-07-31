package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChannelMembershipsForAppInstanceUserResponse extends StObject {
  
  /**
    * The token passed by previous API calls until all requested users are returned.
    */
  var ChannelMemberships: js.UndefOr[ChannelMembershipForAppInstanceUserSummaryList] = js.undefined
  
  /**
    * The token passed by previous API calls until all requested users are returned.
    */
  var NextToken: js.UndefOr[typings.awsSdk.chimeMod.NextToken] = js.undefined
}
object ListChannelMembershipsForAppInstanceUserResponse {
  
  @scala.inline
  def apply(): ListChannelMembershipsForAppInstanceUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChannelMembershipsForAppInstanceUserResponse]
  }
  
  @scala.inline
  implicit class ListChannelMembershipsForAppInstanceUserResponseMutableBuilder[Self <: ListChannelMembershipsForAppInstanceUserResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelMemberships(value: ChannelMembershipForAppInstanceUserSummaryList): Self = StObject.set(x, "ChannelMemberships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelMembershipsUndefined: Self = StObject.set(x, "ChannelMemberships", js.undefined)
    
    @scala.inline
    def setChannelMembershipsVarargs(value: ChannelMembershipForAppInstanceUserSummary*): Self = StObject.set(x, "ChannelMemberships", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
