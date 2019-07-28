package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutConfigurationAggregatorResponse extends js.Object {
  /**
    * Returns a ConfigurationAggregator object.
    */
  var ConfigurationAggregator: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ConfigurationAggregator] = js.undefined
}

object PutConfigurationAggregatorResponse {
  @scala.inline
  def apply(ConfigurationAggregator: ConfigurationAggregator = null): PutConfigurationAggregatorResponse = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationAggregator != null) __obj.updateDynamic("ConfigurationAggregator")(ConfigurationAggregator)
    __obj.asInstanceOf[PutConfigurationAggregatorResponse]
  }
}

