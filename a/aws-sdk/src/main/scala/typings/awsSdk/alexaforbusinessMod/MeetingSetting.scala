package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeetingSetting extends js.Object {
  
  /**
    * The values that indicate whether the pin is always required.
    */
  var RequirePin: typings.awsSdk.alexaforbusinessMod.RequirePin = js.native
}
object MeetingSetting {
  
  @scala.inline
  def apply(RequirePin: RequirePin): MeetingSetting = {
    val __obj = js.Dynamic.literal(RequirePin = RequirePin.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeetingSetting]
  }
  
  @scala.inline
  implicit class MeetingSettingOps[Self <: MeetingSetting] (val x: Self) extends AnyVal {
    
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
    def setRequirePin(value: RequirePin): Self = this.set("RequirePin", value.asInstanceOf[js.Any])
  }
}
