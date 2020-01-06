package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPortfoliosOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  /**
    * Information about the portfolios.
    */
  var PortfolioDetails: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.PortfolioDetails] = js.native
}

object ListPortfoliosOutput {
  @scala.inline
  def apply(NextPageToken: PageToken = null, PortfolioDetails: PortfolioDetails = null): ListPortfoliosOutput = {
    val __obj = js.Dynamic.literal()
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken.asInstanceOf[js.Any])
    if (PortfolioDetails != null) __obj.updateDynamic("PortfolioDetails")(PortfolioDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPortfoliosOutput]
  }
}

