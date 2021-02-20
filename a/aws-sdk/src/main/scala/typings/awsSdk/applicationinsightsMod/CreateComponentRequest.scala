package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateComponentRequest extends StObject {
  
  /**
    * The name of the component.
    */
  var ComponentName: typings.awsSdk.applicationinsightsMod.ComponentName = js.native
  
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typings.awsSdk.applicationinsightsMod.ResourceGroupName = js.native
  
  /**
    * The list of resource ARNs that belong to the component.
    */
  var ResourceList: typings.awsSdk.applicationinsightsMod.ResourceList = js.native
}
object CreateComponentRequest {
  
  @scala.inline
  def apply(ComponentName: ComponentName, ResourceGroupName: ResourceGroupName, ResourceList: ResourceList): CreateComponentRequest = {
    val __obj = js.Dynamic.literal(ComponentName = ComponentName.asInstanceOf[js.Any], ResourceGroupName = ResourceGroupName.asInstanceOf[js.Any], ResourceList = ResourceList.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateComponentRequest]
  }
  
  @scala.inline
  implicit class CreateComponentRequestMutableBuilder[Self <: CreateComponentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentName(value: ComponentName): Self = StObject.set(x, "ComponentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceGroupName(value: ResourceGroupName): Self = StObject.set(x, "ResourceGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceList(value: ResourceList): Self = StObject.set(x, "ResourceList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceListVarargs(value: ResourceARN*): Self = StObject.set(x, "ResourceList", js.Array(value :_*))
  }
}
