package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PollForJobsOutput extends js.Object {
  /**
    * Information about the jobs to take action on.
    */
  var jobs: js.UndefOr[JobList] = js.native
}

object PollForJobsOutput {
  @scala.inline
  def apply(jobs: JobList = null): PollForJobsOutput = {
    val __obj = js.Dynamic.literal()
    if (jobs != null) __obj.updateDynamic("jobs")(jobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollForJobsOutput]
  }
}

