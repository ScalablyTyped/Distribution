package typings.awsSdk.clientsGrafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWorkspaceConfigurationRequest extends StObject {
  
  /**
    * The new configuration string for the workspace. For more information about the format and configuration options available, see Working in your Grafana workspace.
    */
  var configuration: OverridableConfigurationJson
  
  /**
    * The ID of the workspace to update.
    */
  var workspaceId: WorkspaceId
}
object UpdateWorkspaceConfigurationRequest {
  
  inline def apply(configuration: OverridableConfigurationJson, workspaceId: WorkspaceId): UpdateWorkspaceConfigurationRequest = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkspaceConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateWorkspaceConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setConfiguration(value: OverridableConfigurationJson): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
