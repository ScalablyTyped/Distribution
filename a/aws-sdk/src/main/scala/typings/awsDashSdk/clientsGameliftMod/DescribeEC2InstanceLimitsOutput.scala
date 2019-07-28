package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEC2InstanceLimitsOutput extends js.Object {
  /**
    * Object that contains the maximum number of instances for the specified instance type.
    */
  var EC2InstanceLimits: js.UndefOr[EC2InstanceLimitList] = js.undefined
}

object DescribeEC2InstanceLimitsOutput {
  @scala.inline
  def apply(EC2InstanceLimits: EC2InstanceLimitList = null): DescribeEC2InstanceLimitsOutput = {
    val __obj = js.Dynamic.literal()
    if (EC2InstanceLimits != null) __obj.updateDynamic("EC2InstanceLimits")(EC2InstanceLimits)
    __obj.asInstanceOf[DescribeEC2InstanceLimitsOutput]
  }
}

