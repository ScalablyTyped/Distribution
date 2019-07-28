package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutConfigurationSetReputationOptionsRequest extends js.Object {
  /**
    * The name of the configuration set that you want to enable or disable reputation metric tracking for.
    */
  var ConfigurationSetName: typings.awsDashSdk.clientsPinpointemailMod.ConfigurationSetName
  /**
    * If true, tracking of reputation metrics is enabled for the configuration set. If false, tracking of reputation metrics is disabled for the configuration set.
    */
  var ReputationMetricsEnabled: js.UndefOr[Enabled] = js.undefined
}

object PutConfigurationSetReputationOptionsRequest {
  @scala.inline
  def apply(
    ConfigurationSetName: ConfigurationSetName,
    ReputationMetricsEnabled: js.UndefOr[Enabled] = js.undefined
  ): PutConfigurationSetReputationOptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName)
    if (!js.isUndefined(ReputationMetricsEnabled)) __obj.updateDynamic("ReputationMetricsEnabled")(ReputationMetricsEnabled)
    __obj.asInstanceOf[PutConfigurationSetReputationOptionsRequest]
  }
}

