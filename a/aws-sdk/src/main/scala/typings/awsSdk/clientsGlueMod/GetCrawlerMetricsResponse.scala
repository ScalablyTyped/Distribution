package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCrawlerMetricsResponse extends StObject {
  
  /**
    * A list of metrics for the specified crawler.
    */
  var CrawlerMetricsList: js.UndefOr[typings.awsSdk.clientsGlueMod.CrawlerMetricsList] = js.undefined
  
  /**
    * A continuation token, if the returned list does not contain the last metric available.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object GetCrawlerMetricsResponse {
  
  inline def apply(): GetCrawlerMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCrawlerMetricsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCrawlerMetricsResponse] (val x: Self) extends AnyVal {
    
    inline def setCrawlerMetricsList(value: CrawlerMetricsList): Self = StObject.set(x, "CrawlerMetricsList", value.asInstanceOf[js.Any])
    
    inline def setCrawlerMetricsListUndefined: Self = StObject.set(x, "CrawlerMetricsList", js.undefined)
    
    inline def setCrawlerMetricsListVarargs(value: CrawlerMetrics*): Self = StObject.set(x, "CrawlerMetricsList", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
