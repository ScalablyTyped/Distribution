package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeploymentRequest extends StObject {
  
  /**
    * The ID of the application that includes the deployment you want to get. 
    */
  var ApplicationId: Id
  
  /**
    * The sequence number of the deployment.
    */
  var DeploymentNumber: Integer
  
  /**
    * The ID of the environment that includes the deployment you want to get. 
    */
  var EnvironmentId: Id
}
object GetDeploymentRequest {
  
  inline def apply(ApplicationId: Id, DeploymentNumber: Integer, EnvironmentId: Id): GetDeploymentRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], DeploymentNumber = DeploymentNumber.asInstanceOf[js.Any], EnvironmentId = EnvironmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeploymentRequest]
  }
  
  extension [Self <: GetDeploymentRequest](x: Self) {
    
    inline def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setDeploymentNumber(value: Integer): Self = StObject.set(x, "DeploymentNumber", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentId(value: Id): Self = StObject.set(x, "EnvironmentId", value.asInstanceOf[js.Any])
  }
}
