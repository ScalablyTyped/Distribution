package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkspaceResponse extends StObject {
  
  /**
    * The ARN of the workspace.
    */
  var arn: TwinMakerArn
  
  /**
    * The date and time when the workspace was created.
    */
  var creationDateTime: js.Date
}
object CreateWorkspaceResponse {
  
  inline def apply(arn: TwinMakerArn, creationDateTime: js.Date): CreateWorkspaceResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], creationDateTime = creationDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkspaceResponse]
  }
  
  extension [Self <: CreateWorkspaceResponse](x: Self) {
    
    inline def setArn(value: TwinMakerArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
  }
}
