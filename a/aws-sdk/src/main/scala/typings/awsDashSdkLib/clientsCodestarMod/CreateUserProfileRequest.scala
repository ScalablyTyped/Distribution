package typings
package awsDashSdkLib.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUserProfileRequest extends js.Object {
  /**
    * The name that will be displayed as the friendly name for the user in AWS CodeStar. 
    */
  var displayName: UserProfileDisplayName
  /**
    * The email address that will be displayed as part of the user's profile in AWS CodeStar.
    */
  var emailAddress: Email
  /**
    * The SSH public key associated with the user in AWS CodeStar. If a project owner allows the user remote access to project resources, this public key will be used along with the user's private key for SSH access.
    */
  var sshPublicKey: js.UndefOr[SshPublicKey] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the user in IAM.
    */
  var userArn: UserArn
}

object CreateUserProfileRequest {
  @scala.inline
  def apply(
    displayName: UserProfileDisplayName,
    emailAddress: Email,
    userArn: UserArn,
    sshPublicKey: SshPublicKey = null
  ): CreateUserProfileRequest = {
    val __obj = js.Dynamic.literal(displayName = displayName, emailAddress = emailAddress, userArn = userArn)
    if (sshPublicKey != null) __obj.updateDynamic("sshPublicKey")(sshPublicKey)
    __obj.asInstanceOf[CreateUserProfileRequest]
  }
}

