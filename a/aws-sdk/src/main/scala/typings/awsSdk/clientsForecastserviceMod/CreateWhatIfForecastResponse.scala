package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWhatIfForecastResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the what-if forecast.
    */
  var WhatIfForecastArn: js.UndefOr[LongArn] = js.undefined
}
object CreateWhatIfForecastResponse {
  
  inline def apply(): CreateWhatIfForecastResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWhatIfForecastResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateWhatIfForecastResponse] (val x: Self) extends AnyVal {
    
    inline def setWhatIfForecastArn(value: LongArn): Self = StObject.set(x, "WhatIfForecastArn", value.asInstanceOf[js.Any])
    
    inline def setWhatIfForecastArnUndefined: Self = StObject.set(x, "WhatIfForecastArn", js.undefined)
  }
}
