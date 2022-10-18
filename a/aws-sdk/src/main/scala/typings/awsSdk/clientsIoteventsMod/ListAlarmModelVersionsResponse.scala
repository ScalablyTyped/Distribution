package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAlarmModelVersionsResponse extends StObject {
  
  /**
    * A list that summarizes each alarm model version.
    */
  var alarmModelVersionSummaries: js.UndefOr[AlarmModelVersionSummaries] = js.undefined
  
  /**
    * The token that you can use to return the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListAlarmModelVersionsResponse {
  
  inline def apply(): ListAlarmModelVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAlarmModelVersionsResponse]
  }
  
  extension [Self <: ListAlarmModelVersionsResponse](x: Self) {
    
    inline def setAlarmModelVersionSummaries(value: AlarmModelVersionSummaries): Self = StObject.set(x, "alarmModelVersionSummaries", value.asInstanceOf[js.Any])
    
    inline def setAlarmModelVersionSummariesUndefined: Self = StObject.set(x, "alarmModelVersionSummaries", js.undefined)
    
    inline def setAlarmModelVersionSummariesVarargs(value: AlarmModelVersionSummary*): Self = StObject.set(x, "alarmModelVersionSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
