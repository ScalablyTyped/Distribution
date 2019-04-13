package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadSSHPublicKeyResponse extends js.Object {
  /**
    * Contains information about the SSH public key.
    */
  var SSHPublicKey: js.UndefOr[SSHPublicKey] = js.undefined
}

object UploadSSHPublicKeyResponse {
  @scala.inline
  def apply(SSHPublicKey: SSHPublicKey = null): UploadSSHPublicKeyResponse = {
    val __obj = js.Dynamic.literal()
    if (SSHPublicKey != null) __obj.updateDynamic("SSHPublicKey")(SSHPublicKey)
    __obj.asInstanceOf[UploadSSHPublicKeyResponse]
  }
}

