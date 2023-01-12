package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProjectOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the project.
    */
  var ProjectArn: typings.awsSdk.clientsSagemakerMod.ProjectArn
}
object UpdateProjectOutput {
  
  inline def apply(ProjectArn: ProjectArn): UpdateProjectOutput = {
    val __obj = js.Dynamic.literal(ProjectArn = ProjectArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProjectOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateProjectOutput] (val x: Self) extends AnyVal {
    
    inline def setProjectArn(value: ProjectArn): Self = StObject.set(x, "ProjectArn", value.asInstanceOf[js.Any])
  }
}
