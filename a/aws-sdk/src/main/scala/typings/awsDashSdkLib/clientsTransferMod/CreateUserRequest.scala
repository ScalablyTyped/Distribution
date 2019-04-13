package typings
package awsDashSdkLib.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUserRequest extends js.Object {
  /**
    * The landing directory (folder) for a user when they log in to the server using their SFTP client. An example is /home/username .
    */
  var HomeDirectory: js.UndefOr[HomeDirectory] = js.undefined
  /**
    * A scope-down policy for your user so you can use the same IAM role across multiple users. This policy scopes down user access to portions of their Amazon S3 bucket. Variables you can use inside this policy include ${Transfer:UserName}, ${Transfer:HomeDirectory}, and ${Transfer:HomeBucket}.
    */
  var Policy: js.UndefOr[Policy] = js.undefined
  /**
    * The IAM role that controls your user's access to your Amazon S3 bucket. The policies attached to this role will determine the level of access you want to provide your users when transferring files into and out of your Amazon S3 bucket or buckets. The IAM role should also contain a trust relationship that allows the SFTP server to access your resources when servicing your SFTP user's transfer requests.
    */
  var Role: awsDashSdkLib.clientsTransferMod.Role
  /**
    * A system-assigned unique identifier for an SFTP server instance. This is the specific SFTP server that you added your user to.
    */
  var ServerId: awsDashSdkLib.clientsTransferMod.ServerId
  /**
    * The public portion of the Secure Shall (SSH) key used to authenticate the user to the SFTP server.
    */
  var SshPublicKeyBody: js.UndefOr[SshPublicKeyBody] = js.undefined
  /**
    * Key-value pairs that can be used to group and search for users. Tags are metadata attached to users for any purpose.
    */
  var Tags: js.UndefOr[Tags] = js.undefined
  /**
    * A unique string that identifies a user and is associated with a server as specified by the ServerId.
    */
  var UserName: awsDashSdkLib.clientsTransferMod.UserName
}

object CreateUserRequest {
  @scala.inline
  def apply(
    Role: Role,
    ServerId: ServerId,
    UserName: UserName,
    HomeDirectory: HomeDirectory = null,
    Policy: Policy = null,
    SshPublicKeyBody: SshPublicKeyBody = null,
    Tags: Tags = null
  ): CreateUserRequest = {
    val __obj = js.Dynamic.literal(Role = Role, ServerId = ServerId, UserName = UserName)
    if (HomeDirectory != null) __obj.updateDynamic("HomeDirectory")(HomeDirectory)
    if (Policy != null) __obj.updateDynamic("Policy")(Policy)
    if (SshPublicKeyBody != null) __obj.updateDynamic("SshPublicKeyBody")(SshPublicKeyBody)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateUserRequest]
  }
}

