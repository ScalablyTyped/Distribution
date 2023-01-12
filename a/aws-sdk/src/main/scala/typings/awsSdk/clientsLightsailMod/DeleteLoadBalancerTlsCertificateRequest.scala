package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLoadBalancerTlsCertificateRequest extends StObject {
  
  /**
    * The SSL/TLS certificate name.
    */
  var certificateName: ResourceName
  
  /**
    * When true, forces the deletion of an SSL/TLS certificate. There can be two certificates associated with a Lightsail load balancer: the primary and the backup. The force parameter is required when the primary SSL/TLS certificate is in use by an instance attached to the load balancer.
    */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The load balancer name.
    */
  var loadBalancerName: ResourceName
}
object DeleteLoadBalancerTlsCertificateRequest {
  
  inline def apply(certificateName: ResourceName, loadBalancerName: ResourceName): DeleteLoadBalancerTlsCertificateRequest = {
    val __obj = js.Dynamic.literal(certificateName = certificateName.asInstanceOf[js.Any], loadBalancerName = loadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLoadBalancerTlsCertificateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteLoadBalancerTlsCertificateRequest] (val x: Self) extends AnyVal {
    
    inline def setCertificateName(value: ResourceName): Self = StObject.set(x, "certificateName", value.asInstanceOf[js.Any])
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setLoadBalancerName(value: ResourceName): Self = StObject.set(x, "loadBalancerName", value.asInstanceOf[js.Any])
  }
}
