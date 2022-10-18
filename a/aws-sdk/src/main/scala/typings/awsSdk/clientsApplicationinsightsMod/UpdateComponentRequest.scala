package typings.awsSdk.clientsApplicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateComponentRequest extends StObject {
  
  /**
    * The name of the component.
    */
  var ComponentName: CustomComponentName
  
  /**
    * The new name of the component.
    */
  var NewComponentName: js.UndefOr[CustomComponentName] = js.undefined
  
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typings.awsSdk.clientsApplicationinsightsMod.ResourceGroupName
  
  /**
    * The list of resource ARNs that belong to the component.
    */
  var ResourceList: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.ResourceList] = js.undefined
}
object UpdateComponentRequest {
  
  inline def apply(ComponentName: CustomComponentName, ResourceGroupName: ResourceGroupName): UpdateComponentRequest = {
    val __obj = js.Dynamic.literal(ComponentName = ComponentName.asInstanceOf[js.Any], ResourceGroupName = ResourceGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateComponentRequest]
  }
  
  extension [Self <: UpdateComponentRequest](x: Self) {
    
    inline def setComponentName(value: CustomComponentName): Self = StObject.set(x, "ComponentName", value.asInstanceOf[js.Any])
    
    inline def setNewComponentName(value: CustomComponentName): Self = StObject.set(x, "NewComponentName", value.asInstanceOf[js.Any])
    
    inline def setNewComponentNameUndefined: Self = StObject.set(x, "NewComponentName", js.undefined)
    
    inline def setResourceGroupName(value: ResourceGroupName): Self = StObject.set(x, "ResourceGroupName", value.asInstanceOf[js.Any])
    
    inline def setResourceList(value: ResourceList): Self = StObject.set(x, "ResourceList", value.asInstanceOf[js.Any])
    
    inline def setResourceListUndefined: Self = StObject.set(x, "ResourceList", js.undefined)
    
    inline def setResourceListVarargs(value: ResourceARN*): Self = StObject.set(x, "ResourceList", js.Array(value*))
  }
}
