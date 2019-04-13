package typings
package awsDashSdkLib.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentError extends js.Object {
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[String] = js.undefined
  /**
    * The error message.
    */
  var Message: js.UndefOr[SensitiveString] = js.undefined
}

object EnvironmentError {
  @scala.inline
  def apply(ErrorCode: String = null, Message: SensitiveString = null): EnvironmentError = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[EnvironmentError]
  }
}

