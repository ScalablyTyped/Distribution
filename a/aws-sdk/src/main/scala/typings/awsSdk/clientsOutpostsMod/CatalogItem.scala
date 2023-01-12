package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatalogItem extends StObject {
  
  /**
    *  The ID of the catalog item. 
    */
  var CatalogItemId: js.UndefOr[SkuCode] = js.undefined
  
  /**
    *  Information about the EC2 capacity of an item. 
    */
  var EC2Capacities: js.UndefOr[EC2CapacityListDefinition] = js.undefined
  
  /**
    *  The status of a catalog item. 
    */
  var ItemStatus: js.UndefOr[CatalogItemStatus] = js.undefined
  
  /**
    *  Information about the power draw of an item. 
    */
  var PowerKva: js.UndefOr[CatalogItemPowerKva] = js.undefined
  
  /**
    *  The supported storage options for the catalog item. 
    */
  var SupportedStorage: js.UndefOr[SupportedStorageList] = js.undefined
  
  /**
    *  The uplink speed this catalog item requires for the connection to the Region. 
    */
  var SupportedUplinkGbps: js.UndefOr[SupportedUplinkGbpsListDefinition] = js.undefined
  
  /**
    *  The weight of the item in pounds. 
    */
  var WeightLbs: js.UndefOr[CatalogItemWeightLbs] = js.undefined
}
object CatalogItem {
  
  inline def apply(): CatalogItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatalogItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CatalogItem] (val x: Self) extends AnyVal {
    
    inline def setCatalogItemId(value: SkuCode): Self = StObject.set(x, "CatalogItemId", value.asInstanceOf[js.Any])
    
    inline def setCatalogItemIdUndefined: Self = StObject.set(x, "CatalogItemId", js.undefined)
    
    inline def setEC2Capacities(value: EC2CapacityListDefinition): Self = StObject.set(x, "EC2Capacities", value.asInstanceOf[js.Any])
    
    inline def setEC2CapacitiesUndefined: Self = StObject.set(x, "EC2Capacities", js.undefined)
    
    inline def setEC2CapacitiesVarargs(value: EC2Capacity*): Self = StObject.set(x, "EC2Capacities", js.Array(value*))
    
    inline def setItemStatus(value: CatalogItemStatus): Self = StObject.set(x, "ItemStatus", value.asInstanceOf[js.Any])
    
    inline def setItemStatusUndefined: Self = StObject.set(x, "ItemStatus", js.undefined)
    
    inline def setPowerKva(value: CatalogItemPowerKva): Self = StObject.set(x, "PowerKva", value.asInstanceOf[js.Any])
    
    inline def setPowerKvaUndefined: Self = StObject.set(x, "PowerKva", js.undefined)
    
    inline def setSupportedStorage(value: SupportedStorageList): Self = StObject.set(x, "SupportedStorage", value.asInstanceOf[js.Any])
    
    inline def setSupportedStorageUndefined: Self = StObject.set(x, "SupportedStorage", js.undefined)
    
    inline def setSupportedStorageVarargs(value: SupportedStorageEnum*): Self = StObject.set(x, "SupportedStorage", js.Array(value*))
    
    inline def setSupportedUplinkGbps(value: SupportedUplinkGbpsListDefinition): Self = StObject.set(x, "SupportedUplinkGbps", value.asInstanceOf[js.Any])
    
    inline def setSupportedUplinkGbpsUndefined: Self = StObject.set(x, "SupportedUplinkGbps", js.undefined)
    
    inline def setSupportedUplinkGbpsVarargs(value: SupportedUplinkGbps*): Self = StObject.set(x, "SupportedUplinkGbps", js.Array(value*))
    
    inline def setWeightLbs(value: CatalogItemWeightLbs): Self = StObject.set(x, "WeightLbs", value.asInstanceOf[js.Any])
    
    inline def setWeightLbsUndefined: Self = StObject.set(x, "WeightLbs", js.undefined)
  }
}
