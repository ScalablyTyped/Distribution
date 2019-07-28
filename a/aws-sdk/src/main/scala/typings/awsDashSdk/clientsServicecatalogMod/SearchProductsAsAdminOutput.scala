package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchProductsAsAdminOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
  /**
    * Information about the product views.
    */
  var ProductViewDetails: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ProductViewDetails] = js.undefined
}

object SearchProductsAsAdminOutput {
  @scala.inline
  def apply(NextPageToken: PageToken = null, ProductViewDetails: ProductViewDetails = null): SearchProductsAsAdminOutput = {
    val __obj = js.Dynamic.literal()
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken)
    if (ProductViewDetails != null) __obj.updateDynamic("ProductViewDetails")(ProductViewDetails)
    __obj.asInstanceOf[SearchProductsAsAdminOutput]
  }
}

