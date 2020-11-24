package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateInstantBooking extends js.Object {
  
  /**
    * Duration between 15 and 240 minutes at increments of 15 that determines how long to book an available room when a meeting is started with Alexa.
    */
  var DurationInMinutes: Minutes = js.native
  
  /**
    * Whether instant booking is enabled or not.
    */
  var Enabled: Boolean = js.native
}
object CreateInstantBooking {
  
  @scala.inline
  def apply(DurationInMinutes: Minutes, Enabled: Boolean): CreateInstantBooking = {
    val __obj = js.Dynamic.literal(DurationInMinutes = DurationInMinutes.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInstantBooking]
  }
  
  @scala.inline
  implicit class CreateInstantBookingOps[Self <: CreateInstantBooking] (val x: Self) extends AnyVal {
    
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
    def setDurationInMinutes(value: Minutes): Self = this.set("DurationInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
  }
}
