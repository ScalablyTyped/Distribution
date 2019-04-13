package typings
package awsDashSdkLib.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateUserRequest extends js.Object {
  /**
    * The HomeDirectory parameter specifies the landing directory (folder) for a user when they log in to the server using their client. An example would be: /home/username .
    */
  var HomeDirectory: js.UndefOr[HomeDirectory] = js.undefined
  /**
    * Allows you to supply a scope-down policy for your user so you can use the same AWS Identity and Access Management (IAM) role across multiple users. The policy scopes down users access to portions of your Amazon S3 bucket. Variables you can use inside this policy include ${Transfer:UserName}, ${Transfer:HomeDirectory}, and ${Transfer:HomeBucket}.
    */
  var Policy: js.UndefOr[Policy] = js.undefined
  /**
    * The IAM role that controls your user's access to your Amazon S3 bucket. The policies attached to this role will determine the level of access you want to provide your users when transferring files into and out of your Amazon S3 bucket or buckets. The IAM role should also contain a trust relationship that allows the Secure File Transfer Protocol (SFTP) server to access your resources when servicing your SFTP user's transfer requests.
    */
  var Role: js.UndefOr[Role] = js.undefined
  /**
    * A system-assigned unique identifier for an SFTP server instance that the user account is assigned to.
    */
  var ServerId: awsDashSdkLib.clientsTransferMod.ServerId
  /**
    * A unique string that identifies a user and is associated with a server as specified by the ServerId. This is the string that will be used by your user when they log in to your SFTP server.
    */
  var UserName: awsDashSdkLib.clientsTransferMod.UserName
}

object UpdateUserRequest {
  @scala.inline
  def apply(
    ServerId: ServerId,
    UserName: UserName,
    HomeDirectory: HomeDirectory = null,
    Policy: Policy = null,
    Role: Role = null
  ): UpdateUserRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId, UserName = UserName)
    if (HomeDirectory != null) __obj.updateDynamic("HomeDirectory")(HomeDirectory)
    if (Policy != null) __obj.updateDynamic("Policy")(Policy)
    if (Role != null) __obj.updateDynamic("Role")(Role)
    __obj.asInstanceOf[UpdateUserRequest]
  }
}

