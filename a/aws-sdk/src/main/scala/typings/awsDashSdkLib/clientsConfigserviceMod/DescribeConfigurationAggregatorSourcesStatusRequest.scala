package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeConfigurationAggregatorSourcesStatusRequest extends js.Object {
  /**
    * The name of the configuration aggregator.
    */
  var ConfigurationAggregatorName: awsDashSdkLib.clientsConfigserviceMod.ConfigurationAggregatorName
  /**
    * The maximum number of AggregatorSourceStatus returned on each page. The default is maximum. If you specify 0, AWS Config uses the default.
    */
  var Limit: js.UndefOr[Limit] = js.undefined
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Filters the status type.   Valid value FAILED indicates errors while moving data.   Valid value SUCCEEDED indicates the data was successfully moved.   Valid value OUTDATED indicates the data is not the most recent.  
    */
  var UpdateStatus: js.UndefOr[AggregatedSourceStatusTypeList] = js.undefined
}

object DescribeConfigurationAggregatorSourcesStatusRequest {
  @scala.inline
  def apply(
    ConfigurationAggregatorName: ConfigurationAggregatorName,
    Limit: js.UndefOr[Limit] = js.undefined,
    NextToken: String = null,
    UpdateStatus: AggregatedSourceStatusTypeList = null
  ): DescribeConfigurationAggregatorSourcesStatusRequest = {
    val __obj = js.Dynamic.literal(ConfigurationAggregatorName = ConfigurationAggregatorName)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (UpdateStatus != null) __obj.updateDynamic("UpdateStatus")(UpdateStatus)
    __obj.asInstanceOf[DescribeConfigurationAggregatorSourcesStatusRequest]
  }
}

