package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateProductFromPortfolioInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
  /**
    * The portfolio identifier.
    */
  var PortfolioId: Id
  /**
    * The product identifier.
    */
  var ProductId: Id
}

object DisassociateProductFromPortfolioInput {
  @scala.inline
  def apply(PortfolioId: Id, ProductId: Id, AcceptLanguage: AcceptLanguage = null): DisassociateProductFromPortfolioInput = {
    val __obj = js.Dynamic.literal(PortfolioId = PortfolioId, ProductId = ProductId)
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    __obj.asInstanceOf[DisassociateProductFromPortfolioInput]
  }
}

