package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeChannelMembershipForAppInstanceUserResponse extends StObject {
  
  /**
    * The channel to which a user belongs.
    */
  var ChannelMembership: js.UndefOr[ChannelMembershipForAppInstanceUserSummary] = js.native
}
object DescribeChannelMembershipForAppInstanceUserResponse {
  
  @scala.inline
  def apply(): DescribeChannelMembershipForAppInstanceUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeChannelMembershipForAppInstanceUserResponse]
  }
  
  @scala.inline
  implicit class DescribeChannelMembershipForAppInstanceUserResponseMutableBuilder[Self <: DescribeChannelMembershipForAppInstanceUserResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelMembership(value: ChannelMembershipForAppInstanceUserSummary): Self = StObject.set(x, "ChannelMembership", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelMembershipUndefined: Self = StObject.set(x, "ChannelMembership", js.undefined)
  }
}
