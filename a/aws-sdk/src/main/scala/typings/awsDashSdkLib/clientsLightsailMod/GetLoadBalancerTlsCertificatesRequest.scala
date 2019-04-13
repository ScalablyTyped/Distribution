package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLoadBalancerTlsCertificatesRequest extends js.Object {
  /**
    * The name of the load balancer you associated with your SSL/TLS certificate.
    */
  var loadBalancerName: ResourceName
}

object GetLoadBalancerTlsCertificatesRequest {
  @scala.inline
  def apply(loadBalancerName: ResourceName): GetLoadBalancerTlsCertificatesRequest = {
    val __obj = js.Dynamic.literal(loadBalancerName = loadBalancerName)
  
    __obj.asInstanceOf[GetLoadBalancerTlsCertificatesRequest]
  }
}

