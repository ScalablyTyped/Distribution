package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociatePrincipalFromPortfolioInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.AcceptLanguage] = js.undefined
  /**
    * The portfolio identifier.
    */
  var PortfolioId: Id
  /**
    * The ARN of the principal (IAM user, role, or group).
    */
  var PrincipalARN: typings.awsDashSdk.clientsServicecatalogMod.PrincipalARN
}

object DisassociatePrincipalFromPortfolioInput {
  @scala.inline
  def apply(PortfolioId: Id, PrincipalARN: PrincipalARN, AcceptLanguage: AcceptLanguage = null): DisassociatePrincipalFromPortfolioInput = {
    val __obj = js.Dynamic.literal(PortfolioId = PortfolioId, PrincipalARN = PrincipalARN)
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    __obj.asInstanceOf[DisassociatePrincipalFromPortfolioInput]
  }
}

