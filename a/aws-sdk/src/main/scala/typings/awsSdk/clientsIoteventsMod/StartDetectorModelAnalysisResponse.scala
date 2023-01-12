package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartDetectorModelAnalysisResponse extends StObject {
  
  /**
    * The ID that you can use to retrieve the analysis result.
    */
  var analysisId: js.UndefOr[AnalysisId] = js.undefined
}
object StartDetectorModelAnalysisResponse {
  
  inline def apply(): StartDetectorModelAnalysisResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartDetectorModelAnalysisResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartDetectorModelAnalysisResponse] (val x: Self) extends AnyVal {
    
    inline def setAnalysisId(value: AnalysisId): Self = StObject.set(x, "analysisId", value.asInstanceOf[js.Any])
    
    inline def setAnalysisIdUndefined: Self = StObject.set(x, "analysisId", js.undefined)
  }
}
