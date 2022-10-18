package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PauseServiceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the App Runner service that you want to pause.
    */
  var ServiceArn: AppRunnerResourceArn
}
object PauseServiceRequest {
  
  inline def apply(ServiceArn: AppRunnerResourceArn): PauseServiceRequest = {
    val __obj = js.Dynamic.literal(ServiceArn = ServiceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PauseServiceRequest]
  }
  
  extension [Self <: PauseServiceRequest](x: Self) {
    
    inline def setServiceArn(value: AppRunnerResourceArn): Self = StObject.set(x, "ServiceArn", value.asInstanceOf[js.Any])
  }
}
