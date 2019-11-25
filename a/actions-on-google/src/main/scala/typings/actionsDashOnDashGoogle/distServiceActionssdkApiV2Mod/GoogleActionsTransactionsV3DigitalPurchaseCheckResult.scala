package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsTransactionsV3DigitalPurchaseCheckResult extends js.Object {
  /**
    * Result type for digital purchase check result.
    */
  var resultType: js.UndefOr[GoogleActionsTransactionsV3DigitalPurchaseCheckResultResultType] = js.undefined
}

object GoogleActionsTransactionsV3DigitalPurchaseCheckResult {
  @scala.inline
  def apply(resultType: GoogleActionsTransactionsV3DigitalPurchaseCheckResultResultType = null): GoogleActionsTransactionsV3DigitalPurchaseCheckResult = {
    val __obj = js.Dynamic.literal()
    if (resultType != null) __obj.updateDynamic("resultType")(resultType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsTransactionsV3DigitalPurchaseCheckResult]
  }
}

