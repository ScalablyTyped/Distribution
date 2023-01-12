package typings.awsSdk.clientsGrafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWorkspaceAuthenticationRequest extends StObject {
  
  /**
    * The ID of the workspace to return authentication information about.
    */
  var workspaceId: WorkspaceId
}
object DescribeWorkspaceAuthenticationRequest {
  
  inline def apply(workspaceId: WorkspaceId): DescribeWorkspaceAuthenticationRequest = {
    val __obj = js.Dynamic.literal(workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorkspaceAuthenticationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeWorkspaceAuthenticationRequest] (val x: Self) extends AnyVal {
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
