package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStorageSystemResourceMetricsResponse extends StObject {
  
  /**
    * The details that your discovery job collected about your storage system resource.
    */
  var Metrics: js.UndefOr[typings.awsSdk.clientsDatasyncMod.Metrics] = js.undefined
  
  /**
    * The opaque string that indicates the position to begin the next list of results in the response.
    */
  var NextToken: js.UndefOr[DiscoveryNextToken] = js.undefined
}
object DescribeStorageSystemResourceMetricsResponse {
  
  inline def apply(): DescribeStorageSystemResourceMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStorageSystemResourceMetricsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeStorageSystemResourceMetricsResponse] (val x: Self) extends AnyVal {
    
    inline def setMetrics(value: Metrics): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
    
    inline def setMetricsVarargs(value: ResourceMetrics*): Self = StObject.set(x, "Metrics", js.Array(value*))
    
    inline def setNextToken(value: DiscoveryNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
