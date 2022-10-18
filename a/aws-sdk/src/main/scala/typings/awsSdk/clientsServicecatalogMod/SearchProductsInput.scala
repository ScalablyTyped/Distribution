package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchProductsInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.AcceptLanguage] = js.undefined
  
  /**
    * The search filters. If no search filters are specified, the output includes all products to which the caller has access.
    */
  var Filters: js.UndefOr[ProductViewFilters] = js.undefined
  
  /**
    * The maximum number of items to return with this call.
    */
  var PageSize: js.UndefOr[PageSizeMax100] = js.undefined
  
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.PageToken] = js.undefined
  
  /**
    * The sort field. If no value is specified, the results are not sorted.
    */
  var SortBy: js.UndefOr[ProductViewSortBy] = js.undefined
  
  /**
    * The sort order. If no value is specified, the results are not sorted.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.SortOrder] = js.undefined
}
object SearchProductsInput {
  
  inline def apply(): SearchProductsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchProductsInput]
  }
  
  extension [Self <: SearchProductsInput](x: Self) {
    
    inline def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    inline def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    inline def setFilters(value: ProductViewFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setPageSize(value: PageSizeMax100): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
    
    inline def setPageToken(value: PageToken): Self = StObject.set(x, "PageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "PageToken", js.undefined)
    
    inline def setSortBy(value: ProductViewSortBy): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
  }
}
