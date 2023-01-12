package typings.awsSdk.clientsAmpMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAlertManagerDefinitionRequest extends StObject {
  
  /**
    * Optional, unique, case-sensitive, user-provided identifier to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[IdempotencyToken] = js.undefined
  
  /**
    * The alert manager definition data.
    */
  var data: AlertManagerDefinitionData
  
  /**
    * The ID of the workspace in which to create the alert manager definition.
    */
  var workspaceId: WorkspaceId
}
object CreateAlertManagerDefinitionRequest {
  
  inline def apply(data: AlertManagerDefinitionData, workspaceId: WorkspaceId): CreateAlertManagerDefinitionRequest = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAlertManagerDefinitionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAlertManagerDefinitionRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: IdempotencyToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setData(value: AlertManagerDefinitionData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
