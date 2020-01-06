package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotInstanceStatus extends js.Object {
  /**
    * The status code. For a list of status codes, see Spot Status Codes in the Amazon EC2 User Guide for Linux Instances.
    */
  var Code: js.UndefOr[String] = js.native
  /**
    * The description for the status code.
    */
  var Message: js.UndefOr[String] = js.native
  /**
    * The date and time of the most recent status update, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ).
    */
  var UpdateTime: js.UndefOr[DateTime] = js.native
}

object SpotInstanceStatus {
  @scala.inline
  def apply(Code: String = null, Message: String = null, UpdateTime: DateTime = null): SpotInstanceStatus = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (UpdateTime != null) __obj.updateDynamic("UpdateTime")(UpdateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotInstanceStatus]
  }
}

