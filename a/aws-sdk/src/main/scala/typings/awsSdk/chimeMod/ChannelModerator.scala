package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelModerator extends js.Object {
  
  /**
    * The ARN of the moderator's channel.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.native
  
  /**
    * The member who created the moderator.
    */
  var CreatedBy: js.UndefOr[Identity] = js.native
  
  /**
    * The time at which the moderator was created.
    */
  var CreatedTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * The moderator's data.
    */
  var Moderator: js.UndefOr[Identity] = js.native
}
object ChannelModerator {
  
  @scala.inline
  def apply(): ChannelModerator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelModerator]
  }
  
  @scala.inline
  implicit class ChannelModeratorOps[Self <: ChannelModerator] (val x: Self) extends AnyVal {
    
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
    def setModerator(value: Identity): Self = this.set("Moderator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModerator: Self = this.set("Moderator", js.undefined)
  }
}
