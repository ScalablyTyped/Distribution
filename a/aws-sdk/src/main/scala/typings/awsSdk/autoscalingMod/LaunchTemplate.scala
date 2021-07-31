package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplate extends StObject {
  
  /**
    * The launch template to use.
    */
  var LaunchTemplateSpecification: js.UndefOr[typings.awsSdk.autoscalingMod.LaunchTemplateSpecification] = js.undefined
  
  /**
    * Any parameters that you specify override the same parameters in the launch template. If not provided, Amazon EC2 Auto Scaling uses the instance type specified in the launch template when it launches an instance. 
    */
  var Overrides: js.UndefOr[typings.awsSdk.autoscalingMod.Overrides] = js.undefined
}
object LaunchTemplate {
  
  @scala.inline
  def apply(): LaunchTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplate]
  }
  
  @scala.inline
  implicit class LaunchTemplateMutableBuilder[Self <: LaunchTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLaunchTemplateSpecification(value: LaunchTemplateSpecification): Self = StObject.set(x, "LaunchTemplateSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateSpecificationUndefined: Self = StObject.set(x, "LaunchTemplateSpecification", js.undefined)
    
    @scala.inline
    def setOverrides(value: Overrides): Self = StObject.set(x, "Overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesUndefined: Self = StObject.set(x, "Overrides", js.undefined)
    
    @scala.inline
    def setOverridesVarargs(value: LaunchTemplateOverrides*): Self = StObject.set(x, "Overrides", js.Array(value :_*))
  }
}
