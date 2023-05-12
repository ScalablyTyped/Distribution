package typings.awsSdk.clientsGrafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkspaceApiKeyRequest extends StObject {
  
  /**
    * Specifies the name of the key. Keynames must be unique to the workspace.
    */
  var keyName: ApiKeyName
  
  /**
    * Specifies the permission level of the key.  Valid values: VIEWER|EDITOR|ADMIN 
    */
  var keyRole: String
  
  /**
    * Specifies the time in seconds until the key expires. Keys can be valid for up to 30 days.
    */
  var secondsToLive: CreateWorkspaceApiKeyRequestSecondsToLiveInteger
  
  /**
    * The ID of the workspace to create an API key.
    */
  var workspaceId: WorkspaceId
}
object CreateWorkspaceApiKeyRequest {
  
  inline def apply(
    keyName: ApiKeyName,
    keyRole: String,
    secondsToLive: CreateWorkspaceApiKeyRequestSecondsToLiveInteger,
    workspaceId: WorkspaceId
  ): CreateWorkspaceApiKeyRequest = {
    val __obj = js.Dynamic.literal(keyName = keyName.asInstanceOf[js.Any], keyRole = keyRole.asInstanceOf[js.Any], secondsToLive = secondsToLive.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkspaceApiKeyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateWorkspaceApiKeyRequest] (val x: Self) extends AnyVal {
    
    inline def setKeyName(value: ApiKeyName): Self = StObject.set(x, "keyName", value.asInstanceOf[js.Any])
    
    inline def setKeyRole(value: String): Self = StObject.set(x, "keyRole", value.asInstanceOf[js.Any])
    
    inline def setSecondsToLive(value: CreateWorkspaceApiKeyRequestSecondsToLiveInteger): Self = StObject.set(x, "secondsToLive", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
