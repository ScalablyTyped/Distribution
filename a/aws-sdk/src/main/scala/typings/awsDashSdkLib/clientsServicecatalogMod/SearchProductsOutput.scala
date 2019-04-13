package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchProductsOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
  /**
    * The product view aggregations.
    */
  var ProductViewAggregations: js.UndefOr[ProductViewAggregations] = js.undefined
  /**
    * Information about the product views.
    */
  var ProductViewSummaries: js.UndefOr[ProductViewSummaries] = js.undefined
}

object SearchProductsOutput {
  @scala.inline
  def apply(
    NextPageToken: PageToken = null,
    ProductViewAggregations: ProductViewAggregations = null,
    ProductViewSummaries: ProductViewSummaries = null
  ): SearchProductsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken)
    if (ProductViewAggregations != null) __obj.updateDynamic("ProductViewAggregations")(ProductViewAggregations)
    if (ProductViewSummaries != null) __obj.updateDynamic("ProductViewSummaries")(ProductViewSummaries)
    __obj.asInstanceOf[SearchProductsOutput]
  }
}

