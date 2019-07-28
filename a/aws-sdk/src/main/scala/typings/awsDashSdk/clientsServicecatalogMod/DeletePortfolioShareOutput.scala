package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletePortfolioShareOutput extends js.Object {
  /**
    * The portfolio share unique identifier. This will only be returned if delete is made to an organization node.
    */
  var PortfolioShareToken: js.UndefOr[Id] = js.undefined
}

object DeletePortfolioShareOutput {
  @scala.inline
  def apply(PortfolioShareToken: Id = null): DeletePortfolioShareOutput = {
    val __obj = js.Dynamic.literal()
    if (PortfolioShareToken != null) __obj.updateDynamic("PortfolioShareToken")(PortfolioShareToken)
    __obj.asInstanceOf[DeletePortfolioShareOutput]
  }
}

