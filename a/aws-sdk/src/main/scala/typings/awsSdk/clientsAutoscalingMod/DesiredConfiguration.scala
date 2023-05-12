package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DesiredConfiguration extends StObject {
  
  /**
    * Describes the launch template and the version of the launch template that Amazon EC2 Auto Scaling uses to launch Amazon EC2 instances. For more information about launch templates, see Launch templates in the Amazon EC2 Auto Scaling User Guide.
    */
  var LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined
  
  /**
    * Use this structure to launch multiple instance types and On-Demand Instances and Spot Instances within a single Auto Scaling group. A mixed instances policy contains information that Amazon EC2 Auto Scaling can use to launch instances and help optimize your costs. For more information, see Auto Scaling groups with multiple instance types and purchase options in the Amazon EC2 Auto Scaling User Guide.
    */
  var MixedInstancesPolicy: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.MixedInstancesPolicy] = js.undefined
}
object DesiredConfiguration {
  
  inline def apply(): DesiredConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DesiredConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DesiredConfiguration] (val x: Self) extends AnyVal {
    
    inline def setLaunchTemplate(value: LaunchTemplateSpecification): Self = StObject.set(x, "LaunchTemplate", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateUndefined: Self = StObject.set(x, "LaunchTemplate", js.undefined)
    
    inline def setMixedInstancesPolicy(value: MixedInstancesPolicy): Self = StObject.set(x, "MixedInstancesPolicy", value.asInstanceOf[js.Any])
    
    inline def setMixedInstancesPolicyUndefined: Self = StObject.set(x, "MixedInstancesPolicy", js.undefined)
  }
}
