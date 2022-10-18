package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartMetricStreamsInput extends StObject {
  
  /**
    * The array of the names of metric streams to start streaming. This is an "all or nothing" operation. If you do not have permission to access all of the metric streams that you list here, then none of the streams that you list in the operation will start streaming.
    */
  var Names: MetricStreamNames
}
object StartMetricStreamsInput {
  
  inline def apply(Names: MetricStreamNames): StartMetricStreamsInput = {
    val __obj = js.Dynamic.literal(Names = Names.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMetricStreamsInput]
  }
  
  extension [Self <: StartMetricStreamsInput](x: Self) {
    
    inline def setNames(value: MetricStreamNames): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
    
    inline def setNamesVarargs(value: MetricStreamName*): Self = StObject.set(x, "Names", js.Array(value*))
  }
}
