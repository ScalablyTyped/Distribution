package typings.awsSdk.clientsAppconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopDeploymentRequest extends StObject {
  
  /**
    * The application ID.
    */
  var ApplicationId: Id
  
  /**
    * The sequence number of the deployment.
    */
  var DeploymentNumber: Integer
  
  /**
    * The environment ID.
    */
  var EnvironmentId: Id
}
object StopDeploymentRequest {
  
  inline def apply(ApplicationId: Id, DeploymentNumber: Integer, EnvironmentId: Id): StopDeploymentRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], DeploymentNumber = DeploymentNumber.asInstanceOf[js.Any], EnvironmentId = EnvironmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopDeploymentRequest]
  }
  
  extension [Self <: StopDeploymentRequest](x: Self) {
    
    inline def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setDeploymentNumber(value: Integer): Self = StObject.set(x, "DeploymentNumber", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentId(value: Id): Self = StObject.set(x, "EnvironmentId", value.asInstanceOf[js.Any])
  }
}
