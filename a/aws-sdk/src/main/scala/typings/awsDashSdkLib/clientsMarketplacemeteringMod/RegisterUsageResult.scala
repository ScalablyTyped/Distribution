package typings
package awsDashSdkLib.clientsMarketplacemeteringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterUsageResult extends js.Object {
  /**
    * (Optional) Only included when public key version has expired
    */
  var PublicKeyRotationTimestamp: js.UndefOr[Timestamp] = js.undefined
  /**
    * JWT Token
    */
  var Signature: js.UndefOr[NonEmptyString] = js.undefined
}

object RegisterUsageResult {
  @scala.inline
  def apply(PublicKeyRotationTimestamp: Timestamp = null, Signature: NonEmptyString = null): RegisterUsageResult = {
    val __obj = js.Dynamic.literal()
    if (PublicKeyRotationTimestamp != null) __obj.updateDynamic("PublicKeyRotationTimestamp")(PublicKeyRotationTimestamp)
    if (Signature != null) __obj.updateDynamic("Signature")(Signature)
    __obj.asInstanceOf[RegisterUsageResult]
  }
}

