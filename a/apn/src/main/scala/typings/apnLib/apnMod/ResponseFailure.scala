package typings
package apnLib.apnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseFailure extends js.Object {
  var device: java.lang.String
  var error: js.UndefOr[nodeLib.Error] = js.undefined
  var response: js.UndefOr[apnLib.Anon_Reason] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
}

object ResponseFailure {
  @scala.inline
  def apply(
    device: java.lang.String,
    error: nodeLib.Error = null,
    response: apnLib.Anon_Reason = null,
    status: java.lang.String = null
  ): ResponseFailure = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("device")(device)
    if (error != null) __obj.updateDynamic("error")(error)
    if (response != null) __obj.updateDynamic("response")(response)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[ResponseFailure]
  }
}

