package typings.awsSdk.clientsAmpMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWorkspaceRequest extends StObject {
  
  /**
    * The ID of the workspace to describe.
    */
  var workspaceId: WorkspaceId
}
object DescribeWorkspaceRequest {
  
  inline def apply(workspaceId: WorkspaceId): DescribeWorkspaceRequest = {
    val __obj = js.Dynamic.literal(workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorkspaceRequest]
  }
  
  extension [Self <: DescribeWorkspaceRequest](x: Self) {
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
