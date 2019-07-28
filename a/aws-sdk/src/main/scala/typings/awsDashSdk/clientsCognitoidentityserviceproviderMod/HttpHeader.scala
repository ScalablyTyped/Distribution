package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpHeader extends js.Object {
  /**
    * The header name
    */
  var headerName: js.UndefOr[StringType] = js.undefined
  /**
    * The header value.
    */
  var headerValue: js.UndefOr[StringType] = js.undefined
}

object HttpHeader {
  @scala.inline
  def apply(headerName: StringType = null, headerValue: StringType = null): HttpHeader = {
    val __obj = js.Dynamic.literal()
    if (headerName != null) __obj.updateDynamic("headerName")(headerName)
    if (headerValue != null) __obj.updateDynamic("headerValue")(headerValue)
    __obj.asInstanceOf[HttpHeader]
  }
}

