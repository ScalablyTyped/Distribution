package typings.awsSdk.ampMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkspaceResponse extends StObject {
  
  /**
    * The ARN of the workspace that was just created.
    */
  var arn: WorkspaceArn
  
  /**
    * The status of the workspace that was just created (usually CREATING).
    */
  var status: WorkspaceStatus
  
  /**
    * The tags of this workspace.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The generated ID of the workspace that was just created.
    */
  var workspaceId: WorkspaceId
}
object CreateWorkspaceResponse {
  
  inline def apply(arn: WorkspaceArn, status: WorkspaceStatus, workspaceId: WorkspaceId): CreateWorkspaceResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkspaceResponse]
  }
  
  extension [Self <: CreateWorkspaceResponse](x: Self) {
    
    inline def setArn(value: WorkspaceArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: WorkspaceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
