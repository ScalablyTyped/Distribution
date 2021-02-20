package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecutionDetails extends StObject {
  
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
  implicit class ExecutionDetailsMutableBuilder[Self <: ExecutionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMostRecentExecutionMessage(value: MostRecentExecutionMessage): Self = StObject.set(x, "mostRecentExecutionMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMostRecentExecutionMessageUndefined: Self = StObject.set(x, "mostRecentExecutionMessage", js.undefined)
    
    @scala.inline
    def setMostRecentExecutionStatus(value: ExecutionStatus): Self = StObject.set(x, "mostRecentExecutionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMostRecentExecutionStatusUndefined: Self = StObject.set(x, "mostRecentExecutionStatus", js.undefined)
    
    @scala.inline
    def setMostRecentExecutionTime(value: Date): Self = StObject.set(x, "mostRecentExecutionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMostRecentExecutionTimeUndefined: Self = StObject.set(x, "mostRecentExecutionTime", js.undefined)
  }
}
