package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelMembershipForAppInstanceUserSummary extends js.Object {
  
  /**
    * Returns the channel membership data for an app instance.
    */
  var AppInstanceUserMembershipSummary: js.UndefOr[typings.awsSdk.chimeMod.AppInstanceUserMembershipSummary] = js.native
  
  var ChannelSummary: js.UndefOr[typings.awsSdk.chimeMod.ChannelSummary] = js.native
}
object ChannelMembershipForAppInstanceUserSummary {
  
  @scala.inline
  def apply(): ChannelMembershipForAppInstanceUserSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelMembershipForAppInstanceUserSummary]
  }
  
  @scala.inline
  implicit class ChannelMembershipForAppInstanceUserSummaryOps[Self <: ChannelMembershipForAppInstanceUserSummary] (val x: Self) extends AnyVal {
    
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
    def setAppInstanceUserMembershipSummary(value: AppInstanceUserMembershipSummary): Self = this.set("AppInstanceUserMembershipSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppInstanceUserMembershipSummary: Self = this.set("AppInstanceUserMembershipSummary", js.undefined)
    
    @scala.inline
    def setChannelSummary(value: ChannelSummary): Self = this.set("ChannelSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelSummary: Self = this.set("ChannelSummary", js.undefined)
  }
}
