package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInferenceSchedulerRequest extends StObject {
  
  /**
    * The name of the inference scheduler being described. 
    */
  var InferenceSchedulerName: InferenceSchedulerIdentifier
}
object DescribeInferenceSchedulerRequest {
  
  inline def apply(InferenceSchedulerName: InferenceSchedulerIdentifier): DescribeInferenceSchedulerRequest = {
    val __obj = js.Dynamic.literal(InferenceSchedulerName = InferenceSchedulerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInferenceSchedulerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeInferenceSchedulerRequest] (val x: Self) extends AnyVal {
    
    inline def setInferenceSchedulerName(value: InferenceSchedulerIdentifier): Self = StObject.set(x, "InferenceSchedulerName", value.asInstanceOf[js.Any])
  }
}
