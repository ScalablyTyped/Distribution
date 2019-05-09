package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelingJobForWorkteamSummary extends js.Object {
  /**
    * The date and time that the labeling job was created.
    */
  var CreationTime: Timestamp
  /**
    * A unique identifier for a labeling job. You can use this to refer to a specific labeling job.
    */
  var JobReferenceCode: awsDashSdkLib.clientsSagemakerMod.JobReferenceCode
  /**
    * Provides information about the progress of a labeling job.
    */
  var LabelCounters: js.UndefOr[LabelCountersForWorkteam] = js.undefined
  /**
    * The name of the labeling job that the work team is assigned to.
    */
  var LabelingJobName: js.UndefOr[LabelingJobName] = js.undefined
  /**
    * The configured number of workers per data object.
    */
  var NumberOfHumanWorkersPerDataObject: js.UndefOr[NumberOfHumanWorkersPerDataObject] = js.undefined
  /**
    * 
    */
  var WorkRequesterAccountId: AccountId
}

object LabelingJobForWorkteamSummary {
  @scala.inline
  def apply(
    CreationTime: Timestamp,
    JobReferenceCode: JobReferenceCode,
    WorkRequesterAccountId: AccountId,
    LabelCounters: LabelCountersForWorkteam = null,
    LabelingJobName: LabelingJobName = null,
    NumberOfHumanWorkersPerDataObject: js.UndefOr[NumberOfHumanWorkersPerDataObject] = js.undefined
  ): LabelingJobForWorkteamSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime, JobReferenceCode = JobReferenceCode, WorkRequesterAccountId = WorkRequesterAccountId)
    if (LabelCounters != null) __obj.updateDynamic("LabelCounters")(LabelCounters)
    if (LabelingJobName != null) __obj.updateDynamic("LabelingJobName")(LabelingJobName)
    if (!js.isUndefined(NumberOfHumanWorkersPerDataObject)) __obj.updateDynamic("NumberOfHumanWorkersPerDataObject")(NumberOfHumanWorkersPerDataObject)
    __obj.asInstanceOf[LabelingJobForWorkteamSummary]
  }
}

