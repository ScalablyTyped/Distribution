package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMonitoredResourcesFilters extends StObject {
  
  /**
    *  The permission status of a resource. 
    */
  var ResourcePermission: typings.awsSdk.clientsDevopsguruMod.ResourcePermission
  
  /**
    *  The type of resource that you wish to retrieve, such as log groups. 
    */
  var ResourceTypeFilters: typings.awsSdk.clientsDevopsguruMod.ResourceTypeFilters
}
object ListMonitoredResourcesFilters {
  
  inline def apply(ResourcePermission: ResourcePermission, ResourceTypeFilters: ResourceTypeFilters): ListMonitoredResourcesFilters = {
    val __obj = js.Dynamic.literal(ResourcePermission = ResourcePermission.asInstanceOf[js.Any], ResourceTypeFilters = ResourceTypeFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMonitoredResourcesFilters]
  }
  
  extension [Self <: ListMonitoredResourcesFilters](x: Self) {
    
    inline def setResourcePermission(value: ResourcePermission): Self = StObject.set(x, "ResourcePermission", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeFilters(value: ResourceTypeFilters): Self = StObject.set(x, "ResourceTypeFilters", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeFiltersVarargs(value: ResourceTypeFilter*): Self = StObject.set(x, "ResourceTypeFilters", js.Array(value*))
  }
}
