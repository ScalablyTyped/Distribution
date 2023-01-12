package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeServiceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the App Runner service that you want a description for.
    */
  var ServiceArn: AppRunnerResourceArn
}
object DescribeServiceRequest {
  
  inline def apply(ServiceArn: AppRunnerResourceArn): DescribeServiceRequest = {
    val __obj = js.Dynamic.literal(ServiceArn = ServiceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeServiceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeServiceRequest] (val x: Self) extends AnyVal {
    
    inline def setServiceArn(value: AppRunnerResourceArn): Self = StObject.set(x, "ServiceArn", value.asInstanceOf[js.Any])
  }
}
