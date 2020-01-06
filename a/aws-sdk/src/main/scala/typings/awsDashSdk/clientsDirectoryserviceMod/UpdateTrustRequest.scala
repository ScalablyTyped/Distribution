package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTrustRequest extends js.Object {
  /**
    * Updates selective authentication for the trust.
    */
  var SelectiveAuth: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.SelectiveAuth] = js.native
  /**
    * Identifier of the trust relationship.
    */
  var TrustId: typings.awsDashSdk.clientsDirectoryserviceMod.TrustId = js.native
}

object UpdateTrustRequest {
  @scala.inline
  def apply(TrustId: TrustId, SelectiveAuth: SelectiveAuth = null): UpdateTrustRequest = {
    val __obj = js.Dynamic.literal(TrustId = TrustId.asInstanceOf[js.Any])
    if (SelectiveAuth != null) __obj.updateDynamic("SelectiveAuth")(SelectiveAuth.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTrustRequest]
  }
}

