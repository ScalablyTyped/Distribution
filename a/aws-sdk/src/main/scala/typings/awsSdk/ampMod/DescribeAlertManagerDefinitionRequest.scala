package typings.awsSdk.ampMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAlertManagerDefinitionRequest extends StObject {
  
  /**
    * The ID of the workspace to describe.
    */
  var workspaceId: WorkspaceId
}
object DescribeAlertManagerDefinitionRequest {
  
  inline def apply(workspaceId: WorkspaceId): DescribeAlertManagerDefinitionRequest = {
    val __obj = js.Dynamic.literal(workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAlertManagerDefinitionRequest]
  }
  
  extension [Self <: DescribeAlertManagerDefinitionRequest](x: Self) {
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
