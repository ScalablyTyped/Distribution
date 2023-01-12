package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTrackersResponseEntry extends StObject {
  
  /**
    * The timestamp for when the tracker resource was created in  ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ. 
    */
  var CreateTime: js.Date
  
  /**
    * The description for the tracker resource.
    */
  var Description: ResourceDescription
  
  /**
    * Always returns RequestBasedUsage.
    */
  var PricingPlan: js.UndefOr[typings.awsSdk.clientsLocationMod.PricingPlan] = js.undefined
  
  /**
    * No longer used. Always returns an empty string.
    */
  var PricingPlanDataSource: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the tracker resource.
    */
  var TrackerName: ResourceName
  
  /**
    * The timestamp at which the device's position was determined. Uses  ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ. 
    */
  var UpdateTime: js.Date
}
object ListTrackersResponseEntry {
  
  inline def apply(
    CreateTime: js.Date,
    Description: ResourceDescription,
    TrackerName: ResourceName,
    UpdateTime: js.Date
  ): ListTrackersResponseEntry = {
    val __obj = js.Dynamic.literal(CreateTime = CreateTime.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], TrackerName = TrackerName.asInstanceOf[js.Any], UpdateTime = UpdateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrackersResponseEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTrackersResponseEntry] (val x: Self) extends AnyVal {
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ResourceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setPricingPlan(value: PricingPlan): Self = StObject.set(x, "PricingPlan", value.asInstanceOf[js.Any])
    
    inline def setPricingPlanDataSource(value: String): Self = StObject.set(x, "PricingPlanDataSource", value.asInstanceOf[js.Any])
    
    inline def setPricingPlanDataSourceUndefined: Self = StObject.set(x, "PricingPlanDataSource", js.undefined)
    
    inline def setPricingPlanUndefined: Self = StObject.set(x, "PricingPlan", js.undefined)
    
    inline def setTrackerName(value: ResourceName): Self = StObject.set(x, "TrackerName", value.asInstanceOf[js.Any])
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "UpdateTime", value.asInstanceOf[js.Any])
  }
}
