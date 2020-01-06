package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePermissionsResult extends js.Object {
  /**
    * An array of Permission objects that describe the stack permissions.   If the request object contains only a stack ID, the array contains a Permission object with permissions for each of the stack IAM ARNs.   If the request object contains only an IAM ARN, the array contains a Permission object with permissions for each of the user's stack IDs.   If the request contains a stack ID and an IAM ARN, the array contains a single Permission object with permissions for the specified stack and IAM ARN.  
    */
  var Permissions: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.Permissions] = js.native
}

object DescribePermissionsResult {
  @scala.inline
  def apply(Permissions: Permissions = null): DescribePermissionsResult = {
    val __obj = js.Dynamic.literal()
    if (Permissions != null) __obj.updateDynamic("Permissions")(Permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePermissionsResult]
  }
}

