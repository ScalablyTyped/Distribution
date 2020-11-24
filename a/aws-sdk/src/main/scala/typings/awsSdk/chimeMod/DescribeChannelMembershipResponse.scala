package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeChannelMembershipResponse extends js.Object {
  
  /**
    * The details of the membership.
    */
  var ChannelMembership: js.UndefOr[typings.awsSdk.chimeMod.ChannelMembership] = js.native
}
object DescribeChannelMembershipResponse {
  
  @scala.inline
  def apply(): DescribeChannelMembershipResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeChannelMembershipResponse]
  }
  
  @scala.inline
  implicit class DescribeChannelMembershipResponseOps[Self <: DescribeChannelMembershipResponse] (val x: Self) extends AnyVal {
    
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
    def setChannelMembership(value: ChannelMembership): Self = this.set("ChannelMembership", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelMembership: Self = this.set("ChannelMembership", js.undefined)
  }
}
