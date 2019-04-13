package typings
package awsDashSdkLib.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubmitJobResponse extends js.Object {
  /**
    * The unique identifier for the job.
    */
  var jobId: String
  /**
    * The name of the job. 
    */
  var jobName: String
}

object SubmitJobResponse {
  @scala.inline
  def apply(jobId: String, jobName: String): SubmitJobResponse = {
    val __obj = js.Dynamic.literal(jobId = jobId, jobName = jobName)
  
    __obj.asInstanceOf[SubmitJobResponse]
  }
}

