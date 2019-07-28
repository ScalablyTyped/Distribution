package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeVpcEndpointServicePermissionsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * One or more filters.    principal - The ARN of the principal.    principal-type - The principal type (All | Service | OrganizationUnit | Account | User | Role).  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    * The maximum number of results to return for the request in a single page. The remaining results of the initial request can be seen by sending another request with the returned NextToken value. This value can be between 5 and 1000; if MaxResults is given a value larger than 1000, only 1000 results are returned.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  /**
    * The token to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The ID of the service.
    */
  var ServiceId: String
}

object DescribeVpcEndpointServicePermissionsRequest {
  @scala.inline
  def apply(
    ServiceId: String,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Filters: FilterList = null,
    MaxResults: js.UndefOr[Integer] = js.undefined,
    NextToken: String = null
  ): DescribeVpcEndpointServicePermissionsRequest = {
    val __obj = js.Dynamic.literal(ServiceId = ServiceId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeVpcEndpointServicePermissionsRequest]
  }
}

