package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReservedElasticsearchInstanceOfferingsResponse extends js.Object {
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsEsMod.NextToken] = js.native
  /**
    * List of reserved Elasticsearch instance offerings
    */
  var ReservedElasticsearchInstanceOfferings: js.UndefOr[ReservedElasticsearchInstanceOfferingList] = js.native
}

object DescribeReservedElasticsearchInstanceOfferingsResponse {
  @scala.inline
  def apply(
    NextToken: NextToken = null,
    ReservedElasticsearchInstanceOfferings: ReservedElasticsearchInstanceOfferingList = null
  ): DescribeReservedElasticsearchInstanceOfferingsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ReservedElasticsearchInstanceOfferings != null) __obj.updateDynamic("ReservedElasticsearchInstanceOfferings")(ReservedElasticsearchInstanceOfferings.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeReservedElasticsearchInstanceOfferingsResponse]
  }
}

