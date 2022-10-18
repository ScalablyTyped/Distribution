package typings.awsSdk.clientsGrafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePermissionsRequest extends StObject {
  
  /**
    * An array of structures that contain the permission updates to make.
    */
  var updateInstructionBatch: UpdateInstructionBatch
  
  /**
    * The ID of the workspace to update.
    */
  var workspaceId: WorkspaceId
}
object UpdatePermissionsRequest {
  
  inline def apply(updateInstructionBatch: UpdateInstructionBatch, workspaceId: WorkspaceId): UpdatePermissionsRequest = {
    val __obj = js.Dynamic.literal(updateInstructionBatch = updateInstructionBatch.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePermissionsRequest]
  }
  
  extension [Self <: UpdatePermissionsRequest](x: Self) {
    
    inline def setUpdateInstructionBatch(value: UpdateInstructionBatch): Self = StObject.set(x, "updateInstructionBatch", value.asInstanceOf[js.Any])
    
    inline def setUpdateInstructionBatchVarargs(value: UpdateInstruction*): Self = StObject.set(x, "updateInstructionBatch", js.Array(value*))
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
