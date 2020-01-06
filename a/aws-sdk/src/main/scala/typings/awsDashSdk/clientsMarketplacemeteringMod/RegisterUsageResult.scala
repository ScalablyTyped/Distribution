package typings.awsDashSdk.clientsMarketplacemeteringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterUsageResult extends js.Object {
  /**
    * (Optional) Only included when public key version has expired
    */
  var PublicKeyRotationTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * JWT Token
    */
  var Signature: js.UndefOr[NonEmptyString] = js.native
}

object RegisterUsageResult {
  @scala.inline
  def apply(PublicKeyRotationTimestamp: Timestamp = null, Signature: NonEmptyString = null): RegisterUsageResult = {
    val __obj = js.Dynamic.literal()
    if (PublicKeyRotationTimestamp != null) __obj.updateDynamic("PublicKeyRotationTimestamp")(PublicKeyRotationTimestamp.asInstanceOf[js.Any])
    if (Signature != null) __obj.updateDynamic("Signature")(Signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterUsageResult]
  }
}

