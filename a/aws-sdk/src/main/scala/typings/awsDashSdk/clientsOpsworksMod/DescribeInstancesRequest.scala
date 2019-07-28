package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeInstancesRequest extends js.Object {
  /**
    * An array of instance IDs to be described. If you use this parameter, DescribeInstances returns a description of the specified instances. Otherwise, it returns a description of every instance.
    */
  var InstanceIds: js.UndefOr[Strings] = js.undefined
  /**
    * A layer ID. If you use this parameter, DescribeInstances returns descriptions of the instances associated with the specified layer.
    */
  var LayerId: js.UndefOr[String] = js.undefined
  /**
    * A stack ID. If you use this parameter, DescribeInstances returns descriptions of the instances associated with the specified stack.
    */
  var StackId: js.UndefOr[String] = js.undefined
}

object DescribeInstancesRequest {
  @scala.inline
  def apply(InstanceIds: Strings = null, LayerId: String = null, StackId: String = null): DescribeInstancesRequest = {
    val __obj = js.Dynamic.literal()
    if (InstanceIds != null) __obj.updateDynamic("InstanceIds")(InstanceIds)
    if (LayerId != null) __obj.updateDynamic("LayerId")(LayerId)
    if (StackId != null) __obj.updateDynamic("StackId")(StackId)
    __obj.asInstanceOf[DescribeInstancesRequest]
  }
}

