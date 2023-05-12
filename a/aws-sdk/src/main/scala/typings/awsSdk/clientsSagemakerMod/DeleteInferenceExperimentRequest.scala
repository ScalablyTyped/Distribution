package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInferenceExperimentRequest extends StObject {
  
  /**
    * The name of the inference experiment you want to delete.
    */
  var Name: InferenceExperimentName
}
object DeleteInferenceExperimentRequest {
  
  inline def apply(Name: InferenceExperimentName): DeleteInferenceExperimentRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInferenceExperimentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteInferenceExperimentRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: InferenceExperimentName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
