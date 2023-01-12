package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhysicalResource extends StObject {
  
  /**
    * The application components that belong to this resource.
    */
  var appComponents: js.UndefOr[AppComponentList] = js.undefined
  
  /**
    * The logical identifier of the resource.
    */
  var logicalResourceId: LogicalResourceId
  
  /**
    * The physical identifier of the resource.
    */
  var physicalResourceId: PhysicalResourceId
  
  /**
    * The name of the resource.
    */
  var resourceName: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The type of resource.
    */
  var resourceType: String255
}
object PhysicalResource {
  
  inline def apply(
    logicalResourceId: LogicalResourceId,
    physicalResourceId: PhysicalResourceId,
    resourceType: String255
  ): PhysicalResource = {
    val __obj = js.Dynamic.literal(logicalResourceId = logicalResourceId.asInstanceOf[js.Any], physicalResourceId = physicalResourceId.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicalResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhysicalResource] (val x: Self) extends AnyVal {
    
    inline def setAppComponents(value: AppComponentList): Self = StObject.set(x, "appComponents", value.asInstanceOf[js.Any])
    
    inline def setAppComponentsUndefined: Self = StObject.set(x, "appComponents", js.undefined)
    
    inline def setAppComponentsVarargs(value: AppComponent*): Self = StObject.set(x, "appComponents", js.Array(value*))
    
    inline def setLogicalResourceId(value: LogicalResourceId): Self = StObject.set(x, "logicalResourceId", value.asInstanceOf[js.Any])
    
    inline def setPhysicalResourceId(value: PhysicalResourceId): Self = StObject.set(x, "physicalResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceName(value: EntityName): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setResourceType(value: String255): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
