package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDestinationResponse extends StObject {
  
  var arn: DestinationArn
  
  var createdAt: js.Date
  
  var id: DestinationId
  
  var state: DestinationState
  
  var updatedAt: js.Date
}
object CreateDestinationResponse {
  
  inline def apply(
    arn: DestinationArn,
    createdAt: js.Date,
    id: DestinationId,
    state: DestinationState,
    updatedAt: js.Date
  ): CreateDestinationResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDestinationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDestinationResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: DestinationArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setId(value: DestinationId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setState(value: DestinationState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
