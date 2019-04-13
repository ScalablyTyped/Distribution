package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackError extends js.Object {
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[StackErrorCode] = js.undefined
  /**
    * The error message.
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
}

object StackError {
  @scala.inline
  def apply(ErrorCode: StackErrorCode = null, ErrorMessage: String = null): StackError = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    __obj.asInstanceOf[StackError]
  }
}

