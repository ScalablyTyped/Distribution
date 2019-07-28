package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeReservedElasticsearchInstanceOfferingsRequest extends js.Object {
  /**
    * Set this value to limit the number of results returned. If not specified, defaults to 100.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsEsMod.MaxResults] = js.undefined
  /**
    * NextToken should be sent in case if earlier API call produced result containing NextToken. It is used for pagination.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsEsMod.NextToken] = js.undefined
  /**
    * The offering identifier filter value. Use this parameter to show only the available offering that matches the specified reservation identifier.
    */
  var ReservedElasticsearchInstanceOfferingId: js.UndefOr[GUID] = js.undefined
}

object DescribeReservedElasticsearchInstanceOfferingsRequest {
  @scala.inline
  def apply(
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null,
    ReservedElasticsearchInstanceOfferingId: GUID = null
  ): DescribeReservedElasticsearchInstanceOfferingsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ReservedElasticsearchInstanceOfferingId != null) __obj.updateDynamic("ReservedElasticsearchInstanceOfferingId")(ReservedElasticsearchInstanceOfferingId)
    __obj.asInstanceOf[DescribeReservedElasticsearchInstanceOfferingsRequest]
  }
}

