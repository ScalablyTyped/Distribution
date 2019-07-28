package typings.awsDashSdk.clientsIot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClaimDevicesByClaimCodeResponse extends js.Object {
  /**
    * The claim code provided by the device manufacturer.
    */
  var ClaimCode: js.UndefOr[__stringMin12Max40] = js.undefined
  /**
    * The total number of devices associated with the claim code that has been processed in
    the claim request.
    */
  var Total: js.UndefOr[__integer] = js.undefined
}

object ClaimDevicesByClaimCodeResponse {
  @scala.inline
  def apply(ClaimCode: __stringMin12Max40 = null, Total: js.UndefOr[__integer] = js.undefined): ClaimDevicesByClaimCodeResponse = {
    val __obj = js.Dynamic.literal()
    if (ClaimCode != null) __obj.updateDynamic("ClaimCode")(ClaimCode)
    if (!js.isUndefined(Total)) __obj.updateDynamic("Total")(Total)
    __obj.asInstanceOf[ClaimDevicesByClaimCodeResponse]
  }
}

