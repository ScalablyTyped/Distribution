package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregatedValue extends StObject {
  
  /**
    * The quality of the aggregated data.
    */
  var quality: js.UndefOr[Quality] = js.undefined
  
  /**
    * The date the aggregating computations occurred, in Unix epoch time.
    */
  var timestamp: js.Date
  
  /**
    * The value of the aggregates.
    */
  var value: Aggregates
}
object AggregatedValue {
  
  inline def apply(timestamp: js.Date, value: Aggregates): AggregatedValue = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregatedValue]
  }
  
  extension [Self <: AggregatedValue](x: Self) {
    
    inline def setQuality(value: Quality): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Aggregates): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
