package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PollForThirdPartyJobsOutput extends js.Object {
  /**
    * Information about the jobs to take action on.
    */
  var jobs: js.UndefOr[ThirdPartyJobList] = js.undefined
}

object PollForThirdPartyJobsOutput {
  @scala.inline
  def apply(jobs: ThirdPartyJobList = null): PollForThirdPartyJobsOutput = {
    val __obj = js.Dynamic.literal()
    if (jobs != null) __obj.updateDynamic("jobs")(jobs)
    __obj.asInstanceOf[PollForThirdPartyJobsOutput]
  }
}

