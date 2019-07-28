package typings.awsDashSdk.clientsIotjobsdataplaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartNextPendingJobExecutionResponse extends js.Object {
  /**
    * A JobExecution object.
    */
  var execution: js.UndefOr[JobExecution] = js.undefined
}

object StartNextPendingJobExecutionResponse {
  @scala.inline
  def apply(execution: JobExecution = null): StartNextPendingJobExecutionResponse = {
    val __obj = js.Dynamic.literal()
    if (execution != null) __obj.updateDynamic("execution")(execution)
    __obj.asInstanceOf[StartNextPendingJobExecutionResponse]
  }
}

