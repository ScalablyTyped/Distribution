package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRdsDbInstancesRequest extends js.Object {
  /**
    * An array containing the ARNs of the instances to be described.
    */
  var RdsDbInstanceArns: js.UndefOr[Strings] = js.undefined
  /**
    * The ID of the stack with which the instances are registered. The operation returns descriptions of all registered Amazon RDS instances.
    */
  var StackId: String
}

object DescribeRdsDbInstancesRequest {
  @scala.inline
  def apply(StackId: String, RdsDbInstanceArns: Strings = null): DescribeRdsDbInstancesRequest = {
    val __obj = js.Dynamic.literal(StackId = StackId)
    if (RdsDbInstanceArns != null) __obj.updateDynamic("RdsDbInstanceArns")(RdsDbInstanceArns)
    __obj.asInstanceOf[DescribeRdsDbInstancesRequest]
  }
}

