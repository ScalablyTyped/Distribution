package typings.awsSdk.clientsServicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyncResourceRequest extends StObject {
  
  /**
    * An entity you can work with and specify with a name or ID. Examples include an Amazon EC2 instance, an Amazon Web Services CloudFormation stack, or an Amazon S3 bucket.
    */
  var resource: ResourceSpecifier
  
  /**
    * The type of resource of which the application will be associated.
    */
  var resourceType: ResourceType
}
object SyncResourceRequest {
  
  inline def apply(resource: ResourceSpecifier, resourceType: ResourceType): SyncResourceRequest = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncResourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SyncResourceRequest] (val x: Self) extends AnyVal {
    
    inline def setResource(value: ResourceSpecifier): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
