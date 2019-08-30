package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerStateChange extends js.Object {
  /**
    * The name of the container.
    */
  var containerName: js.UndefOr[String] = js.undefined
  /**
    * The exit code for the container, if the state change is a result of the container exiting.
    */
  var exitCode: js.UndefOr[BoxedInteger] = js.undefined
  /**
    * Any network bindings associated with the container.
    */
  var networkBindings: js.UndefOr[NetworkBindings] = js.undefined
  /**
    * The reason for the state change.
    */
  var reason: js.UndefOr[String] = js.undefined
  /**
    * The ID of the Docker container.
    */
  var runtimeId: js.UndefOr[String] = js.undefined
  /**
    * The status of the container.
    */
  var status: js.UndefOr[String] = js.undefined
}

object ContainerStateChange {
  @scala.inline
  def apply(
    containerName: String = null,
    exitCode: js.UndefOr[BoxedInteger] = js.undefined,
    networkBindings: NetworkBindings = null,
    reason: String = null,
    runtimeId: String = null,
    status: String = null
  ): ContainerStateChange = {
    val __obj = js.Dynamic.literal()
    if (containerName != null) __obj.updateDynamic("containerName")(containerName)
    if (!js.isUndefined(exitCode)) __obj.updateDynamic("exitCode")(exitCode)
    if (networkBindings != null) __obj.updateDynamic("networkBindings")(networkBindings)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (runtimeId != null) __obj.updateDynamic("runtimeId")(runtimeId)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[ContainerStateChange]
  }
}

