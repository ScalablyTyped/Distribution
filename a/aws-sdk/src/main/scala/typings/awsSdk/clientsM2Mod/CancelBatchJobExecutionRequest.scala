package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelBatchJobExecutionRequest extends StObject {
  
  /**
    * The unique identifier of the application.
    */
  var applicationId: Identifier
  
  /**
    * The unique identifier of the batch job execution.
    */
  var executionId: Identifier
}
object CancelBatchJobExecutionRequest {
  
  inline def apply(applicationId: Identifier, executionId: Identifier): CancelBatchJobExecutionRequest = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], executionId = executionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelBatchJobExecutionRequest]
  }
  
  extension [Self <: CancelBatchJobExecutionRequest](x: Self) {
    
    inline def setApplicationId(value: Identifier): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setExecutionId(value: Identifier): Self = StObject.set(x, "executionId", value.asInstanceOf[js.Any])
  }
}
