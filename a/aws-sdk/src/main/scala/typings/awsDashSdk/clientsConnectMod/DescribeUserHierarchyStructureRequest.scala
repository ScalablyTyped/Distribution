package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeUserHierarchyStructureRequest extends js.Object {
  /**
    * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in the Overview section of your instance settings. For example, the instance ID is the set of characters at the end of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
    */
  var InstanceId: typings.awsDashSdk.clientsConnectMod.InstanceId
}

object DescribeUserHierarchyStructureRequest {
  @scala.inline
  def apply(InstanceId: InstanceId): DescribeUserHierarchyStructureRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId)
  
    __obj.asInstanceOf[DescribeUserHierarchyStructureRequest]
  }
}

