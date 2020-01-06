package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PollForThirdPartyJobsOutput extends js.Object {
  /**
    * Information about the jobs to take action on.
    */
  var jobs: js.UndefOr[ThirdPartyJobList] = js.native
}

object PollForThirdPartyJobsOutput {
  @scala.inline
  def apply(jobs: ThirdPartyJobList = null): PollForThirdPartyJobsOutput = {
    val __obj = js.Dynamic.literal()
    if (jobs != null) __obj.updateDynamic("jobs")(jobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollForThirdPartyJobsOutput]
  }
}

