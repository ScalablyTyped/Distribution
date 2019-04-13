package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepExecutionFilter extends js.Object {
  /**
    * One or more keys to limit the results. Valid filter keys include the following: StepName, Action, StepExecutionId, StepExecutionStatus, StartTimeBefore, StartTimeAfter.
    */
  var Key: StepExecutionFilterKey
  /**
    * The values of the filter key.
    */
  var Values: StepExecutionFilterValueList
}

object StepExecutionFilter {
  @scala.inline
  def apply(Key: StepExecutionFilterKey, Values: StepExecutionFilterValueList): StepExecutionFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Values = Values)
  
    __obj.asInstanceOf[StepExecutionFilter]
  }
}

