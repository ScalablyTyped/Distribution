package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelModeratorSummary extends js.Object {
  
  /**
    * The data for a moderator.
    */
  var Moderator: js.UndefOr[Identity] = js.native
}
object ChannelModeratorSummary {
  
  @scala.inline
  def apply(): ChannelModeratorSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelModeratorSummary]
  }
  
  @scala.inline
  implicit class ChannelModeratorSummaryOps[Self <: ChannelModeratorSummary] (val x: Self) extends AnyVal {
    
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
    def setModerator(value: Identity): Self = this.set("Moderator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModerator: Self = this.set("Moderator", js.undefined)
  }
}
