package typings.awsDashSdk.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateComponentConfigurationRequest extends js.Object {
  /**
    * The configuration settings of the component. The value is the escaped JSON of the configuration. For more information about the JSON format, see Working with JSON. You can send a request to DescribeComponentConfigurationRecommendation to see the recommended configuration for a component.
    */
  var ComponentConfiguration: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.ComponentConfiguration] = js.undefined
  /**
    * The name of the component.
    */
  var ComponentName: typings.awsDashSdk.clientsApplicationinsightsMod.ComponentName
  /**
    * Indicates whether the application component is monitored.
    */
  var Monitor: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.Monitor] = js.undefined
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typings.awsDashSdk.clientsApplicationinsightsMod.ResourceGroupName
  /**
    * The tier of the application component. Supported tiers include DOT_NET_WORKER, DOT_NET_WEB, SQL_SERVER, and DEFAULT.
    */
  var Tier: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.Tier] = js.undefined
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
    val __obj = js.Dynamic.literal(ComponentName = ComponentName, ResourceGroupName = ResourceGroupName)
    if (ComponentConfiguration != null) __obj.updateDynamic("ComponentConfiguration")(ComponentConfiguration)
    if (!js.isUndefined(Monitor)) __obj.updateDynamic("Monitor")(Monitor)
    if (Tier != null) __obj.updateDynamic("Tier")(Tier)
    __obj.asInstanceOf[UpdateComponentConfigurationRequest]
  }
}

