package typings.awsSdk.clientsMachinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRealtimeEndpointInput extends StObject {
  
  /**
    * The ID assigned to the MLModel during creation.
    */
  var MLModelId: EntityId
}
object DeleteRealtimeEndpointInput {
  
  inline def apply(MLModelId: EntityId): DeleteRealtimeEndpointInput = {
    val __obj = js.Dynamic.literal(MLModelId = MLModelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRealtimeEndpointInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteRealtimeEndpointInput] (val x: Self) extends AnyVal {
    
    inline def setMLModelId(value: EntityId): Self = StObject.set(x, "MLModelId", value.asInstanceOf[js.Any])
  }
}
