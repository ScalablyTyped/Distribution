package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportKeyPairRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * A unique name for the key pair.
    */
  var KeyName: String
  /**
    * The public key. For API calls, the text must be base64-encoded. For command line tools, base64 encoding is performed for you.
    */
  var PublicKeyMaterial: _Blob
}

object ImportKeyPairRequest {
  @scala.inline
  def apply(KeyName: String, PublicKeyMaterial: _Blob, DryRun: js.UndefOr[Boolean] = js.undefined): ImportKeyPairRequest = {
    val __obj = js.Dynamic.literal(KeyName = KeyName, PublicKeyMaterial = PublicKeyMaterial.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[ImportKeyPairRequest]
  }
}

