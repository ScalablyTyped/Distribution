package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCrawlersResponse extends StObject {
  
  /**
    * The names of all crawlers in the account, or the crawlers with the specified tags.
    */
  var CrawlerNames: js.UndefOr[CrawlerNameList] = js.undefined
  
  /**
    * A continuation token, if the returned list does not contain the last metric available.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListCrawlersResponse {
  
  inline def apply(): ListCrawlersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCrawlersResponse]
  }
  
  extension [Self <: ListCrawlersResponse](x: Self) {
    
    inline def setCrawlerNames(value: CrawlerNameList): Self = StObject.set(x, "CrawlerNames", value.asInstanceOf[js.Any])
    
    inline def setCrawlerNamesUndefined: Self = StObject.set(x, "CrawlerNames", js.undefined)
    
    inline def setCrawlerNamesVarargs(value: NameString*): Self = StObject.set(x, "CrawlerNames", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
