package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartBatchJobRequest extends StObject {
  
  /**
    * The unique identifier of the application associated with this batch job.
    */
  var applicationId: Identifier
  
  /**
    * The unique identifier of the batch job.
    */
  var batchJobIdentifier: BatchJobIdentifier
  
  /**
    * The collection of batch job parameters. For details about limits for keys and values, see Coding variables in JCL.
    */
  var jobParams: js.UndefOr[BatchJobParametersMap] = js.undefined
}
object StartBatchJobRequest {
  
  inline def apply(applicationId: Identifier, batchJobIdentifier: BatchJobIdentifier): StartBatchJobRequest = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], batchJobIdentifier = batchJobIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartBatchJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartBatchJobRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: Identifier): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setBatchJobIdentifier(value: BatchJobIdentifier): Self = StObject.set(x, "batchJobIdentifier", value.asInstanceOf[js.Any])
    
    inline def setJobParams(value: BatchJobParametersMap): Self = StObject.set(x, "jobParams", value.asInstanceOf[js.Any])
    
    inline def setJobParamsUndefined: Self = StObject.set(x, "jobParams", js.undefined)
  }
}
