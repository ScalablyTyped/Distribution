package typings.awsSdk.clientsPiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseResourceMetricKey extends StObject {
  
  /**
    * The valid dimensions for the metric.
    */
  var Dimensions: js.UndefOr[DimensionMap] = js.undefined
  
  /**
    * The name of a Performance Insights metric to be measured. Valid values for Metric are:    db.load.avg - A scaled representation of the number of active sessions for the database engine.    db.sampledload.avg - The raw number of active sessions for the database engine.   The counter metrics listed in Performance Insights operating system counters in the Amazon Aurora User Guide.   If the number of active sessions is less than an internal Performance Insights threshold, db.load.avg and db.sampledload.avg are the same value. If the number of active sessions is greater than the internal threshold, Performance Insights samples the active sessions, with db.load.avg showing the scaled values, db.sampledload.avg showing the raw values, and db.sampledload.avg less than db.load.avg. For most use cases, you can query db.load.avg only. 
    */
  var Metric: String
}
object ResponseResourceMetricKey {
  
  inline def apply(Metric: String): ResponseResourceMetricKey = {
    val __obj = js.Dynamic.literal(Metric = Metric.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseResourceMetricKey]
  }
  
  extension [Self <: ResponseResourceMetricKey](x: Self) {
    
    inline def setDimensions(value: DimensionMap): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    inline def setMetric(value: String): Self = StObject.set(x, "Metric", value.asInstanceOf[js.Any])
  }
}
