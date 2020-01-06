package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assignment extends js.Object {
  /**
    *  The date and time the Worker accepted the assignment.
    */
  var AcceptTime: js.UndefOr[Timestamp] = js.native
  /**
    *  The Worker's answers submitted for the HIT contained in a QuestionFormAnswers document, if the Worker provides an answer. If the Worker does not provide any answers, Answer may contain a QuestionFormAnswers document, or Answer may be empty.
    */
  var Answer: js.UndefOr[String] = js.native
  /**
    *  If the Worker has submitted results and the Requester has approved the results, ApprovalTime is the date and time the Requester approved the results. This value is omitted from the assignment if the Requester has not yet approved the results.
    */
  var ApprovalTime: js.UndefOr[Timestamp] = js.native
  /**
    *  A unique identifier for the assignment.
    */
  var AssignmentId: js.UndefOr[EntityId] = js.native
  /**
    *  The status of the assignment.
    */
  var AssignmentStatus: js.UndefOr[typings.awsDashSdk.clientsMturkMod.AssignmentStatus] = js.native
  /**
    *  If results have been submitted, AutoApprovalTime is the date and time the results of the assignment results are considered Approved automatically if they have not already been explicitly approved or rejected by the Requester. This value is derived from the auto-approval delay specified by the Requester in the HIT. This value is omitted from the assignment if the Worker has not yet submitted results.
    */
  var AutoApprovalTime: js.UndefOr[Timestamp] = js.native
  /**
    *  The date and time of the deadline for the assignment. This value is derived from the deadline specification for the HIT and the date and time the Worker accepted the HIT.
    */
  var Deadline: js.UndefOr[Timestamp] = js.native
  /**
    *  The ID of the HIT.
    */
  var HITId: js.UndefOr[EntityId] = js.native
  /**
    *  If the Worker has submitted results and the Requester has rejected the results, RejectionTime is the date and time the Requester rejected the results.
    */
  var RejectionTime: js.UndefOr[Timestamp] = js.native
  /**
    *  The feedback string included with the call to the ApproveAssignment operation or the RejectAssignment operation, if the Requester approved or rejected the assignment and specified feedback.
    */
  var RequesterFeedback: js.UndefOr[String] = js.native
  /**
    *  If the Worker has submitted results, SubmitTime is the date and time the assignment was submitted. This value is omitted from the assignment if the Worker has not yet submitted results.
    */
  var SubmitTime: js.UndefOr[Timestamp] = js.native
  /**
    *  The ID of the Worker who accepted the HIT.
    */
  var WorkerId: js.UndefOr[CustomerId] = js.native
}

object Assignment {
  @scala.inline
  def apply(
    AcceptTime: Timestamp = null,
    Answer: String = null,
    ApprovalTime: Timestamp = null,
    AssignmentId: EntityId = null,
    AssignmentStatus: AssignmentStatus = null,
    AutoApprovalTime: Timestamp = null,
    Deadline: Timestamp = null,
    HITId: EntityId = null,
    RejectionTime: Timestamp = null,
    RequesterFeedback: String = null,
    SubmitTime: Timestamp = null,
    WorkerId: CustomerId = null
  ): Assignment = {
    val __obj = js.Dynamic.literal()
    if (AcceptTime != null) __obj.updateDynamic("AcceptTime")(AcceptTime.asInstanceOf[js.Any])
    if (Answer != null) __obj.updateDynamic("Answer")(Answer.asInstanceOf[js.Any])
    if (ApprovalTime != null) __obj.updateDynamic("ApprovalTime")(ApprovalTime.asInstanceOf[js.Any])
    if (AssignmentId != null) __obj.updateDynamic("AssignmentId")(AssignmentId.asInstanceOf[js.Any])
    if (AssignmentStatus != null) __obj.updateDynamic("AssignmentStatus")(AssignmentStatus.asInstanceOf[js.Any])
    if (AutoApprovalTime != null) __obj.updateDynamic("AutoApprovalTime")(AutoApprovalTime.asInstanceOf[js.Any])
    if (Deadline != null) __obj.updateDynamic("Deadline")(Deadline.asInstanceOf[js.Any])
    if (HITId != null) __obj.updateDynamic("HITId")(HITId.asInstanceOf[js.Any])
    if (RejectionTime != null) __obj.updateDynamic("RejectionTime")(RejectionTime.asInstanceOf[js.Any])
    if (RequesterFeedback != null) __obj.updateDynamic("RequesterFeedback")(RequesterFeedback.asInstanceOf[js.Any])
    if (SubmitTime != null) __obj.updateDynamic("SubmitTime")(SubmitTime.asInstanceOf[js.Any])
    if (WorkerId != null) __obj.updateDynamic("WorkerId")(WorkerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assignment]
  }
}

