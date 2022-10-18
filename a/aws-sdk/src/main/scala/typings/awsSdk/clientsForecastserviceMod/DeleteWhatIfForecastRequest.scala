package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWhatIfForecastRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the what-if forecast that you want to delete.
    */
  var WhatIfForecastArn: LongArn
}
object DeleteWhatIfForecastRequest {
  
  inline def apply(WhatIfForecastArn: LongArn): DeleteWhatIfForecastRequest = {
    val __obj = js.Dynamic.literal(WhatIfForecastArn = WhatIfForecastArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWhatIfForecastRequest]
  }
  
  extension [Self <: DeleteWhatIfForecastRequest](x: Self) {
    
    inline def setWhatIfForecastArn(value: LongArn): Self = StObject.set(x, "WhatIfForecastArn", value.asInstanceOf[js.Any])
  }
}
