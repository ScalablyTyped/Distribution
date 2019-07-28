package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateConfigurationSetReputationMetricsEnabledRequest extends js.Object {
  /**
    * The name of the configuration set that you want to update.
    */
  var ConfigurationSetName: typings.awsDashSdk.clientsSesMod.ConfigurationSetName
  /**
    * Describes whether or not Amazon SES will publish reputation metrics for the configuration set, such as bounce and complaint rates, to Amazon CloudWatch.
    */
  var Enabled: typings.awsDashSdk.clientsSesMod.Enabled
}

object UpdateConfigurationSetReputationMetricsEnabledRequest {
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName, Enabled: Enabled): UpdateConfigurationSetReputationMetricsEnabledRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName, Enabled = Enabled)
  
    __obj.asInstanceOf[UpdateConfigurationSetReputationMetricsEnabledRequest]
  }
}

