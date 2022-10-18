package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetProjectRequest extends StObject {
  
  /**
    * The name or ARN of the project that you want to see the details of.
    */
  var project: ProjectRef
}
object GetProjectRequest {
  
  inline def apply(project: ProjectRef): GetProjectRequest = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProjectRequest]
  }
  
  extension [Self <: GetProjectRequest](x: Self) {
    
    inline def setProject(value: ProjectRef): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
  }
}
