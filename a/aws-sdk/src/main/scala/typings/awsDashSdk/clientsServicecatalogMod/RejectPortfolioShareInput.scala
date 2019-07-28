package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RejectPortfolioShareInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.AcceptLanguage] = js.undefined
  /**
    * The portfolio identifier.
    */
  var PortfolioId: Id
  /**
    * The type of shared portfolios to reject. The default is to reject imported portfolios.    AWS_ORGANIZATIONS - Reject portfolios shared by the master account of your organization.    IMPORTED - Reject imported portfolios.    AWS_SERVICECATALOG - Not supported. (Throws ResourceNotFoundException.)   For example, aws servicecatalog reject-portfolio-share --portfolio-id "port-2qwzkwxt3y5fk" --portfolio-share-type AWS_ORGANIZATIONS 
    */
  var PortfolioShareType: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.PortfolioShareType] = js.undefined
}

object RejectPortfolioShareInput {
  @scala.inline
  def apply(
    PortfolioId: Id,
    AcceptLanguage: AcceptLanguage = null,
    PortfolioShareType: PortfolioShareType = null
  ): RejectPortfolioShareInput = {
    val __obj = js.Dynamic.literal(PortfolioId = PortfolioId)
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    if (PortfolioShareType != null) __obj.updateDynamic("PortfolioShareType")(PortfolioShareType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectPortfolioShareInput]
  }
}

