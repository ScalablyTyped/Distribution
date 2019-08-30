package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubmitContainerStateChangeRequest extends js.Object {
  /**
    * The short name or full ARN of the cluster that hosts the container.
    */
  var cluster: js.UndefOr[String] = js.undefined
  /**
    * The name of the container.
    */
  var containerName: js.UndefOr[String] = js.undefined
  /**
    * The exit code returned for the state change request.
    */
  var exitCode: js.UndefOr[BoxedInteger] = js.undefined
  /**
    * The network bindings of the container.
    */
  var networkBindings: js.UndefOr[NetworkBindings] = js.undefined
  /**
    * The reason for the state change request.
    */
  var reason: js.UndefOr[String] = js.undefined
  /**
    * The ID of the Docker container.
    */
  var runtimeId: js.UndefOr[String] = js.undefined
  /**
    * The status of the state change request.
    */
  var status: js.UndefOr[String] = js.undefined
  /**
    * The task ID or full Amazon Resource Name (ARN) of the task that hosts the container.
    */
  var task: js.UndefOr[String] = js.undefined
}

object SubmitContainerStateChangeRequest {
  @scala.inline
  def apply(
    cluster: String = null,
    containerName: String = null,
    exitCode: js.UndefOr[BoxedInteger] = js.undefined,
    networkBindings: NetworkBindings = null,
    reason: String = null,
    runtimeId: String = null,
    status: String = null,
    task: String = null
  ): SubmitContainerStateChangeRequest = {
    val __obj = js.Dynamic.literal()
    if (cluster != null) __obj.updateDynamic("cluster")(cluster)
    if (containerName != null) __obj.updateDynamic("containerName")(containerName)
    if (!js.isUndefined(exitCode)) __obj.updateDynamic("exitCode")(exitCode)
    if (networkBindings != null) __obj.updateDynamic("networkBindings")(networkBindings)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (runtimeId != null) __obj.updateDynamic("runtimeId")(runtimeId)
    if (status != null) __obj.updateDynamic("status")(status)
    if (task != null) __obj.updateDynamic("task")(task)
    __obj.asInstanceOf[SubmitContainerStateChangeRequest]
  }
}

