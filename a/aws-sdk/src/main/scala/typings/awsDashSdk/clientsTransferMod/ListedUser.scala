package typings.awsDashSdk.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListedUser extends js.Object {
  /**
    * This property is the unique Amazon Resource Name (ARN) for the user that you want to learn about.
    */
  var Arn: typings.awsDashSdk.clientsTransferMod.Arn
  /**
    * This value specifies the location that files are written to or read from an Amazon S3 bucket for the user you specify by their ARN.
    */
  var HomeDirectory: js.UndefOr[typings.awsDashSdk.clientsTransferMod.HomeDirectory] = js.undefined
  /**
    * The role in use by this user. A role is an AWS Identity and Access Management (IAM) entity that, in this case, allows the SFTP server to act on a user's behalf. It allows the server to inherit the trust relationship that enables that user to perform file operations to their Amazon S3 bucket.
    */
  var Role: js.UndefOr[typings.awsDashSdk.clientsTransferMod.Role] = js.undefined
  /**
    * This value is the number of SSH public keys stored for the user you specified.
    */
  var SshPublicKeyCount: js.UndefOr[typings.awsDashSdk.clientsTransferMod.SshPublicKeyCount] = js.undefined
  /**
    * The name of the user whose ARN was specified. User names are used for authentication purposes.
    */
  var UserName: js.UndefOr[typings.awsDashSdk.clientsTransferMod.UserName] = js.undefined
}

object ListedUser {
  @scala.inline
  def apply(
    Arn: Arn,
    HomeDirectory: HomeDirectory = null,
    Role: Role = null,
    SshPublicKeyCount: js.UndefOr[SshPublicKeyCount] = js.undefined,
    UserName: UserName = null
  ): ListedUser = {
    val __obj = js.Dynamic.literal(Arn = Arn)
    if (HomeDirectory != null) __obj.updateDynamic("HomeDirectory")(HomeDirectory)
    if (Role != null) __obj.updateDynamic("Role")(Role)
    if (!js.isUndefined(SshPublicKeyCount)) __obj.updateDynamic("SshPublicKeyCount")(SshPublicKeyCount)
    if (UserName != null) __obj.updateDynamic("UserName")(UserName)
    __obj.asInstanceOf[ListedUser]
  }
}

