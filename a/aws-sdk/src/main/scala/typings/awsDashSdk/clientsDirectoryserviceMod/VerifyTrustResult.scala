package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyTrustResult extends js.Object {
  /**
    * The unique Trust ID of the trust relationship that was verified.
    */
  var TrustId: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.TrustId] = js.undefined
}

object VerifyTrustResult {
  @scala.inline
  def apply(TrustId: TrustId = null): VerifyTrustResult = {
    val __obj = js.Dynamic.literal()
    if (TrustId != null) __obj.updateDynamic("TrustId")(TrustId)
    __obj.asInstanceOf[VerifyTrustResult]
  }
}

