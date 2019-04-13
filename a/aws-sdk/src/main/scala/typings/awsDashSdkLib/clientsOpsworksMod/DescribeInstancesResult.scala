package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeInstancesResult extends js.Object {
  /**
    * An array of Instance objects that describe the instances.
    */
  var Instances: js.UndefOr[Instances] = js.undefined
}

object DescribeInstancesResult {
  @scala.inline
  def apply(Instances: Instances = null): DescribeInstancesResult = {
    val __obj = js.Dynamic.literal()
    if (Instances != null) __obj.updateDynamic("Instances")(Instances)
    __obj.asInstanceOf[DescribeInstancesResult]
  }
}

