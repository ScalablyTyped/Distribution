package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateComponentRequest extends StObject {
  
  /**
    * The name of the component.
    */
  var ComponentName: typings.awsSdk.applicationinsightsMod.ComponentName
  
  /**
    * The new name of the component.
    */
  var NewComponentName: js.UndefOr[typings.awsSdk.applicationinsightsMod.NewComponentName] = js.undefined
  
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typings.awsSdk.applicationinsightsMod.ResourceGroupName
  
  /**
    * The list of resource ARNs that belong to the component.
    */
  var ResourceList: js.UndefOr[typings.awsSdk.applicationinsightsMod.ResourceList] = js.undefined
}
object UpdateComponentRequest {
  
  @scala.inline
  def apply(ComponentName: ComponentName, ResourceGroupName: ResourceGroupName): UpdateComponentRequest = {
    val __obj = js.Dynamic.literal(ComponentName = ComponentName.asInstanceOf[js.Any], ResourceGroupName = ResourceGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateComponentRequest]
  }
  
  @scala.inline
  implicit class UpdateComponentRequestMutableBuilder[Self <: UpdateComponentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentName(value: ComponentName): Self = StObject.set(x, "ComponentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewComponentName(value: NewComponentName): Self = StObject.set(x, "NewComponentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewComponentNameUndefined: Self = StObject.set(x, "NewComponentName", js.undefined)
    
    @scala.inline
    def setResourceGroupName(value: ResourceGroupName): Self = StObject.set(x, "ResourceGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceList(value: ResourceList): Self = StObject.set(x, "ResourceList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceListUndefined: Self = StObject.set(x, "ResourceList", js.undefined)
    
    @scala.inline
    def setResourceListVarargs(value: ResourceARN*): Self = StObject.set(x, "ResourceList", js.Array(value :_*))
  }
}
