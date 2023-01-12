package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartDeploymentRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the App Runner service that you want to manually deploy to.
    */
  var ServiceArn: AppRunnerResourceArn
}
object StartDeploymentRequest {
  
  inline def apply(ServiceArn: AppRunnerResourceArn): StartDeploymentRequest = {
    val __obj = js.Dynamic.literal(ServiceArn = ServiceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDeploymentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartDeploymentRequest] (val x: Self) extends AnyVal {
    
    inline def setServiceArn(value: AppRunnerResourceArn): Self = StObject.set(x, "ServiceArn", value.asInstanceOf[js.Any])
  }
}
