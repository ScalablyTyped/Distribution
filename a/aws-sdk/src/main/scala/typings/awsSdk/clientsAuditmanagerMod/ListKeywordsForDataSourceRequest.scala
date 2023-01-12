package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListKeywordsForDataSourceRequest extends StObject {
  
  /**
    *  Represents the maximum number of results on a page or for an API request call. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    *  The pagination token that's used to fetch the next set of results. 
    */
  var nextToken: js.UndefOr[Token] = js.undefined
  
  /**
    *  The control mapping data source that the keywords apply to. 
    */
  var source: SourceType
}
object ListKeywordsForDataSourceRequest {
  
  inline def apply(source: SourceType): ListKeywordsForDataSourceRequest = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListKeywordsForDataSourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListKeywordsForDataSourceRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSource(value: SourceType): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
