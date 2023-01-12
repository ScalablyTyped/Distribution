package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointPerformance extends StObject {
  
  var EndpointInfo: typings.awsSdk.clientsSagemakerMod.EndpointInfo
  
  /**
    * The metrics for an existing endpoint.
    */
  var Metrics: InferenceMetrics
}
object EndpointPerformance {
  
  inline def apply(EndpointInfo: EndpointInfo, Metrics: InferenceMetrics): EndpointPerformance = {
    val __obj = js.Dynamic.literal(EndpointInfo = EndpointInfo.asInstanceOf[js.Any], Metrics = Metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointPerformance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndpointPerformance] (val x: Self) extends AnyVal {
    
    inline def setEndpointInfo(value: EndpointInfo): Self = StObject.set(x, "EndpointInfo", value.asInstanceOf[js.Any])
    
    inline def setMetrics(value: InferenceMetrics): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
  }
}
