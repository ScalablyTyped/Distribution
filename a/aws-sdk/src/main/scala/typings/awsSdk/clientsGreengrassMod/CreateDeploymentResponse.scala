package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDeploymentResponse extends StObject {
  
  /**
    * The ARN of the deployment.
    */
  var DeploymentArn: js.UndefOr[string] = js.undefined
  
  /**
    * The ID of the deployment.
    */
  var DeploymentId: js.UndefOr[string] = js.undefined
}
object CreateDeploymentResponse {
  
  inline def apply(): CreateDeploymentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDeploymentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDeploymentResponse] (val x: Self) extends AnyVal {
    
    inline def setDeploymentArn(value: string): Self = StObject.set(x, "DeploymentArn", value.asInstanceOf[js.Any])
    
    inline def setDeploymentArnUndefined: Self = StObject.set(x, "DeploymentArn", js.undefined)
    
    inline def setDeploymentId(value: string): Self = StObject.set(x, "DeploymentId", value.asInstanceOf[js.Any])
    
    inline def setDeploymentIdUndefined: Self = StObject.set(x, "DeploymentId", js.undefined)
  }
}
