package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelMembership extends js.Object {
  
  /**
    * The ARN of the member's channel.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.native
  
  /**
    * The time at which the channel membership was created. 
    */
  var CreatedTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * The identifier of the member who invited another member. Taken from the message header.
    */
  var InvitedBy: js.UndefOr[Identity] = js.native
  
  /**
    * The time at which a channel membership was last updated.
    */
  var LastUpdatedTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * The data of the channel member.
    */
  var Member: js.UndefOr[Identity] = js.native
  
  /**
    * The membership type set for the channel member.
    */
  var Type: js.UndefOr[ChannelMembershipType] = js.native
}
object ChannelMembership {
  
  @scala.inline
  def apply(): ChannelMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelMembership]
  }
  
  @scala.inline
  implicit class ChannelMembershipOps[Self <: ChannelMembership] (val x: Self) extends AnyVal {
    
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
    def deleteChannelArn: Self = this.set("ChannelArn", js.undefined)
    
    @scala.inline
    def setCreatedTimestamp(value: Timestamp): Self = this.set("CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTimestamp: Self = this.set("CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setInvitedBy(value: Identity): Self = this.set("InvitedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvitedBy: Self = this.set("InvitedBy", js.undefined)
    
    @scala.inline
    def setLastUpdatedTimestamp(value: Timestamp): Self = this.set("LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedTimestamp: Self = this.set("LastUpdatedTimestamp", js.undefined)
    
    @scala.inline
    def setMember(value: Identity): Self = this.set("Member", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMember: Self = this.set("Member", js.undefined)
    
    @scala.inline
    def setType(value: ChannelMembershipType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
