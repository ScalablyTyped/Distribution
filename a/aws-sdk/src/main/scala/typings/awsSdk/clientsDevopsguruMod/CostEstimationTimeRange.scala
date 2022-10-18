package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CostEstimationTimeRange extends StObject {
  
  /**
    * The end time of the cost estimation.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The start time of the cost estimation.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
}
object CostEstimationTimeRange {
  
  inline def apply(): CostEstimationTimeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CostEstimationTimeRange]
  }
  
  extension [Self <: CostEstimationTimeRange](x: Self) {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
