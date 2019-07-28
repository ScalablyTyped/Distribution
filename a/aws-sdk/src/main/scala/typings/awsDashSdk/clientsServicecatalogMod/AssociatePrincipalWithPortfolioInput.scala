package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociatePrincipalWithPortfolioInput extends js.Object {
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
  /**
    * The principal type. The supported value is IAM.
    */
  var PrincipalType: typings.awsDashSdk.clientsServicecatalogMod.PrincipalType
}

object AssociatePrincipalWithPortfolioInput {
  @scala.inline
  def apply(
    PortfolioId: Id,
    PrincipalARN: PrincipalARN,
    PrincipalType: PrincipalType,
    AcceptLanguage: AcceptLanguage = null
  ): AssociatePrincipalWithPortfolioInput = {
    val __obj = js.Dynamic.literal(PortfolioId = PortfolioId, PrincipalARN = PrincipalARN, PrincipalType = PrincipalType.asInstanceOf[js.Any])
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    __obj.asInstanceOf[AssociatePrincipalWithPortfolioInput]
  }
}

