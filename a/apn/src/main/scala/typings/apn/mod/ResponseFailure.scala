package typings.apn.mod

import typings.apn.AnonReason
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseFailure extends js.Object {
  var device: String
  var error: js.UndefOr[Error] = js.undefined
  var response: js.UndefOr[AnonReason] = js.undefined
  var status: js.UndefOr[String] = js.undefined
}

object ResponseFailure {
  @scala.inline
  def apply(device: String, error: Error = null, response: AnonReason = null, status: String = null): ResponseFailure = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseFailure]
  }
}

