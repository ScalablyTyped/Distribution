package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProjectVersionResponse extends StObject {
  
  /**
    * The ARN of the model version that was created. Use DescribeProjectVersion to get the current status of the training operation.
    */
  var ProjectVersionArn: js.UndefOr[typings.awsSdk.clientsRekognitionMod.ProjectVersionArn] = js.undefined
}
object CreateProjectVersionResponse {
  
  inline def apply(): CreateProjectVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProjectVersionResponse]
  }
  
  extension [Self <: CreateProjectVersionResponse](x: Self) {
    
    inline def setProjectVersionArn(value: ProjectVersionArn): Self = StObject.set(x, "ProjectVersionArn", value.asInstanceOf[js.Any])
    
    inline def setProjectVersionArnUndefined: Self = StObject.set(x, "ProjectVersionArn", js.undefined)
  }
}
