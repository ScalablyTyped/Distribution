package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteLoadBalancerTlsCertificateRequest extends js.Object {
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
  @scala.inline
  def apply(
    certificateName: ResourceName,
    loadBalancerName: ResourceName,
    force: js.UndefOr[Boolean] = js.undefined
  ): DeleteLoadBalancerTlsCertificateRequest = {
    val __obj = js.Dynamic.literal(certificateName = certificateName, loadBalancerName = loadBalancerName)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    __obj.asInstanceOf[DeleteLoadBalancerTlsCertificateRequest]
  }
}

