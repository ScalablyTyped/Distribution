package typings.awsDashSdk.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionStartedEventDetails extends js.Object {
  /**
    * The JSON data input to the execution.
    */
  var input: js.UndefOr[SensitiveData] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role used for executing AWS Lambda tasks.
    */
  var roleArn: js.UndefOr[Arn] = js.native
}

object ExecutionStartedEventDetails {
  @scala.inline
  def apply(input: SensitiveData = null, roleArn: Arn = null): ExecutionStartedEventDetails = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionStartedEventDetails]
  }
}

