package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeReservedElasticsearchInstancesResponse extends js.Object {
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * List of reserved Elasticsearch instances.
    */
  var ReservedElasticsearchInstances: js.UndefOr[ReservedElasticsearchInstanceList] = js.undefined
}

object DescribeReservedElasticsearchInstancesResponse {
  @scala.inline
  def apply(NextToken: String = null, ReservedElasticsearchInstances: ReservedElasticsearchInstanceList = null): DescribeReservedElasticsearchInstancesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ReservedElasticsearchInstances != null) __obj.updateDynamic("ReservedElasticsearchInstances")(ReservedElasticsearchInstances)
    __obj.asInstanceOf[DescribeReservedElasticsearchInstancesResponse]
  }
}

