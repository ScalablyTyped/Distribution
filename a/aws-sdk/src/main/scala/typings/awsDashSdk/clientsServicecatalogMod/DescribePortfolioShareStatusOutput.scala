package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePortfolioShareStatusOutput extends js.Object {
  /**
    * Organization node identifier. It can be either account id, organizational unit id or organization id.
    */
  var OrganizationNodeValue: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.OrganizationNodeValue] = js.native
  /**
    * The portfolio identifier.
    */
  var PortfolioId: js.UndefOr[Id] = js.native
  /**
    * The token for the portfolio share operation. For example, share-6v24abcdefghi.
    */
  var PortfolioShareToken: js.UndefOr[Id] = js.native
  /**
    * Information about the portfolio share operation.
    */
  var ShareDetails: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ShareDetails] = js.native
  /**
    * Status of the portfolio share operation.
    */
  var Status: js.UndefOr[ShareStatus] = js.native
}

object DescribePortfolioShareStatusOutput {
  @scala.inline
  def apply(
    OrganizationNodeValue: OrganizationNodeValue = null,
    PortfolioId: Id = null,
    PortfolioShareToken: Id = null,
    ShareDetails: ShareDetails = null,
    Status: ShareStatus = null
  ): DescribePortfolioShareStatusOutput = {
    val __obj = js.Dynamic.literal()
    if (OrganizationNodeValue != null) __obj.updateDynamic("OrganizationNodeValue")(OrganizationNodeValue.asInstanceOf[js.Any])
    if (PortfolioId != null) __obj.updateDynamic("PortfolioId")(PortfolioId.asInstanceOf[js.Any])
    if (PortfolioShareToken != null) __obj.updateDynamic("PortfolioShareToken")(PortfolioShareToken.asInstanceOf[js.Any])
    if (ShareDetails != null) __obj.updateDynamic("ShareDetails")(ShareDetails.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePortfolioShareStatusOutput]
  }
}

