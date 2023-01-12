package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePortfolioShareInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.AcceptLanguage] = js.undefined
  
  /**
    * The Amazon Web Services account ID. For example, 123456789012.
    */
  var AccountId: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.AccountId] = js.undefined
  
  /**
    * The organization node to whom you are going to share. When you pass OrganizationNode, it creates PortfolioShare for all of the Amazon Web Services accounts that are associated to the OrganizationNode. The output returns a PortfolioShareToken, which enables the administrator to monitor the status of the PortfolioShare creation process.
    */
  var OrganizationNode: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.OrganizationNode] = js.undefined
  
  /**
    * The portfolio identifier.
    */
  var PortfolioId: Id
  
  /**
    * Enables or disables TagOptions  sharing when creating the portfolio share. If this flag is not provided, TagOptions sharing is disabled.
    */
  var ShareTagOptions: js.UndefOr[Boolean] = js.undefined
}
object CreatePortfolioShareInput {
  
  inline def apply(PortfolioId: Id): CreatePortfolioShareInput = {
    val __obj = js.Dynamic.literal(PortfolioId = PortfolioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePortfolioShareInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatePortfolioShareInput] (val x: Self) extends AnyVal {
    
    inline def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    inline def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setOrganizationNode(value: OrganizationNode): Self = StObject.set(x, "OrganizationNode", value.asInstanceOf[js.Any])
    
    inline def setOrganizationNodeUndefined: Self = StObject.set(x, "OrganizationNode", js.undefined)
    
    inline def setPortfolioId(value: Id): Self = StObject.set(x, "PortfolioId", value.asInstanceOf[js.Any])
    
    inline def setShareTagOptions(value: Boolean): Self = StObject.set(x, "ShareTagOptions", value.asInstanceOf[js.Any])
    
    inline def setShareTagOptionsUndefined: Self = StObject.set(x, "ShareTagOptions", js.undefined)
  }
}
