package typings.awsDashSdk.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobListEntry extends js.Object {
  /**
    * The creation date for this job.
    */
  var CreationDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The optional description of this specific job, for example Important Photos 2016-08-11.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * A value that indicates that this job is a master job. A master job represents a successful request to create an export job. Master jobs aren't associated with any Snowballs. Instead, each master job will have at least one job part, and each job part is associated with a Snowball. It might take some time before the job parts associated with a particular master job are listed, because they are created after the master job is created.
    */
  var IsMaster: js.UndefOr[Boolean] = js.undefined
  /**
    * The automatically generated ID for a job, for example JID123e4567-e89b-12d3-a456-426655440000.
    */
  var JobId: js.UndefOr[String] = js.undefined
  /**
    * The current state of this job.
    */
  var JobState: js.UndefOr[typings.awsDashSdk.clientsSnowballMod.JobState] = js.undefined
  /**
    * The type of job.
    */
  var JobType: js.UndefOr[typings.awsDashSdk.clientsSnowballMod.JobType] = js.undefined
  /**
    * The type of device used with this job.
    */
  var SnowballType: js.UndefOr[typings.awsDashSdk.clientsSnowballMod.SnowballType] = js.undefined
}

object JobListEntry {
  @scala.inline
  def apply(
    CreationDate: Timestamp = null,
    Description: String = null,
    IsMaster: js.UndefOr[Boolean] = js.undefined,
    JobId: String = null,
    JobState: JobState = null,
    JobType: JobType = null,
    SnowballType: SnowballType = null
  ): JobListEntry = {
    val __obj = js.Dynamic.literal()
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(IsMaster)) __obj.updateDynamic("IsMaster")(IsMaster)
    if (JobId != null) __obj.updateDynamic("JobId")(JobId)
    if (JobState != null) __obj.updateDynamic("JobState")(JobState.asInstanceOf[js.Any])
    if (JobType != null) __obj.updateDynamic("JobType")(JobType.asInstanceOf[js.Any])
    if (SnowballType != null) __obj.updateDynamic("SnowballType")(SnowballType.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobListEntry]
  }
}

