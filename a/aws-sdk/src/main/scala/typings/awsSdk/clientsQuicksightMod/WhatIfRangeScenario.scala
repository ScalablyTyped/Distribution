package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WhatIfRangeScenario extends StObject {
  
  /**
    * The end date in the date range that you need the forecast results for.
    */
  var EndDate: js.Date
  
  /**
    * The start date in the date range that you need the forecast results for.
    */
  var StartDate: js.Date
  
  /**
    * The target value that you want to meet for the provided date range.
    */
  var Value: Double
}
object WhatIfRangeScenario {
  
  inline def apply(EndDate: js.Date, StartDate: js.Date, Value: Double): WhatIfRangeScenario = {
    val __obj = js.Dynamic.literal(EndDate = EndDate.asInstanceOf[js.Any], StartDate = StartDate.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhatIfRangeScenario]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WhatIfRangeScenario] (val x: Self) extends AnyVal {
    
    inline def setEndDate(value: js.Date): Self = StObject.set(x, "EndDate", value.asInstanceOf[js.Any])
    
    inline def setStartDate(value: js.Date): Self = StObject.set(x, "StartDate", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
