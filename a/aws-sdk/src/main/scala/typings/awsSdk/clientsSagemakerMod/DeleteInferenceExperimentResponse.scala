package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInferenceExperimentResponse extends StObject {
  
  /**
    * The ARN of the deleted inference experiment.
    */
  var InferenceExperimentArn: typings.awsSdk.clientsSagemakerMod.InferenceExperimentArn
}
object DeleteInferenceExperimentResponse {
  
  inline def apply(InferenceExperimentArn: InferenceExperimentArn): DeleteInferenceExperimentResponse = {
    val __obj = js.Dynamic.literal(InferenceExperimentArn = InferenceExperimentArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInferenceExperimentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteInferenceExperimentResponse] (val x: Self) extends AnyVal {
    
    inline def setInferenceExperimentArn(value: InferenceExperimentArn): Self = StObject.set(x, "InferenceExperimentArn", value.asInstanceOf[js.Any])
  }
}
