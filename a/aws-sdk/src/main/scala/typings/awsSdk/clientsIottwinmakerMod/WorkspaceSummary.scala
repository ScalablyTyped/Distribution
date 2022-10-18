package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceSummary extends StObject {
  
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
    * The date and time when the workspace was last updated.
    */
  var updateDateTime: js.Date
  
  /**
    * The ID of the workspace.
    */
  var workspaceId: Id
}
object WorkspaceSummary {
  
  inline def apply(arn: TwinMakerArn, creationDateTime: js.Date, updateDateTime: js.Date, workspaceId: Id): WorkspaceSummary = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], creationDateTime = creationDateTime.asInstanceOf[js.Any], updateDateTime = updateDateTime.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceSummary]
  }
  
  extension [Self <: WorkspaceSummary](x: Self) {
    
    inline def setArn(value: TwinMakerArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setUpdateDateTime(value: js.Date): Self = StObject.set(x, "updateDateTime", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceId(value: Id): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
