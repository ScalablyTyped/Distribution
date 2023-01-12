package typings.awsSdk.clientsMachinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRealtimeEndpointOutput extends StObject {
  
  /**
    * A user-supplied ID that uniquely identifies the MLModel. This value should be identical to the value of the MLModelId in the request.
    */
  var MLModelId: js.UndefOr[EntityId] = js.undefined
  
  /**
    * The endpoint information of the MLModel 
    */
  var RealtimeEndpointInfo: js.UndefOr[typings.awsSdk.clientsMachinelearningMod.RealtimeEndpointInfo] = js.undefined
}
object CreateRealtimeEndpointOutput {
  
  inline def apply(): CreateRealtimeEndpointOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRealtimeEndpointOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRealtimeEndpointOutput] (val x: Self) extends AnyVal {
    
    inline def setMLModelId(value: EntityId): Self = StObject.set(x, "MLModelId", value.asInstanceOf[js.Any])
    
    inline def setMLModelIdUndefined: Self = StObject.set(x, "MLModelId", js.undefined)
    
    inline def setRealtimeEndpointInfo(value: RealtimeEndpointInfo): Self = StObject.set(x, "RealtimeEndpointInfo", value.asInstanceOf[js.Any])
    
    inline def setRealtimeEndpointInfoUndefined: Self = StObject.set(x, "RealtimeEndpointInfo", js.undefined)
  }
}
