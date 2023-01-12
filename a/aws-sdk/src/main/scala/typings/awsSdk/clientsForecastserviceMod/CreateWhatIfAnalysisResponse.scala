package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWhatIfAnalysisResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the what-if analysis.
    */
  var WhatIfAnalysisArn: js.UndefOr[Arn] = js.undefined
}
object CreateWhatIfAnalysisResponse {
  
  inline def apply(): CreateWhatIfAnalysisResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWhatIfAnalysisResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateWhatIfAnalysisResponse] (val x: Self) extends AnyVal {
    
    inline def setWhatIfAnalysisArn(value: Arn): Self = StObject.set(x, "WhatIfAnalysisArn", value.asInstanceOf[js.Any])
    
    inline def setWhatIfAnalysisArnUndefined: Self = StObject.set(x, "WhatIfAnalysisArn", js.undefined)
  }
}
