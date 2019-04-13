package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadBalancerTlsCertificateSummary extends js.Object {
  /**
    * When true, the SSL/TLS certificate is attached to the Lightsail load balancer.
    */
  var isAttached: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The name of the SSL/TLS certificate.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
}

object LoadBalancerTlsCertificateSummary {
  @scala.inline
  def apply(isAttached: js.UndefOr[scala.Boolean] = js.undefined, name: ResourceName = null): LoadBalancerTlsCertificateSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isAttached)) __obj.updateDynamic("isAttached")(isAttached)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[LoadBalancerTlsCertificateSummary]
  }
}

