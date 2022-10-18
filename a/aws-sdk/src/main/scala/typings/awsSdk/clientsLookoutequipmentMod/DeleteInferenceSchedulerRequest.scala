package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInferenceSchedulerRequest extends StObject {
  
  /**
    * The name of the inference scheduler to be deleted. 
    */
  var InferenceSchedulerName: InferenceSchedulerIdentifier
}
object DeleteInferenceSchedulerRequest {
  
  inline def apply(InferenceSchedulerName: InferenceSchedulerIdentifier): DeleteInferenceSchedulerRequest = {
    val __obj = js.Dynamic.literal(InferenceSchedulerName = InferenceSchedulerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInferenceSchedulerRequest]
  }
  
  extension [Self <: DeleteInferenceSchedulerRequest](x: Self) {
    
    inline def setInferenceSchedulerName(value: InferenceSchedulerIdentifier): Self = StObject.set(x, "InferenceSchedulerName", value.asInstanceOf[js.Any])
  }
}
