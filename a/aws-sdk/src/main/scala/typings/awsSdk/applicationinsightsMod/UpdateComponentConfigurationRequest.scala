package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateComponentConfigurationRequest extends js.Object {
  /**
    * The configuration settings of the component. The value is the escaped JSON of the configuration. For more information about the JSON format, see Working with JSON. You can send a request to DescribeComponentConfigurationRecommendation to see the recommended configuration for a component. For the complete format of the component configuration file, see Component Configuration.
    */
  var ComponentConfiguration: js.UndefOr[typings.awsSdk.applicationinsightsMod.ComponentConfiguration] = js.native
  /**
    * The name of the component.
    */
  var ComponentName: typings.awsSdk.applicationinsightsMod.ComponentName = js.native
  /**
    * Indicates whether the application component is monitored.
    */
  var Monitor: js.UndefOr[typings.awsSdk.applicationinsightsMod.Monitor] = js.native
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typings.awsSdk.applicationinsightsMod.ResourceGroupName = js.native
  /**
    * The tier of the application component. Supported tiers include DOT_NET_WORKER, DOT_NET_WEB, DOT_NET_CORE, SQL_SERVER, and DEFAULT.
    */
  var Tier: js.UndefOr[typings.awsSdk.applicationinsightsMod.Tier] = js.native
}

object UpdateComponentConfigurationRequest {
  @scala.inline
  def apply(ComponentName: ComponentName, ResourceGroupName: ResourceGroupName): UpdateComponentConfigurationRequest = {
    val __obj = js.Dynamic.literal(ComponentName = ComponentName.asInstanceOf[js.Any], ResourceGroupName = ResourceGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateComponentConfigurationRequest]
  }
  @scala.inline
  implicit class UpdateComponentConfigurationRequestOps[Self <: UpdateComponentConfigurationRequest] (val x: Self) extends AnyVal {
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
    def setComponentName(value: ComponentName): Self = this.set("ComponentName", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceGroupName(value: ResourceGroupName): Self = this.set("ResourceGroupName", value.asInstanceOf[js.Any])
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

