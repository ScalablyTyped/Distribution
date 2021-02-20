package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2OrdersPromotion extends StObject {
  
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
  implicit class GoogleActionsV2OrdersPromotionMutableBuilder[Self <: GoogleActionsV2OrdersPromotion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoupon(value: String): Self = StObject.set(x, "coupon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCouponUndefined: Self = StObject.set(x, "coupon", js.undefined)
  }
}
