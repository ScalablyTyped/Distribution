package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationAggregator extends js.Object {
  /**
    * Provides a list of source accounts and regions to be aggregated.
    */
  var AccountAggregationSources: js.UndefOr[AccountAggregationSourceList] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the aggregator.
    */
  var ConfigurationAggregatorArn: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ConfigurationAggregatorArn] = js.undefined
  /**
    * The name of the aggregator.
    */
  var ConfigurationAggregatorName: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ConfigurationAggregatorName] = js.undefined
  /**
    * The time stamp when the configuration aggregator was created.
    */
  var CreationTime: js.UndefOr[_Date] = js.undefined
  /**
    * The time of the last update.
    */
  var LastUpdatedTime: js.UndefOr[_Date] = js.undefined
  /**
    * Provides an organization and list of regions to be aggregated.
    */
  var OrganizationAggregationSource: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.OrganizationAggregationSource] = js.undefined
}

object ConfigurationAggregator {
  @scala.inline
  def apply(
    AccountAggregationSources: AccountAggregationSourceList = null,
    ConfigurationAggregatorArn: ConfigurationAggregatorArn = null,
    ConfigurationAggregatorName: ConfigurationAggregatorName = null,
    CreationTime: _Date = null,
    LastUpdatedTime: _Date = null,
    OrganizationAggregationSource: OrganizationAggregationSource = null
  ): ConfigurationAggregator = {
    val __obj = js.Dynamic.literal()
    if (AccountAggregationSources != null) __obj.updateDynamic("AccountAggregationSources")(AccountAggregationSources)
    if (ConfigurationAggregatorArn != null) __obj.updateDynamic("ConfigurationAggregatorArn")(ConfigurationAggregatorArn)
    if (ConfigurationAggregatorName != null) __obj.updateDynamic("ConfigurationAggregatorName")(ConfigurationAggregatorName)
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (LastUpdatedTime != null) __obj.updateDynamic("LastUpdatedTime")(LastUpdatedTime)
    if (OrganizationAggregationSource != null) __obj.updateDynamic("OrganizationAggregationSource")(OrganizationAggregationSource)
    __obj.asInstanceOf[ConfigurationAggregator]
  }
}

