package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAcceptedPortfolioSharesInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.AcceptLanguage] = js.undefined
  
  /**
    * The maximum number of items to return with this call.
    */
  var PageSize: js.UndefOr[PageSizeMax100] = js.undefined
  
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.PageToken] = js.undefined
  
  /**
    * The type of shared portfolios to list. The default is to list imported portfolios.    AWS_ORGANIZATIONS - List portfolios accepted and shared via organizational sharing by the management account or delegated administrator of your organization.    AWS_SERVICECATALOG - Deprecated type.    IMPORTED - List imported portfolios that have been accepted and shared through account-to-account sharing.  
    */
  var PortfolioShareType: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.PortfolioShareType] = js.undefined
}
object ListAcceptedPortfolioSharesInput {
  
  inline def apply(): ListAcceptedPortfolioSharesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAcceptedPortfolioSharesInput]
  }
  
  extension [Self <: ListAcceptedPortfolioSharesInput](x: Self) {
    
    inline def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    inline def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    inline def setPageSize(value: PageSizeMax100): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
    
    inline def setPageToken(value: PageToken): Self = StObject.set(x, "PageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "PageToken", js.undefined)
    
    inline def setPortfolioShareType(value: PortfolioShareType): Self = StObject.set(x, "PortfolioShareType", value.asInstanceOf[js.Any])
    
    inline def setPortfolioShareTypeUndefined: Self = StObject.set(x, "PortfolioShareType", js.undefined)
  }
}
