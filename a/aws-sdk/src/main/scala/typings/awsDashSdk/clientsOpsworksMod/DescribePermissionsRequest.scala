package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePermissionsRequest extends js.Object {
  /**
    * The user's IAM ARN. This can also be a federated user's ARN. For more information about IAM ARNs, see Using Identifiers.
    */
  var IamUserArn: js.UndefOr[String] = js.undefined
  /**
    * The stack ID.
    */
  var StackId: js.UndefOr[String] = js.undefined
}

object DescribePermissionsRequest {
  @scala.inline
  def apply(IamUserArn: String = null, StackId: String = null): DescribePermissionsRequest = {
    val __obj = js.Dynamic.literal()
    if (IamUserArn != null) __obj.updateDynamic("IamUserArn")(IamUserArn)
    if (StackId != null) __obj.updateDynamic("StackId")(StackId)
    __obj.asInstanceOf[DescribePermissionsRequest]
  }
}

