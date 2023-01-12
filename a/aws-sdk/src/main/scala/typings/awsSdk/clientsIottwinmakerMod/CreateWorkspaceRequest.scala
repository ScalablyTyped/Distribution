package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkspaceRequest extends StObject {
  
  /**
    * The description of the workspace.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The ARN of the execution role associated with the workspace.
    */
  var role: RoleArn
  
  /**
    * The ARN of the S3 bucket where resources associated with the workspace are stored.
    */
  var s3Location: S3Location
  
  /**
    * Metadata that you can use to manage the workspace
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The ID of the workspace.
    */
  var workspaceId: Id
}
object CreateWorkspaceRequest {
  
  inline def apply(role: RoleArn, s3Location: S3Location, workspaceId: Id): CreateWorkspaceRequest = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any], s3Location = s3Location.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkspaceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateWorkspaceRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setRole(value: RoleArn): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setS3Location(value: S3Location): Self = StObject.set(x, "s3Location", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setWorkspaceId(value: Id): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
