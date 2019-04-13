package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutConfigurationAggregatorRequest extends js.Object {
  /**
    * A list of AccountAggregationSource object. 
    */
  var AccountAggregationSources: js.UndefOr[AccountAggregationSourceList] = js.undefined
  /**
    * The name of the configuration aggregator.
    */
  var ConfigurationAggregatorName: awsDashSdkLib.clientsConfigserviceMod.ConfigurationAggregatorName
  /**
    * An OrganizationAggregationSource object.
    */
  var OrganizationAggregationSource: js.UndefOr[OrganizationAggregationSource] = js.undefined
}

object PutConfigurationAggregatorRequest {
  @scala.inline
  def apply(
    ConfigurationAggregatorName: ConfigurationAggregatorName,
    AccountAggregationSources: AccountAggregationSourceList = null,
    OrganizationAggregationSource: OrganizationAggregationSource = null
  ): PutConfigurationAggregatorRequest = {
    val __obj = js.Dynamic.literal(ConfigurationAggregatorName = ConfigurationAggregatorName)
    if (AccountAggregationSources != null) __obj.updateDynamic("AccountAggregationSources")(AccountAggregationSources)
    if (OrganizationAggregationSource != null) __obj.updateDynamic("OrganizationAggregationSource")(OrganizationAggregationSource)
    __obj.asInstanceOf[PutConfigurationAggregatorRequest]
  }
}

