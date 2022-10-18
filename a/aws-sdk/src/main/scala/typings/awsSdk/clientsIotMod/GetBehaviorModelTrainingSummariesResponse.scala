package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBehaviorModelTrainingSummariesResponse extends StObject {
  
  /**
    *  A token that can be used to retrieve the next set of results, or null if there are no additional results. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    *  A list of all ML Detect behaviors and their model status for a given Security Profile. 
    */
  var summaries: js.UndefOr[BehaviorModelTrainingSummaries] = js.undefined
}
object GetBehaviorModelTrainingSummariesResponse {
  
  inline def apply(): GetBehaviorModelTrainingSummariesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBehaviorModelTrainingSummariesResponse]
  }
  
  extension [Self <: GetBehaviorModelTrainingSummariesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSummaries(value: BehaviorModelTrainingSummaries): Self = StObject.set(x, "summaries", value.asInstanceOf[js.Any])
    
    inline def setSummariesUndefined: Self = StObject.set(x, "summaries", js.undefined)
    
    inline def setSummariesVarargs(value: BehaviorModelTrainingSummary*): Self = StObject.set(x, "summaries", js.Array(value*))
  }
}
