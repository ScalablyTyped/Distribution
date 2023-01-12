package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGeofenceCollectionRequest extends StObject {
  
  /**
    * The name of the geofence collection to update.
    */
  var CollectionName: ResourceName
  
  /**
    * Updates the description for the geofence collection.
    */
  var Description: js.UndefOr[ResourceDescription] = js.undefined
  
  /**
    * No longer used. If included, the only allowed value is RequestBasedUsage.
    */
  var PricingPlan: js.UndefOr[typings.awsSdk.clientsLocationMod.PricingPlan] = js.undefined
  
  /**
    * This parameter is no longer used.
    */
  var PricingPlanDataSource: js.UndefOr[String] = js.undefined
}
object UpdateGeofenceCollectionRequest {
  
  inline def apply(CollectionName: ResourceName): UpdateGeofenceCollectionRequest = {
    val __obj = js.Dynamic.literal(CollectionName = CollectionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGeofenceCollectionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateGeofenceCollectionRequest] (val x: Self) extends AnyVal {
    
    inline def setCollectionName(value: ResourceName): Self = StObject.set(x, "CollectionName", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ResourceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setPricingPlan(value: PricingPlan): Self = StObject.set(x, "PricingPlan", value.asInstanceOf[js.Any])
    
    inline def setPricingPlanDataSource(value: String): Self = StObject.set(x, "PricingPlanDataSource", value.asInstanceOf[js.Any])
    
    inline def setPricingPlanDataSourceUndefined: Self = StObject.set(x, "PricingPlanDataSource", js.undefined)
    
    inline def setPricingPlanUndefined: Self = StObject.set(x, "PricingPlan", js.undefined)
  }
}
