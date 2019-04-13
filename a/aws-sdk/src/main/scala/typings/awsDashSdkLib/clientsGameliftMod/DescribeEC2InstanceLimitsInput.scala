package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEC2InstanceLimitsInput extends js.Object {
  /**
    * Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the computing resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. Amazon GameLift supports the following EC2 instance types. See Amazon EC2 Instance Types for detailed descriptions. Leave this parameter blank to retrieve limits for all types.
    */
  var EC2InstanceType: js.UndefOr[EC2InstanceType] = js.undefined
}

object DescribeEC2InstanceLimitsInput {
  @scala.inline
  def apply(EC2InstanceType: EC2InstanceType = null): DescribeEC2InstanceLimitsInput = {
    val __obj = js.Dynamic.literal()
    if (EC2InstanceType != null) __obj.updateDynamic("EC2InstanceType")(EC2InstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEC2InstanceLimitsInput]
  }
}

