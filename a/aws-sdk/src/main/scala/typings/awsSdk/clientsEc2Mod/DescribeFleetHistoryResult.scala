package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFleetHistoryResult extends StObject {
  
  /**
    * The ID of the EC Fleet.
    */
  var FleetId: js.UndefOr[typings.awsSdk.clientsEc2Mod.FleetId] = js.undefined
  
  /**
    * Information about the events in the history of the EC2 Fleet.
    */
  var HistoryRecords: js.UndefOr[HistoryRecordSet] = js.undefined
  
  /**
    * The last date and time for the events, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ). All records up to this time were retrieved. If nextToken indicates that there are more results, this value is not present.
    */
  var LastEvaluatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The start date and time for the events, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ).
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
}
object DescribeFleetHistoryResult {
  
  inline def apply(): DescribeFleetHistoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetHistoryResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeFleetHistoryResult] (val x: Self) extends AnyVal {
    
    inline def setFleetId(value: FleetId): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setFleetIdUndefined: Self = StObject.set(x, "FleetId", js.undefined)
    
    inline def setHistoryRecords(value: HistoryRecordSet): Self = StObject.set(x, "HistoryRecords", value.asInstanceOf[js.Any])
    
    inline def setHistoryRecordsUndefined: Self = StObject.set(x, "HistoryRecords", js.undefined)
    
    inline def setHistoryRecordsVarargs(value: HistoryRecordEntry*): Self = StObject.set(x, "HistoryRecords", js.Array(value*))
    
    inline def setLastEvaluatedTime(value: js.Date): Self = StObject.set(x, "LastEvaluatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastEvaluatedTimeUndefined: Self = StObject.set(x, "LastEvaluatedTime", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
