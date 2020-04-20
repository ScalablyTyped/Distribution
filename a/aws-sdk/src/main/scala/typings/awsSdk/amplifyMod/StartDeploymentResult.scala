package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartDeploymentResult extends js.Object {
  /**
    *  Summary for the Job. 
    */
  var jobSummary: JobSummary = js.native
}

object StartDeploymentResult {
  @scala.inline
  def apply(jobSummary: JobSummary): StartDeploymentResult = {
    val __obj = js.Dynamic.literal(jobSummary = jobSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDeploymentResult]
  }
}

