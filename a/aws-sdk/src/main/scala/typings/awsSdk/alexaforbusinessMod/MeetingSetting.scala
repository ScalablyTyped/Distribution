package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

