package typings.awsDashSdk.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateUserProfileResult extends js.Object {
  /**
    * The date the user profile was created, in timestamp format.
    */
  var createdTimestamp: js.UndefOr[CreatedTimestamp] = js.undefined
  /**
    * The name that is displayed as the friendly name for the user in AWS CodeStar.
    */
  var displayName: js.UndefOr[UserProfileDisplayName] = js.undefined
  /**
    * The email address that is displayed as part of the user's profile in AWS CodeStar.
    */
  var emailAddress: js.UndefOr[Email] = js.undefined
  /**
    * The date the user profile was last modified, in timestamp format.
    */
  var lastModifiedTimestamp: js.UndefOr[LastModifiedTimestamp] = js.undefined
  /**
    * The SSH public key associated with the user in AWS CodeStar. This is the public portion of the public/private keypair the user can use to access project resources if a project owner allows the user remote access to those resources.
    */
  var sshPublicKey: js.UndefOr[SshPublicKey] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the user in IAM.
    */
  var userArn: UserArn
}

object UpdateUserProfileResult {
  @scala.inline
  def apply(
    userArn: UserArn,
    createdTimestamp: CreatedTimestamp = null,
    displayName: UserProfileDisplayName = null,
    emailAddress: Email = null,
    lastModifiedTimestamp: LastModifiedTimestamp = null,
    sshPublicKey: SshPublicKey = null
  ): UpdateUserProfileResult = {
    val __obj = js.Dynamic.literal(userArn = userArn)
    if (createdTimestamp != null) __obj.updateDynamic("createdTimestamp")(createdTimestamp)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress)
    if (lastModifiedTimestamp != null) __obj.updateDynamic("lastModifiedTimestamp")(lastModifiedTimestamp)
    if (sshPublicKey != null) __obj.updateDynamic("sshPublicKey")(sshPublicKey)
    __obj.asInstanceOf[UpdateUserProfileResult]
  }
}

