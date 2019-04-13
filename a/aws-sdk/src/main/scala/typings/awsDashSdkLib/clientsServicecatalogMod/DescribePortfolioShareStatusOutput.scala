package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePortfolioShareStatusOutput extends js.Object {
  /**
    * Organization node identifier. It can be either account id, organizational unit id or organization id.
    */
  var OrganizationNodeValue: js.UndefOr[OrganizationNodeValue] = js.undefined
  /**
    * The portfolio identifier.
    */
  var PortfolioId: js.UndefOr[Id] = js.undefined
  /**
    * The token for the portfolio share operation. For example, share-6v24abcdefghi.
    */
  var PortfolioShareToken: js.UndefOr[PortfolioShareToken] = js.undefined
  /**
    * Information about the portfolio share operation.
    */
  var ShareDetails: js.UndefOr[ShareDetails] = js.undefined
  /**
    * Status of the portfolio share operation.
    */
  var Status: js.UndefOr[ShareStatus] = js.undefined
}

object DescribePortfolioShareStatusOutput {
  @scala.inline
  def apply(
    OrganizationNodeValue: OrganizationNodeValue = null,
    PortfolioId: Id = null,
    PortfolioShareToken: PortfolioShareToken = null,
    ShareDetails: ShareDetails = null,
    Status: ShareStatus = null
  ): DescribePortfolioShareStatusOutput = {
    val __obj = js.Dynamic.literal()
    if (OrganizationNodeValue != null) __obj.updateDynamic("OrganizationNodeValue")(OrganizationNodeValue)
    if (PortfolioId != null) __obj.updateDynamic("PortfolioId")(PortfolioId)
    if (PortfolioShareToken != null) __obj.updateDynamic("PortfolioShareToken")(PortfolioShareToken)
    if (ShareDetails != null) __obj.updateDynamic("ShareDetails")(ShareDetails)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePortfolioShareStatusOutput]
  }
}

