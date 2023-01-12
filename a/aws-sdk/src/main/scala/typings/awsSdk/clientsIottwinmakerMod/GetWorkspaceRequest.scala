package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorkspaceRequest extends StObject {
  
  /**
    * The ID of the workspace.
    */
  var workspaceId: IdOrArn
}
object GetWorkspaceRequest {
  
  inline def apply(workspaceId: IdOrArn): GetWorkspaceRequest = {
    val __obj = js.Dynamic.literal(workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkspaceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetWorkspaceRequest] (val x: Self) extends AnyVal {
    
    inline def setWorkspaceId(value: IdOrArn): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
