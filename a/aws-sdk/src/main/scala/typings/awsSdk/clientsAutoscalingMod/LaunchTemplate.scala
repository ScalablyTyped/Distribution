package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplate extends StObject {
  
  /**
    * The launch template to use.
    */
  var LaunchTemplateSpecification: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.LaunchTemplateSpecification] = js.undefined
  
  /**
    * Any properties that you specify override the same properties in the launch template. If not provided, Amazon EC2 Auto Scaling uses the instance type or instance type requirements specified in the launch template when it launches an instance. The overrides can include either one or more instance types or a set of instance requirements, but not both.
    */
  var Overrides: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.Overrides] = js.undefined
}
object LaunchTemplate {
  
  inline def apply(): LaunchTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplate]
  }
  
  extension [Self <: LaunchTemplate](x: Self) {
    
    inline def setLaunchTemplateSpecification(value: LaunchTemplateSpecification): Self = StObject.set(x, "LaunchTemplateSpecification", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateSpecificationUndefined: Self = StObject.set(x, "LaunchTemplateSpecification", js.undefined)
    
    inline def setOverrides(value: Overrides): Self = StObject.set(x, "Overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "Overrides", js.undefined)
    
    inline def setOverridesVarargs(value: LaunchTemplateOverrides*): Self = StObject.set(x, "Overrides", js.Array(value*))
  }
}
