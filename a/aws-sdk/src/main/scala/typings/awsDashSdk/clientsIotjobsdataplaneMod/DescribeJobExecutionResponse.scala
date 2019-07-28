package typings.awsDashSdk.clientsIotjobsdataplaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeJobExecutionResponse extends js.Object {
  /**
    * Contains data about a job execution.
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

