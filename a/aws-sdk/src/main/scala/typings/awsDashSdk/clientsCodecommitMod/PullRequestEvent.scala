package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullRequestEvent extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the user whose actions resulted in the event. Examples include updating the pull request with additional commits or changing the status of a pull request.
    */
  var actorArn: js.UndefOr[Arn] = js.undefined
  /**
    * The day and time of the pull request event, in timestamp format.
    */
  var eventDate: js.UndefOr[EventDate] = js.undefined
  /**
    * Information about the source and destination branches for the pull request.
    */
  var pullRequestCreatedEventMetadata: js.UndefOr[PullRequestCreatedEventMetadata] = js.undefined
  /**
    * The type of the pull request event, for example a status change event (PULL_REQUEST_STATUS_CHANGED) or update event (PULL_REQUEST_SOURCE_REFERENCE_UPDATED).
    */
  var pullRequestEventType: js.UndefOr[PullRequestEventType] = js.undefined
  /**
    * The system-generated ID of the pull request.
    */
  var pullRequestId: js.UndefOr[PullRequestId] = js.undefined
  /**
    * Information about the change in mergability state for the pull request event.
    */
  var pullRequestMergedStateChangedEventMetadata: js.UndefOr[PullRequestMergedStateChangedEventMetadata] = js.undefined
  /**
    * Information about the updated source branch for the pull request event. 
    */
  var pullRequestSourceReferenceUpdatedEventMetadata: js.UndefOr[PullRequestSourceReferenceUpdatedEventMetadata] = js.undefined
  /**
    * Information about the change in status for the pull request event.
    */
  var pullRequestStatusChangedEventMetadata: js.UndefOr[PullRequestStatusChangedEventMetadata] = js.undefined
}

object PullRequestEvent {
  @scala.inline
  def apply(
    actorArn: Arn = null,
    eventDate: EventDate = null,
    pullRequestCreatedEventMetadata: PullRequestCreatedEventMetadata = null,
    pullRequestEventType: PullRequestEventType = null,
    pullRequestId: PullRequestId = null,
    pullRequestMergedStateChangedEventMetadata: PullRequestMergedStateChangedEventMetadata = null,
    pullRequestSourceReferenceUpdatedEventMetadata: PullRequestSourceReferenceUpdatedEventMetadata = null,
    pullRequestStatusChangedEventMetadata: PullRequestStatusChangedEventMetadata = null
  ): PullRequestEvent = {
    val __obj = js.Dynamic.literal()
    if (actorArn != null) __obj.updateDynamic("actorArn")(actorArn)
    if (eventDate != null) __obj.updateDynamic("eventDate")(eventDate)
    if (pullRequestCreatedEventMetadata != null) __obj.updateDynamic("pullRequestCreatedEventMetadata")(pullRequestCreatedEventMetadata)
    if (pullRequestEventType != null) __obj.updateDynamic("pullRequestEventType")(pullRequestEventType.asInstanceOf[js.Any])
    if (pullRequestId != null) __obj.updateDynamic("pullRequestId")(pullRequestId)
    if (pullRequestMergedStateChangedEventMetadata != null) __obj.updateDynamic("pullRequestMergedStateChangedEventMetadata")(pullRequestMergedStateChangedEventMetadata)
    if (pullRequestSourceReferenceUpdatedEventMetadata != null) __obj.updateDynamic("pullRequestSourceReferenceUpdatedEventMetadata")(pullRequestSourceReferenceUpdatedEventMetadata)
    if (pullRequestStatusChangedEventMetadata != null) __obj.updateDynamic("pullRequestStatusChangedEventMetadata")(pullRequestStatusChangedEventMetadata)
    __obj.asInstanceOf[PullRequestEvent]
  }
}

