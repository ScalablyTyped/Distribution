package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDeploymentResponse extends StObject {
  
  /**
    * The unique identifier of the deployment.
    */
  var deploymentId: Identifier
}
object CreateDeploymentResponse {
  
  inline def apply(deploymentId: Identifier): CreateDeploymentResponse = {
    val __obj = js.Dynamic.literal(deploymentId = deploymentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDeploymentResponse] (val x: Self) extends AnyVal {
    
    inline def setDeploymentId(value: Identifier): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
  }
}
