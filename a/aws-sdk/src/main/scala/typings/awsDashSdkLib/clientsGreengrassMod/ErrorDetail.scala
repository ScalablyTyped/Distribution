package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorDetail extends js.Object {
  /**
    * A detailed error code.
    */
  var DetailedErrorCode: js.UndefOr[__string] = js.undefined
  /**
    * A detailed error message.
    */
  var DetailedErrorMessage: js.UndefOr[__string] = js.undefined
}

object ErrorDetail {
  @scala.inline
  def apply(DetailedErrorCode: __string = null, DetailedErrorMessage: __string = null): ErrorDetail = {
    val __obj = js.Dynamic.literal()
    if (DetailedErrorCode != null) __obj.updateDynamic("DetailedErrorCode")(DetailedErrorCode)
    if (DetailedErrorMessage != null) __obj.updateDynamic("DetailedErrorMessage")(DetailedErrorMessage)
    __obj.asInstanceOf[ErrorDetail]
  }
}

