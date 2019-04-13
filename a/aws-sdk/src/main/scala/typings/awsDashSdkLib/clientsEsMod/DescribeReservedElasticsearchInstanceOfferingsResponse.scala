package typings
package awsDashSdkLib.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeReservedElasticsearchInstanceOfferingsResponse extends js.Object {
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * List of reserved Elasticsearch instance offerings
    */
  var ReservedElasticsearchInstanceOfferings: js.UndefOr[ReservedElasticsearchInstanceOfferingList] = js.undefined
}

object DescribeReservedElasticsearchInstanceOfferingsResponse {
  @scala.inline
  def apply(
    NextToken: NextToken = null,
    ReservedElasticsearchInstanceOfferings: ReservedElasticsearchInstanceOfferingList = null
  ): DescribeReservedElasticsearchInstanceOfferingsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ReservedElasticsearchInstanceOfferings != null) __obj.updateDynamic("ReservedElasticsearchInstanceOfferings")(ReservedElasticsearchInstanceOfferings)
    __obj.asInstanceOf[DescribeReservedElasticsearchInstanceOfferingsResponse]
  }
}

