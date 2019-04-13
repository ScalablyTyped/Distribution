package typings
package awsDashSdkLib.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEndPointStateOutput extends js.Object {
  /**
    * Information about the health of the instances.
    */
  var InstanceStates: js.UndefOr[InstanceStates] = js.undefined
}

object DescribeEndPointStateOutput {
  @scala.inline
  def apply(InstanceStates: InstanceStates = null): DescribeEndPointStateOutput = {
    val __obj = js.Dynamic.literal()
    if (InstanceStates != null) __obj.updateDynamic("InstanceStates")(InstanceStates)
    __obj.asInstanceOf[DescribeEndPointStateOutput]
  }
}

