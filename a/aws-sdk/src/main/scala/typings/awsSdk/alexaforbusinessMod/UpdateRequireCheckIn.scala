package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRequireCheckIn extends js.Object {
  
  /**
    * Whether require check in is enabled or not.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Duration between 5 and 20 minutes to determine when to release the room if it's not checked into. 
    */
  var ReleaseAfterMinutes: js.UndefOr[Minutes] = js.native
}
object UpdateRequireCheckIn {
  
  @scala.inline
  def apply(): UpdateRequireCheckIn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRequireCheckIn]
  }
  
  @scala.inline
  implicit class UpdateRequireCheckInOps[Self <: UpdateRequireCheckIn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    
    @scala.inline
    def setReleaseAfterMinutes(value: Minutes): Self = this.set("ReleaseAfterMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReleaseAfterMinutes: Self = this.set("ReleaseAfterMinutes", js.undefined)
  }
}
