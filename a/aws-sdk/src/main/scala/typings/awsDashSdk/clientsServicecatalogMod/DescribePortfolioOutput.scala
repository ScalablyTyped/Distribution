package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePortfolioOutput extends js.Object {
  /**
    * Information about the associated budgets.
    */
  var Budgets: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.Budgets] = js.undefined
  /**
    * Information about the portfolio.
    */
  var PortfolioDetail: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.PortfolioDetail] = js.undefined
  /**
    * Information about the TagOptions associated with the portfolio.
    */
  var TagOptions: js.UndefOr[TagOptionDetails] = js.undefined
  /**
    * Information about the tags associated with the portfolio.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.Tags] = js.undefined
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
    if (Budgets != null) __obj.updateDynamic("Budgets")(Budgets)
    if (PortfolioDetail != null) __obj.updateDynamic("PortfolioDetail")(PortfolioDetail)
    if (TagOptions != null) __obj.updateDynamic("TagOptions")(TagOptions)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[DescribePortfolioOutput]
  }
}

