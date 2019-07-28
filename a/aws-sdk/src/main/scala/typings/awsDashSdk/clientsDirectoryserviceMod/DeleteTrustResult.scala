package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTrustResult extends js.Object {
  /**
    * The Trust ID of the trust relationship that was deleted.
    */
  var TrustId: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.TrustId] = js.undefined
}

object DeleteTrustResult {
  @scala.inline
  def apply(TrustId: TrustId = null): DeleteTrustResult = {
    val __obj = js.Dynamic.literal()
    if (TrustId != null) __obj.updateDynamic("TrustId")(TrustId)
    __obj.asInstanceOf[DeleteTrustResult]
  }
}

