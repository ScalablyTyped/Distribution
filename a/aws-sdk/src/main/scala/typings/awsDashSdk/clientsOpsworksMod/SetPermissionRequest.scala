package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetPermissionRequest extends js.Object {
  /**
    * The user is allowed to use SSH to communicate with the instance.
    */
  var AllowSsh: js.UndefOr[Boolean] = js.undefined
  /**
    * The user is allowed to use sudo to elevate privileges.
    */
  var AllowSudo: js.UndefOr[Boolean] = js.undefined
  /**
    * The user's IAM ARN. This can also be a federated user's ARN.
    */
  var IamUserArn: String
  /**
    * The user's permission level, which must be set to one of the following strings. You cannot set your own permissions level.    deny     show     deploy     manage     iam_only    For more information about the permissions associated with these levels, see Managing User Permissions.
    */
  var Level: js.UndefOr[String] = js.undefined
  /**
    * The stack ID.
    */
  var StackId: String
}

object SetPermissionRequest {
  @scala.inline
  def apply(
    IamUserArn: String,
    StackId: String,
    AllowSsh: js.UndefOr[scala.Boolean] = js.undefined,
    AllowSudo: js.UndefOr[scala.Boolean] = js.undefined,
    Level: String = null
  ): SetPermissionRequest = {
    val __obj = js.Dynamic.literal(IamUserArn = IamUserArn, StackId = StackId)
    if (!js.isUndefined(AllowSsh)) __obj.updateDynamic("AllowSsh")(AllowSsh)
    if (!js.isUndefined(AllowSudo)) __obj.updateDynamic("AllowSudo")(AllowSudo)
    if (Level != null) __obj.updateDynamic("Level")(Level)
    __obj.asInstanceOf[SetPermissionRequest]
  }
}

