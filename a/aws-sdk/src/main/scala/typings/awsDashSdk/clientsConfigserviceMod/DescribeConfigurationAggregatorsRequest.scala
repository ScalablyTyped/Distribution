package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeConfigurationAggregatorsRequest extends js.Object {
  /**
    * The name of the configuration aggregators.
    */
  var ConfigurationAggregatorNames: js.UndefOr[ConfigurationAggregatorNameList] = js.undefined
  /**
    * The maximum number of configuration aggregators returned on each page. The default is maximum. If you specify 0, AWS Config uses the default.
    */
  var Limit: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.Limit] = js.undefined
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeConfigurationAggregatorsRequest {
  @scala.inline
  def apply(
    ConfigurationAggregatorNames: ConfigurationAggregatorNameList = null,
    Limit: Int | Double = null,
    NextToken: String = null
  ): DescribeConfigurationAggregatorsRequest = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationAggregatorNames != null) __obj.updateDynamic("ConfigurationAggregatorNames")(ConfigurationAggregatorNames)
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeConfigurationAggregatorsRequest]
  }
}

