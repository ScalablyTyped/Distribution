package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePortfolioShareInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.AcceptLanguage] = js.undefined
  
  /**
    * The Amazon Web Services account Id of the recipient account. This field is required when updating an external account to account type share.
    */
  var AccountId: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.AccountId] = js.undefined
  
  var OrganizationNode: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.OrganizationNode] = js.undefined
  
  /**
    * The unique identifier of the portfolio for which the share will be updated.
    */
  var PortfolioId: Id
  
  /**
    * A flag to enable or disable TagOptions sharing for the portfolio share. If this field is not provided, the current state of TagOptions sharing on the portfolio share will not be modified.
    */
  var ShareTagOptions: js.UndefOr[NullableBoolean] = js.undefined
}
object UpdatePortfolioShareInput {
  
  inline def apply(PortfolioId: Id): UpdatePortfolioShareInput = {
    val __obj = js.Dynamic.literal(PortfolioId = PortfolioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePortfolioShareInput]
  }
  
  extension [Self <: UpdatePortfolioShareInput](x: Self) {
    
    inline def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    inline def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setOrganizationNode(value: OrganizationNode): Self = StObject.set(x, "OrganizationNode", value.asInstanceOf[js.Any])
    
    inline def setOrganizationNodeUndefined: Self = StObject.set(x, "OrganizationNode", js.undefined)
    
    inline def setPortfolioId(value: Id): Self = StObject.set(x, "PortfolioId", value.asInstanceOf[js.Any])
    
    inline def setShareTagOptions(value: NullableBoolean): Self = StObject.set(x, "ShareTagOptions", value.asInstanceOf[js.Any])
    
    inline def setShareTagOptionsUndefined: Self = StObject.set(x, "ShareTagOptions", js.undefined)
  }
}
