package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DesiredConfiguration extends StObject {
  
  var LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined
  
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
