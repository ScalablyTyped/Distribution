package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAttendeeResponse extends js.Object {
  
  /**
    * The attendee information, including attendee ID and join token.
    */
  var Attendee: js.UndefOr[typings.awsSdk.chimeMod.Attendee] = js.native
}
object CreateAttendeeResponse {
  
  @scala.inline
  def apply(): CreateAttendeeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAttendeeResponse]
  }
  
  @scala.inline
  implicit class CreateAttendeeResponseOps[Self <: CreateAttendeeResponse] (val x: Self) extends AnyVal {
    
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
