package typings.akamaiDashEdgeworkers.EW

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImmutableRequest
  extends ReadsHeaders
     with ReadsVariables
     with Request

object ImmutableRequest {
  @scala.inline
  def apply(
    cpCode: Double,
    getHeader: String => js.Array[String] | Null,
    getVariable: String => js.UndefOr[String],
    host: String,
    method: String,
    path: String,
    query: String,
    scheme: String,
    url: String,
    device: Device = null,
    userLocation: UserLocation = null
  ): ImmutableRequest = {
    val __obj = js.Dynamic.literal(cpCode = cpCode.asInstanceOf[js.Any], getHeader = js.Any.fromFunction1(getHeader), getVariable = js.Any.fromFunction1(getVariable), host = host.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (userLocation != null) __obj.updateDynamic("userLocation")(userLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImmutableRequest]
  }
}

