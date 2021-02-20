package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchConfigurationNamesType extends StObject {
  
  /**
    * The launch configuration names. If you omit this parameter, all launch configurations are described.
    */
  var LaunchConfigurationNames: js.UndefOr[typings.awsSdk.autoscalingMod.LaunchConfigurationNames] = js.native
  
  /**
    * The maximum number of items to return with this call. The default value is 50 and the maximum value is 100.
    */
  var MaxRecords: js.UndefOr[typings.awsSdk.autoscalingMod.MaxRecords] = js.native
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[XmlString] = js.native
}
object LaunchConfigurationNamesType {
  
  @scala.inline
  def apply(): LaunchConfigurationNamesType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchConfigurationNamesType]
  }
  
  @scala.inline
  implicit class LaunchConfigurationNamesTypeMutableBuilder[Self <: LaunchConfigurationNamesType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLaunchConfigurationNames(value: LaunchConfigurationNames): Self = StObject.set(x, "LaunchConfigurationNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchConfigurationNamesUndefined: Self = StObject.set(x, "LaunchConfigurationNames", js.undefined)
    
    @scala.inline
    def setLaunchConfigurationNamesVarargs(value: ResourceName*): Self = StObject.set(x, "LaunchConfigurationNames", js.Array(value :_*))
    
    @scala.inline
    def setMaxRecords(value: MaxRecords): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    @scala.inline
    def setNextToken(value: XmlString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
