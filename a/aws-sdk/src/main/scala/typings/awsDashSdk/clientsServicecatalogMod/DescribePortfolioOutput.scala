package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePortfolioOutput extends js.Object {
  /**
    * Information about the associated budgets.
    */
  var Budgets: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.Budgets] = js.native
  /**
    * Information about the portfolio.
    */
  var PortfolioDetail: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.PortfolioDetail] = js.native
  /**
    * Information about the TagOptions associated with the portfolio.
    */
  var TagOptions: js.UndefOr[TagOptionDetails] = js.native
  /**
    * Information about the tags associated with the portfolio.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.Tags] = js.native
}

object DescribePortfolioOutput {
  @scala.inline
  def apply(
    Budgets: Budgets = null,
    PortfolioDetail: PortfolioDetail = null,
    TagOptions: TagOptionDetails = null,
    Tags: Tags = null
  ): DescribePortfolioOutput = {
    val __obj = js.Dynamic.literal()
    if (Budgets != null) __obj.updateDynamic("Budgets")(Budgets.asInstanceOf[js.Any])
    if (PortfolioDetail != null) __obj.updateDynamic("PortfolioDetail")(PortfolioDetail.asInstanceOf[js.Any])
    if (TagOptions != null) __obj.updateDynamic("TagOptions")(TagOptions.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePortfolioOutput]
  }
}

