package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.algoliaClientSearchStrings.default
import typings.algoliaClientSearch.algoliaClientSearchStrings.facet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedMultipleQueriesQuery extends StObject {
  
  /**
    * The index name.
    */
  val indexName: String
  
  /**
    * The search options.
    */
  val params: js.UndefOr[SearchOptions] = js.undefined
  
  /**
    * The query associated with the request.
    */
  val query: js.UndefOr[String] = js.undefined
  
  /**
    * The type of query to perform.
    *
    * @defaultValue "default"
    */
  val `type`: js.UndefOr[default | facet] = js.undefined
}
object SharedMultipleQueriesQuery {
  
  inline def apply(indexName: String): SharedMultipleQueriesQuery = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedMultipleQueriesQuery]
  }
  
  extension [Self <: SharedMultipleQueriesQuery](x: Self) {
    
    inline def setIndexName(value: String): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
    
    inline def setParams(value: SearchOptions): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setType(value: default | facet): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
