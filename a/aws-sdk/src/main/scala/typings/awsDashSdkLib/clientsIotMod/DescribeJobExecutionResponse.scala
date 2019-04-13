package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeJobExecutionResponse extends js.Object {
  /**
    * Information about the job execution.
    */
  var execution: js.UndefOr[JobExecution] = js.undefined
}

object DescribeJobExecutionResponse {
  @scala.inline
  def apply(execution: JobExecution = null): DescribeJobExecutionResponse = {
    val __obj = js.Dynamic.literal()
    if (execution != null) __obj.updateDynamic("execution")(execution)
    __obj.asInstanceOf[DescribeJobExecutionResponse]
  }
}

