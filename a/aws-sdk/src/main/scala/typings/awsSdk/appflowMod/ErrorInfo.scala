package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorInfo extends js.Object {
  
  /**
    *  Specifies the error message that appears if a flow fails. 
    */
  var executionMessage: js.UndefOr[ExecutionMessage] = js.native
  
  /**
    *  Specifies the failure count for the attempted flow. 
    */
  var putFailuresCount: js.UndefOr[Long] = js.native
}
object ErrorInfo {
  
  @scala.inline
  def apply(): ErrorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorInfo]
  }
  
  @scala.inline
  implicit class ErrorInfoOps[Self <: ErrorInfo] (val x: Self) extends AnyVal {
    
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
    def setExecutionMessage(value: ExecutionMessage): Self = this.set("executionMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionMessage: Self = this.set("executionMessage", js.undefined)
    
    @scala.inline
    def setPutFailuresCount(value: Long): Self = this.set("putFailuresCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePutFailuresCount: Self = this.set("putFailuresCount", js.undefined)
  }
}
