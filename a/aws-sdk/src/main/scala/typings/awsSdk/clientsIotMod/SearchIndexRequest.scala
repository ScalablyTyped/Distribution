package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchIndexRequest extends StObject {
  
  /**
    * The search index name.
    */
  var indexName: js.UndefOr[IndexName] = js.undefined
  
  /**
    * The maximum number of results to return at one time.
    */
  var maxResults: js.UndefOr[QueryMaxResults] = js.undefined
  
  /**
    * The token used to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The search query string. For more information about the search query syntax, see Query syntax.
    */
  var queryString: QueryString
  
  /**
    * The query version.
    */
  var queryVersion: js.UndefOr[QueryVersion] = js.undefined
}
object SearchIndexRequest {
  
  inline def apply(queryString: QueryString): SearchIndexRequest = {
    val __obj = js.Dynamic.literal(queryString = queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchIndexRequest]
  }
  
  extension [Self <: SearchIndexRequest](x: Self) {
    
    inline def setIndexName(value: IndexName): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
    
    inline def setIndexNameUndefined: Self = StObject.set(x, "indexName", js.undefined)
    
    inline def setMaxResults(value: QueryMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setQueryString(value: QueryString): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    inline def setQueryVersion(value: QueryVersion): Self = StObject.set(x, "queryVersion", value.asInstanceOf[js.Any])
    
    inline def setQueryVersionUndefined: Self = StObject.set(x, "queryVersion", js.undefined)
  }
}
