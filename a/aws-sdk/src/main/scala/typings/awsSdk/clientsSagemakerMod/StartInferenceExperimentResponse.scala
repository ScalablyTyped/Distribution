package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartInferenceExperimentResponse extends StObject {
  
  /**
    * The ARN of the started inference experiment to start.
    */
  var InferenceExperimentArn: typings.awsSdk.clientsSagemakerMod.InferenceExperimentArn
}
object StartInferenceExperimentResponse {
  
  inline def apply(InferenceExperimentArn: InferenceExperimentArn): StartInferenceExperimentResponse = {
    val __obj = js.Dynamic.literal(InferenceExperimentArn = InferenceExperimentArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartInferenceExperimentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartInferenceExperimentResponse] (val x: Self) extends AnyVal {
    
    inline def setInferenceExperimentArn(value: InferenceExperimentArn): Self = StObject.set(x, "InferenceExperimentArn", value.asInstanceOf[js.Any])
  }
}
