package typings.awsSdk.clientsMachinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRealtimeEndpointInput extends StObject {
  
  /**
    * The ID assigned to the MLModel during creation.
    */
  var MLModelId: EntityId
}
object CreateRealtimeEndpointInput {
  
  inline def apply(MLModelId: EntityId): CreateRealtimeEndpointInput = {
    val __obj = js.Dynamic.literal(MLModelId = MLModelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRealtimeEndpointInput]
  }
  
  extension [Self <: CreateRealtimeEndpointInput](x: Self) {
    
    inline def setMLModelId(value: EntityId): Self = StObject.set(x, "MLModelId", value.asInstanceOf[js.Any])
  }
}
