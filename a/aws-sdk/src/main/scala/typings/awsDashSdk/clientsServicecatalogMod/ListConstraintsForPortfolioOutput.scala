package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConstraintsForPortfolioOutput extends js.Object {
  /**
    * Information about the constraints.
    */
  var ConstraintDetails: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ConstraintDetails] = js.native
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
}

object ListConstraintsForPortfolioOutput {
  @scala.inline
  def apply(ConstraintDetails: ConstraintDetails = null, NextPageToken: PageToken = null): ListConstraintsForPortfolioOutput = {
    val __obj = js.Dynamic.literal()
    if (ConstraintDetails != null) __obj.updateDynamic("ConstraintDetails")(ConstraintDetails.asInstanceOf[js.Any])
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConstraintsForPortfolioOutput]
  }
}

