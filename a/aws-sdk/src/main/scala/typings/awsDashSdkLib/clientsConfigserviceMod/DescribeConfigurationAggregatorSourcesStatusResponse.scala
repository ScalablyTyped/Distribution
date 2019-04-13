package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeConfigurationAggregatorSourcesStatusResponse extends js.Object {
  /**
    * Returns an AggregatedSourceStatus object. 
    */
  var AggregatedSourceStatusList: js.UndefOr[AggregatedSourceStatusList] = js.undefined
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeConfigurationAggregatorSourcesStatusResponse {
  @scala.inline
  def apply(AggregatedSourceStatusList: AggregatedSourceStatusList = null, NextToken: String = null): DescribeConfigurationAggregatorSourcesStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (AggregatedSourceStatusList != null) __obj.updateDynamic("AggregatedSourceStatusList")(AggregatedSourceStatusList)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeConfigurationAggregatorSourcesStatusResponse]
  }
}

