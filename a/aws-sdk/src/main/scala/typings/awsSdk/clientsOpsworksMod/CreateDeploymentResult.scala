package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDeploymentResult extends StObject {
  
  /**
    * The deployment ID, which can be used with other requests to identify the deployment.
    */
  var DeploymentId: js.UndefOr[String] = js.undefined
}
object CreateDeploymentResult {
  
  inline def apply(): CreateDeploymentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDeploymentResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDeploymentResult] (val x: Self) extends AnyVal {
    
    inline def setDeploymentId(value: String): Self = StObject.set(x, "DeploymentId", value.asInstanceOf[js.Any])
    
    inline def setDeploymentIdUndefined: Self = StObject.set(x, "DeploymentId", js.undefined)
  }
}
