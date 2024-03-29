package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateConfig extends StObject {
  
  /**
    * The launch template.
    */
  var LaunchTemplateSpecification: js.UndefOr[FleetLaunchTemplateSpecification] = js.undefined
  
  /**
    * Any parameters that you specify override the same parameters in the launch template.
    */
  var Overrides: js.UndefOr[LaunchTemplateOverridesList] = js.undefined
}
object LaunchTemplateConfig {
  
  inline def apply(): LaunchTemplateConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LaunchTemplateConfig] (val x: Self) extends AnyVal {
    
    inline def setLaunchTemplateSpecification(value: FleetLaunchTemplateSpecification): Self = StObject.set(x, "LaunchTemplateSpecification", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateSpecificationUndefined: Self = StObject.set(x, "LaunchTemplateSpecification", js.undefined)
    
    inline def setOverrides(value: LaunchTemplateOverridesList): Self = StObject.set(x, "Overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "Overrides", js.undefined)
    
    inline def setOverridesVarargs(value: LaunchTemplateOverrides*): Self = StObject.set(x, "Overrides", js.Array(value*))
  }
}
