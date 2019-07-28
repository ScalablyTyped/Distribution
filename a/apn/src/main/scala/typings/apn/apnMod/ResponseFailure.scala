package typings.apn.apnMod

import typings.apn.Anon_Reason
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseFailure extends js.Object {
  var device: String
  var error: js.UndefOr[Error] = js.undefined
  var response: js.UndefOr[Anon_Reason] = js.undefined
  var status: js.UndefOr[String] = js.undefined
}

object ResponseFailure {
  @scala.inline
  def apply(device: String, error: Error = null, response: Anon_Reason = null, status: String = null): ResponseFailure = {
    val __obj = js.Dynamic.literal(device = device)
    if (error != null) __obj.updateDynamic("error")(error)
    if (response != null) __obj.updateDynamic("response")(response)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[ResponseFailure]
  }
}

