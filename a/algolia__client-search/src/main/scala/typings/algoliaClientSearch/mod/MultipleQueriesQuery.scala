package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.algoliaClientSearch.anon.readonlytypedefaultundefi
  - typings.algoliaClientSearch.anon.readonlytypefacetreadonly
*/
trait MultipleQueriesQuery extends StObject
object MultipleQueriesQuery {
  
  inline def readonlytypedefaultundefi(indexName: String): typings.algoliaClientSearch.anon.readonlytypedefaultundefi = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.algoliaClientSearch.anon.readonlytypedefaultundefi]
  }
  
  inline def readonlytypefacetreadonly(facet: String, indexName: String): typings.algoliaClientSearch.anon.readonlytypefacetreadonly = {
    val __obj = js.Dynamic.literal(facet = facet.asInstanceOf[js.Any], indexName = indexName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("facet")
    __obj.asInstanceOf[typings.algoliaClientSearch.anon.readonlytypefacetreadonly]
  }
}
