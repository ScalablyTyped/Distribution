package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachLoadBalancerTlsCertificateRequest extends js.Object {
  /**
    * The name of your SSL/TLS certificate.
    */
  var certificateName: ResourceName = js.native
  /**
    * The name of the load balancer to which you want to associate the SSL/TLS certificate.
    */
  var loadBalancerName: ResourceName = js.native
}

object AttachLoadBalancerTlsCertificateRequest {
  @scala.inline
  def apply(certificateName: ResourceName, loadBalancerName: ResourceName): AttachLoadBalancerTlsCertificateRequest = {
    val __obj = js.Dynamic.literal(certificateName = certificateName.asInstanceOf[js.Any], loadBalancerName = loadBalancerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AttachLoadBalancerTlsCertificateRequest]
  }
}

