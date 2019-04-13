package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTrustRequest extends js.Object {
  /**
    * Updates selective authentication for the trust.
    */
  var SelectiveAuth: js.UndefOr[SelectiveAuth] = js.undefined
  /**
    * Identifier of the trust relationship.
    */
  var TrustId: awsDashSdkLib.clientsDirectoryserviceMod.TrustId
}

object UpdateTrustRequest {
  @scala.inline
  def apply(TrustId: TrustId, SelectiveAuth: SelectiveAuth = null): UpdateTrustRequest = {
    val __obj = js.Dynamic.literal(TrustId = TrustId)
    if (SelectiveAuth != null) __obj.updateDynamic("SelectiveAuth")(SelectiveAuth.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTrustRequest]
  }
}

