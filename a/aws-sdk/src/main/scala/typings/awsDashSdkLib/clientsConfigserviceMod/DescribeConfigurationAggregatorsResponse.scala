package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeConfigurationAggregatorsResponse extends js.Object {
  /**
    * Returns a ConfigurationAggregators object.
    */
  var ConfigurationAggregators: js.UndefOr[ConfigurationAggregatorList] = js.undefined
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeConfigurationAggregatorsResponse {
  @scala.inline
  def apply(ConfigurationAggregators: ConfigurationAggregatorList = null, NextToken: String = null): DescribeConfigurationAggregatorsResponse = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationAggregators != null) __obj.updateDynamic("ConfigurationAggregators")(ConfigurationAggregators)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeConfigurationAggregatorsResponse]
  }
}

