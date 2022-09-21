package typings.awsSdk.apprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResumeServiceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the App Runner service that you want to resume.
    */
  var ServiceArn: AppRunnerResourceArn
}
object ResumeServiceRequest {
  
  inline def apply(ServiceArn: AppRunnerResourceArn): ResumeServiceRequest = {
    val __obj = js.Dynamic.literal(ServiceArn = ServiceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResumeServiceRequest]
  }
  
  extension [Self <: ResumeServiceRequest](x: Self) {
    
    inline def setServiceArn(value: AppRunnerResourceArn): Self = StObject.set(x, "ServiceArn", value.asInstanceOf[js.Any])
  }
}
