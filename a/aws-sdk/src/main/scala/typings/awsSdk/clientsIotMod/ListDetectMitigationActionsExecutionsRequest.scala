package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDetectMitigationActionsExecutionsRequest extends StObject {
  
  /**
    *  The end of the time period for which ML Detect mitigation actions executions are returned. 
    */
  var endTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The maximum number of results to return at one time. The default is 25. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    *  The token for the next set of results. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    *  A filter to limit results to those found after the specified time. You must specify either the startTime and endTime or the taskId, but not both. 
    */
  var startTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The unique identifier of the task. 
    */
  var taskId: js.UndefOr[MitigationActionsTaskId] = js.undefined
  
  /**
    *  The name of the thing whose mitigation actions are listed. 
    */
  var thingName: js.UndefOr[DeviceDefenderThingName] = js.undefined
  
  /**
    *  The unique identifier of the violation. 
    */
  var violationId: js.UndefOr[ViolationId] = js.undefined
}
object ListDetectMitigationActionsExecutionsRequest {
  
  inline def apply(): ListDetectMitigationActionsExecutionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDetectMitigationActionsExecutionsRequest]
  }
  
  extension [Self <: ListDetectMitigationActionsExecutionsRequest](x: Self) {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTaskId(value: MitigationActionsTaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    inline def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
    
    inline def setThingName(value: DeviceDefenderThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
    
    inline def setThingNameUndefined: Self = StObject.set(x, "thingName", js.undefined)
    
    inline def setViolationId(value: ViolationId): Self = StObject.set(x, "violationId", value.asInstanceOf[js.Any])
    
    inline def setViolationIdUndefined: Self = StObject.set(x, "violationId", js.undefined)
  }
}
