package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopInferenceSchedulerRequest extends StObject {
  
  /**
    * The name of the inference scheduler to be stopped. 
    */
  var InferenceSchedulerName: InferenceSchedulerIdentifier
}
object StopInferenceSchedulerRequest {
  
  inline def apply(InferenceSchedulerName: InferenceSchedulerIdentifier): StopInferenceSchedulerRequest = {
    val __obj = js.Dynamic.literal(InferenceSchedulerName = InferenceSchedulerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopInferenceSchedulerRequest]
  }
  
  extension [Self <: StopInferenceSchedulerRequest](x: Self) {
    
    inline def setInferenceSchedulerName(value: InferenceSchedulerIdentifier): Self = StObject.set(x, "InferenceSchedulerName", value.asInstanceOf[js.Any])
  }
}
