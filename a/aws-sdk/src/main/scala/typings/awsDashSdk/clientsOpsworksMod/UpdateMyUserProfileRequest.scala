package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMyUserProfileRequest extends js.Object {
  /**
    * The user's SSH public key.
    */
  var SshPublicKey: js.UndefOr[String] = js.native
}

object UpdateMyUserProfileRequest {
  @scala.inline
  def apply(SshPublicKey: String = null): UpdateMyUserProfileRequest = {
    val __obj = js.Dynamic.literal()
    if (SshPublicKey != null) __obj.updateDynamic("SshPublicKey")(SshPublicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMyUserProfileRequest]
  }
}

