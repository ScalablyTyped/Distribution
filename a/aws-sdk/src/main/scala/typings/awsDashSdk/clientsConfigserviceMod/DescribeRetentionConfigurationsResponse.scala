package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRetentionConfigurationsResponse extends js.Object {
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.NextToken] = js.native
  /**
    * Returns a retention configuration object.
    */
  var RetentionConfigurations: js.UndefOr[RetentionConfigurationList] = js.native
}

object DescribeRetentionConfigurationsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, RetentionConfigurations: RetentionConfigurationList = null): DescribeRetentionConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (RetentionConfigurations != null) __obj.updateDynamic("RetentionConfigurations")(RetentionConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRetentionConfigurationsResponse]
  }
}

