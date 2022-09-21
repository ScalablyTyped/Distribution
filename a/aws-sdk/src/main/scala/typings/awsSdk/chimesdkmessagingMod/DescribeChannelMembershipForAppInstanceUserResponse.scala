package typings.awsSdk.chimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeChannelMembershipForAppInstanceUserResponse extends StObject {
  
  /**
    * The channel to which a user belongs.
    */
  var ChannelMembership: js.UndefOr[ChannelMembershipForAppInstanceUserSummary] = js.undefined
}
object DescribeChannelMembershipForAppInstanceUserResponse {
  
  inline def apply(): DescribeChannelMembershipForAppInstanceUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeChannelMembershipForAppInstanceUserResponse]
  }
  
  extension [Self <: DescribeChannelMembershipForAppInstanceUserResponse](x: Self) {
    
    inline def setChannelMembership(value: ChannelMembershipForAppInstanceUserSummary): Self = StObject.set(x, "ChannelMembership", value.asInstanceOf[js.Any])
    
    inline def setChannelMembershipUndefined: Self = StObject.set(x, "ChannelMembership", js.undefined)
  }
}
