package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDetectorModelAnalysisRequest extends StObject {
  
  /**
    * The ID of the analysis result that you want to retrieve.
    */
  var analysisId: AnalysisId
}
object DescribeDetectorModelAnalysisRequest {
  
  inline def apply(analysisId: AnalysisId): DescribeDetectorModelAnalysisRequest = {
    val __obj = js.Dynamic.literal(analysisId = analysisId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDetectorModelAnalysisRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDetectorModelAnalysisRequest] (val x: Self) extends AnyVal {
    
    inline def setAnalysisId(value: AnalysisId): Self = StObject.set(x, "analysisId", value.asInstanceOf[js.Any])
  }
}
