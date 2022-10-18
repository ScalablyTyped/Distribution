package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeploymentRequest extends StObject {
  
  /**
    * The ID of the deployment.
    */
  var deploymentId: NonEmptyString
}
object GetDeploymentRequest {
  
  inline def apply(deploymentId: NonEmptyString): GetDeploymentRequest = {
    val __obj = js.Dynamic.literal(deploymentId = deploymentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeploymentRequest]
  }
  
  extension [Self <: GetDeploymentRequest](x: Self) {
    
    inline def setDeploymentId(value: NonEmptyString): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
  }
}
