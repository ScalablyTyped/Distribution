package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorDetail extends js.Object {
  /**
    * A detailed error code.
    */
  var DetailedErrorCode: js.UndefOr[__string] = js.native
  /**
    * A detailed error message.
    */
  var DetailedErrorMessage: js.UndefOr[__string] = js.native
}

object ErrorDetail {
  @scala.inline
  def apply(DetailedErrorCode: __string = null, DetailedErrorMessage: __string = null): ErrorDetail = {
    val __obj = js.Dynamic.literal()
    if (DetailedErrorCode != null) __obj.updateDynamic("DetailedErrorCode")(DetailedErrorCode.asInstanceOf[js.Any])
    if (DetailedErrorMessage != null) __obj.updateDynamic("DetailedErrorMessage")(DetailedErrorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorDetail]
  }
}

