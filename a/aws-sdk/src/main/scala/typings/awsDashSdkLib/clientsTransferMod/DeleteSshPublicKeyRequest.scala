package typings
package awsDashSdkLib.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSshPublicKeyRequest extends js.Object {
  /**
    * A system-assigned unique identifier for a Secure File Transfer Protocol (SFTP) server instance that has the user assigned to it.
    */
  var ServerId: awsDashSdkLib.clientsTransferMod.ServerId
  /**
    * A unique identifier used to reference your user's specific SSH key.
    */
  var SshPublicKeyId: awsDashSdkLib.clientsTransferMod.SshPublicKeyId
  /**
    * A unique string that identifies a user whose public key is being deleted.
    */
  var UserName: awsDashSdkLib.clientsTransferMod.UserName
}

object DeleteSshPublicKeyRequest {
  @scala.inline
  def apply(ServerId: ServerId, SshPublicKeyId: SshPublicKeyId, UserName: UserName): DeleteSshPublicKeyRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId, SshPublicKeyId = SshPublicKeyId, UserName = UserName)
  
    __obj.asInstanceOf[DeleteSshPublicKeyRequest]
  }
}

