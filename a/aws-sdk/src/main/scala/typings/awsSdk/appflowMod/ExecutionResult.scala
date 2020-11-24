package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecutionResult extends js.Object {
  
  /**
    *  The total number of bytes processed by the flow run. 
    */
  var bytesProcessed: js.UndefOr[Long] = js.native
  
  /**
    *  The total number of bytes written as a result of the flow run. 
    */
  var bytesWritten: js.UndefOr[Long] = js.native
  
  /**
    *  Provides any error message information related to the flow run. 
    */
  var errorInfo: js.UndefOr[ErrorInfo] = js.native
  
  /**
    *  The number of records processed in the flow run. 
    */
  var recordsProcessed: js.UndefOr[Long] = js.native
}
object ExecutionResult {
  
  @scala.inline
  def apply(): ExecutionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionResult]
  }
  
  @scala.inline
  implicit class ExecutionResultOps[Self <: ExecutionResult] (val x: Self) extends AnyVal {
    
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
    def setBytesProcessed(value: Long): Self = this.set("bytesProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBytesProcessed: Self = this.set("bytesProcessed", js.undefined)
    
    @scala.inline
    def setBytesWritten(value: Long): Self = this.set("bytesWritten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBytesWritten: Self = this.set("bytesWritten", js.undefined)
    
    @scala.inline
    def setErrorInfo(value: ErrorInfo): Self = this.set("errorInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorInfo: Self = this.set("errorInfo", js.undefined)
    
    @scala.inline
    def setRecordsProcessed(value: Long): Self = this.set("recordsProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordsProcessed: Self = this.set("recordsProcessed", js.undefined)
  }
}
