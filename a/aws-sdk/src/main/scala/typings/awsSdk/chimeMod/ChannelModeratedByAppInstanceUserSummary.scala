package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelModeratedByAppInstanceUserSummary extends js.Object {
  
  var ChannelSummary: js.UndefOr[typings.awsSdk.chimeMod.ChannelSummary] = js.native
}
object ChannelModeratedByAppInstanceUserSummary {
  
  @scala.inline
  def apply(): ChannelModeratedByAppInstanceUserSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelModeratedByAppInstanceUserSummary]
  }
  
  @scala.inline
  implicit class ChannelModeratedByAppInstanceUserSummaryOps[Self <: ChannelModeratedByAppInstanceUserSummary] (val x: Self) extends AnyVal {
    
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
    def setChannelSummary(value: ChannelSummary): Self = this.set("ChannelSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelSummary: Self = this.set("ChannelSummary", js.undefined)
  }
}
