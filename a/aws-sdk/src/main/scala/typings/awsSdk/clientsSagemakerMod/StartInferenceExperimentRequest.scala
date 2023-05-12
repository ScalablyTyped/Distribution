package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartInferenceExperimentRequest extends StObject {
  
  /**
    * The name of the inference experiment to start.
    */
  var Name: InferenceExperimentName
}
object StartInferenceExperimentRequest {
  
  inline def apply(Name: InferenceExperimentName): StartInferenceExperimentRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartInferenceExperimentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartInferenceExperimentRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: InferenceExperimentName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
