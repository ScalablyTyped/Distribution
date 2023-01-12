package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCrawlsRequest extends StObject {
  
  /**
    * The name of the crawler whose runs you want to retrieve.
    */
  var CrawlerName: NameString
  
  /**
    * Filters the crawls by the criteria you specify in a list of CrawlsFilter objects.
    */
  var Filters: js.UndefOr[CrawlsFilterList] = js.undefined
  
  /**
    * The maximum number of results to return. The default is 20, and maximum is 100.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    * A continuation token, if this is a continuation call.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListCrawlsRequest {
  
  inline def apply(CrawlerName: NameString): ListCrawlsRequest = {
    val __obj = js.Dynamic.literal(CrawlerName = CrawlerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCrawlsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCrawlsRequest] (val x: Self) extends AnyVal {
    
    inline def setCrawlerName(value: NameString): Self = StObject.set(x, "CrawlerName", value.asInstanceOf[js.Any])
    
    inline def setFilters(value: CrawlsFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: CrawlsFilter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
