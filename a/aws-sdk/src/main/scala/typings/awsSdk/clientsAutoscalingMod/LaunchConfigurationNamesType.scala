package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchConfigurationNamesType extends StObject {
  
  /**
    * The launch configuration names. If you omit this property, all launch configurations are described. Array Members: Maximum number of 50 items.
    */
  var LaunchConfigurationNames: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.LaunchConfigurationNames] = js.undefined
  
  /**
    * The maximum number of items to return with this call. The default value is 50 and the maximum value is 100.
    */
  var MaxRecords: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.MaxRecords] = js.undefined
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
}
object LaunchConfigurationNamesType {
  
  inline def apply(): LaunchConfigurationNamesType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchConfigurationNamesType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LaunchConfigurationNamesType] (val x: Self) extends AnyVal {
    
    inline def setLaunchConfigurationNames(value: LaunchConfigurationNames): Self = StObject.set(x, "LaunchConfigurationNames", value.asInstanceOf[js.Any])
    
    inline def setLaunchConfigurationNamesUndefined: Self = StObject.set(x, "LaunchConfigurationNames", js.undefined)
    
    inline def setLaunchConfigurationNamesVarargs(value: XmlStringMaxLen255*): Self = StObject.set(x, "LaunchConfigurationNames", js.Array(value*))
    
    inline def setMaxRecords(value: MaxRecords): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    inline def setNextToken(value: XmlString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
