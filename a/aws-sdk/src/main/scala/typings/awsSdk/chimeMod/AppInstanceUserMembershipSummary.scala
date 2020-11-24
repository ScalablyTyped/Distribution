package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppInstanceUserMembershipSummary extends js.Object {
  
  /**
    * The time at which a summary was last read.
    */
  var ReadMarkerTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * The type of channel summary, 
    */
  var Type: js.UndefOr[ChannelMembershipType] = js.native
}
object AppInstanceUserMembershipSummary {
  
  @scala.inline
  def apply(): AppInstanceUserMembershipSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppInstanceUserMembershipSummary]
  }
  
  @scala.inline
  implicit class AppInstanceUserMembershipSummaryOps[Self <: AppInstanceUserMembershipSummary] (val x: Self) extends AnyVal {
    
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
    def setReadMarkerTimestamp(value: Timestamp): Self = this.set("ReadMarkerTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadMarkerTimestamp: Self = this.set("ReadMarkerTimestamp", js.undefined)
    
    @scala.inline
    def setType(value: ChannelMembershipType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
