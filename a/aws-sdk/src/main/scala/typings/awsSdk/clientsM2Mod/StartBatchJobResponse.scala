package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartBatchJobResponse extends StObject {
  
  /**
    * The unique identifier of this execution of the batch job.
    */
  var executionId: Identifier
}
object StartBatchJobResponse {
  
  inline def apply(executionId: Identifier): StartBatchJobResponse = {
    val __obj = js.Dynamic.literal(executionId = executionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartBatchJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartBatchJobResponse] (val x: Self) extends AnyVal {
    
    inline def setExecutionId(value: Identifier): Self = StObject.set(x, "executionId", value.asInstanceOf[js.Any])
  }
}
