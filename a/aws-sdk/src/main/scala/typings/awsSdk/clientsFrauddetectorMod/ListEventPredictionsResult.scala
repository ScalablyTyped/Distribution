package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEventPredictionsResult extends StObject {
  
  /**
    *  The summary of the past predictions. 
    */
  var eventPredictionSummaries: js.UndefOr[ListOfEventPredictionSummaries] = js.undefined
  
  /**
    *  Identifies the next page of results to return. Use the token to make the call again to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. 
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListEventPredictionsResult {
  
  inline def apply(): ListEventPredictionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEventPredictionsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListEventPredictionsResult] (val x: Self) extends AnyVal {
    
    inline def setEventPredictionSummaries(value: ListOfEventPredictionSummaries): Self = StObject.set(x, "eventPredictionSummaries", value.asInstanceOf[js.Any])
    
    inline def setEventPredictionSummariesUndefined: Self = StObject.set(x, "eventPredictionSummaries", js.undefined)
    
    inline def setEventPredictionSummariesVarargs(value: EventPredictionSummary*): Self = StObject.set(x, "eventPredictionSummaries", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
