package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteServiceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the App Runner service that you want to delete.
    */
  var ServiceArn: AppRunnerResourceArn
}
object DeleteServiceRequest {
  
  inline def apply(ServiceArn: AppRunnerResourceArn): DeleteServiceRequest = {
    val __obj = js.Dynamic.literal(ServiceArn = ServiceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteServiceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteServiceRequest] (val x: Self) extends AnyVal {
    
    inline def setServiceArn(value: AppRunnerResourceArn): Self = StObject.set(x, "ServiceArn", value.asInstanceOf[js.Any])
  }
}
