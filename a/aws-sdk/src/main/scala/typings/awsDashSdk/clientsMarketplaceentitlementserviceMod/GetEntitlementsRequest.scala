package typings.awsDashSdk.clientsMarketplaceentitlementserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEntitlementsRequest extends js.Object {
  /**
    * Filter is used to return entitlements for a specific customer or for a specific dimension. Filters are described as keys mapped to a lists of values. Filtered requests are unioned for each value in the value list, and then intersected for each filter key.
    */
  var Filter: js.UndefOr[GetEntitlementFilters] = js.native
  /**
    * The maximum number of items to retrieve from the GetEntitlements operation. For pagination, use the NextToken field in subsequent calls to GetEntitlements.
    */
  var MaxResults: js.UndefOr[Integer] = js.native
  /**
    * For paginated calls to GetEntitlements, pass the NextToken from the previous GetEntitlementsResult.
    */
  var NextToken: js.UndefOr[NonEmptyString] = js.native
  /**
    * Product code is used to uniquely identify a product in AWS Marketplace. The product code will be provided by AWS Marketplace when the product listing is created.
    */
  var ProductCode: typings.awsDashSdk.clientsMarketplaceentitlementserviceMod.ProductCode = js.native
}

object GetEntitlementsRequest {
  @scala.inline
  def apply(
    ProductCode: ProductCode,
    Filter: GetEntitlementFilters = null,
    MaxResults: Int | scala.Double = null,
    NextToken: NonEmptyString = null
  ): GetEntitlementsRequest = {
    val __obj = js.Dynamic.literal(ProductCode = ProductCode.asInstanceOf[js.Any])
    if (Filter != null) __obj.updateDynamic("Filter")(Filter.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEntitlementsRequest]
  }
}

