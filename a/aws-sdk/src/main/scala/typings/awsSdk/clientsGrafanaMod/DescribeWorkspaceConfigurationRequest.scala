package typings.awsSdk.clientsGrafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWorkspaceConfigurationRequest extends StObject {
  
  /**
    * The ID of the workspace to get configuration information for.
    */
  var workspaceId: WorkspaceId
}
object DescribeWorkspaceConfigurationRequest {
  
  inline def apply(workspaceId: WorkspaceId): DescribeWorkspaceConfigurationRequest = {
    val __obj = js.Dynamic.literal(workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorkspaceConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeWorkspaceConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
