package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetCrawlersRequest extends StObject {
  
  /**
    * A list of crawler names, which might be the names returned from the ListCrawlers operation.
    */
  var CrawlerNames: CrawlerNameList
}
object BatchGetCrawlersRequest {
  
  inline def apply(CrawlerNames: CrawlerNameList): BatchGetCrawlersRequest = {
    val __obj = js.Dynamic.literal(CrawlerNames = CrawlerNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetCrawlersRequest]
  }
  
  extension [Self <: BatchGetCrawlersRequest](x: Self) {
    
    inline def setCrawlerNames(value: CrawlerNameList): Self = StObject.set(x, "CrawlerNames", value.asInstanceOf[js.Any])
    
    inline def setCrawlerNamesVarargs(value: NameString*): Self = StObject.set(x, "CrawlerNames", js.Array(value*))
  }
}
