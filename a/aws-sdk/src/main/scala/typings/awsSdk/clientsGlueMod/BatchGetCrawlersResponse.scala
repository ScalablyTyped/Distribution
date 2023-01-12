package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetCrawlersResponse extends StObject {
  
  /**
    * A list of crawler definitions.
    */
  var Crawlers: js.UndefOr[CrawlerList] = js.undefined
  
  /**
    * A list of names of crawlers that were not found.
    */
  var CrawlersNotFound: js.UndefOr[CrawlerNameList] = js.undefined
}
object BatchGetCrawlersResponse {
  
  inline def apply(): BatchGetCrawlersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetCrawlersResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetCrawlersResponse] (val x: Self) extends AnyVal {
    
    inline def setCrawlers(value: CrawlerList): Self = StObject.set(x, "Crawlers", value.asInstanceOf[js.Any])
    
    inline def setCrawlersNotFound(value: CrawlerNameList): Self = StObject.set(x, "CrawlersNotFound", value.asInstanceOf[js.Any])
    
    inline def setCrawlersNotFoundUndefined: Self = StObject.set(x, "CrawlersNotFound", js.undefined)
    
    inline def setCrawlersNotFoundVarargs(value: NameString*): Self = StObject.set(x, "CrawlersNotFound", js.Array(value*))
    
    inline def setCrawlersUndefined: Self = StObject.set(x, "Crawlers", js.undefined)
    
    inline def setCrawlersVarargs(value: Crawler*): Self = StObject.set(x, "Crawlers", js.Array(value*))
  }
}
