package typings.awsDashSdk.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LambdaFunctionScheduledEventDetails extends js.Object {
  /**
    * The JSON data input to the lambda function.
    */
  var input: js.UndefOr[SensitiveData] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the scheduled lambda function.
    */
  var resource: Arn
  /**
    * The maximum allowed duration of the lambda function.
    */
  var timeoutInSeconds: js.UndefOr[TimeoutInSeconds] = js.undefined
}

object LambdaFunctionScheduledEventDetails {
  @scala.inline
  def apply(
    resource: Arn,
    input: SensitiveData = null,
    timeoutInSeconds: js.UndefOr[TimeoutInSeconds] = js.undefined
  ): LambdaFunctionScheduledEventDetails = {
    val __obj = js.Dynamic.literal(resource = resource)
    if (input != null) __obj.updateDynamic("input")(input)
    if (!js.isUndefined(timeoutInSeconds)) __obj.updateDynamic("timeoutInSeconds")(timeoutInSeconds)
    __obj.asInstanceOf[LambdaFunctionScheduledEventDetails]
  }
}

