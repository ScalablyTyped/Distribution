package typings.awsSdk.clientsAmpMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWorkspaceAliasRequest extends StObject {
  
  /**
    * The new alias of the workspace.
    */
  var alias: js.UndefOr[WorkspaceAlias] = js.undefined
  
  /**
    * Optional, unique, case-sensitive, user-provided identifier to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[IdempotencyToken] = js.undefined
  
  /**
    * The ID of the workspace being updated.
    */
  var workspaceId: WorkspaceId
}
object UpdateWorkspaceAliasRequest {
  
  inline def apply(workspaceId: WorkspaceId): UpdateWorkspaceAliasRequest = {
    val __obj = js.Dynamic.literal(workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkspaceAliasRequest]
  }
  
  extension [Self <: UpdateWorkspaceAliasRequest](x: Self) {
    
    inline def setAlias(value: WorkspaceAlias): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setClientToken(value: IdempotencyToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
