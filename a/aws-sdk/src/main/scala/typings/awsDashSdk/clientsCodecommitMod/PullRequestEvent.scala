package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullRequestEvent extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the user whose actions resulted in the event. Examples include updating the pull request with more commits or changing the status of a pull request.
    */
  var actorArn: js.UndefOr[Arn] = js.native
  /**
    * Information about a pull request event.
    */
  var approvalRuleEventMetadata: js.UndefOr[ApprovalRuleEventMetadata] = js.native
  /**
    * Information about an approval rule override event for a pull request.
    */
  var approvalRuleOverriddenEventMetadata: js.UndefOr[ApprovalRuleOverriddenEventMetadata] = js.native
  /**
    * Information about an approval state change for a pull request.
    */
  var approvalStateChangedEventMetadata: js.UndefOr[ApprovalStateChangedEventMetadata] = js.native
  /**
    * The day and time of the pull request event, in timestamp format.
    */
  var eventDate: js.UndefOr[EventDate] = js.native
  /**
    * Information about the source and destination branches for the pull request.
    */
  var pullRequestCreatedEventMetadata: js.UndefOr[PullRequestCreatedEventMetadata] = js.native
  /**
    * The type of the pull request event (for example, a status change event (PULL_REQUEST_STATUS_CHANGED) or update event (PULL_REQUEST_SOURCE_REFERENCE_UPDATED)).
    */
  var pullRequestEventType: js.UndefOr[PullRequestEventType] = js.native
  /**
    * The system-generated ID of the pull request.
    */
  var pullRequestId: js.UndefOr[PullRequestId] = js.native
  /**
    * Information about the change in mergability state for the pull request event.
    */
  var pullRequestMergedStateChangedEventMetadata: js.UndefOr[PullRequestMergedStateChangedEventMetadata] = js.native
  /**
    * Information about the updated source branch for the pull request event. 
    */
  var pullRequestSourceReferenceUpdatedEventMetadata: js.UndefOr[PullRequestSourceReferenceUpdatedEventMetadata] = js.native
  /**
    * Information about the change in status for the pull request event.
    */
  var pullRequestStatusChangedEventMetadata: js.UndefOr[PullRequestStatusChangedEventMetadata] = js.native
}

object PullRequestEvent {
  @scala.inline
  def apply(
    actorArn: Arn = null,
    approvalRuleEventMetadata: ApprovalRuleEventMetadata = null,
    approvalRuleOverriddenEventMetadata: ApprovalRuleOverriddenEventMetadata = null,
    approvalStateChangedEventMetadata: ApprovalStateChangedEventMetadata = null,
    eventDate: EventDate = null,
    pullRequestCreatedEventMetadata: PullRequestCreatedEventMetadata = null,
    pullRequestEventType: PullRequestEventType = null,
    pullRequestId: PullRequestId = null,
    pullRequestMergedStateChangedEventMetadata: PullRequestMergedStateChangedEventMetadata = null,
    pullRequestSourceReferenceUpdatedEventMetadata: PullRequestSourceReferenceUpdatedEventMetadata = null,
    pullRequestStatusChangedEventMetadata: PullRequestStatusChangedEventMetadata = null
  ): PullRequestEvent = {
    val __obj = js.Dynamic.literal()
    if (actorArn != null) __obj.updateDynamic("actorArn")(actorArn.asInstanceOf[js.Any])
    if (approvalRuleEventMetadata != null) __obj.updateDynamic("approvalRuleEventMetadata")(approvalRuleEventMetadata.asInstanceOf[js.Any])
    if (approvalRuleOverriddenEventMetadata != null) __obj.updateDynamic("approvalRuleOverriddenEventMetadata")(approvalRuleOverriddenEventMetadata.asInstanceOf[js.Any])
    if (approvalStateChangedEventMetadata != null) __obj.updateDynamic("approvalStateChangedEventMetadata")(approvalStateChangedEventMetadata.asInstanceOf[js.Any])
    if (eventDate != null) __obj.updateDynamic("eventDate")(eventDate.asInstanceOf[js.Any])
    if (pullRequestCreatedEventMetadata != null) __obj.updateDynamic("pullRequestCreatedEventMetadata")(pullRequestCreatedEventMetadata.asInstanceOf[js.Any])
    if (pullRequestEventType != null) __obj.updateDynamic("pullRequestEventType")(pullRequestEventType.asInstanceOf[js.Any])
    if (pullRequestId != null) __obj.updateDynamic("pullRequestId")(pullRequestId.asInstanceOf[js.Any])
    if (pullRequestMergedStateChangedEventMetadata != null) __obj.updateDynamic("pullRequestMergedStateChangedEventMetadata")(pullRequestMergedStateChangedEventMetadata.asInstanceOf[js.Any])
    if (pullRequestSourceReferenceUpdatedEventMetadata != null) __obj.updateDynamic("pullRequestSourceReferenceUpdatedEventMetadata")(pullRequestSourceReferenceUpdatedEventMetadata.asInstanceOf[js.Any])
    if (pullRequestStatusChangedEventMetadata != null) __obj.updateDynamic("pullRequestStatusChangedEventMetadata")(pullRequestStatusChangedEventMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullRequestEvent]
  }
}

