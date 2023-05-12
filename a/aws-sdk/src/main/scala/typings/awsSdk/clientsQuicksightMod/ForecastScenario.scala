package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForecastScenario extends StObject {
  
  /**
    * The what-if analysis forecast setup with the target date.
    */
  var WhatIfPointScenario: js.UndefOr[typings.awsSdk.clientsQuicksightMod.WhatIfPointScenario] = js.undefined
  
  /**
    * The what-if analysis forecast setup with the date range.
    */
  var WhatIfRangeScenario: js.UndefOr[typings.awsSdk.clientsQuicksightMod.WhatIfRangeScenario] = js.undefined
}
object ForecastScenario {
  
  inline def apply(): ForecastScenario = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForecastScenario]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ForecastScenario] (val x: Self) extends AnyVal {
    
    inline def setWhatIfPointScenario(value: WhatIfPointScenario): Self = StObject.set(x, "WhatIfPointScenario", value.asInstanceOf[js.Any])
    
    inline def setWhatIfPointScenarioUndefined: Self = StObject.set(x, "WhatIfPointScenario", js.undefined)
    
    inline def setWhatIfRangeScenario(value: WhatIfRangeScenario): Self = StObject.set(x, "WhatIfRangeScenario", value.asInstanceOf[js.Any])
    
    inline def setWhatIfRangeScenarioUndefined: Self = StObject.set(x, "WhatIfRangeScenario", js.undefined)
  }
}
