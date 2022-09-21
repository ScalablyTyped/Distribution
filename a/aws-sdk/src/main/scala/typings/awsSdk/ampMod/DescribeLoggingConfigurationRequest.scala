package typings.awsSdk.ampMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLoggingConfigurationRequest extends StObject {
  
  /**
    * The ID of the workspace to vend logs to.
    */
  var workspaceId: WorkspaceId
}
object DescribeLoggingConfigurationRequest {
  
  inline def apply(workspaceId: WorkspaceId): DescribeLoggingConfigurationRequest = {
    val __obj = js.Dynamic.literal(workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLoggingConfigurationRequest]
  }
  
  extension [Self <: DescribeLoggingConfigurationRequest](x: Self) {
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
