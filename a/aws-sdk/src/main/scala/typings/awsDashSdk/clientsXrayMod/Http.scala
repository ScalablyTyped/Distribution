package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Http extends js.Object {
  /**
    * The IP address of the requestor.
    */
  var ClientIp: js.UndefOr[String] = js.undefined
  /**
    * The request method.
    */
  var HttpMethod: js.UndefOr[String] = js.undefined
  /**
    * The response status.
    */
  var HttpStatus: js.UndefOr[NullableInteger] = js.undefined
  /**
    * The request URL.
    */
  var HttpURL: js.UndefOr[String] = js.undefined
  /**
    * The request's user agent string.
    */
  var UserAgent: js.UndefOr[String] = js.undefined
}

object Http {
  @scala.inline
  def apply(
    ClientIp: String = null,
    HttpMethod: String = null,
    HttpStatus: js.UndefOr[NullableInteger] = js.undefined,
    HttpURL: String = null,
    UserAgent: String = null
  ): Http = {
    val __obj = js.Dynamic.literal()
    if (ClientIp != null) __obj.updateDynamic("ClientIp")(ClientIp)
    if (HttpMethod != null) __obj.updateDynamic("HttpMethod")(HttpMethod)
    if (!js.isUndefined(HttpStatus)) __obj.updateDynamic("HttpStatus")(HttpStatus)
    if (HttpURL != null) __obj.updateDynamic("HttpURL")(HttpURL)
    if (UserAgent != null) __obj.updateDynamic("UserAgent")(UserAgent)
    __obj.asInstanceOf[Http]
  }
}

