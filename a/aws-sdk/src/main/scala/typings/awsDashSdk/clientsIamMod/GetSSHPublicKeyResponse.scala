package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSSHPublicKeyResponse extends js.Object {
  /**
    * A structure containing details about the SSH public key.
    */
  var SSHPublicKey: js.UndefOr[typings.awsDashSdk.clientsIamMod.SSHPublicKey] = js.native
}

object GetSSHPublicKeyResponse {
  @scala.inline
  def apply(SSHPublicKey: SSHPublicKey = null): GetSSHPublicKeyResponse = {
    val __obj = js.Dynamic.literal()
    if (SSHPublicKey != null) __obj.updateDynamic("SSHPublicKey")(SSHPublicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSSHPublicKeyResponse]
  }
}

