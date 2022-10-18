package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAlarmRecommendationsResponse extends StObject {
  
  /**
    * The alarm recommendations for an AWS Resilience Hub application, returned as an object. This object includes application component names, descriptions, information about whether a recommendation has already been implemented or not, prerequisites, and more.
    */
  var alarmRecommendations: AlarmRecommendationList
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListAlarmRecommendationsResponse {
  
  inline def apply(alarmRecommendations: AlarmRecommendationList): ListAlarmRecommendationsResponse = {
    val __obj = js.Dynamic.literal(alarmRecommendations = alarmRecommendations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAlarmRecommendationsResponse]
  }
  
  extension [Self <: ListAlarmRecommendationsResponse](x: Self) {
    
    inline def setAlarmRecommendations(value: AlarmRecommendationList): Self = StObject.set(x, "alarmRecommendations", value.asInstanceOf[js.Any])
    
    inline def setAlarmRecommendationsVarargs(value: AlarmRecommendation*): Self = StObject.set(x, "alarmRecommendations", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
