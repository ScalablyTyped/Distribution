package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubmitTaskStateChangeRequest extends js.Object {
  /**
    * Any attachments associated with the state change request.
    */
  var attachments: js.UndefOr[AttachmentStateChanges] = js.undefined
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the task.
    */
  var cluster: js.UndefOr[String] = js.undefined
  /**
    * Any containers associated with the state change request.
    */
  var containers: js.UndefOr[ContainerStateChanges] = js.undefined
  /**
    * The Unix timestamp for when the task execution stopped.
    */
  var executionStoppedAt: js.UndefOr[Timestamp] = js.undefined
  /**
    * The Unix timestamp for when the container image pull began.
    */
  var pullStartedAt: js.UndefOr[Timestamp] = js.undefined
  /**
    * The Unix timestamp for when the container image pull completed.
    */
  var pullStoppedAt: js.UndefOr[Timestamp] = js.undefined
  /**
    * The reason for the state change request.
    */
  var reason: js.UndefOr[String] = js.undefined
  /**
    * The status of the state change request.
    */
  var status: js.UndefOr[String] = js.undefined
  /**
    * The task ID or full ARN of the task in the state change request.
    */
  var task: js.UndefOr[String] = js.undefined
}

object SubmitTaskStateChangeRequest {
  @scala.inline
  def apply(
    attachments: AttachmentStateChanges = null,
    cluster: String = null,
    containers: ContainerStateChanges = null,
    executionStoppedAt: Timestamp = null,
    pullStartedAt: Timestamp = null,
    pullStoppedAt: Timestamp = null,
    reason: String = null,
    status: String = null,
    task: String = null
  ): SubmitTaskStateChangeRequest = {
    val __obj = js.Dynamic.literal()
    if (attachments != null) __obj.updateDynamic("attachments")(attachments)
    if (cluster != null) __obj.updateDynamic("cluster")(cluster)
    if (containers != null) __obj.updateDynamic("containers")(containers)
    if (executionStoppedAt != null) __obj.updateDynamic("executionStoppedAt")(executionStoppedAt)
    if (pullStartedAt != null) __obj.updateDynamic("pullStartedAt")(pullStartedAt)
    if (pullStoppedAt != null) __obj.updateDynamic("pullStoppedAt")(pullStoppedAt)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (status != null) __obj.updateDynamic("status")(status)
    if (task != null) __obj.updateDynamic("task")(task)
    __obj.asInstanceOf[SubmitTaskStateChangeRequest]
  }
}

