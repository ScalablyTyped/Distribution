package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSSHPublicKeyResponse extends js.Object {
  /**
    * A structure containing details about the SSH public key.
    */
  var SSHPublicKey: js.UndefOr[typings.awsDashSdk.clientsIamMod.SSHPublicKey] = js.undefined
}

object GetSSHPublicKeyResponse {
  @scala.inline
  def apply(SSHPublicKey: SSHPublicKey = null): GetSSHPublicKeyResponse = {
    val __obj = js.Dynamic.literal()
    if (SSHPublicKey != null) __obj.updateDynamic("SSHPublicKey")(SSHPublicKey)
    __obj.asInstanceOf[GetSSHPublicKeyResponse]
  }
}

