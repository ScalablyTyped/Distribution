package typings.awsSdk.clientsAmpMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkspaceRequest extends StObject {
  
  /**
    * An optional user-assigned alias for this workspace. This alias is for user reference and does not need to be unique.
    */
  var alias: js.UndefOr[WorkspaceAlias] = js.undefined
  
  /**
    * Optional, unique, case-sensitive, user-provided identifier to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[IdempotencyToken] = js.undefined
  
  /**
    * Optional, user-provided tags for this workspace.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateWorkspaceRequest {
  
  inline def apply(): CreateWorkspaceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWorkspaceRequest]
  }
  
  extension [Self <: CreateWorkspaceRequest](x: Self) {
    
    inline def setAlias(value: WorkspaceAlias): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setClientToken(value: IdempotencyToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
