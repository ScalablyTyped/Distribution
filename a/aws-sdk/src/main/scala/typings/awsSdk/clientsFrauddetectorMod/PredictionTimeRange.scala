package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredictionTimeRange extends StObject {
  
  /**
    *  The end time of the time period for when the predictions were generated. 
    */
  var endTime: time
  
  /**
    *  The start time of the time period for when the predictions were generated. 
    */
  var startTime: time
}
object PredictionTimeRange {
  
  inline def apply(endTime: time, startTime: time): PredictionTimeRange = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredictionTimeRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PredictionTimeRange] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: time): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: time): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
