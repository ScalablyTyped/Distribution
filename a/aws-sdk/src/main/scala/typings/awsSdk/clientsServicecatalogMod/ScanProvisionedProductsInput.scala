package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScanProvisionedProductsInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.AcceptLanguage] = js.undefined
  
  /**
    * The access level to use to obtain results. The default is User.
    */
  var AccessLevelFilter: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.AccessLevelFilter] = js.undefined
  
  /**
    * The maximum number of items to return with this call.
    */
  var PageSize: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.PageSize] = js.undefined
  
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.PageToken] = js.undefined
}
object ScanProvisionedProductsInput {
  
  inline def apply(): ScanProvisionedProductsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanProvisionedProductsInput]
  }
  
  extension [Self <: ScanProvisionedProductsInput](x: Self) {
    
    inline def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    inline def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    inline def setAccessLevelFilter(value: AccessLevelFilter): Self = StObject.set(x, "AccessLevelFilter", value.asInstanceOf[js.Any])
    
    inline def setAccessLevelFilterUndefined: Self = StObject.set(x, "AccessLevelFilter", js.undefined)
    
    inline def setPageSize(value: PageSize): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
    
    inline def setPageToken(value: PageToken): Self = StObject.set(x, "PageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "PageToken", js.undefined)
  }
}
