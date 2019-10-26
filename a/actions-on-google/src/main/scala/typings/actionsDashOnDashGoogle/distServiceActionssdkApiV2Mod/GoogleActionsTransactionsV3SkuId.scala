package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsTransactionsV3SkuId extends js.Object {
  /**
    * The identifier of the product SKU used for registration in the developer
    * console.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The name of the android package under which the sku was registered.
    */
  var packageName: js.UndefOr[String] = js.undefined
  /**
    * The type of SKU.
    */
  var skuType: js.UndefOr[GoogleActionsTransactionsV3SkuIdSkuType] = js.undefined
}

object GoogleActionsTransactionsV3SkuId {
  @scala.inline
  def apply(
    id: String = null,
    packageName: String = null,
    skuType: GoogleActionsTransactionsV3SkuIdSkuType = null
  ): GoogleActionsTransactionsV3SkuId = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (packageName != null) __obj.updateDynamic("packageName")(packageName)
    if (skuType != null) __obj.updateDynamic("skuType")(skuType)
    __obj.asInstanceOf[GoogleActionsTransactionsV3SkuId]
  }
}

