package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAcceptedPortfolioSharesInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.AcceptLanguage] = js.native
  /**
    * The maximum number of items to return with this call.
    */
  var PageSize: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.PageSize] = js.native
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.PageToken] = js.native
  /**
    * The type of shared portfolios to list. The default is to list imported portfolios.    AWS_ORGANIZATIONS - List portfolios shared by the master account of your organization    AWS_SERVICECATALOG - List default portfolios    IMPORTED - List imported portfolios  
    */
  var PortfolioShareType: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.PortfolioShareType] = js.native
}

object ListAcceptedPortfolioSharesInput {
  @scala.inline
  def apply(
    AcceptLanguage: AcceptLanguage = null,
    PageSize: Int | Double = null,
    PageToken: PageToken = null,
    PortfolioShareType: PortfolioShareType = null
  ): ListAcceptedPortfolioSharesInput = {
    val __obj = js.Dynamic.literal()
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage.asInstanceOf[js.Any])
    if (PageSize != null) __obj.updateDynamic("PageSize")(PageSize.asInstanceOf[js.Any])
    if (PageToken != null) __obj.updateDynamic("PageToken")(PageToken.asInstanceOf[js.Any])
    if (PortfolioShareType != null) __obj.updateDynamic("PortfolioShareType")(PortfolioShareType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAcceptedPortfolioSharesInput]
  }
}

