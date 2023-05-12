package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceMetrics extends StObject {
  
  /**
    * The storage capacity of the on-premises storage system resource.
    */
  var Capacity: js.UndefOr[typings.awsSdk.clientsDatasyncMod.Capacity] = js.undefined
  
  /**
    * The types of performance data that DataSync Discovery collects about the on-premises storage system resource.
    */
  var P95Metrics: js.UndefOr[typings.awsSdk.clientsDatasyncMod.P95Metrics] = js.undefined
  
  /**
    * The universally unique identifier (UUID) of the on-premises storage system resource.
    */
  var ResourceId: js.UndefOr[typings.awsSdk.clientsDatasyncMod.ResourceId] = js.undefined
  
  /**
    * The type of on-premises storage system resource.
    */
  var ResourceType: js.UndefOr[DiscoveryResourceType] = js.undefined
  
  /**
    * The time when DataSync Discovery collected this information from the resource.
    */
  var Timestamp: js.UndefOr[js.Date] = js.undefined
}
object ResourceMetrics {
  
  inline def apply(): ResourceMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceMetrics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceMetrics] (val x: Self) extends AnyVal {
    
    inline def setCapacity(value: Capacity): Self = StObject.set(x, "Capacity", value.asInstanceOf[js.Any])
    
    inline def setCapacityUndefined: Self = StObject.set(x, "Capacity", js.undefined)
    
    inline def setP95Metrics(value: P95Metrics): Self = StObject.set(x, "P95Metrics", value.asInstanceOf[js.Any])
    
    inline def setP95MetricsUndefined: Self = StObject.set(x, "P95Metrics", js.undefined)
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setResourceType(value: DiscoveryResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
