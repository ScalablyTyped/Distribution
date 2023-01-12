package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionBundle extends StObject {
  
  /**
    * The ID of the bundle.
    */
  var bundleId: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the bundle is active, and can be specified for a new or existing distribution.
    */
  var isActive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the distribution bundle.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The monthly price, in US dollars, of the bundle.
    */
  var price: js.UndefOr[float] = js.undefined
  
  /**
    * The monthly network transfer quota of the bundle.
    */
  var transferPerMonthInGb: js.UndefOr[integer] = js.undefined
}
object DistributionBundle {
  
  inline def apply(): DistributionBundle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistributionBundle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DistributionBundle] (val x: Self) extends AnyVal {
    
    inline def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    inline def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrice(value: float): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setTransferPerMonthInGb(value: integer): Self = StObject.set(x, "transferPerMonthInGb", value.asInstanceOf[js.Any])
    
    inline def setTransferPerMonthInGbUndefined: Self = StObject.set(x, "transferPerMonthInGb", js.undefined)
  }
}
