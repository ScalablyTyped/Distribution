package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbortCriteria extends js.Object {
  /**
    * The type of abort action to initiate a job abort.
    */
  var action: AbortAction
  /**
    * The type of job execution failure to define a rule to initiate a job abort.
    */
  var failureType: JobExecutionFailureType
  /**
    * Minimum number of executed things before evaluating an abort rule.
    */
  var minNumberOfExecutedThings: MinimumNumberOfExecutedThings
  /**
    * The threshold as a percentage of the total number of executed things that will initiate a job abort. AWS IoT supports up to two digits after the decimal (for example, 10.9 and 10.99, but not 10.999).
    */
  var thresholdPercentage: AbortThresholdPercentage
}

object AbortCriteria {
  @scala.inline
  def apply(
    action: AbortAction,
    failureType: JobExecutionFailureType,
    minNumberOfExecutedThings: MinimumNumberOfExecutedThings,
    thresholdPercentage: AbortThresholdPercentage
  ): AbortCriteria = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], failureType = failureType.asInstanceOf[js.Any], minNumberOfExecutedThings = minNumberOfExecutedThings, thresholdPercentage = thresholdPercentage)
  
    __obj.asInstanceOf[AbortCriteria]
  }
}

