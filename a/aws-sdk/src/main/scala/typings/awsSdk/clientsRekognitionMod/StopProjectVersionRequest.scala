package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopProjectVersionRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the model version that you want to delete. This operation requires permissions to perform the rekognition:StopProjectVersion action.
    */
  var ProjectVersionArn: typings.awsSdk.clientsRekognitionMod.ProjectVersionArn
}
object StopProjectVersionRequest {
  
  inline def apply(ProjectVersionArn: ProjectVersionArn): StopProjectVersionRequest = {
    val __obj = js.Dynamic.literal(ProjectVersionArn = ProjectVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopProjectVersionRequest]
  }
  
  extension [Self <: StopProjectVersionRequest](x: Self) {
    
    inline def setProjectVersionArn(value: ProjectVersionArn): Self = StObject.set(x, "ProjectVersionArn", value.asInstanceOf[js.Any])
  }
}
