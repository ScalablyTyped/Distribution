package typings.awsSdk.clientsGrafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWorkspaceApiKeyResponse extends StObject {
  
  /**
    * The name of the key that was deleted.
    */
  var keyName: ApiKeyName
  
  /**
    * The ID of the workspace where the key was deleted.
    */
  var workspaceId: WorkspaceId
}
object DeleteWorkspaceApiKeyResponse {
  
  inline def apply(keyName: ApiKeyName, workspaceId: WorkspaceId): DeleteWorkspaceApiKeyResponse = {
    val __obj = js.Dynamic.literal(keyName = keyName.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkspaceApiKeyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteWorkspaceApiKeyResponse] (val x: Self) extends AnyVal {
    
    inline def setKeyName(value: ApiKeyName): Self = StObject.set(x, "keyName", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
