package typings.awsDashSdk.clientsIotjobsdataplaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeJobExecutionResponse extends js.Object {
  /**
    * Contains data about a job execution.
    */
  var execution: js.UndefOr[JobExecution] = js.native
}

object DescribeJobExecutionResponse {
  @scala.inline
  def apply(execution: JobExecution = null): DescribeJobExecutionResponse = {
    val __obj = js.Dynamic.literal()
    if (execution != null) __obj.updateDynamic("execution")(execution.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJobExecutionResponse]
  }
}

