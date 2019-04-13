package typings
package awsDashSdkLib.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribedUser extends js.Object {
  /**
    * This property contains the unique Amazon Resource Name (ARN) for the user that was requested to be described.
    */
  var Arn: awsDashSdkLib.clientsTransferMod.Arn
  /**
    * This property specifies the landing directory (or folder) which is the location that files are written to or read from in an Amazon S3 bucket for the described user. An example would be: /bucket_name/home/username .
    */
  var HomeDirectory: js.UndefOr[HomeDirectory] = js.undefined
  /**
    * Specifies the name of the policy in use for the described user.
    */
  var Policy: js.UndefOr[Policy] = js.undefined
  /**
    * This property specifies the IAM role that controls your user's access to your Amazon S3 bucket. The policies attached to this role will determine the level of access you want to provide your users when transferring files into and out of your Amazon S3 bucket or buckets. The IAM role should also contain a trust relationship that allows the SFTP server to access your resources when servicing your SFTP user's transfer requests.
    */
  var Role: js.UndefOr[Role] = js.undefined
  /**
    * This property contains the public key portion of the Secure Shell (SSH) keys stored for the described user.
    */
  var SshPublicKeys: js.UndefOr[SshPublicKeys] = js.undefined
  /**
    * This property contains the key-value pairs for the user requested. Tag can be used to search for and group users for a variety of purposes.
    */
  var Tags: js.UndefOr[Tags] = js.undefined
  /**
    * This property is the name of the user that was requested to be described. User names are used for authentication purposes. This is the string that will be used by your user when they log in to your SFTP server.
    */
  var UserName: js.UndefOr[UserName] = js.undefined
}

object DescribedUser {
  @scala.inline
  def apply(
    Arn: Arn,
    HomeDirectory: HomeDirectory = null,
    Policy: Policy = null,
    Role: Role = null,
    SshPublicKeys: SshPublicKeys = null,
    Tags: Tags = null,
    UserName: UserName = null
  ): DescribedUser = {
    val __obj = js.Dynamic.literal(Arn = Arn)
    if (HomeDirectory != null) __obj.updateDynamic("HomeDirectory")(HomeDirectory)
    if (Policy != null) __obj.updateDynamic("Policy")(Policy)
    if (Role != null) __obj.updateDynamic("Role")(Role)
    if (SshPublicKeys != null) __obj.updateDynamic("SshPublicKeys")(SshPublicKeys)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (UserName != null) __obj.updateDynamic("UserName")(UserName)
    __obj.asInstanceOf[DescribedUser]
  }
}

