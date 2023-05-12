package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInferenceExperimentResponse extends StObject {
  
  /**
    * The ARN for your inference experiment.
    */
  var InferenceExperimentArn: typings.awsSdk.clientsSagemakerMod.InferenceExperimentArn
}
object CreateInferenceExperimentResponse {
  
  inline def apply(InferenceExperimentArn: InferenceExperimentArn): CreateInferenceExperimentResponse = {
    val __obj = js.Dynamic.literal(InferenceExperimentArn = InferenceExperimentArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInferenceExperimentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateInferenceExperimentResponse] (val x: Self) extends AnyVal {
    
    inline def setInferenceExperimentArn(value: InferenceExperimentArn): Self = StObject.set(x, "InferenceExperimentArn", value.asInstanceOf[js.Any])
  }
}
