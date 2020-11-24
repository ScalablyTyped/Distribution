package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeChannelModeratorResponse extends js.Object {
  
  /**
    * The details of the channel moderator.
    */
  var ChannelModerator: js.UndefOr[typings.awsSdk.chimeMod.ChannelModerator] = js.native
}
object DescribeChannelModeratorResponse {
  
  @scala.inline
  def apply(): DescribeChannelModeratorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeChannelModeratorResponse]
  }
  
  @scala.inline
  implicit class DescribeChannelModeratorResponseOps[Self <: DescribeChannelModeratorResponse] (val x: Self) extends AnyVal {
    
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
    def setChannelModerator(value: ChannelModerator): Self = this.set("ChannelModerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelModerator: Self = this.set("ChannelModerator", js.undefined)
  }
}
