package typings.awsSdk.clientsServicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAssociatedResourceRequest extends StObject {
  
  /**
    * The name or ID of the application.
    */
  var application: ApplicationSpecifier
  
  /**
    * The name or ID of the resource associated with the application.
    */
  var resource: ResourceSpecifier
  
  /**
    * The type of resource associated with the application.
    */
  var resourceType: ResourceType
}
object GetAssociatedResourceRequest {
  
  inline def apply(application: ApplicationSpecifier, resource: ResourceSpecifier, resourceType: ResourceType): GetAssociatedResourceRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAssociatedResourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAssociatedResourceRequest] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: ApplicationSpecifier): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setResource(value: ResourceSpecifier): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
