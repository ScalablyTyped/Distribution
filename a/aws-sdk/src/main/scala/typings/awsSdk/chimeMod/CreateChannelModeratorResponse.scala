package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateChannelModeratorResponse extends js.Object {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.native
  
  /**
    * The ARNs of the channel and the moderator.
    */
  var ChannelModerator: js.UndefOr[Identity] = js.native
}
object CreateChannelModeratorResponse {
  
  @scala.inline
  def apply(): CreateChannelModeratorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateChannelModeratorResponse]
  }
  
  @scala.inline
  implicit class CreateChannelModeratorResponseOps[Self <: CreateChannelModeratorResponse] (val x: Self) extends AnyVal {
    
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
    def setChannelModerator(value: Identity): Self = this.set("ChannelModerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelModerator: Self = this.set("ChannelModerator", js.undefined)
  }
}
