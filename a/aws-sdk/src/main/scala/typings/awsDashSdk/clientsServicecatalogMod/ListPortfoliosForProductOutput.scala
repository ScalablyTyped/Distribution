package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPortfoliosForProductOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
  /**
    * Information about the portfolios.
    */
  var PortfolioDetails: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.PortfolioDetails] = js.undefined
}

object ListPortfoliosForProductOutput {
  @scala.inline
  def apply(NextPageToken: PageToken = null, PortfolioDetails: PortfolioDetails = null): ListPortfoliosForProductOutput = {
    val __obj = js.Dynamic.literal()
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken)
    if (PortfolioDetails != null) __obj.updateDynamic("PortfolioDetails")(PortfolioDetails)
    __obj.asInstanceOf[ListPortfoliosForProductOutput]
  }
}

