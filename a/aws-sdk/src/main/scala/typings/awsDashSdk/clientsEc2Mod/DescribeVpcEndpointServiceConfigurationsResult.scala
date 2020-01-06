package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVpcEndpointServiceConfigurationsResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about one or more services.
    */
  var ServiceConfigurations: js.UndefOr[ServiceConfigurationSet] = js.native
}

object DescribeVpcEndpointServiceConfigurationsResult {
  @scala.inline
  def apply(NextToken: String = null, ServiceConfigurations: ServiceConfigurationSet = null): DescribeVpcEndpointServiceConfigurationsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ServiceConfigurations != null) __obj.updateDynamic("ServiceConfigurations")(ServiceConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVpcEndpointServiceConfigurationsResult]
  }
}

