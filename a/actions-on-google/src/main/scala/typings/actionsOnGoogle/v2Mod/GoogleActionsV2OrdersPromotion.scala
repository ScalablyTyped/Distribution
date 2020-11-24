package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2OrdersPromotion extends js.Object {
  
  /**
    * Required. Coupon code understood by 3P. For ex: GOOGLE10.
    */
  var coupon: js.UndefOr[String] = js.native
}
object GoogleActionsV2OrdersPromotion {
  
  @scala.inline
  def apply(): GoogleActionsV2OrdersPromotion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersPromotion]
  }
  
  @scala.inline
  implicit class GoogleActionsV2OrdersPromotionOps[Self <: GoogleActionsV2OrdersPromotion] (val x: Self) extends AnyVal {
    
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
    def setCoupon(value: String): Self = this.set("coupon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoupon: Self = this.set("coupon", js.undefined)
  }
}
