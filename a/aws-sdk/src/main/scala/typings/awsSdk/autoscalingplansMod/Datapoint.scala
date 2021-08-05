package typings.awsSdk.autoscalingplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Datapoint extends StObject {
  
  /**
    * The time stamp for the data point in UTC format.
    */
  var Timestamp: js.UndefOr[TimestampType] = js.undefined
  
  /**
    * The value of the data point.
    */
  var Value: js.UndefOr[MetricScale] = js.undefined
}
object Datapoint {
  
  inline def apply(): Datapoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Datapoint]
  }
  
  extension [Self <: Datapoint](x: Self) {
    
    inline def setTimestamp(value: TimestampType): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
    
    inline def setValue(value: MetricScale): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
