package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionRecord extends StObject {
  
  /**
    *  The timestamp that indicates the last new or updated record to be transferred in the flow run. 
    */
  var dataPullEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The timestamp that determines the first new or updated record to be transferred in the flow run. 
    */
  var dataPullStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  Specifies the identifier of the given flow run. 
    */
  var executionId: js.UndefOr[ExecutionId] = js.undefined
  
  /**
    *  Describes the result of the given flow run. 
    */
  var executionResult: js.UndefOr[ExecutionResult] = js.undefined
  
  /**
    *  Specifies the flow run status and whether it is in progress, has completed successfully, or has failed. 
    */
  var executionStatus: js.UndefOr[ExecutionStatus] = js.undefined
  
  /**
    *  Specifies the time of the most recent update. 
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  Specifies the start time of the flow run. 
    */
  var startedAt: js.UndefOr[js.Date] = js.undefined
}
object ExecutionRecord {
  
  inline def apply(): ExecutionRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionRecord]
  }
  
  extension [Self <: ExecutionRecord](x: Self) {
    
    inline def setDataPullEndTime(value: js.Date): Self = StObject.set(x, "dataPullEndTime", value.asInstanceOf[js.Any])
    
    inline def setDataPullEndTimeUndefined: Self = StObject.set(x, "dataPullEndTime", js.undefined)
    
    inline def setDataPullStartTime(value: js.Date): Self = StObject.set(x, "dataPullStartTime", value.asInstanceOf[js.Any])
    
    inline def setDataPullStartTimeUndefined: Self = StObject.set(x, "dataPullStartTime", js.undefined)
    
    inline def setExecutionId(value: ExecutionId): Self = StObject.set(x, "executionId", value.asInstanceOf[js.Any])
    
    inline def setExecutionIdUndefined: Self = StObject.set(x, "executionId", js.undefined)
    
    inline def setExecutionResult(value: ExecutionResult): Self = StObject.set(x, "executionResult", value.asInstanceOf[js.Any])
    
    inline def setExecutionResultUndefined: Self = StObject.set(x, "executionResult", js.undefined)
    
    inline def setExecutionStatus(value: ExecutionStatus): Self = StObject.set(x, "executionStatus", value.asInstanceOf[js.Any])
    
    inline def setExecutionStatusUndefined: Self = StObject.set(x, "executionStatus", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    inline def setStartedAt(value: js.Date): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    
    inline def setStartedAtUndefined: Self = StObject.set(x, "startedAt", js.undefined)
  }
}
