package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2OrdersPromotion extends StObject {
  
  /**
    * Required. Coupon code understood by 3P. For ex: GOOGLE10.
    */
  var coupon: js.UndefOr[String] = js.undefined
}
object GoogleActionsV2OrdersPromotion {
  
  inline def apply(): GoogleActionsV2OrdersPromotion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersPromotion]
  }
  
  extension [Self <: GoogleActionsV2OrdersPromotion](x: Self) {
    
    inline def setCoupon(value: String): Self = StObject.set(x, "coupon", value.asInstanceOf[js.Any])
    
    inline def setCouponUndefined: Self = StObject.set(x, "coupon", js.undefined)
  }
}
