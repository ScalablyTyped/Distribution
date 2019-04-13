package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTrustResult extends js.Object {
  var RequestId: js.UndefOr[RequestId] = js.undefined
  /**
    * Identifier of the trust relationship.
    */
  var TrustId: js.UndefOr[TrustId] = js.undefined
}

object UpdateTrustResult {
  @scala.inline
  def apply(RequestId: RequestId = null, TrustId: TrustId = null): UpdateTrustResult = {
    val __obj = js.Dynamic.literal()
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId)
    if (TrustId != null) __obj.updateDynamic("TrustId")(TrustId)
    __obj.asInstanceOf[UpdateTrustResult]
  }
}

