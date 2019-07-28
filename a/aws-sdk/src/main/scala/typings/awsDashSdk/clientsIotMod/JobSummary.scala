package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobSummary extends js.Object {
  /**
    * The time, in seconds since the epoch, when the job completed.
    */
  var completedAt: js.UndefOr[DateType] = js.undefined
  /**
    * The time, in seconds since the epoch, when the job was created.
    */
  var createdAt: js.UndefOr[DateType] = js.undefined
  /**
    * The job ARN.
    */
  var jobArn: js.UndefOr[JobArn] = js.undefined
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: js.UndefOr[JobId] = js.undefined
  /**
    * The time, in seconds since the epoch, when the job was last updated.
    */
  var lastUpdatedAt: js.UndefOr[DateType] = js.undefined
  /**
    * The job summary status.
    */
  var status: js.UndefOr[JobStatus] = js.undefined
  /**
    * Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things specified as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing when a change is detected in a target. For example, a job will run on a thing when the thing is added to a target group, even after the job was completed by all things originally in the group.
    */
  var targetSelection: js.UndefOr[TargetSelection] = js.undefined
  /**
    * The ID of the thing group.
    */
  var thingGroupId: js.UndefOr[ThingGroupId] = js.undefined
}

object JobSummary {
  @scala.inline
  def apply(
    completedAt: DateType = null,
    createdAt: DateType = null,
    jobArn: JobArn = null,
    jobId: JobId = null,
    lastUpdatedAt: DateType = null,
    status: JobStatus = null,
    targetSelection: TargetSelection = null,
    thingGroupId: ThingGroupId = null
  ): JobSummary = {
    val __obj = js.Dynamic.literal()
    if (completedAt != null) __obj.updateDynamic("completedAt")(completedAt)
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (jobArn != null) __obj.updateDynamic("jobArn")(jobArn)
    if (jobId != null) __obj.updateDynamic("jobId")(jobId)
    if (lastUpdatedAt != null) __obj.updateDynamic("lastUpdatedAt")(lastUpdatedAt)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (targetSelection != null) __obj.updateDynamic("targetSelection")(targetSelection.asInstanceOf[js.Any])
    if (thingGroupId != null) __obj.updateDynamic("thingGroupId")(thingGroupId)
    __obj.asInstanceOf[JobSummary]
  }
}

