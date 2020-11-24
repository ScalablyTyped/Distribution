package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateChannelMembershipRequest extends js.Object {
  
  /**
    * The ARN of the channel to which you're adding users.
    */
  var ChannelArn: ChimeArn = js.native
  
  /**
    * The ARN of the member you want to add to the channel.
    */
  var MemberArn: ChimeArn = js.native
  
  /**
    * The membership type of a user, DEFAULT or HIDDEN. Default members are always returned as part of ListChannelMemberships. Hidden members are only returned if the type filter in ListChannelMemberships equals HIDDEN. Otherwise hidden members are not returned. This is only supported by moderators.
    */
  var Type: ChannelMembershipType = js.native
}
object CreateChannelMembershipRequest {
  
  @scala.inline
  def apply(ChannelArn: ChimeArn, MemberArn: ChimeArn, Type: ChannelMembershipType): CreateChannelMembershipRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any], MemberArn = MemberArn.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateChannelMembershipRequest]
  }
  
  @scala.inline
  implicit class CreateChannelMembershipRequestOps[Self <: CreateChannelMembershipRequest] (val x: Self) extends AnyVal {
    
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
    def setChannelArn(value: ChimeArn): Self = this.set("ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberArn(value: ChimeArn): Self = this.set("MemberArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ChannelMembershipType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
}
