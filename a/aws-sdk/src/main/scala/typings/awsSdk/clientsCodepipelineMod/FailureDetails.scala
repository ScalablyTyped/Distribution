package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailureDetails extends StObject {
  
  /**
    * The external ID of the run of the action that failed.
    */
  var externalExecutionId: js.UndefOr[ExecutionId] = js.undefined
  
  /**
    * The message about the failure.
    */
  var message: Message
  
  /**
    * The type of the failure.
    */
  var `type`: FailureType
}
object FailureDetails {
  
  inline def apply(message: Message, `type`: FailureType): FailureDetails = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailureDetails]
  }
  
  extension [Self <: FailureDetails](x: Self) {
    
    inline def setExternalExecutionId(value: ExecutionId): Self = StObject.set(x, "externalExecutionId", value.asInstanceOf[js.Any])
    
    inline def setExternalExecutionIdUndefined: Self = StObject.set(x, "externalExecutionId", js.undefined)
    
    inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setType(value: FailureType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
