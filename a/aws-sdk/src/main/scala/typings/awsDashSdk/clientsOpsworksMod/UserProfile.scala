package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserProfile extends js.Object {
  /**
    * Whether users can specify their own SSH public key through the My Settings page. For more information, see Managing User Permissions.
    */
  var AllowSelfManagement: js.UndefOr[Boolean] = js.undefined
  /**
    * The user's IAM ARN.
    */
  var IamUserArn: js.UndefOr[String] = js.undefined
  /**
    * The user's name.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The user's SSH public key.
    */
  var SshPublicKey: js.UndefOr[String] = js.undefined
  /**
    * The user's SSH user name.
    */
  var SshUsername: js.UndefOr[String] = js.undefined
}

object UserProfile {
  @scala.inline
  def apply(
    AllowSelfManagement: js.UndefOr[Boolean] = js.undefined,
    IamUserArn: String = null,
    Name: String = null,
    SshPublicKey: String = null,
    SshUsername: String = null
  ): UserProfile = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllowSelfManagement)) __obj.updateDynamic("AllowSelfManagement")(AllowSelfManagement)
    if (IamUserArn != null) __obj.updateDynamic("IamUserArn")(IamUserArn)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (SshPublicKey != null) __obj.updateDynamic("SshPublicKey")(SshPublicKey)
    if (SshUsername != null) __obj.updateDynamic("SshUsername")(SshUsername)
    __obj.asInstanceOf[UserProfile]
  }
}

