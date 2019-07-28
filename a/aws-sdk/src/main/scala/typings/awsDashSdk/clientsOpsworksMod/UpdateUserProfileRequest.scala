package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateUserProfileRequest extends js.Object {
  /**
    * Whether users can specify their own SSH public key through the My Settings page. For more information, see Managing User Permissions.
    */
  var AllowSelfManagement: js.UndefOr[Boolean] = js.undefined
  /**
    * The user IAM ARN. This can also be a federated user's ARN.
    */
  var IamUserArn: String
  /**
    * The user's new SSH public key.
    */
  var SshPublicKey: js.UndefOr[String] = js.undefined
  /**
    * The user's SSH user name. The allowable characters are [a-z], [A-Z], [0-9], '-', and '_'. If the specified name includes other punctuation marks, AWS OpsWorks Stacks removes them. For example, my.name will be changed to myname. If you do not specify an SSH user name, AWS OpsWorks Stacks generates one from the IAM user name. 
    */
  var SshUsername: js.UndefOr[String] = js.undefined
}

object UpdateUserProfileRequest {
  @scala.inline
  def apply(
    IamUserArn: String,
    AllowSelfManagement: js.UndefOr[Boolean] = js.undefined,
    SshPublicKey: String = null,
    SshUsername: String = null
  ): UpdateUserProfileRequest = {
    val __obj = js.Dynamic.literal(IamUserArn = IamUserArn)
    if (!js.isUndefined(AllowSelfManagement)) __obj.updateDynamic("AllowSelfManagement")(AllowSelfManagement)
    if (SshPublicKey != null) __obj.updateDynamic("SshPublicKey")(SshPublicKey)
    if (SshUsername != null) __obj.updateDynamic("SshUsername")(SshUsername)
    __obj.asInstanceOf[UpdateUserProfileRequest]
  }
}

