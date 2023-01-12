package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachLoadBalancerTlsCertificateResult extends StObject {
  
  /**
    * An array of objects that describe the result of the action, such as the status of the request, the timestamp of the request, and the resources affected by the request. These SSL/TLS certificates are only usable by Lightsail load balancers. You can't get the certificate and use it for another purpose.
    */
  var operations: js.UndefOr[OperationList] = js.undefined
}
object AttachLoadBalancerTlsCertificateResult {
  
  inline def apply(): AttachLoadBalancerTlsCertificateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachLoadBalancerTlsCertificateResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttachLoadBalancerTlsCertificateResult] (val x: Self) extends AnyVal {
    
    inline def setOperations(value: OperationList): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: Operation*): Self = StObject.set(x, "operations", js.Array(value*))
  }
}
