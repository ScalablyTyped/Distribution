package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWhatIfAnalysisRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the what-if analysis that you are interested in.
    */
  var WhatIfAnalysisArn: Arn
}
object DescribeWhatIfAnalysisRequest {
  
  inline def apply(WhatIfAnalysisArn: Arn): DescribeWhatIfAnalysisRequest = {
    val __obj = js.Dynamic.literal(WhatIfAnalysisArn = WhatIfAnalysisArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWhatIfAnalysisRequest]
  }
  
  extension [Self <: DescribeWhatIfAnalysisRequest](x: Self) {
    
    inline def setWhatIfAnalysisArn(value: Arn): Self = StObject.set(x, "WhatIfAnalysisArn", value.asInstanceOf[js.Any])
  }
}
