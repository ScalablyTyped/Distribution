package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsOrdersV3Promotion extends StObject {
  
  /**
    * Required: Coupon code applied to this offer.
    */
  var coupon: js.UndefOr[String] = js.undefined
}
object GoogleActionsOrdersV3Promotion {
  
  inline def apply(): GoogleActionsOrdersV3Promotion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3Promotion]
  }
  
  extension [Self <: GoogleActionsOrdersV3Promotion](x: Self) {
    
    inline def setCoupon(value: String): Self = StObject.set(x, "coupon", value.asInstanceOf[js.Any])
    
    inline def setCouponUndefined: Self = StObject.set(x, "coupon", js.undefined)
  }
}
