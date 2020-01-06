package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRdsDbInstancesRequest extends js.Object {
  /**
    * An array containing the ARNs of the instances to be described.
    */
  var RdsDbInstanceArns: js.UndefOr[Strings] = js.native
  /**
    * The ID of the stack with which the instances are registered. The operation returns descriptions of all registered Amazon RDS instances.
    */
  var StackId: String = js.native
}

object DescribeRdsDbInstancesRequest {
  @scala.inline
  def apply(StackId: String, RdsDbInstanceArns: Strings = null): DescribeRdsDbInstancesRequest = {
    val __obj = js.Dynamic.literal(StackId = StackId.asInstanceOf[js.Any])
    if (RdsDbInstanceArns != null) __obj.updateDynamic("RdsDbInstanceArns")(RdsDbInstanceArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRdsDbInstancesRequest]
  }
}

