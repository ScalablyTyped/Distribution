package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBatchJobExecutionRequest extends StObject {
  
  /**
    * The identifier of the application.
    */
  var applicationId: Identifier
  
  /**
    * The unique identifier of the batch job execution.
    */
  var executionId: Identifier
}
object GetBatchJobExecutionRequest {
  
  inline def apply(applicationId: Identifier, executionId: Identifier): GetBatchJobExecutionRequest = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], executionId = executionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBatchJobExecutionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBatchJobExecutionRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: Identifier): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setExecutionId(value: Identifier): Self = StObject.set(x, "executionId", value.asInstanceOf[js.Any])
  }
}
