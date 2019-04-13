package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePortfolioShareInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
  /**
    * The AWS account ID. For example, 123456789012.
    */
  var AccountId: js.UndefOr[AccountId] = js.undefined
  /**
    * The organization node to whom you are going to share. If OrganizationNode is passed in, PortfolioShare will be created for the node and its children (when applies), and a PortfolioShareToken will be returned in the output in order for the administrator to monitor the status of the PortfolioShare creation process.
    */
  var OrganizationNode: js.UndefOr[OrganizationNode] = js.undefined
  /**
    * The portfolio identifier.
    */
  var PortfolioId: Id
}

object CreatePortfolioShareInput {
  @scala.inline
  def apply(
    PortfolioId: Id,
    AcceptLanguage: AcceptLanguage = null,
    AccountId: AccountId = null,
    OrganizationNode: OrganizationNode = null
  ): CreatePortfolioShareInput = {
    val __obj = js.Dynamic.literal(PortfolioId = PortfolioId)
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId)
    if (OrganizationNode != null) __obj.updateDynamic("OrganizationNode")(OrganizationNode)
    __obj.asInstanceOf[CreatePortfolioShareInput]
  }
}

