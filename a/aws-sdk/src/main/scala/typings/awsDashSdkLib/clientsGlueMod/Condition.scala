package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Condition extends js.Object {
  /**
    * The name of the job whose JobRuns this condition applies to, and on which this trigger waits.
    */
  var JobName: js.UndefOr[NameString] = js.undefined
  /**
    * A logical operator.
    */
  var LogicalOperator: js.UndefOr[LogicalOperator] = js.undefined
  /**
    * The condition state. Currently, the values supported are SUCCEEDED, STOPPED, TIMEOUT, and FAILED.
    */
  var State: js.UndefOr[JobRunState] = js.undefined
}

object Condition {
  @scala.inline
  def apply(JobName: NameString = null, LogicalOperator: LogicalOperator = null, State: JobRunState = null): Condition = {
    val __obj = js.Dynamic.literal()
    if (JobName != null) __obj.updateDynamic("JobName")(JobName)
    if (LogicalOperator != null) __obj.updateDynamic("LogicalOperator")(LogicalOperator.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
}

