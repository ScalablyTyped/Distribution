package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecutionRecord extends StObject {
  
  /**
    *  Specifies the identifier of the given flow run. 
    */
  var executionId: js.UndefOr[ExecutionId] = js.native
  
  /**
    *  Describes the result of the given flow run. 
    */
  var executionResult: js.UndefOr[ExecutionResult] = js.native
  
  /**
    *  Specifies the flow run status and whether it is in progress, has completed successfully, or has failed. 
    */
  var executionStatus: js.UndefOr[ExecutionStatus] = js.native
  
  /**
    *  Specifies the time of the most recent update. 
    */
  var lastUpdatedAt: js.UndefOr[Date] = js.native
  
  /**
    *  Specifies the start time of the flow run. 
    */
  var startedAt: js.UndefOr[Date] = js.native
}
object ExecutionRecord {
  
  @scala.inline
  def apply(): ExecutionRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionRecord]
  }
  
  @scala.inline
  implicit class ExecutionRecordMutableBuilder[Self <: ExecutionRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutionId(value: ExecutionId): Self = StObject.set(x, "executionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionIdUndefined: Self = StObject.set(x, "executionId", js.undefined)
    
    @scala.inline
    def setExecutionResult(value: ExecutionResult): Self = StObject.set(x, "executionResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionResultUndefined: Self = StObject.set(x, "executionResult", js.undefined)
    
    @scala.inline
    def setExecutionStatus(value: ExecutionStatus): Self = StObject.set(x, "executionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionStatusUndefined: Self = StObject.set(x, "executionStatus", js.undefined)
    
    @scala.inline
    def setLastUpdatedAt(value: Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    @scala.inline
    def setStartedAt(value: Date): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedAtUndefined: Self = StObject.set(x, "startedAt", js.undefined)
  }
}
