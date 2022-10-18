package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorkspaceResponse extends StObject {
  
  /**
    * The ARN of the workspace.
    */
  var arn: TwinMakerArn
  
  /**
    * The date and time when the workspace was created.
    */
  var creationDateTime: js.Date
  
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
    * The date and time when the workspace was last updated.
    */
  var updateDateTime: js.Date
  
  /**
    * The ID of the workspace.
    */
  var workspaceId: Id
}
object GetWorkspaceResponse {
  
  inline def apply(
    arn: TwinMakerArn,
    creationDateTime: js.Date,
    role: RoleArn,
    s3Location: S3Location,
    updateDateTime: js.Date,
    workspaceId: Id
  ): GetWorkspaceResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], creationDateTime = creationDateTime.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], s3Location = s3Location.asInstanceOf[js.Any], updateDateTime = updateDateTime.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkspaceResponse]
  }
  
  extension [Self <: GetWorkspaceResponse](x: Self) {
    
    inline def setArn(value: TwinMakerArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setRole(value: RoleArn): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setS3Location(value: S3Location): Self = StObject.set(x, "s3Location", value.asInstanceOf[js.Any])
    
    inline def setUpdateDateTime(value: js.Date): Self = StObject.set(x, "updateDateTime", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceId(value: Id): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
