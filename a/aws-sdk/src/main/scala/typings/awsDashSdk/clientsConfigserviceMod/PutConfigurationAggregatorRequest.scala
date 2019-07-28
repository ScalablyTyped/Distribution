package typings.awsDashSdk.clientsConfigserviceMod

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
  var ConfigurationAggregatorName: typings.awsDashSdk.clientsConfigserviceMod.ConfigurationAggregatorName
  /**
    * An OrganizationAggregationSource object.
    */
  var OrganizationAggregationSource: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.OrganizationAggregationSource] = js.undefined
  var Tags: js.UndefOr[TagsList] = js.undefined
}

object PutConfigurationAggregatorRequest {
  @scala.inline
  def apply(
    ConfigurationAggregatorName: ConfigurationAggregatorName,
    AccountAggregationSources: AccountAggregationSourceList = null,
    OrganizationAggregationSource: OrganizationAggregationSource = null,
    Tags: TagsList = null
  ): PutConfigurationAggregatorRequest = {
    val __obj = js.Dynamic.literal(ConfigurationAggregatorName = ConfigurationAggregatorName)
    if (AccountAggregationSources != null) __obj.updateDynamic("AccountAggregationSources")(AccountAggregationSources)
    if (OrganizationAggregationSource != null) __obj.updateDynamic("OrganizationAggregationSource")(OrganizationAggregationSource)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[PutConfigurationAggregatorRequest]
  }
}

