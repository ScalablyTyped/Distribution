package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDetectorModelAnalysisResultsRequest extends StObject {
  
  /**
    * The ID of the analysis result that you want to retrieve.
    */
  var analysisId: AnalysisId
  
  /**
    * The maximum number of results to be returned per request.
    */
  var maxResults: js.UndefOr[MaxAnalysisResults] = js.undefined
  
  /**
    * The token that you can use to return the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object GetDetectorModelAnalysisResultsRequest {
  
  inline def apply(analysisId: AnalysisId): GetDetectorModelAnalysisResultsRequest = {
    val __obj = js.Dynamic.literal(analysisId = analysisId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDetectorModelAnalysisResultsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDetectorModelAnalysisResultsRequest] (val x: Self) extends AnyVal {
    
    inline def setAnalysisId(value: AnalysisId): Self = StObject.set(x, "analysisId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxAnalysisResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
