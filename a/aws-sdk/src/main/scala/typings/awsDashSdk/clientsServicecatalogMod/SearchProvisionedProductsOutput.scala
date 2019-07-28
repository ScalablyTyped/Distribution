package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchProvisionedProductsOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
  /**
    * Information about the provisioned products.
    */
  var ProvisionedProducts: js.UndefOr[ProvisionedProductAttributes] = js.undefined
  /**
    * The number of provisioned products found.
    */
  var TotalResultsCount: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.TotalResultsCount] = js.undefined
}

object SearchProvisionedProductsOutput {
  @scala.inline
  def apply(
    NextPageToken: PageToken = null,
    ProvisionedProducts: ProvisionedProductAttributes = null,
    TotalResultsCount: js.UndefOr[TotalResultsCount] = js.undefined
  ): SearchProvisionedProductsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken)
    if (ProvisionedProducts != null) __obj.updateDynamic("ProvisionedProducts")(ProvisionedProducts)
    if (!js.isUndefined(TotalResultsCount)) __obj.updateDynamic("TotalResultsCount")(TotalResultsCount)
    __obj.asInstanceOf[SearchProvisionedProductsOutput]
  }
}

