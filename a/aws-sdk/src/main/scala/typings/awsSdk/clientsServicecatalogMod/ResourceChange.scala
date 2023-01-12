package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceChange extends StObject {
  
  /**
    * The change action.
    */
  var Action: js.UndefOr[ChangeAction] = js.undefined
  
  /**
    * Information about the resource changes.
    */
  var Details: js.UndefOr[ResourceChangeDetails] = js.undefined
  
  /**
    * The ID of the resource, as defined in the CloudFormation template.
    */
  var LogicalResourceId: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.LogicalResourceId] = js.undefined
  
  /**
    * The ID of the resource, if it was already created.
    */
  var PhysicalResourceId: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.PhysicalResourceId] = js.undefined
  
  /**
    * If the change type is Modify, indicates whether the existing resource is deleted and replaced with a new one.
    */
  var Replacement: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.Replacement] = js.undefined
  
  /**
    * The type of resource.
    */
  var ResourceType: js.UndefOr[PlanResourceType] = js.undefined
  
  /**
    * The change scope.
    */
  var Scope: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.Scope] = js.undefined
}
object ResourceChange {
  
  inline def apply(): ResourceChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceChange] (val x: Self) extends AnyVal {
    
    inline def setAction(value: ChangeAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    inline def setDetails(value: ResourceChangeDetails): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "Details", js.undefined)
    
    inline def setDetailsVarargs(value: ResourceChangeDetail*): Self = StObject.set(x, "Details", js.Array(value*))
    
    inline def setLogicalResourceId(value: LogicalResourceId): Self = StObject.set(x, "LogicalResourceId", value.asInstanceOf[js.Any])
    
    inline def setLogicalResourceIdUndefined: Self = StObject.set(x, "LogicalResourceId", js.undefined)
    
    inline def setPhysicalResourceId(value: PhysicalResourceId): Self = StObject.set(x, "PhysicalResourceId", value.asInstanceOf[js.Any])
    
    inline def setPhysicalResourceIdUndefined: Self = StObject.set(x, "PhysicalResourceId", js.undefined)
    
    inline def setReplacement(value: Replacement): Self = StObject.set(x, "Replacement", value.asInstanceOf[js.Any])
    
    inline def setReplacementUndefined: Self = StObject.set(x, "Replacement", js.undefined)
    
    inline def setResourceType(value: PlanResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setScope(value: Scope): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "Scope", js.undefined)
    
    inline def setScopeVarargs(value: ResourceAttribute*): Self = StObject.set(x, "Scope", js.Array(value*))
  }
}
