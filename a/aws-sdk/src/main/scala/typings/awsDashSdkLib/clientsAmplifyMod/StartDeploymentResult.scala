package typings
package awsDashSdkLib.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartDeploymentResult extends js.Object {
  /**
    *  Summary for the Job. 
    */
  var jobSummary: JobSummary
}

object StartDeploymentResult {
  @scala.inline
  def apply(jobSummary: JobSummary): StartDeploymentResult = {
    val __obj = js.Dynamic.literal(jobSummary = jobSummary)
  
    __obj.asInstanceOf[StartDeploymentResult]
  }
}

