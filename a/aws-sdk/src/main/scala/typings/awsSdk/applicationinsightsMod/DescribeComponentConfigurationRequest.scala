package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeComponentConfigurationRequest extends StObject {
  
  /**
    * The name of the component.
    */
  var ComponentName: typings.awsSdk.applicationinsightsMod.ComponentName
  
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typings.awsSdk.applicationinsightsMod.ResourceGroupName
}
object DescribeComponentConfigurationRequest {
  
  @scala.inline
  def apply(ComponentName: ComponentName, ResourceGroupName: ResourceGroupName): DescribeComponentConfigurationRequest = {
    val __obj = js.Dynamic.literal(ComponentName = ComponentName.asInstanceOf[js.Any], ResourceGroupName = ResourceGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeComponentConfigurationRequest]
  }
  
  @scala.inline
  implicit class DescribeComponentConfigurationRequestMutableBuilder[Self <: DescribeComponentConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentName(value: ComponentName): Self = StObject.set(x, "ComponentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceGroupName(value: ResourceGroupName): Self = StObject.set(x, "ResourceGroupName", value.asInstanceOf[js.Any])
  }
}
