package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultipleQueriesQuery extends StObject {
  
  /**
    * The index name.
    */
  val indexName: String = js.native
  
  /**
    * The search options.
    */
  val params: js.UndefOr[SearchOptions] = js.native
  
  /**
    * The query associated with the request.
    */
  val query: js.UndefOr[String] = js.native
}
object MultipleQueriesQuery {
  
  @scala.inline
  def apply(indexName: String): MultipleQueriesQuery = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleQueriesQuery]
  }
  
  @scala.inline
  implicit class MultipleQueriesQueryMutableBuilder[Self <: MultipleQueriesQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexName(value: String): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: SearchOptions): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
