package typings.awsSdk.apprunnerMod

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
  
  extension [Self <: StartDeploymentRequest](x: Self) {
    
    inline def setServiceArn(value: AppRunnerResourceArn): Self = StObject.set(x, "ServiceArn", value.asInstanceOf[js.Any])
  }
}
