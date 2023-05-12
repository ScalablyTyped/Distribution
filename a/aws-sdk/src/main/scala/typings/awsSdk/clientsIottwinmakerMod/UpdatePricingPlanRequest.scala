package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePricingPlanRequest extends StObject {
  
  /**
    * The bundle names.
    */
  var bundleNames: js.UndefOr[PricingBundles] = js.undefined
  
  /**
    * The pricing mode.
    */
  var pricingMode: PricingMode
}
object UpdatePricingPlanRequest {
  
  inline def apply(pricingMode: PricingMode): UpdatePricingPlanRequest = {
    val __obj = js.Dynamic.literal(pricingMode = pricingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePricingPlanRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdatePricingPlanRequest] (val x: Self) extends AnyVal {
    
    inline def setBundleNames(value: PricingBundles): Self = StObject.set(x, "bundleNames", value.asInstanceOf[js.Any])
    
    inline def setBundleNamesUndefined: Self = StObject.set(x, "bundleNames", js.undefined)
    
    inline def setBundleNamesVarargs(value: BundleName*): Self = StObject.set(x, "bundleNames", js.Array(value*))
    
    inline def setPricingMode(value: PricingMode): Self = StObject.set(x, "pricingMode", value.asInstanceOf[js.Any])
  }
}
