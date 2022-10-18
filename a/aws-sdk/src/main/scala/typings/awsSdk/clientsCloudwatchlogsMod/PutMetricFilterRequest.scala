package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutMetricFilterRequest extends StObject {
  
  /**
    * A name for the metric filter.
    */
  var filterName: FilterName
  
  /**
    * A filter pattern for extracting metric data out of ingested log events.
    */
  var filterPattern: FilterPattern
  
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName
  
  /**
    * A collection of information that defines how metric data gets emitted.
    */
  var metricTransformations: MetricTransformations
}
object PutMetricFilterRequest {
  
  inline def apply(
    filterName: FilterName,
    filterPattern: FilterPattern,
    logGroupName: LogGroupName,
    metricTransformations: MetricTransformations
  ): PutMetricFilterRequest = {
    val __obj = js.Dynamic.literal(filterName = filterName.asInstanceOf[js.Any], filterPattern = filterPattern.asInstanceOf[js.Any], logGroupName = logGroupName.asInstanceOf[js.Any], metricTransformations = metricTransformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutMetricFilterRequest]
  }
  
  extension [Self <: PutMetricFilterRequest](x: Self) {
    
    inline def setFilterName(value: FilterName): Self = StObject.set(x, "filterName", value.asInstanceOf[js.Any])
    
    inline def setFilterPattern(value: FilterPattern): Self = StObject.set(x, "filterPattern", value.asInstanceOf[js.Any])
    
    inline def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
    
    inline def setMetricTransformations(value: MetricTransformations): Self = StObject.set(x, "metricTransformations", value.asInstanceOf[js.Any])
    
    inline def setMetricTransformationsVarargs(value: MetricTransformation*): Self = StObject.set(x, "metricTransformations", js.Array(value*))
  }
}
