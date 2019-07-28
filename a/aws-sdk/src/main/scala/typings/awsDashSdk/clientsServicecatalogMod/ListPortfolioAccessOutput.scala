package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPortfolioAccessOutput extends js.Object {
  /**
    * Information about the AWS accounts with access to the portfolio.
    */
  var AccountIds: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.AccountIds] = js.undefined
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
}

object ListPortfolioAccessOutput {
  @scala.inline
  def apply(AccountIds: AccountIds = null, NextPageToken: PageToken = null): ListPortfolioAccessOutput = {
    val __obj = js.Dynamic.literal()
    if (AccountIds != null) __obj.updateDynamic("AccountIds")(AccountIds)
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken)
    __obj.asInstanceOf[ListPortfolioAccessOutput]
  }
}

