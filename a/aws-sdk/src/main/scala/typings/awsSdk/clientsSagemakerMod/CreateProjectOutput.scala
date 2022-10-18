package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProjectOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the project.
    */
  var ProjectArn: typings.awsSdk.clientsSagemakerMod.ProjectArn
  
  /**
    * The ID of the new project.
    */
  var ProjectId: typings.awsSdk.clientsSagemakerMod.ProjectId
}
object CreateProjectOutput {
  
  inline def apply(ProjectArn: ProjectArn, ProjectId: ProjectId): CreateProjectOutput = {
    val __obj = js.Dynamic.literal(ProjectArn = ProjectArn.asInstanceOf[js.Any], ProjectId = ProjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectOutput]
  }
  
  extension [Self <: CreateProjectOutput](x: Self) {
    
    inline def setProjectArn(value: ProjectArn): Self = StObject.set(x, "ProjectArn", value.asInstanceOf[js.Any])
    
    inline def setProjectId(value: ProjectId): Self = StObject.set(x, "ProjectId", value.asInstanceOf[js.Any])
  }
}
