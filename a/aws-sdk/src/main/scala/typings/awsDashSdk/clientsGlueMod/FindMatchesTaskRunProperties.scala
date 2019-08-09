package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindMatchesTaskRunProperties extends js.Object {
  /**
    * The job ID for the Find Matches task run.
    */
  var JobId: js.UndefOr[HashString] = js.undefined
  /**
    * The name assigned to the job for the Find Matches task run.
    */
  var JobName: js.UndefOr[NameString] = js.undefined
  /**
    * The job run ID for the Find Matches task run.
    */
  var JobRunId: js.UndefOr[HashString] = js.undefined
}

object FindMatchesTaskRunProperties {
  @scala.inline
  def apply(JobId: HashString = null, JobName: NameString = null, JobRunId: HashString = null): FindMatchesTaskRunProperties = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId)
    if (JobName != null) __obj.updateDynamic("JobName")(JobName)
    if (JobRunId != null) __obj.updateDynamic("JobRunId")(JobRunId)
    __obj.asInstanceOf[FindMatchesTaskRunProperties]
  }
}

