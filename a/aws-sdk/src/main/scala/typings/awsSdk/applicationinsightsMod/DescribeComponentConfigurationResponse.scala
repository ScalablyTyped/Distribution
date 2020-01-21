package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    ComponentConfiguration: ComponentConfiguration = null,
    Monitor: js.UndefOr[Boolean] = js.undefined,
    Tier: Tier = null
  ): DescribeComponentConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (ComponentConfiguration != null) __obj.updateDynamic("ComponentConfiguration")(ComponentConfiguration.asInstanceOf[js.Any])
    if (!js.isUndefined(Monitor)) __obj.updateDynamic("Monitor")(Monitor.asInstanceOf[js.Any])
    if (Tier != null) __obj.updateDynamic("Tier")(Tier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeComponentConfigurationResponse]
  }
}

