package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateMyUserProfileRequest extends js.Object {
  /**
    * The user's SSH public key.
    */
  var SshPublicKey: js.UndefOr[String] = js.undefined
}

object UpdateMyUserProfileRequest {
  @scala.inline
  def apply(SshPublicKey: String = null): UpdateMyUserProfileRequest = {
    val __obj = js.Dynamic.literal()
    if (SshPublicKey != null) __obj.updateDynamic("SshPublicKey")(SshPublicKey)
    __obj.asInstanceOf[UpdateMyUserProfileRequest]
  }
}

