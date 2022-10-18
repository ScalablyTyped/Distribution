package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMediaCapturePipelinesRequest extends StObject {
  
  /**
    * The maximum number of results to return in a single call. Valid Range: 1 - 99.
    */
  var MaxResults: js.UndefOr[ResultMax] = js.undefined
  
  /**
    * The token used to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListMediaCapturePipelinesRequest {
  
  inline def apply(): ListMediaCapturePipelinesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMediaCapturePipelinesRequest]
  }
  
  extension [Self <: ListMediaCapturePipelinesRequest](x: Self) {
    
    inline def setMaxResults(value: ResultMax): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
