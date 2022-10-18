package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetProjectResponse extends StObject {
  
  /**
    * A structure containing the configuration details of the project.
    */
  var project: Project
}
object GetProjectResponse {
  
  inline def apply(project: Project): GetProjectResponse = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProjectResponse]
  }
  
  extension [Self <: GetProjectResponse](x: Self) {
    
    inline def setProject(value: Project): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
  }
}
