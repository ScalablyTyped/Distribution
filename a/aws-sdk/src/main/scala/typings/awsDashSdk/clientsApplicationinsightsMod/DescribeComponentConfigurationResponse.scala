package typings.awsDashSdk.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeComponentConfigurationResponse extends js.Object {
  /**
    * The configuration settings of the component. The value is the escaped JSON of the configuration.
    */
  var ComponentConfiguration: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.ComponentConfiguration] = js.undefined
  /**
    * Indicates whether the application component is monitored.
    */
  var Monitor: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.Monitor] = js.undefined
  /**
    * The tier of the application component. Supported tiers include DOT_NET_WORKER, DOT_NET_WEB_TIER, SQL_SERVER, and DEFAULT 
    */
  var Tier: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.Tier] = js.undefined
}

object DescribeComponentConfigurationResponse {
  @scala.inline
  def apply(
    ComponentConfiguration: ComponentConfiguration = null,
    Monitor: js.UndefOr[Monitor] = js.undefined,
    Tier: Tier = null
  ): DescribeComponentConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (ComponentConfiguration != null) __obj.updateDynamic("ComponentConfiguration")(ComponentConfiguration)
    if (!js.isUndefined(Monitor)) __obj.updateDynamic("Monitor")(Monitor)
    if (Tier != null) __obj.updateDynamic("Tier")(Tier)
    __obj.asInstanceOf[DescribeComponentConfigurationResponse]
  }
}

