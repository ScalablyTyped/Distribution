package typings.awsDashSdk.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateUserProfileRequest extends js.Object {
  /**
    * The name that is displayed as the friendly name for the user in AWS CodeStar.
    */
  var displayName: js.UndefOr[UserProfileDisplayName] = js.undefined
  /**
    * The email address that is displayed as part of the user's profile in AWS CodeStar.
    */
  var emailAddress: js.UndefOr[Email] = js.undefined
  /**
    * The SSH public key associated with the user in AWS CodeStar. If a project owner allows the user remote access to project resources, this public key will be used along with the user's private key for SSH access.
    */
  var sshPublicKey: js.UndefOr[SshPublicKey] = js.undefined
  /**
    * The name that will be displayed as the friendly name for the user in AWS CodeStar.
    */
  var userArn: UserArn
}

object UpdateUserProfileRequest {
  @scala.inline
  def apply(
    userArn: UserArn,
    displayName: UserProfileDisplayName = null,
    emailAddress: Email = null,
    sshPublicKey: SshPublicKey = null
  ): UpdateUserProfileRequest = {
    val __obj = js.Dynamic.literal(userArn = userArn)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress)
    if (sshPublicKey != null) __obj.updateDynamic("sshPublicKey")(sshPublicKey)
    __obj.asInstanceOf[UpdateUserProfileRequest]
  }
}

