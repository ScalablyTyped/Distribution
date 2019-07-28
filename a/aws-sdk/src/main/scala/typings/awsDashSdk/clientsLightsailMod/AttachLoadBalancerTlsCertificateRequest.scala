package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachLoadBalancerTlsCertificateRequest extends js.Object {
  /**
    * The name of your SSL/TLS certificate.
    */
  var certificateName: ResourceName
  /**
    * The name of the load balancer to which you want to associate the SSL/TLS certificate.
    */
  var loadBalancerName: ResourceName
}

object AttachLoadBalancerTlsCertificateRequest {
  @scala.inline
  def apply(certificateName: ResourceName, loadBalancerName: ResourceName): AttachLoadBalancerTlsCertificateRequest = {
    val __obj = js.Dynamic.literal(certificateName = certificateName, loadBalancerName = loadBalancerName)
  
    __obj.asInstanceOf[AttachLoadBalancerTlsCertificateRequest]
  }
}

