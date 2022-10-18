package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDetectorModelsResponse extends StObject {
  
  /**
    * Summary information about the detector models.
    */
  var detectorModelSummaries: js.UndefOr[DetectorModelSummaries] = js.undefined
  
  /**
    * The token that you can use to return the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListDetectorModelsResponse {
  
  inline def apply(): ListDetectorModelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDetectorModelsResponse]
  }
  
  extension [Self <: ListDetectorModelsResponse](x: Self) {
    
    inline def setDetectorModelSummaries(value: DetectorModelSummaries): Self = StObject.set(x, "detectorModelSummaries", value.asInstanceOf[js.Any])
    
    inline def setDetectorModelSummariesUndefined: Self = StObject.set(x, "detectorModelSummaries", js.undefined)
    
    inline def setDetectorModelSummariesVarargs(value: DetectorModelSummary*): Self = StObject.set(x, "detectorModelSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
