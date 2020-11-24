package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecutionDetails extends js.Object {
  
  /**
    *  Describes the details of the most recent flow run. 
    */
  var mostRecentExecutionMessage: js.UndefOr[MostRecentExecutionMessage] = js.native
  
  /**
    *  Specifies the status of the most recent flow run. 
    */
  var mostRecentExecutionStatus: js.UndefOr[ExecutionStatus] = js.native
  
  /**
    *  Specifies the time of the most recent flow run. 
    */
  var mostRecentExecutionTime: js.UndefOr[Date] = js.native
}
object ExecutionDetails {
  
  @scala.inline
  def apply(): ExecutionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionDetails]
  }
  
  @scala.inline
  implicit class ExecutionDetailsOps[Self <: ExecutionDetails] (val x: Self) extends AnyVal {
    
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
    def setMostRecentExecutionMessage(value: MostRecentExecutionMessage): Self = this.set("mostRecentExecutionMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMostRecentExecutionMessage: Self = this.set("mostRecentExecutionMessage", js.undefined)
    
    @scala.inline
    def setMostRecentExecutionStatus(value: ExecutionStatus): Self = this.set("mostRecentExecutionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMostRecentExecutionStatus: Self = this.set("mostRecentExecutionStatus", js.undefined)
    
    @scala.inline
    def setMostRecentExecutionTime(value: Date): Self = this.set("mostRecentExecutionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMostRecentExecutionTime: Self = this.set("mostRecentExecutionTime", js.undefined)
  }
}
