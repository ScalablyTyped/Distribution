package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationAggregator extends js.Object {
  /**
    * Provides a list of source accounts and regions to be aggregated.
    */
  var AccountAggregationSources: js.UndefOr[AccountAggregationSourceList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the aggregator.
    */
  var ConfigurationAggregatorArn: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ConfigurationAggregatorArn] = js.native
  /**
    * The name of the aggregator.
    */
  var ConfigurationAggregatorName: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ConfigurationAggregatorName] = js.native
  /**
    * The time stamp when the configuration aggregator was created.
    */
  var CreationTime: js.UndefOr[_Date] = js.native
  /**
    * The time of the last update.
    */
  var LastUpdatedTime: js.UndefOr[_Date] = js.native
  /**
    * Provides an organization and list of regions to be aggregated.
    */
  var OrganizationAggregationSource: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.OrganizationAggregationSource] = js.native
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
    if (AccountAggregationSources != null) __obj.updateDynamic("AccountAggregationSources")(AccountAggregationSources.asInstanceOf[js.Any])
    if (ConfigurationAggregatorArn != null) __obj.updateDynamic("ConfigurationAggregatorArn")(ConfigurationAggregatorArn.asInstanceOf[js.Any])
    if (ConfigurationAggregatorName != null) __obj.updateDynamic("ConfigurationAggregatorName")(ConfigurationAggregatorName.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (LastUpdatedTime != null) __obj.updateDynamic("LastUpdatedTime")(LastUpdatedTime.asInstanceOf[js.Any])
    if (OrganizationAggregationSource != null) __obj.updateDynamic("OrganizationAggregationSource")(OrganizationAggregationSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationAggregator]
  }
}

