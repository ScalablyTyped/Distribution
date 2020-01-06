package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoMLCandidate extends js.Object {
  /**
    * The candidate name.
    */
  var CandidateName: typings.awsDashSdk.clientsSagemakerMod.CandidateName = js.native
  /**
    * The candidate's status.
    */
  var CandidateStatus: typings.awsDashSdk.clientsSagemakerMod.CandidateStatus = js.native
  /**
    * The candidate's steps.
    */
  var CandidateSteps: typings.awsDashSdk.clientsSagemakerMod.CandidateSteps = js.native
  /**
    * The creation time.
    */
  var CreationTime: Timestamp = js.native
  /**
    * The end time.
    */
  var EndTime: js.UndefOr[Timestamp] = js.native
  /**
    * The failure reason.
    */
  var FailureReason: js.UndefOr[AutoMLFailureReason] = js.native
  var FinalAutoMLJobObjectiveMetric: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.FinalAutoMLJobObjectiveMetric] = js.native
  /**
    * The inference containers.
    */
  var InferenceContainers: js.UndefOr[AutoMLContainerDefinitions] = js.native
  /**
    * The last modified time.
    */
  var LastModifiedTime: Timestamp = js.native
  /**
    * The objective status.
    */
  var ObjectiveStatus: typings.awsDashSdk.clientsSagemakerMod.ObjectiveStatus = js.native
}

object AutoMLCandidate {
  @scala.inline
  def apply(
    CandidateName: CandidateName,
    CandidateStatus: CandidateStatus,
    CandidateSteps: CandidateSteps,
    CreationTime: Timestamp,
    LastModifiedTime: Timestamp,
    ObjectiveStatus: ObjectiveStatus,
    EndTime: Timestamp = null,
    FailureReason: AutoMLFailureReason = null,
    FinalAutoMLJobObjectiveMetric: FinalAutoMLJobObjectiveMetric = null,
    InferenceContainers: AutoMLContainerDefinitions = null
  ): AutoMLCandidate = {
    val __obj = js.Dynamic.literal(CandidateName = CandidateName.asInstanceOf[js.Any], CandidateStatus = CandidateStatus.asInstanceOf[js.Any], CandidateSteps = CandidateSteps.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], ObjectiveStatus = ObjectiveStatus.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    if (FinalAutoMLJobObjectiveMetric != null) __obj.updateDynamic("FinalAutoMLJobObjectiveMetric")(FinalAutoMLJobObjectiveMetric.asInstanceOf[js.Any])
    if (InferenceContainers != null) __obj.updateDynamic("InferenceContainers")(InferenceContainers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLCandidate]
  }
}

