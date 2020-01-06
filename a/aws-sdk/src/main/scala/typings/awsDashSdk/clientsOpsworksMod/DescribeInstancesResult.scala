package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInstancesResult extends js.Object {
  /**
    * An array of Instance objects that describe the instances.
    */
  var Instances: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.Instances] = js.native
}

object DescribeInstancesResult {
  @scala.inline
  def apply(Instances: Instances = null): DescribeInstancesResult = {
    val __obj = js.Dynamic.literal()
    if (Instances != null) __obj.updateDynamic("Instances")(Instances.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInstancesResult]
  }
}

