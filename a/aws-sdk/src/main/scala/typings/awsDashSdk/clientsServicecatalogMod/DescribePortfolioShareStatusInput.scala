package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePortfolioShareStatusInput extends js.Object {
  /**
    * The token for the portfolio share operation. This token is returned either by CreatePortfolioShare or by DeletePortfolioShare.
    */
  var PortfolioShareToken: Id = js.native
}

object DescribePortfolioShareStatusInput {
  @scala.inline
  def apply(PortfolioShareToken: Id): DescribePortfolioShareStatusInput = {
    val __obj = js.Dynamic.literal(PortfolioShareToken = PortfolioShareToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribePortfolioShareStatusInput]
  }
}

