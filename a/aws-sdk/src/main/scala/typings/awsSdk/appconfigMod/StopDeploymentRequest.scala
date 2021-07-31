package typings.awsSdk.appconfigMod

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
  
  @scala.inline
  def apply(ApplicationId: Id, DeploymentNumber: Integer, EnvironmentId: Id): StopDeploymentRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], DeploymentNumber = DeploymentNumber.asInstanceOf[js.Any], EnvironmentId = EnvironmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopDeploymentRequest]
  }
  
  @scala.inline
  implicit class StopDeploymentRequestMutableBuilder[Self <: StopDeploymentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentNumber(value: Integer): Self = StObject.set(x, "DeploymentNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentId(value: Id): Self = StObject.set(x, "EnvironmentId", value.asInstanceOf[js.Any])
  }
}
