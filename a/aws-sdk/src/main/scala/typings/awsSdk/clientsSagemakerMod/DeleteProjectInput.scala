package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProjectInput extends StObject {
  
  /**
    * The name of the project to delete.
    */
  var ProjectName: ProjectEntityName
}
object DeleteProjectInput {
  
  inline def apply(ProjectName: ProjectEntityName): DeleteProjectInput = {
    val __obj = js.Dynamic.literal(ProjectName = ProjectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProjectInput]
  }
  
  extension [Self <: DeleteProjectInput](x: Self) {
    
    inline def setProjectName(value: ProjectEntityName): Self = StObject.set(x, "ProjectName", value.asInstanceOf[js.Any])
  }
}
