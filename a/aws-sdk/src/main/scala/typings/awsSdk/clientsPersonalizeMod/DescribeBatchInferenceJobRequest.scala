package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBatchInferenceJobRequest extends StObject {
  
  /**
    * The ARN of the batch inference job to describe.
    */
  var batchInferenceJobArn: Arn
}
object DescribeBatchInferenceJobRequest {
  
  inline def apply(batchInferenceJobArn: Arn): DescribeBatchInferenceJobRequest = {
    val __obj = js.Dynamic.literal(batchInferenceJobArn = batchInferenceJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBatchInferenceJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeBatchInferenceJobRequest] (val x: Self) extends AnyVal {
    
    inline def setBatchInferenceJobArn(value: Arn): Self = StObject.set(x, "batchInferenceJobArn", value.asInstanceOf[js.Any])
  }
}
