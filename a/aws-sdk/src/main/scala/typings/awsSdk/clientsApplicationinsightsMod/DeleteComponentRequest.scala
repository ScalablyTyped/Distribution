package typings.awsSdk.clientsApplicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteComponentRequest extends StObject {
  
  /**
    * The name of the component.
    */
  var ComponentName: CustomComponentName
  
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typings.awsSdk.clientsApplicationinsightsMod.ResourceGroupName
}
object DeleteComponentRequest {
  
  inline def apply(ComponentName: CustomComponentName, ResourceGroupName: ResourceGroupName): DeleteComponentRequest = {
    val __obj = js.Dynamic.literal(ComponentName = ComponentName.asInstanceOf[js.Any], ResourceGroupName = ResourceGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteComponentRequest]
  }
  
  extension [Self <: DeleteComponentRequest](x: Self) {
    
    inline def setComponentName(value: CustomComponentName): Self = StObject.set(x, "ComponentName", value.asInstanceOf[js.Any])
    
    inline def setResourceGroupName(value: ResourceGroupName): Self = StObject.set(x, "ResourceGroupName", value.asInstanceOf[js.Any])
  }
}
