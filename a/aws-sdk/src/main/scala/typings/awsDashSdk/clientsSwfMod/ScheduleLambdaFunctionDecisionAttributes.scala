package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduleLambdaFunctionDecisionAttributes extends js.Object {
  /**
    * The data attached to the event that the decider can use in subsequent workflow tasks. This data isn't sent to the Lambda task.
    */
  var control: js.UndefOr[Data] = js.native
  /**
    * A string that identifies the Lambda function execution in the event history.
    */
  var id: FunctionId = js.native
  /**
    * The optional input data to be supplied to the Lambda function.
    */
  var input: js.UndefOr[FunctionInput] = js.native
  /**
    * The name, or ARN, of the Lambda function to schedule.
    */
  var name: FunctionName = js.native
  /**
    * The timeout value, in seconds, after which the Lambda function is considered to be failed once it has started. This can be any integer from 1-300 (1s-5m). If no value is supplied, than a default value of 300s is assumed.
    */
  var startToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
}

object ScheduleLambdaFunctionDecisionAttributes {
  @scala.inline
  def apply(
    id: FunctionId,
    name: FunctionName,
    control: Data = null,
    input: FunctionInput = null,
    startToCloseTimeout: DurationInSecondsOptional = null
  ): ScheduleLambdaFunctionDecisionAttributes = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (control != null) __obj.updateDynamic("control")(control.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (startToCloseTimeout != null) __obj.updateDynamic("startToCloseTimeout")(startToCloseTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleLambdaFunctionDecisionAttributes]
  }
}

