package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePortfolioOutput extends js.Object {
  /**
    * Information about the portfolio.
    */
  var PortfolioDetail: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.PortfolioDetail] = js.undefined
  /**
    * Information about the tags associated with the portfolio.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.Tags] = js.undefined
}

object UpdatePortfolioOutput {
  @scala.inline
  def apply(PortfolioDetail: PortfolioDetail = null, Tags: Tags = null): UpdatePortfolioOutput = {
    val __obj = js.Dynamic.literal()
    if (PortfolioDetail != null) __obj.updateDynamic("PortfolioDetail")(PortfolioDetail)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[UpdatePortfolioOutput]
  }
}

