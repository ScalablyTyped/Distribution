package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsLambdaFunctionEnvironmentError extends js.Object {
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[NonEmptyString] = js.native
  /**
    * The error message.
    */
  var Message: js.UndefOr[NonEmptyString] = js.native
}

object AwsLambdaFunctionEnvironmentError {
  @scala.inline
  def apply(ErrorCode: NonEmptyString = null, Message: NonEmptyString = null): AwsLambdaFunctionEnvironmentError = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsLambdaFunctionEnvironmentError]
  }
}

