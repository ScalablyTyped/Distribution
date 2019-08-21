package typings.awsDashSdk.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUserRequest extends js.Object {
  /**
    * The landing directory (folder) for a user when they log in to the server using their SFTP client. An example is /home/username .
    */
  var HomeDirectory: js.UndefOr[typings.awsDashSdk.clientsTransferMod.HomeDirectory] = js.undefined
  /**
    * A scope-down policy for your user so you can use the same IAM role across multiple users. This policy scopes down user access to portions of their Amazon S3 bucket. Variables that you can use inside this policy include ${Transfer:UserName}, ${Transfer:HomeDirectory}, and ${Transfer:HomeBucket}.  For scope-down policies, AWS Transfer for SFTP stores the policy as a JSON blob, instead of the Amazon Resource Name (ARN) of the policy. You save the policy as a JSON blob and pass it in the Policy argument. For an example of a scope-down policy, see "https://docs.aws.amazon.com/transfer/latest/userguide/users.html#users-policies-scope-down"&gt;Creating a Scope-Down Policy. For more information, see "https://docs.aws.amazon.com/STS/latest/APIReference/API_AssumeRole.html" in the AWS Security Token Service API Reference. 
    */
  var Policy: js.UndefOr[typings.awsDashSdk.clientsTransferMod.Policy] = js.undefined
  /**
    * The IAM role that controls your user's access to your Amazon S3 bucket. The policies attached to this role will determine the level of access you want to provide your users when transferring files into and out of your Amazon S3 bucket or buckets. The IAM role should also contain a trust relationship that allows the SFTP server to access your resources when servicing your SFTP user's transfer requests.
    */
  var Role: typings.awsDashSdk.clientsTransferMod.Role
  /**
    * A system-assigned unique identifier for an SFTP server instance. This is the specific SFTP server that you added your user to.
    */
  var ServerId: typings.awsDashSdk.clientsTransferMod.ServerId
  /**
    * The public portion of the Secure Shell (SSH) key used to authenticate the user to the SFTP server.
    */
  var SshPublicKeyBody: js.UndefOr[typings.awsDashSdk.clientsTransferMod.SshPublicKeyBody] = js.undefined
  /**
    * Key-value pairs that can be used to group and search for users. Tags are metadata attached to users for any purpose.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsTransferMod.Tags] = js.undefined
  /**
    * A unique string that identifies a user and is associated with a server as specified by the ServerId. This user name must be a minimum of 3 and a maximum of 32 characters long. The following are valid characters: a-z, A-Z, 0-9, underscore, and hyphen. The user name can't start with a hyphen.
    */
  var UserName: typings.awsDashSdk.clientsTransferMod.UserName
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

