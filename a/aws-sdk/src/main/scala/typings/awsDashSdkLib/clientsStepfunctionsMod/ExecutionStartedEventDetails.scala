package typings
package awsDashSdkLib.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionStartedEventDetails extends js.Object {
  /**
    * The JSON data input to the execution.
    */
  var input: js.UndefOr[SensitiveData] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the IAM role used for executing AWS Lambda tasks.
    */
  var roleArn: js.UndefOr[Arn] = js.undefined
}

object ExecutionStartedEventDetails {
  @scala.inline
  def apply(input: SensitiveData = null, roleArn: Arn = null): ExecutionStartedEventDetails = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input)
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn)
    __obj.asInstanceOf[ExecutionStartedEventDetails]
  }
}

