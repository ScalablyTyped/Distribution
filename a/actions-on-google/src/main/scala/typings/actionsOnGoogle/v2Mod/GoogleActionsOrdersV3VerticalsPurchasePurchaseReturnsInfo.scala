package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo extends StObject {
  
  /**
    * Return is allowed within that many days.
    */
  var daysToReturn: js.UndefOr[Double] = js.undefined
  
  /**
    * If true, return is allowed.
    */
  var isReturnable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Link to the return policy.
    */
  var policyUrl: js.UndefOr[String] = js.undefined
}
object GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo {
  
  inline def apply(): GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo]
  }
  
  extension [Self <: GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo](x: Self) {
    
    inline def setDaysToReturn(value: Double): Self = StObject.set(x, "daysToReturn", value.asInstanceOf[js.Any])
    
    inline def setDaysToReturnUndefined: Self = StObject.set(x, "daysToReturn", js.undefined)
    
    inline def setIsReturnable(value: Boolean): Self = StObject.set(x, "isReturnable", value.asInstanceOf[js.Any])
    
    inline def setIsReturnableUndefined: Self = StObject.set(x, "isReturnable", js.undefined)
    
    inline def setPolicyUrl(value: String): Self = StObject.set(x, "policyUrl", value.asInstanceOf[js.Any])
    
    inline def setPolicyUrlUndefined: Self = StObject.set(x, "policyUrl", js.undefined)
  }
}
