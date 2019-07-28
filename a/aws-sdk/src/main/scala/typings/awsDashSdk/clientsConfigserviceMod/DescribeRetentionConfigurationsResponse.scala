package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRetentionConfigurationsResponse extends js.Object {
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.NextToken] = js.undefined
  /**
    * Returns a retention configuration object.
    */
  var RetentionConfigurations: js.UndefOr[RetentionConfigurationList] = js.undefined
}

object DescribeRetentionConfigurationsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, RetentionConfigurations: RetentionConfigurationList = null): DescribeRetentionConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (RetentionConfigurations != null) __obj.updateDynamic("RetentionConfigurations")(RetentionConfigurations)
    __obj.asInstanceOf[DescribeRetentionConfigurationsResponse]
  }
}

