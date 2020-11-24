package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeChannelMembershipForAppInstanceUserResponse extends js.Object {
  
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
  implicit class DescribeChannelMembershipForAppInstanceUserResponseOps[Self <: DescribeChannelMembershipForAppInstanceUserResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChannelMembership(value: ChannelMembershipForAppInstanceUserSummary): Self = this.set("ChannelMembership", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelMembership: Self = this.set("ChannelMembership", js.undefined)
  }
}
