package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketBundle extends StObject {
  
  /**
    * The ID of the bundle.
    */
  var bundleId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates whether the bundle is active. Use for a new or existing bucket.
    */
  var isActive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the bundle.
    */
  var name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The monthly price of the bundle, in US dollars.
    */
  var price: js.UndefOr[float] = js.undefined
  
  /**
    * The storage size of the bundle, in GB.
    */
  var storagePerMonthInGb: js.UndefOr[integer] = js.undefined
  
  /**
    * The monthly network transfer quota of the bundle.
    */
  var transferPerMonthInGb: js.UndefOr[integer] = js.undefined
}
object BucketBundle {
  
  inline def apply(): BucketBundle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketBundle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BucketBundle] (val x: Self) extends AnyVal {
    
    inline def setBundleId(value: NonEmptyString): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    inline def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrice(value: float): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setStoragePerMonthInGb(value: integer): Self = StObject.set(x, "storagePerMonthInGb", value.asInstanceOf[js.Any])
    
    inline def setStoragePerMonthInGbUndefined: Self = StObject.set(x, "storagePerMonthInGb", js.undefined)
    
    inline def setTransferPerMonthInGb(value: integer): Self = StObject.set(x, "transferPerMonthInGb", value.asInstanceOf[js.Any])
    
    inline def setTransferPerMonthInGbUndefined: Self = StObject.set(x, "transferPerMonthInGb", js.undefined)
  }
}
