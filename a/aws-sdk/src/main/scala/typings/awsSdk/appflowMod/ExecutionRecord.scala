package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecutionRecord extends js.Object {
  
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
  implicit class ExecutionRecordOps[Self <: ExecutionRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExecutionId(value: ExecutionId): Self = this.set("executionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionId: Self = this.set("executionId", js.undefined)
    
    @scala.inline
    def setExecutionResult(value: ExecutionResult): Self = this.set("executionResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionResult: Self = this.set("executionResult", js.undefined)
    
    @scala.inline
    def setExecutionStatus(value: ExecutionStatus): Self = this.set("executionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionStatus: Self = this.set("executionStatus", js.undefined)
    
    @scala.inline
    def setLastUpdatedAt(value: Date): Self = this.set("lastUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedAt: Self = this.set("lastUpdatedAt", js.undefined)
    
    @scala.inline
    def setStartedAt(value: Date): Self = this.set("startedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartedAt: Self = this.set("startedAt", js.undefined)
  }
}
