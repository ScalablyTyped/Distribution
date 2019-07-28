package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateContainerInstancesStateResponse extends js.Object {
  /**
    * The list of container instances.
    */
  var containerInstances: js.UndefOr[ContainerInstances] = js.undefined
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[Failures] = js.undefined
}

object UpdateContainerInstancesStateResponse {
  @scala.inline
  def apply(containerInstances: ContainerInstances = null, failures: Failures = null): UpdateContainerInstancesStateResponse = {
    val __obj = js.Dynamic.literal()
    if (containerInstances != null) __obj.updateDynamic("containerInstances")(containerInstances)
    if (failures != null) __obj.updateDynamic("failures")(failures)
    __obj.asInstanceOf[UpdateContainerInstancesStateResponse]
  }
}

