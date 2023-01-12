package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionDetails extends StObject {
  
  /**
    *  Describes the details of the most recent flow run. 
    */
  var mostRecentExecutionMessage: js.UndefOr[MostRecentExecutionMessage] = js.undefined
  
  /**
    *  Specifies the status of the most recent flow run. 
    */
  var mostRecentExecutionStatus: js.UndefOr[ExecutionStatus] = js.undefined
  
  /**
    *  Specifies the time of the most recent flow run. 
    */
  var mostRecentExecutionTime: js.UndefOr[js.Date] = js.undefined
}
object ExecutionDetails {
  
  inline def apply(): ExecutionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecutionDetails] (val x: Self) extends AnyVal {
    
    inline def setMostRecentExecutionMessage(value: MostRecentExecutionMessage): Self = StObject.set(x, "mostRecentExecutionMessage", value.asInstanceOf[js.Any])
    
    inline def setMostRecentExecutionMessageUndefined: Self = StObject.set(x, "mostRecentExecutionMessage", js.undefined)
    
    inline def setMostRecentExecutionStatus(value: ExecutionStatus): Self = StObject.set(x, "mostRecentExecutionStatus", value.asInstanceOf[js.Any])
    
    inline def setMostRecentExecutionStatusUndefined: Self = StObject.set(x, "mostRecentExecutionStatus", js.undefined)
    
    inline def setMostRecentExecutionTime(value: js.Date): Self = StObject.set(x, "mostRecentExecutionTime", value.asInstanceOf[js.Any])
    
    inline def setMostRecentExecutionTimeUndefined: Self = StObject.set(x, "mostRecentExecutionTime", js.undefined)
  }
}
