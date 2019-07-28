package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLoadBalancerTlsCertificatesResult extends js.Object {
  /**
    * An array of LoadBalancerTlsCertificate objects describing your SSL/TLS certificates.
    */
  var tlsCertificates: js.UndefOr[LoadBalancerTlsCertificateList] = js.undefined
}

object GetLoadBalancerTlsCertificatesResult {
  @scala.inline
  def apply(tlsCertificates: LoadBalancerTlsCertificateList = null): GetLoadBalancerTlsCertificatesResult = {
    val __obj = js.Dynamic.literal()
    if (tlsCertificates != null) __obj.updateDynamic("tlsCertificates")(tlsCertificates)
    __obj.asInstanceOf[GetLoadBalancerTlsCertificatesResult]
  }
}

