package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInferenceExperimentRequest extends StObject {
  
  /**
    * The name of the inference experiment to describe.
    */
  var Name: InferenceExperimentName
}
object DescribeInferenceExperimentRequest {
  
  inline def apply(Name: InferenceExperimentName): DescribeInferenceExperimentRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInferenceExperimentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeInferenceExperimentRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: InferenceExperimentName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
