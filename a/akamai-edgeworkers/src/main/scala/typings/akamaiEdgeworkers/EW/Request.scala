package typings.akamaiEdgeworkers.EW

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  /**
    * The cpcode used for reporting.
    */
  val cpCode: Double
  /**
    * Object containing properties specifying the device characteristics. This
    * value of this property will be null if the contract associated with the
    * request does not have entitlements for EDC.
    */
  val device: js.UndefOr[Device] = js.undefined
  /**
    * The Host header value of the incoming request.
    */
  val host: String
  /**
    * The HTTP method of the incoming request.
    */
  val method: String
  /**
    * The URL path of the incoming request, including the filename and
    * extension, but without any query string.
    */
  val path: String
  /**
    * The query string of the incoming request.
    */
  val query: String
  /**
    * The scheme of the incoming request ("http" or "https").
    */
  val scheme: String
  /**
    * The Relative URL of the incoming request. This includes the path as well
    * as the query string.
    */
  val url: String
  /**
    * Object containing properties specifying the end user's geographic
    * location. This value of this property will be null if the contract
    * associated with the request does not have the appropriate entitlements.
    */
  val userLocation: js.UndefOr[UserLocation] = js.undefined
}

object Request {
  @scala.inline
  def apply(
    cpCode: Double,
    host: String,
    method: String,
    path: String,
    query: String,
    scheme: String,
    url: String,
    device: Device = null,
    userLocation: UserLocation = null
  ): Request = {
    val __obj = js.Dynamic.literal(cpCode = cpCode.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (userLocation != null) __obj.updateDynamic("userLocation")(userLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

