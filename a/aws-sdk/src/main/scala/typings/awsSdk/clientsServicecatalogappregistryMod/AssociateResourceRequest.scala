package typings.awsSdk.clientsServicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateResourceRequest extends StObject {
  
  /**
    * The name or ID of the application.
    */
  var application: ApplicationSpecifier
  
  /**
    * The name or ID of the resource of which the application will be associated.
    */
  var resource: ResourceSpecifier
  
  /**
    * The type of resource of which the application will be associated.
    */
  var resourceType: ResourceType
}
object AssociateResourceRequest {
  
  inline def apply(application: ApplicationSpecifier, resource: ResourceSpecifier, resourceType: ResourceType): AssociateResourceRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateResourceRequest]
  }
  
  extension [Self <: AssociateResourceRequest](x: Self) {
    
    inline def setApplication(value: ApplicationSpecifier): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setResource(value: ResourceSpecifier): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
