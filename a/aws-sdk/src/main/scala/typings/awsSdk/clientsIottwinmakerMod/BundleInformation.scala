package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BundleInformation extends StObject {
  
  /**
    * The bundle names.
    */
  var bundleNames: PricingBundles
  
  /**
    * The pricing tier.
    */
  var pricingTier: js.UndefOr[PricingTier] = js.undefined
}
object BundleInformation {
  
  inline def apply(bundleNames: PricingBundles): BundleInformation = {
    val __obj = js.Dynamic.literal(bundleNames = bundleNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundleInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BundleInformation] (val x: Self) extends AnyVal {
    
    inline def setBundleNames(value: PricingBundles): Self = StObject.set(x, "bundleNames", value.asInstanceOf[js.Any])
    
    inline def setBundleNamesVarargs(value: BundleName*): Self = StObject.set(x, "bundleNames", js.Array(value*))
    
    inline def setPricingTier(value: PricingTier): Self = StObject.set(x, "pricingTier", value.asInstanceOf[js.Any])
    
    inline def setPricingTierUndefined: Self = StObject.set(x, "pricingTier", js.undefined)
  }
}
