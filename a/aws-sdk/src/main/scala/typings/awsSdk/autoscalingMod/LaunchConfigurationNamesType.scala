package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchConfigurationNamesType extends js.Object {
  
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
  implicit class LaunchConfigurationNamesTypeOps[Self <: LaunchConfigurationNamesType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLaunchConfigurationNamesVarargs(value: ResourceName*): Self = this.set("LaunchConfigurationNames", js.Array(value :_*))
    
    @scala.inline
    def setLaunchConfigurationNames(value: LaunchConfigurationNames): Self = this.set("LaunchConfigurationNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchConfigurationNames: Self = this.set("LaunchConfigurationNames", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: MaxRecords): Self = this.set("MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRecords: Self = this.set("MaxRecords", js.undefined)
    
    @scala.inline
    def setNextToken(value: XmlString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
