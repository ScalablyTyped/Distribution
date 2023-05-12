package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopInferenceExperimentResponse extends StObject {
  
  /**
    * The ARN of the stopped inference experiment.
    */
  var InferenceExperimentArn: typings.awsSdk.clientsSagemakerMod.InferenceExperimentArn
}
object StopInferenceExperimentResponse {
  
  inline def apply(InferenceExperimentArn: InferenceExperimentArn): StopInferenceExperimentResponse = {
    val __obj = js.Dynamic.literal(InferenceExperimentArn = InferenceExperimentArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopInferenceExperimentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopInferenceExperimentResponse] (val x: Self) extends AnyVal {
    
    inline def setInferenceExperimentArn(value: InferenceExperimentArn): Self = StObject.set(x, "InferenceExperimentArn", value.asInstanceOf[js.Any])
  }
}
