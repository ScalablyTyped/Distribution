package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletePortfolioShareInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
  /**
    * The AWS account ID.
    */
  var AccountId: js.UndefOr[AccountId] = js.undefined
  /**
    * The organization node to whom you are going to stop sharing.
    */
  var OrganizationNode: js.UndefOr[OrganizationNode] = js.undefined
  /**
    * The portfolio identifier.
    */
  var PortfolioId: Id
}

object DeletePortfolioShareInput {
  @scala.inline
  def apply(
    PortfolioId: Id,
    AcceptLanguage: AcceptLanguage = null,
    AccountId: AccountId = null,
    OrganizationNode: OrganizationNode = null
  ): DeletePortfolioShareInput = {
    val __obj = js.Dynamic.literal(PortfolioId = PortfolioId)
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId)
    if (OrganizationNode != null) __obj.updateDynamic("OrganizationNode")(OrganizationNode)
    __obj.asInstanceOf[DeletePortfolioShareInput]
  }
}

