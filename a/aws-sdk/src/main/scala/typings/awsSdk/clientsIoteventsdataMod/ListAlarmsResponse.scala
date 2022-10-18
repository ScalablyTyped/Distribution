package typings.awsSdk.clientsIoteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAlarmsResponse extends StObject {
  
  /**
    * A list that summarizes each alarm.
    */
  var alarmSummaries: js.UndefOr[AlarmSummaries] = js.undefined
  
  /**
    * The token that you can use to return the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListAlarmsResponse {
  
  inline def apply(): ListAlarmsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAlarmsResponse]
  }
  
  extension [Self <: ListAlarmsResponse](x: Self) {
    
    inline def setAlarmSummaries(value: AlarmSummaries): Self = StObject.set(x, "alarmSummaries", value.asInstanceOf[js.Any])
    
    inline def setAlarmSummariesUndefined: Self = StObject.set(x, "alarmSummaries", js.undefined)
    
    inline def setAlarmSummariesVarargs(value: AlarmSummary*): Self = StObject.set(x, "alarmSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
