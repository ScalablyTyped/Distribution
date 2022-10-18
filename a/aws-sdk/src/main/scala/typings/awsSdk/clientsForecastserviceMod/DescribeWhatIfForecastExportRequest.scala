package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWhatIfForecastExportRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the what-if forecast export that you are interested in.
    */
  var WhatIfForecastExportArn: LongArn
}
object DescribeWhatIfForecastExportRequest {
  
  inline def apply(WhatIfForecastExportArn: LongArn): DescribeWhatIfForecastExportRequest = {
    val __obj = js.Dynamic.literal(WhatIfForecastExportArn = WhatIfForecastExportArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWhatIfForecastExportRequest]
  }
  
  extension [Self <: DescribeWhatIfForecastExportRequest](x: Self) {
    
    inline def setWhatIfForecastExportArn(value: LongArn): Self = StObject.set(x, "WhatIfForecastExportArn", value.asInstanceOf[js.Any])
  }
}
