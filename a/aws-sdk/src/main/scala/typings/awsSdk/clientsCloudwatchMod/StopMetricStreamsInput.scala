package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopMetricStreamsInput extends StObject {
  
  /**
    * The array of the names of metric streams to stop streaming. This is an "all or nothing" operation. If you do not have permission to access all of the metric streams that you list here, then none of the streams that you list in the operation will stop streaming.
    */
  var Names: MetricStreamNames
}
object StopMetricStreamsInput {
  
  inline def apply(Names: MetricStreamNames): StopMetricStreamsInput = {
    val __obj = js.Dynamic.literal(Names = Names.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopMetricStreamsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopMetricStreamsInput] (val x: Self) extends AnyVal {
    
    inline def setNames(value: MetricStreamNames): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
    
    inline def setNamesVarargs(value: MetricStreamName*): Self = StObject.set(x, "Names", js.Array(value*))
  }
}
