package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBatchInferenceJobResponse extends StObject {
  
  /**
    * The ARN of the batch inference job.
    */
  var batchInferenceJobArn: js.UndefOr[Arn] = js.undefined
}
object CreateBatchInferenceJobResponse {
  
  inline def apply(): CreateBatchInferenceJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBatchInferenceJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateBatchInferenceJobResponse] (val x: Self) extends AnyVal {
    
    inline def setBatchInferenceJobArn(value: Arn): Self = StObject.set(x, "batchInferenceJobArn", value.asInstanceOf[js.Any])
    
    inline def setBatchInferenceJobArnUndefined: Self = StObject.set(x, "batchInferenceJobArn", js.undefined)
  }
}
