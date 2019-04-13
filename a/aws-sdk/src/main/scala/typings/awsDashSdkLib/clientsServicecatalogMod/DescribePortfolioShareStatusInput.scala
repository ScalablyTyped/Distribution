package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePortfolioShareStatusInput extends js.Object {
  /**
    * The token for the portfolio share operation. This token is returned either by CreatePortfolioShare or by DeletePortfolioShare.
    */
  var PortfolioShareToken: awsDashSdkLib.clientsServicecatalogMod.PortfolioShareToken
}

object DescribePortfolioShareStatusInput {
  @scala.inline
  def apply(PortfolioShareToken: PortfolioShareToken): DescribePortfolioShareStatusInput = {
    val __obj = js.Dynamic.literal(PortfolioShareToken = PortfolioShareToken)
  
    __obj.asInstanceOf[DescribePortfolioShareStatusInput]
  }
}

