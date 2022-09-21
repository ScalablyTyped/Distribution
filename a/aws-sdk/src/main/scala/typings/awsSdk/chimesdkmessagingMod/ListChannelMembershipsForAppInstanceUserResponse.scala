package typings.awsSdk.chimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChannelMembershipsForAppInstanceUserResponse extends StObject {
  
  /**
    * The information for the requested channel memberships.
    */
  var ChannelMemberships: js.UndefOr[ChannelMembershipForAppInstanceUserSummaryList] = js.undefined
  
  /**
    * The token passed by previous API calls until all requested users are returned.
    */
  var NextToken: js.UndefOr[typings.awsSdk.chimesdkmessagingMod.NextToken] = js.undefined
}
object ListChannelMembershipsForAppInstanceUserResponse {
  
  inline def apply(): ListChannelMembershipsForAppInstanceUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChannelMembershipsForAppInstanceUserResponse]
  }
  
  extension [Self <: ListChannelMembershipsForAppInstanceUserResponse](x: Self) {
    
    inline def setChannelMemberships(value: ChannelMembershipForAppInstanceUserSummaryList): Self = StObject.set(x, "ChannelMemberships", value.asInstanceOf[js.Any])
    
    inline def setChannelMembershipsUndefined: Self = StObject.set(x, "ChannelMemberships", js.undefined)
    
    inline def setChannelMembershipsVarargs(value: ChannelMembershipForAppInstanceUserSummary*): Self = StObject.set(x, "ChannelMemberships", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
