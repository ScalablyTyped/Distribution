package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCrawlsResponse extends StObject {
  
  /**
    * A list of CrawlerHistory objects representing the crawl runs that meet your criteria.
    */
  var Crawls: js.UndefOr[CrawlerHistoryList] = js.undefined
  
  /**
    * A continuation token for paginating the returned list of tokens, returned if the current segment of the list is not the last.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListCrawlsResponse {
  
  inline def apply(): ListCrawlsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCrawlsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCrawlsResponse] (val x: Self) extends AnyVal {
    
    inline def setCrawls(value: CrawlerHistoryList): Self = StObject.set(x, "Crawls", value.asInstanceOf[js.Any])
    
    inline def setCrawlsUndefined: Self = StObject.set(x, "Crawls", js.undefined)
    
    inline def setCrawlsVarargs(value: CrawlerHistory*): Self = StObject.set(x, "Crawls", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
