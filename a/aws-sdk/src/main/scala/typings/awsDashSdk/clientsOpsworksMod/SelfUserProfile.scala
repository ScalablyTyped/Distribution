package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelfUserProfile extends js.Object {
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

object SelfUserProfile {
  @scala.inline
  def apply(
    IamUserArn: String = null,
    Name: String = null,
    SshPublicKey: String = null,
    SshUsername: String = null
  ): SelfUserProfile = {
    val __obj = js.Dynamic.literal()
    if (IamUserArn != null) __obj.updateDynamic("IamUserArn")(IamUserArn)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (SshPublicKey != null) __obj.updateDynamic("SshPublicKey")(SshPublicKey)
    if (SshUsername != null) __obj.updateDynamic("SshUsername")(SshUsername)
    __obj.asInstanceOf[SelfUserProfile]
  }
}

