package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProjectResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the new project. You can use the ARN to configure IAM access to the project. 
    */
  var ProjectArn: js.UndefOr[typings.awsSdk.clientsRekognitionMod.ProjectArn] = js.undefined
}
object CreateProjectResponse {
  
  inline def apply(): CreateProjectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProjectResponse]
  }
  
  extension [Self <: CreateProjectResponse](x: Self) {
    
    inline def setProjectArn(value: ProjectArn): Self = StObject.set(x, "ProjectArn", value.asInstanceOf[js.Any])
    
    inline def setProjectArnUndefined: Self = StObject.set(x, "ProjectArn", js.undefined)
  }
}
