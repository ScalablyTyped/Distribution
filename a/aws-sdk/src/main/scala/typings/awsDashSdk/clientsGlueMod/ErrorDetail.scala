package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorDetail extends js.Object {
  /**
    * The code associated with this error.
    */
  var ErrorCode: js.UndefOr[NameString] = js.undefined
  /**
    * A message describing the error.
    */
  var ErrorMessage: js.UndefOr[DescriptionString] = js.undefined
}

object ErrorDetail {
  @scala.inline
  def apply(ErrorCode: NameString = null, ErrorMessage: DescriptionString = null): ErrorDetail = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode)
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    __obj.asInstanceOf[ErrorDetail]
  }
}

