package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvailabilityZoneMessage extends js.Object {
  /**
    * The message about the Availability Zone.
    */
  var Message: js.UndefOr[String] = js.undefined
}

object AvailabilityZoneMessage {
  @scala.inline
  def apply(Message: String = null): AvailabilityZoneMessage = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[AvailabilityZoneMessage]
  }
}

