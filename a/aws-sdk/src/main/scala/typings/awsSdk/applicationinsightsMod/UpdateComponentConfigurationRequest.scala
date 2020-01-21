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
  def apply(
    ComponentName: ComponentName,
    ResourceGroupName: ResourceGroupName,
    ComponentConfiguration: ComponentConfiguration = null,
    Monitor: js.UndefOr[Boolean] = js.undefined,
    Tier: Tier = null
  ): UpdateComponentConfigurationRequest = {
    val __obj = js.Dynamic.literal(ComponentName = ComponentName.asInstanceOf[js.Any], ResourceGroupName = ResourceGroupName.asInstanceOf[js.Any])
    if (ComponentConfiguration != null) __obj.updateDynamic("ComponentConfiguration")(ComponentConfiguration.asInstanceOf[js.Any])
    if (!js.isUndefined(Monitor)) __obj.updateDynamic("Monitor")(Monitor.asInstanceOf[js.Any])
    if (Tier != null) __obj.updateDynamic("Tier")(Tier.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateComponentConfigurationRequest]
  }
}

