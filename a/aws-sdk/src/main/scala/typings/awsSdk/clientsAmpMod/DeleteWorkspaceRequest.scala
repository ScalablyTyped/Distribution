package typings.awsSdk.clientsAmpMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWorkspaceRequest extends StObject {
  
  /**
    * Optional, unique, case-sensitive, user-provided identifier to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[IdempotencyToken] = js.undefined
  
  /**
    * The ID of the workspace to delete.
    */
  var workspaceId: WorkspaceId
}
object DeleteWorkspaceRequest {
  
  inline def apply(workspaceId: WorkspaceId): DeleteWorkspaceRequest = {
    val __obj = js.Dynamic.literal(workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkspaceRequest]
  }
  
  extension [Self <: DeleteWorkspaceRequest](x: Self) {
    
    inline def setClientToken(value: IdempotencyToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
