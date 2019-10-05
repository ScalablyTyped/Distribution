package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSpotPriceHistoryRequest extends js.Object {
  /**
    * Filters the results by the specified Availability Zone.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The date and time, up to the current date, from which to stop retrieving the price history data, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ).
    */
  var EndTime: js.UndefOr[DateTime] = js.undefined
  /**
    * One or more filters.    availability-zone - The Availability Zone for which prices should be returned.    instance-type - The type of instance (for example, m3.medium).    product-description - The product description for the Spot price (Linux/UNIX | SUSE Linux | Windows | Linux/UNIX (Amazon VPC) | SUSE Linux (Amazon VPC) | Windows (Amazon VPC)).    spot-price - The Spot price. The value must match exactly (or use wildcards; greater than or less than comparison is not supported).    timestamp - The time stamp of the Spot price history, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ). You can use wildcards (* and ?). Greater than or less than comparison is not supported.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    * Filters the results by the specified instance types.
    */
  var InstanceTypes: js.UndefOr[InstanceTypeList] = js.undefined
  /**
    * The maximum number of results to return in a single call. Specify a value between 1 and 1000. The default value is 1000. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Filters the results by the specified basic product descriptions.
    */
  var ProductDescriptions: js.UndefOr[ProductDescriptionList] = js.undefined
  /**
    * The date and time, up to the past 90 days, from which to start retrieving the price history data, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ).
    */
  var StartTime: js.UndefOr[DateTime] = js.undefined
}

object DescribeSpotPriceHistoryRequest {
  @scala.inline
  def apply(
    AvailabilityZone: String = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    EndTime: DateTime = null,
    Filters: FilterList = null,
    InstanceTypes: InstanceTypeList = null,
    MaxResults: Int | scala.Double = null,
    NextToken: String = null,
    ProductDescriptions: ProductDescriptionList = null,
    StartTime: DateTime = null
  ): DescribeSpotPriceHistoryRequest = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (InstanceTypes != null) __obj.updateDynamic("InstanceTypes")(InstanceTypes)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ProductDescriptions != null) __obj.updateDynamic("ProductDescriptions")(ProductDescriptions)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    __obj.asInstanceOf[DescribeSpotPriceHistoryRequest]
  }
}

