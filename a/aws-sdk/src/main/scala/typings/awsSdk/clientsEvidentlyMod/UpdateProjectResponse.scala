package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProjectResponse extends StObject {
  
  /**
    * A structure containing information about the updated project.
    */
  var project: Project
}
object UpdateProjectResponse {
  
  inline def apply(project: Project): UpdateProjectResponse = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProjectResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateProjectResponse] (val x: Self) extends AnyVal {
    
    inline def setProject(value: Project): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
  }
}
