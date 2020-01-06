package typings.awsDashSdk.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportSshPublicKeyRequest extends js.Object {
  /**
    * A system-assigned unique identifier for an SFTP server.
    */
  var ServerId: typings.awsDashSdk.clientsTransferMod.ServerId = js.native
  /**
    * The public key portion of an SSH key pair.
    */
  var SshPublicKeyBody: typings.awsDashSdk.clientsTransferMod.SshPublicKeyBody = js.native
  /**
    * The name of the user account that is assigned to one or more servers.
    */
  var UserName: typings.awsDashSdk.clientsTransferMod.UserName = js.native
}

object ImportSshPublicKeyRequest {
  @scala.inline
  def apply(ServerId: ServerId, SshPublicKeyBody: SshPublicKeyBody, UserName: UserName): ImportSshPublicKeyRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any], SshPublicKeyBody = SshPublicKeyBody.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ImportSshPublicKeyRequest]
  }
}

