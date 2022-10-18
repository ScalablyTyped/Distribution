package typings.awsSdk.clientsIoteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDetectorsRequest extends StObject {
  
  /**
    * The name of the detector model whose detectors (instances) are listed.
    */
  var detectorModelName: DetectorModelName
  
  /**
    * The maximum number of results to be returned per request.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token that you can use to return the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A filter that limits results to those detectors (instances) in the given state.
    */
  var stateName: js.UndefOr[StateName] = js.undefined
}
object ListDetectorsRequest {
  
  inline def apply(detectorModelName: DetectorModelName): ListDetectorsRequest = {
    val __obj = js.Dynamic.literal(detectorModelName = detectorModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDetectorsRequest]
  }
  
  extension [Self <: ListDetectorsRequest](x: Self) {
    
    inline def setDetectorModelName(value: DetectorModelName): Self = StObject.set(x, "detectorModelName", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setStateName(value: StateName): Self = StObject.set(x, "stateName", value.asInstanceOf[js.Any])
    
    inline def setStateNameUndefined: Self = StObject.set(x, "stateName", js.undefined)
  }
}
