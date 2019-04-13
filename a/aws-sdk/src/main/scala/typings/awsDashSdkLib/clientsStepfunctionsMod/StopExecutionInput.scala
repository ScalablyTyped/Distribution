package typings
package awsDashSdkLib.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopExecutionInput extends js.Object {
  /**
    * A more detailed explanation of the cause of the failure.
    */
  var cause: js.UndefOr[SensitiveCause] = js.undefined
  /**
    * The error code of the failure.
    */
  var error: js.UndefOr[SensitiveError] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the execution to stop.
    */
  var executionArn: Arn
}

object StopExecutionInput {
  @scala.inline
  def apply(executionArn: Arn, cause: SensitiveCause = null, error: SensitiveError = null): StopExecutionInput = {
    val __obj = js.Dynamic.literal(executionArn = executionArn)
    if (cause != null) __obj.updateDynamic("cause")(cause)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[StopExecutionInput]
  }
}

