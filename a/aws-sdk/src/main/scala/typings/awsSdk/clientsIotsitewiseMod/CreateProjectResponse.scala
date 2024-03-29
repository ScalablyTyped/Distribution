package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProjectResponse extends StObject {
  
  /**
    * The ARN of the project, which has the following format.  arn:${Partition}:iotsitewise:${Region}:${Account}:project/${ProjectId} 
    */
  var projectArn: ARN
  
  /**
    * The ID of the project.
    */
  var projectId: ID
}
object CreateProjectResponse {
  
  inline def apply(projectArn: ARN, projectId: ID): CreateProjectResponse = {
    val __obj = js.Dynamic.literal(projectArn = projectArn.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateProjectResponse] (val x: Self) extends AnyVal {
    
    inline def setProjectArn(value: ARN): Self = StObject.set(x, "projectArn", value.asInstanceOf[js.Any])
    
    inline def setProjectId(value: ID): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
  }
}
