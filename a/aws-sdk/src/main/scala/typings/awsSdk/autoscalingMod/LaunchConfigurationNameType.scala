package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchConfigurationNameType extends StObject {
  
  /**
    * The name of the launch configuration.
    */
  var LaunchConfigurationName: ResourceName
}
object LaunchConfigurationNameType {
  
  inline def apply(LaunchConfigurationName: ResourceName): LaunchConfigurationNameType = {
    val __obj = js.Dynamic.literal(LaunchConfigurationName = LaunchConfigurationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchConfigurationNameType]
  }
  
  extension [Self <: LaunchConfigurationNameType](x: Self) {
    
    inline def setLaunchConfigurationName(value: ResourceName): Self = StObject.set(x, "LaunchConfigurationName", value.asInstanceOf[js.Any])
  }
}
