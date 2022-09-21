package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateComponentRequest extends StObject {
  
  /**
    * The name of the component.
    */
  var ComponentName: CustomComponentName
  
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typings.awsSdk.applicationinsightsMod.ResourceGroupName
  
  /**
    * The list of resource ARNs that belong to the component.
    */
  var ResourceList: typings.awsSdk.applicationinsightsMod.ResourceList
}
object CreateComponentRequest {
  
  inline def apply(
    ComponentName: CustomComponentName,
    ResourceGroupName: ResourceGroupName,
    ResourceList: ResourceList
  ): CreateComponentRequest = {
    val __obj = js.Dynamic.literal(ComponentName = ComponentName.asInstanceOf[js.Any], ResourceGroupName = ResourceGroupName.asInstanceOf[js.Any], ResourceList = ResourceList.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateComponentRequest]
  }
  
  extension [Self <: CreateComponentRequest](x: Self) {
    
    inline def setComponentName(value: CustomComponentName): Self = StObject.set(x, "ComponentName", value.asInstanceOf[js.Any])
    
    inline def setResourceGroupName(value: ResourceGroupName): Self = StObject.set(x, "ResourceGroupName", value.asInstanceOf[js.Any])
    
    inline def setResourceList(value: ResourceList): Self = StObject.set(x, "ResourceList", value.asInstanceOf[js.Any])
    
    inline def setResourceListVarargs(value: ResourceARN*): Self = StObject.set(x, "ResourceList", js.Array(value*))
  }
}
