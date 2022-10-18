package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProjectRequest extends StObject {
  
  /**
    * The name or ARN of the project to delete.
    */
  var project: ProjectRef
}
object DeleteProjectRequest {
  
  inline def apply(project: ProjectRef): DeleteProjectRequest = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProjectRequest]
  }
  
  extension [Self <: DeleteProjectRequest](x: Self) {
    
    inline def setProject(value: ProjectRef): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
  }
}
