package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWhatIfForecastExportResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the what-if forecast.
    */
  var WhatIfForecastExportArn: js.UndefOr[LongArn] = js.undefined
}
object CreateWhatIfForecastExportResponse {
  
  inline def apply(): CreateWhatIfForecastExportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWhatIfForecastExportResponse]
  }
  
  extension [Self <: CreateWhatIfForecastExportResponse](x: Self) {
    
    inline def setWhatIfForecastExportArn(value: LongArn): Self = StObject.set(x, "WhatIfForecastExportArn", value.asInstanceOf[js.Any])
    
    inline def setWhatIfForecastExportArnUndefined: Self = StObject.set(x, "WhatIfForecastExportArn", js.undefined)
  }
}
