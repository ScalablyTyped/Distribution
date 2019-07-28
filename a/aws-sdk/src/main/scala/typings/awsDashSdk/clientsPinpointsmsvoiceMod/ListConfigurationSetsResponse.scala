package typings.awsDashSdk.clientsPinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListConfigurationSetsResponse extends js.Object {
  /**
    * An object that contains a list of configuration sets for your account in the current region.
    */
  var ConfigurationSets: js.UndefOr[typings.awsDashSdk.clientsPinpointsmsvoiceMod.ConfigurationSets] = js.undefined
  /**
    * A token returned from a previous call to ListConfigurationSets to indicate the position in the list of configuration sets.
    */
  var NextToken: js.UndefOr[NextTokenString] = js.undefined
}

object ListConfigurationSetsResponse {
  @scala.inline
  def apply(ConfigurationSets: ConfigurationSets = null, NextToken: NextTokenString = null): ListConfigurationSetsResponse = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationSets != null) __obj.updateDynamic("ConfigurationSets")(ConfigurationSets)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListConfigurationSetsResponse]
  }
}

