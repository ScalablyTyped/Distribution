package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateChannelModeratorRequest extends js.Object {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: ChimeArn = js.native
  
  /**
    * The ARN of the moderator.
    */
  var ChannelModeratorArn: ChimeArn = js.native
}
object CreateChannelModeratorRequest {
  
  @scala.inline
  def apply(ChannelArn: ChimeArn, ChannelModeratorArn: ChimeArn): CreateChannelModeratorRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any], ChannelModeratorArn = ChannelModeratorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateChannelModeratorRequest]
  }
  
  @scala.inline
  implicit class CreateChannelModeratorRequestOps[Self <: CreateChannelModeratorRequest] (val x: Self) extends AnyVal {
    
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
    def setChannelModeratorArn(value: ChimeArn): Self = this.set("ChannelModeratorArn", value.asInstanceOf[js.Any])
  }
}
