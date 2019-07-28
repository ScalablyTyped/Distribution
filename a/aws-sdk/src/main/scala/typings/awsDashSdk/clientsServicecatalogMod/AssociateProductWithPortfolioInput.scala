package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateProductWithPortfolioInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.AcceptLanguage] = js.undefined
  /**
    * The portfolio identifier.
    */
  var PortfolioId: Id
  /**
    * The product identifier.
    */
  var ProductId: Id
  /**
    * The identifier of the source portfolio.
    */
  var SourcePortfolioId: js.UndefOr[Id] = js.undefined
}

object AssociateProductWithPortfolioInput {
  @scala.inline
  def apply(
    PortfolioId: Id,
    ProductId: Id,
    AcceptLanguage: AcceptLanguage = null,
    SourcePortfolioId: Id = null
  ): AssociateProductWithPortfolioInput = {
    val __obj = js.Dynamic.literal(PortfolioId = PortfolioId, ProductId = ProductId)
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    if (SourcePortfolioId != null) __obj.updateDynamic("SourcePortfolioId")(SourcePortfolioId)
    __obj.asInstanceOf[AssociateProductWithPortfolioInput]
  }
}

