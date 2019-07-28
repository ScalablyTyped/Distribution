package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetJobDetailsOutput extends js.Object {
  /**
    * The details of the job.  If AWSSessionCredentials is used, a long-running job can call GetJobDetails again to obtain new credentials. 
    */
  var jobDetails: js.UndefOr[JobDetails] = js.undefined
}

object GetJobDetailsOutput {
  @scala.inline
  def apply(jobDetails: JobDetails = null): GetJobDetailsOutput = {
    val __obj = js.Dynamic.literal()
    if (jobDetails != null) __obj.updateDynamic("jobDetails")(jobDetails)
    __obj.asInstanceOf[GetJobDetailsOutput]
  }
}

