package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAcceptedPortfolioSharesInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
  /**
    * The maximum number of items to return with this call.
    */
  var PageSize: js.UndefOr[PageSize] = js.undefined
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[PageToken] = js.undefined
  /**
    * The type of shared portfolios to list. The default is to list imported portfolios.    AWS_ORGANIZATIONS - List portfolios shared by the master account of your organization    AWS_SERVICECATALOG - List default portfolios    IMPORTED - List imported portfolios  
    */
  var PortfolioShareType: js.UndefOr[PortfolioShareType] = js.undefined
}

object ListAcceptedPortfolioSharesInput {
  @scala.inline
  def apply(
    AcceptLanguage: AcceptLanguage = null,
    PageSize: js.UndefOr[PageSize] = js.undefined,
    PageToken: PageToken = null,
    PortfolioShareType: PortfolioShareType = null
  ): ListAcceptedPortfolioSharesInput = {
    val __obj = js.Dynamic.literal()
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    if (!js.isUndefined(PageSize)) __obj.updateDynamic("PageSize")(PageSize)
    if (PageToken != null) __obj.updateDynamic("PageToken")(PageToken)
    if (PortfolioShareType != null) __obj.updateDynamic("PortfolioShareType")(PortfolioShareType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAcceptedPortfolioSharesInput]
  }
}

