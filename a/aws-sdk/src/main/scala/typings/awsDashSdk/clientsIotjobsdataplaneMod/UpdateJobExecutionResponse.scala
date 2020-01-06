package typings.awsDashSdk.clientsIotjobsdataplaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateJobExecutionResponse extends js.Object {
  /**
    * A JobExecutionState object.
    */
  var executionState: js.UndefOr[JobExecutionState] = js.native
  /**
    * The contents of the Job Documents.
    */
  var jobDocument: js.UndefOr[JobDocument] = js.native
}

object UpdateJobExecutionResponse {
  @scala.inline
  def apply(executionState: JobExecutionState = null, jobDocument: JobDocument = null): UpdateJobExecutionResponse = {
    val __obj = js.Dynamic.literal()
    if (executionState != null) __obj.updateDynamic("executionState")(executionState.asInstanceOf[js.Any])
    if (jobDocument != null) __obj.updateDynamic("jobDocument")(jobDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobExecutionResponse]
  }
}

