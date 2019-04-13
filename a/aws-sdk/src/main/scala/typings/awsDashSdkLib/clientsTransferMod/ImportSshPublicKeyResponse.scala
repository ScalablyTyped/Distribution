package typings
package awsDashSdkLib.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportSshPublicKeyResponse extends js.Object {
  /**
    * A system-assigned unique identifier for an SFTP server.
    */
  var ServerId: awsDashSdkLib.clientsTransferMod.ServerId
  /**
    * This identifier is the name given to a public key by the system that was imported.
    */
  var SshPublicKeyId: awsDashSdkLib.clientsTransferMod.SshPublicKeyId
  /**
    * A user name assigned to the ServerID value that you specified.
    */
  var UserName: awsDashSdkLib.clientsTransferMod.UserName
}

object ImportSshPublicKeyResponse {
  @scala.inline
  def apply(ServerId: ServerId, SshPublicKeyId: SshPublicKeyId, UserName: UserName): ImportSshPublicKeyResponse = {
    val __obj = js.Dynamic.literal(ServerId = ServerId, SshPublicKeyId = SshPublicKeyId, UserName = UserName)
  
    __obj.asInstanceOf[ImportSshPublicKeyResponse]
  }
}

