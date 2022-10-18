package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCrawlerResponse extends StObject {
  
  /**
    * The metadata for the specified crawler.
    */
  var Crawler: js.UndefOr[typings.awsSdk.clientsGlueMod.Crawler] = js.undefined
}
object GetCrawlerResponse {
  
  inline def apply(): GetCrawlerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCrawlerResponse]
  }
  
  extension [Self <: GetCrawlerResponse](x: Self) {
    
    inline def setCrawler(value: Crawler): Self = StObject.set(x, "Crawler", value.asInstanceOf[js.Any])
    
    inline def setCrawlerUndefined: Self = StObject.set(x, "Crawler", js.undefined)
  }
}
