package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkedService extends StObject {
  
  /**
    * If the health check or hosted zone was created by another service, an optional description that can be provided by the other service. When a resource is created by another service, you can't edit or delete it using Amazon Route 53. 
    */
  var Description: js.UndefOr[ResourceDescription] = js.undefined
  
  /**
    * If the health check or hosted zone was created by another service, the service that created the resource. When a resource is created by another service, you can't edit or delete it using Amazon Route 53. 
    */
  var ServicePrincipal: js.UndefOr[typings.awsSdk.clientsRoute53Mod.ServicePrincipal] = js.undefined
}
object LinkedService {
  
  inline def apply(): LinkedService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkedService]
  }
  
  extension [Self <: LinkedService](x: Self) {
    
    inline def setDescription(value: ResourceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setServicePrincipal(value: ServicePrincipal): Self = StObject.set(x, "ServicePrincipal", value.asInstanceOf[js.Any])
    
    inline def setServicePrincipalUndefined: Self = StObject.set(x, "ServicePrincipal", js.undefined)
  }
}
