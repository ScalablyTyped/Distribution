package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOrganizationPortfolioAccessInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.AcceptLanguage] = js.native
  /**
    * The organization node type that will be returned in the output.    ORGANIZATION - Organization that has access to the portfolio.     ORGANIZATIONAL_UNIT - Organizational unit that has access to the portfolio within your organization.    ACCOUNT - Account that has access to the portfolio within your organization.  
    */
  var OrganizationNodeType: typings.awsDashSdk.clientsServicecatalogMod.OrganizationNodeType = js.native
  /**
    * The maximum number of items to return with this call.
    */
  var PageSize: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.PageSize] = js.native
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.PageToken] = js.native
  /**
    * The portfolio identifier. For example, port-2abcdext3y5fk.
    */
  var PortfolioId: Id = js.native
}

object ListOrganizationPortfolioAccessInput {
  @scala.inline
  def apply(
    OrganizationNodeType: OrganizationNodeType,
    PortfolioId: Id,
    AcceptLanguage: AcceptLanguage = null,
    PageSize: Int | Double = null,
    PageToken: PageToken = null
  ): ListOrganizationPortfolioAccessInput = {
    val __obj = js.Dynamic.literal(OrganizationNodeType = OrganizationNodeType.asInstanceOf[js.Any], PortfolioId = PortfolioId.asInstanceOf[js.Any])
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage.asInstanceOf[js.Any])
    if (PageSize != null) __obj.updateDynamic("PageSize")(PageSize.asInstanceOf[js.Any])
    if (PageToken != null) __obj.updateDynamic("PageToken")(PageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOrganizationPortfolioAccessInput]
  }
}

