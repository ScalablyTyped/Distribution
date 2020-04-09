package typings.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentEvent extends js.Object {
  /**
    * A description of the deployment event. Descriptions include, but are not limited to, the user account or the CloudWatch alarm ARN that initiated a rollback, the percentage of hosts that received the deployment, or in the case of an internal error, a recommendation to attempt a new deployment.
    */
  var Description: js.UndefOr[typings.awsSdk.appconfigMod.Description] = js.native
  /**
    * The type of deployment event. Deployment event types include the start, stop, or completion of a deployment; a percentage update; the start or stop of a bake period; the start or completion of a rollback.
    */
  var EventType: js.UndefOr[DeploymentEventType] = js.native
  /**
    * The date and time the event occurred.
    */
  var OccurredAt: js.UndefOr[Iso8601DateTime] = js.native
  /**
    * The entity that triggered the deployment event. Events can be triggered by a user, AWS AppConfig, an Amazon CloudWatch alarm, or an internal error.
    */
  var TriggeredBy: js.UndefOr[typings.awsSdk.appconfigMod.TriggeredBy] = js.native
}

object DeploymentEvent {
  @scala.inline
  def apply(
    Description: Description = null,
    EventType: DeploymentEventType = null,
    OccurredAt: Iso8601DateTime = null,
    TriggeredBy: TriggeredBy = null
  ): DeploymentEvent = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (EventType != null) __obj.updateDynamic("EventType")(EventType.asInstanceOf[js.Any])
    if (OccurredAt != null) __obj.updateDynamic("OccurredAt")(OccurredAt.asInstanceOf[js.Any])
    if (TriggeredBy != null) __obj.updateDynamic("TriggeredBy")(TriggeredBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentEvent]
  }
}

