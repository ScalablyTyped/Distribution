package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.algoliaClientSearchStrings.default
import typings.algoliaClientSearch.mod.MultipleQueriesQuery
import typings.algoliaClientSearch.mod.SearchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined { readonly type :'default' | undefined} & @algolia/client-search.@algolia/client-search.SharedMultipleQueriesQuery */
trait readonlytypedefaultundefi
  extends StObject
     with MultipleQueriesQuery {
  
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
  val `type`: js.UndefOr[default] = js.undefined
}
object readonlytypedefaultundefi {
  
  inline def apply(indexName: String): readonlytypedefaultundefi = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any])
    __obj.asInstanceOf[readonlytypedefaultundefi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: readonlytypedefaultundefi] (val x: Self) extends AnyVal {
    
    inline def setIndexName(value: String): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
    
    inline def setParams(value: SearchOptions): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setType(value: default): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
