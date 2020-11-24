package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeComponentConfigurationResponse extends js.Object {
  
  /**
    * The configuration settings of the component. The value is the escaped JSON of the configuration.
    */
  var ComponentConfiguration: js.UndefOr[typings.awsSdk.applicationinsightsMod.ComponentConfiguration] = js.native
  
  /**
    * Indicates whether the application component is monitored.
    */
  var Monitor: js.UndefOr[typings.awsSdk.applicationinsightsMod.Monitor] = js.native
  
  /**
    * The tier of the application component. Supported tiers include DOT_NET_CORE, DOT_NET_WORKER, DOT_NET_WEB, SQL_SERVER, and DEFAULT 
    */
  var Tier: js.UndefOr[typings.awsSdk.applicationinsightsMod.Tier] = js.native
}
object DescribeComponentConfigurationResponse {
  
  @scala.inline
  def apply(): DescribeComponentConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeComponentConfigurationResponse]
  }
  
  @scala.inline
  implicit class DescribeComponentConfigurationResponseOps[Self <: DescribeComponentConfigurationResponse] (val x: Self) extends AnyVal {
    
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
    def setComponentConfiguration(value: ComponentConfiguration): Self = this.set("ComponentConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentConfiguration: Self = this.set("ComponentConfiguration", js.undefined)
    
    @scala.inline
    def setMonitor(value: Monitor): Self = this.set("Monitor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitor: Self = this.set("Monitor", js.undefined)
    
    @scala.inline
    def setTier(value: Tier): Self = this.set("Tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTier: Self = this.set("Tier", js.undefined)
  }
}
