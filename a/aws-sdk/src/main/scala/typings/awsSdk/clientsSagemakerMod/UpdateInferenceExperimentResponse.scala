package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateInferenceExperimentResponse extends StObject {
  
  /**
    * The ARN of the updated inference experiment.
    */
  var InferenceExperimentArn: typings.awsSdk.clientsSagemakerMod.InferenceExperimentArn
}
object UpdateInferenceExperimentResponse {
  
  inline def apply(InferenceExperimentArn: InferenceExperimentArn): UpdateInferenceExperimentResponse = {
    val __obj = js.Dynamic.literal(InferenceExperimentArn = InferenceExperimentArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInferenceExperimentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateInferenceExperimentResponse] (val x: Self) extends AnyVal {
    
    inline def setInferenceExperimentArn(value: InferenceExperimentArn): Self = StObject.set(x, "InferenceExperimentArn", value.asInstanceOf[js.Any])
  }
}
