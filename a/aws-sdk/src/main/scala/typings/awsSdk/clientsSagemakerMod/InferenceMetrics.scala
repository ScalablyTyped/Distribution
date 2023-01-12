package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InferenceMetrics extends StObject {
  
  /**
    * The expected maximum number of requests per minute for the instance.
    */
  var MaxInvocations: Integer
  
  /**
    * The expected model latency at maximum invocations per minute for the instance.
    */
  var ModelLatency: Integer
}
object InferenceMetrics {
  
  inline def apply(MaxInvocations: Integer, ModelLatency: Integer): InferenceMetrics = {
    val __obj = js.Dynamic.literal(MaxInvocations = MaxInvocations.asInstanceOf[js.Any], ModelLatency = ModelLatency.asInstanceOf[js.Any])
    __obj.asInstanceOf[InferenceMetrics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InferenceMetrics] (val x: Self) extends AnyVal {
    
    inline def setMaxInvocations(value: Integer): Self = StObject.set(x, "MaxInvocations", value.asInstanceOf[js.Any])
    
    inline def setModelLatency(value: Integer): Self = StObject.set(x, "ModelLatency", value.asInstanceOf[js.Any])
  }
}
