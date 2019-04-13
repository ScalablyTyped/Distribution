package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeContainerInstancesResponse extends js.Object {
  /**
    * The list of container instances.
    */
  var containerInstances: js.UndefOr[ContainerInstances] = js.undefined
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[Failures] = js.undefined
}

object DescribeContainerInstancesResponse {
  @scala.inline
  def apply(containerInstances: ContainerInstances = null, failures: Failures = null): DescribeContainerInstancesResponse = {
    val __obj = js.Dynamic.literal()
    if (containerInstances != null) __obj.updateDynamic("containerInstances")(containerInstances)
    if (failures != null) __obj.updateDynamic("failures")(failures)
    __obj.asInstanceOf[DescribeContainerInstancesResponse]
  }
}

