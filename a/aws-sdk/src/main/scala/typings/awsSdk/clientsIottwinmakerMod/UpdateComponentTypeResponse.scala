package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateComponentTypeResponse extends StObject {
  
  /**
    * The ARN of the component type.
    */
  var arn: TwinMakerArn
  
  /**
    * The ID of the component type.
    */
  var componentTypeId: ComponentTypeId
  
  /**
    * The current state of the component type.
    */
  var state: State
  
  /**
    * The ID of the workspace that contains the component type.
    */
  var workspaceId: Id
}
object UpdateComponentTypeResponse {
  
  inline def apply(arn: TwinMakerArn, componentTypeId: ComponentTypeId, state: State, workspaceId: Id): UpdateComponentTypeResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], componentTypeId = componentTypeId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateComponentTypeResponse]
  }
  
  extension [Self <: UpdateComponentTypeResponse](x: Self) {
    
    inline def setArn(value: TwinMakerArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setComponentTypeId(value: ComponentTypeId): Self = StObject.set(x, "componentTypeId", value.asInstanceOf[js.Any])
    
    inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceId(value: Id): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
