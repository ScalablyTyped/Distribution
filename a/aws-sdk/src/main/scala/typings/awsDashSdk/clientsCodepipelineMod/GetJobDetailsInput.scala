package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetJobDetailsInput extends js.Object {
  /**
    * The unique system-generated ID for the job.
    */
  var jobId: JobId
}

object GetJobDetailsInput {
  @scala.inline
  def apply(jobId: JobId): GetJobDetailsInput = {
    val __obj = js.Dynamic.literal(jobId = jobId)
  
    __obj.asInstanceOf[GetJobDetailsInput]
  }
}

