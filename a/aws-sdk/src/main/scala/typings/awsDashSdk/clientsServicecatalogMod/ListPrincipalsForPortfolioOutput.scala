package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPrincipalsForPortfolioOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  /**
    * The IAM principals (users or roles) associated with the portfolio.
    */
  var Principals: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.Principals] = js.native
}

object ListPrincipalsForPortfolioOutput {
  @scala.inline
  def apply(NextPageToken: PageToken = null, Principals: Principals = null): ListPrincipalsForPortfolioOutput = {
    val __obj = js.Dynamic.literal()
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken.asInstanceOf[js.Any])
    if (Principals != null) __obj.updateDynamic("Principals")(Principals.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPrincipalsForPortfolioOutput]
  }
}

