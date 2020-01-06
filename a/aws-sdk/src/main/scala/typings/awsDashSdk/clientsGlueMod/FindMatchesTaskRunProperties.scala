package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindMatchesTaskRunProperties extends js.Object {
  /**
    * The job ID for the Find Matches task run.
    */
  var JobId: js.UndefOr[HashString] = js.native
  /**
    * The name assigned to the job for the Find Matches task run.
    */
  var JobName: js.UndefOr[NameString] = js.native
  /**
    * The job run ID for the Find Matches task run.
    */
  var JobRunId: js.UndefOr[HashString] = js.native
}

object FindMatchesTaskRunProperties {
  @scala.inline
  def apply(JobId: HashString = null, JobName: NameString = null, JobRunId: HashString = null): FindMatchesTaskRunProperties = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId.asInstanceOf[js.Any])
    if (JobName != null) __obj.updateDynamic("JobName")(JobName.asInstanceOf[js.Any])
    if (JobRunId != null) __obj.updateDynamic("JobRunId")(JobRunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindMatchesTaskRunProperties]
  }
}

