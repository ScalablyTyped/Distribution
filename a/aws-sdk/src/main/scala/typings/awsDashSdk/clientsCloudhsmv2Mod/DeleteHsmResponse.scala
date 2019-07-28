package typings.awsDashSdk.clientsCloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteHsmResponse extends js.Object {
  /**
    * The identifier (ID) of the HSM that was deleted.
    */
  var HsmId: js.UndefOr[typings.awsDashSdk.clientsCloudhsmv2Mod.HsmId] = js.undefined
}

object DeleteHsmResponse {
  @scala.inline
  def apply(HsmId: HsmId = null): DeleteHsmResponse = {
    val __obj = js.Dynamic.literal()
    if (HsmId != null) __obj.updateDynamic("HsmId")(HsmId)
    __obj.asInstanceOf[DeleteHsmResponse]
  }
}

