package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.algoliaClientSearchStrings.facet
import typings.algoliaClientSearch.mod.MultipleQueriesQuery
import typings.algoliaClientSearch.mod.SearchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined { readonly type :'facet',  readonly facet :string,  readonly params :@algolia/client-search.@algolia/client-search.SharedMultipleQueriesQuery['params'] & { readonly facetQuery :string | undefined} | undefined} & @algolia/client-search.@algolia/client-search.SharedMultipleQueriesQuery */
trait readonlytypefacetreadonly
  extends StObject
     with MultipleQueriesQuery {
  
  /**
    * The facet name.
    */
  val facet: String
  
  /**
    * The index name.
    */
  val indexName: String
  
  /**
    * The search options.
    */
  val params: js.UndefOr[js.UndefOr[SearchOptions] & FacetQuery] = js.undefined
  
  /**
    * The query associated with the request.
    */
  val query: js.UndefOr[String] = js.undefined
  
  /**
    * The type of query to perform.
    *
    * @defaultValue "default"
    */
  val `type`: typings.algoliaClientSearch.algoliaClientSearchStrings.facet
}
object readonlytypefacetreadonly {
  
  inline def apply(facet: String, indexName: String): readonlytypefacetreadonly = {
    val __obj = js.Dynamic.literal(facet = facet.asInstanceOf[js.Any], indexName = indexName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("facet")
    __obj.asInstanceOf[readonlytypefacetreadonly]
  }
  
  extension [Self <: readonlytypefacetreadonly](x: Self) {
    
    inline def setFacet(value: String): Self = StObject.set(x, "facet", value.asInstanceOf[js.Any])
    
    inline def setIndexName(value: String): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
    
    inline def setParams(value: js.UndefOr[SearchOptions] & FacetQuery): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setType(value: facet): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
