package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSceneRequest extends StObject {
  
  /**
    * The ID of the scene.
    */
  var sceneId: Id
  
  /**
    * The ID of the workspace that contains the scene.
    */
  var workspaceId: Id
}
object GetSceneRequest {
  
  inline def apply(sceneId: Id, workspaceId: Id): GetSceneRequest = {
    val __obj = js.Dynamic.literal(sceneId = sceneId.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSceneRequest]
  }
  
  extension [Self <: GetSceneRequest](x: Self) {
    
    inline def setSceneId(value: Id): Self = StObject.set(x, "sceneId", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceId(value: Id): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
