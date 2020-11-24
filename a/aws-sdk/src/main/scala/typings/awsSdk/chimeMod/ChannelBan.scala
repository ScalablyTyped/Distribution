package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelBan extends js.Object {
  
  /**
    * The ARN of the channel from which a member is being banned.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.native
  
  /**
    * The parameter of the action.
    */
  var CreatedBy: js.UndefOr[Identity] = js.native
  
  /**
    * The time at which the ban was created.
    */
  var CreatedTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * The member being banned from the channel.
    */
  var Member: js.UndefOr[Identity] = js.native
}
object ChannelBan {
  
  @scala.inline
  def apply(): ChannelBan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelBan]
  }
  
  @scala.inline
  implicit class ChannelBanOps[Self <: ChannelBan] (val x: Self) extends AnyVal {
    
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
    def setCreatedBy(value: Identity): Self = this.set("CreatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedBy: Self = this.set("CreatedBy", js.undefined)
    
    @scala.inline
    def setCreatedTimestamp(value: Timestamp): Self = this.set("CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTimestamp: Self = this.set("CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setMember(value: Identity): Self = this.set("Member", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMember: Self = this.set("Member", js.undefined)
  }
}
