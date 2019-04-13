package typings
package awsDashSdkLib.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityScheduledEventDetails extends js.Object {
  /**
    * The maximum allowed duration between two heartbeats for the activity task.
    */
  var heartbeatInSeconds: js.UndefOr[TimeoutInSeconds] = js.undefined
  /**
    * The JSON data input to the activity task.
    */
  var input: js.UndefOr[SensitiveData] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the scheduled activity.
    */
  var resource: Arn
  /**
    * The maximum allowed duration of the activity task.
    */
  var timeoutInSeconds: js.UndefOr[TimeoutInSeconds] = js.undefined
}

object ActivityScheduledEventDetails {
  @scala.inline
  def apply(
    resource: Arn,
    heartbeatInSeconds: js.UndefOr[TimeoutInSeconds] = js.undefined,
    input: SensitiveData = null,
    timeoutInSeconds: js.UndefOr[TimeoutInSeconds] = js.undefined
  ): ActivityScheduledEventDetails = {
    val __obj = js.Dynamic.literal(resource = resource)
    if (!js.isUndefined(heartbeatInSeconds)) __obj.updateDynamic("heartbeatInSeconds")(heartbeatInSeconds)
    if (input != null) __obj.updateDynamic("input")(input)
    if (!js.isUndefined(timeoutInSeconds)) __obj.updateDynamic("timeoutInSeconds")(timeoutInSeconds)
    __obj.asInstanceOf[ActivityScheduledEventDetails]
  }
}

