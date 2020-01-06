package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeContainerInstancesResponse extends js.Object {
  /**
    * The list of container instances.
    */
  var containerInstances: js.UndefOr[ContainerInstances] = js.native
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[Failures] = js.native
}

object DescribeContainerInstancesResponse {
  @scala.inline
  def apply(containerInstances: ContainerInstances = null, failures: Failures = null): DescribeContainerInstancesResponse = {
    val __obj = js.Dynamic.literal()
    if (containerInstances != null) __obj.updateDynamic("containerInstances")(containerInstances.asInstanceOf[js.Any])
    if (failures != null) __obj.updateDynamic("failures")(failures.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeContainerInstancesResponse]
  }
}

