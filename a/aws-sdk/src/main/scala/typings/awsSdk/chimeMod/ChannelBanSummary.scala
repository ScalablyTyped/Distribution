package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelBanSummary extends js.Object {
  
  /**
    * The member being banned from a channel.
    */
  var Member: js.UndefOr[Identity] = js.native
}
object ChannelBanSummary {
  
  @scala.inline
  def apply(): ChannelBanSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelBanSummary]
  }
  
  @scala.inline
  implicit class ChannelBanSummaryOps[Self <: ChannelBanSummary] (val x: Self) extends AnyVal {
    
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
    def setMember(value: Identity): Self = this.set("Member", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMember: Self = this.set("Member", js.undefined)
  }
}
