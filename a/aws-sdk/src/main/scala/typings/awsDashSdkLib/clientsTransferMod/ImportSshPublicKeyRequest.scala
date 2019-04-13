package typings
package awsDashSdkLib.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportSshPublicKeyRequest extends js.Object {
  /**
    * A system-assigned unique identifier for an SFTP server.
    */
  var ServerId: awsDashSdkLib.clientsTransferMod.ServerId
  /**
    * The public key portion of an SSH key pair.
    */
  var SshPublicKeyBody: awsDashSdkLib.clientsTransferMod.SshPublicKeyBody
  /**
    * The name of the user account that is assigned to one or more servers.
    */
  var UserName: awsDashSdkLib.clientsTransferMod.UserName
}

object ImportSshPublicKeyRequest {
  @scala.inline
  def apply(ServerId: ServerId, SshPublicKeyBody: SshPublicKeyBody, UserName: UserName): ImportSshPublicKeyRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId, SshPublicKeyBody = SshPublicKeyBody, UserName = UserName)
  
    __obj.asInstanceOf[ImportSshPublicKeyRequest]
  }
}

