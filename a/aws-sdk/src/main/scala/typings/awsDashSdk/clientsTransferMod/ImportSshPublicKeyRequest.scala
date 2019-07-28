package typings.awsDashSdk.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportSshPublicKeyRequest extends js.Object {
  /**
    * A system-assigned unique identifier for an SFTP server.
    */
  var ServerId: typings.awsDashSdk.clientsTransferMod.ServerId
  /**
    * The public key portion of an SSH key pair.
    */
  var SshPublicKeyBody: typings.awsDashSdk.clientsTransferMod.SshPublicKeyBody
  /**
    * The name of the user account that is assigned to one or more servers.
    */
  var UserName: typings.awsDashSdk.clientsTransferMod.UserName
}

object ImportSshPublicKeyRequest {
  @scala.inline
  def apply(ServerId: ServerId, SshPublicKeyBody: SshPublicKeyBody, UserName: UserName): ImportSshPublicKeyRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId, SshPublicKeyBody = SshPublicKeyBody, UserName = UserName)
  
    __obj.asInstanceOf[ImportSshPublicKeyRequest]
  }
}

