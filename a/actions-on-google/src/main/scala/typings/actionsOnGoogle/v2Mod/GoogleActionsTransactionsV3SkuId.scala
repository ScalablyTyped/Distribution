package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsTransactionsV3SkuId extends js.Object {
  /**
    * The identifier of the product SKU used for registration in the developer
    * console.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The name of the android package under which the sku was registered.
    */
  var packageName: js.UndefOr[String] = js.native
  /**
    * The type of SKU.
    */
  var skuType: js.UndefOr[GoogleActionsTransactionsV3SkuIdSkuType] = js.native
}

object GoogleActionsTransactionsV3SkuId {
  @scala.inline
  def apply(): GoogleActionsTransactionsV3SkuId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3SkuId]
  }
  @scala.inline
  implicit class GoogleActionsTransactionsV3SkuIdOps[Self <: GoogleActionsTransactionsV3SkuId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackageName: Self = this.set("packageName", js.undefined)
    @scala.inline
    def setSkuType(value: GoogleActionsTransactionsV3SkuIdSkuType): Self = this.set("skuType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkuType: Self = this.set("skuType", js.undefined)
  }
  
}

