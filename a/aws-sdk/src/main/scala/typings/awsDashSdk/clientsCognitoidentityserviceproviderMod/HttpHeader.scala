package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpHeader extends js.Object {
  /**
    * The header name
    */
  var headerName: js.UndefOr[StringType] = js.native
  /**
    * The header value.
    */
  var headerValue: js.UndefOr[StringType] = js.native
}

object HttpHeader {
  @scala.inline
  def apply(headerName: StringType = null, headerValue: StringType = null): HttpHeader = {
    val __obj = js.Dynamic.literal()
    if (headerName != null) __obj.updateDynamic("headerName")(headerName.asInstanceOf[js.Any])
    if (headerValue != null) __obj.updateDynamic("headerValue")(headerValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpHeader]
  }
}

