package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProjectVersionRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the model version that you want to delete.
    */
  var ProjectVersionArn: typings.awsSdk.clientsRekognitionMod.ProjectVersionArn
}
object DeleteProjectVersionRequest {
  
  inline def apply(ProjectVersionArn: ProjectVersionArn): DeleteProjectVersionRequest = {
    val __obj = js.Dynamic.literal(ProjectVersionArn = ProjectVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProjectVersionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteProjectVersionRequest] (val x: Self) extends AnyVal {
    
    inline def setProjectVersionArn(value: ProjectVersionArn): Self = StObject.set(x, "ProjectVersionArn", value.asInstanceOf[js.Any])
  }
}
