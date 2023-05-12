package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WhatIfPointScenario extends StObject {
  
  /**
    * The date that you need the forecast results for.
    */
  var Date: js.Date
  
  /**
    * The target value that you want to meet for the provided date.
    */
  var Value: Double
}
object WhatIfPointScenario {
  
  inline def apply(Date: js.Date, Value: Double): WhatIfPointScenario = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhatIfPointScenario]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WhatIfPointScenario] (val x: Self) extends AnyVal {
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
