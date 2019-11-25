package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsTransactionsV3CompletePurchaseValueSpec extends js.Object {
  /**
    * An opaque string specified by developer, which would associate with the
    * purchase and is expected to return as part of purchase data.
    */
  var developerPayload: js.UndefOr[String] = js.undefined
  /**
    * The product being purchased.
    */
  var skuId: js.UndefOr[GoogleActionsTransactionsV3SkuId] = js.undefined
}

object GoogleActionsTransactionsV3CompletePurchaseValueSpec {
  @scala.inline
  def apply(developerPayload: String = null, skuId: GoogleActionsTransactionsV3SkuId = null): GoogleActionsTransactionsV3CompletePurchaseValueSpec = {
    val __obj = js.Dynamic.literal()
    if (developerPayload != null) __obj.updateDynamic("developerPayload")(developerPayload.asInstanceOf[js.Any])
    if (skuId != null) __obj.updateDynamic("skuId")(skuId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsTransactionsV3CompletePurchaseValueSpec]
  }
}

