package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePortfolioShareOutput extends js.Object {
  /**
    * The portfolio share unique identifier. This will only be returned if portfolio is shared to an organization node.
    */
  var PortfolioShareToken: js.UndefOr[PortfolioShareToken] = js.undefined
}

object CreatePortfolioShareOutput {
  @scala.inline
  def apply(PortfolioShareToken: PortfolioShareToken = null): CreatePortfolioShareOutput = {
    val __obj = js.Dynamic.literal()
    if (PortfolioShareToken != null) __obj.updateDynamic("PortfolioShareToken")(PortfolioShareToken)
    __obj.asInstanceOf[CreatePortfolioShareOutput]
  }
}

