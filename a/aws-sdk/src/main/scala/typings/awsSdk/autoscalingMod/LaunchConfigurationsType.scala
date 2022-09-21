package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchConfigurationsType extends StObject {
  
  /**
    * The launch configurations.
    */
  var LaunchConfigurations: typings.awsSdk.autoscalingMod.LaunchConfigurations
  
  /**
    * A string that indicates that the response contains more items than can be returned in a single response. To receive additional items, specify this string for the NextToken value when requesting the next set of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
}
object LaunchConfigurationsType {
  
  inline def apply(LaunchConfigurations: LaunchConfigurations): LaunchConfigurationsType = {
    val __obj = js.Dynamic.literal(LaunchConfigurations = LaunchConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchConfigurationsType]
  }
  
  extension [Self <: LaunchConfigurationsType](x: Self) {
    
    inline def setLaunchConfigurations(value: LaunchConfigurations): Self = StObject.set(x, "LaunchConfigurations", value.asInstanceOf[js.Any])
    
    inline def setLaunchConfigurationsVarargs(value: LaunchConfiguration*): Self = StObject.set(x, "LaunchConfigurations", js.Array(value*))
    
    inline def setNextToken(value: XmlString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
