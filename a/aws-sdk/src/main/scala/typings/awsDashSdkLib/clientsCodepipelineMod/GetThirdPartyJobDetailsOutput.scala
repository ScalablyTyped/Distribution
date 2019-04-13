package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetThirdPartyJobDetailsOutput extends js.Object {
  /**
    * The details of the job, including any protected values defined for the job.
    */
  var jobDetails: js.UndefOr[ThirdPartyJobDetails] = js.undefined
}

object GetThirdPartyJobDetailsOutput {
  @scala.inline
  def apply(jobDetails: ThirdPartyJobDetails = null): GetThirdPartyJobDetailsOutput = {
    val __obj = js.Dynamic.literal()
    if (jobDetails != null) __obj.updateDynamic("jobDetails")(jobDetails)
    __obj.asInstanceOf[GetThirdPartyJobDetailsOutput]
  }
}

