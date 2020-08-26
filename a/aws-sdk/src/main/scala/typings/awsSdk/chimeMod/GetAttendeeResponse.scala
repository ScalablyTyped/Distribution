package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAttendeeResponse extends js.Object {
  /**
    * The Amazon Chime SDK attendee information.
    */
  var Attendee: js.UndefOr[typings.awsSdk.chimeMod.Attendee] = js.native
}

object GetAttendeeResponse {
  @scala.inline
  def apply(): GetAttendeeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAttendeeResponse]
  }
  @scala.inline
  implicit class GetAttendeeResponseOps[Self <: GetAttendeeResponse] (val x: Self) extends AnyVal {
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
    def setAttendee(value: Attendee): Self = this.set("Attendee", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttendee: Self = this.set("Attendee", js.undefined)
  }
  
}

