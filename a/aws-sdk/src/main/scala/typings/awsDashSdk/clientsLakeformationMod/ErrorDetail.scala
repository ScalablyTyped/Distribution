package typings.awsDashSdk.clientsLakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorDetail extends js.Object {
  /**
    * The code associated with this error.
    */
  var ErrorCode: js.UndefOr[NameString] = js.native
  /**
    * A message describing the error.
    */
  var ErrorMessage: js.UndefOr[DescriptionString] = js.native
}

object ErrorDetail {
  @scala.inline
  def apply(ErrorCode: NameString = null, ErrorMessage: DescriptionString = null): ErrorDetail = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorDetail]
  }
}

