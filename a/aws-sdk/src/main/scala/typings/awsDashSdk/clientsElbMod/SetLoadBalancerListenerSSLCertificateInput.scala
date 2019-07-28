package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetLoadBalancerListenerSSLCertificateInput extends js.Object {
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
  /**
    * The port that uses the specified SSL certificate.
    */
  var LoadBalancerPort: AccessPointPort
  /**
    * The Amazon Resource Name (ARN) of the SSL certificate.
    */
  var SSLCertificateId: typings.awsDashSdk.clientsElbMod.SSLCertificateId
}

object SetLoadBalancerListenerSSLCertificateInput {
  @scala.inline
  def apply(
    LoadBalancerName: AccessPointName,
    LoadBalancerPort: AccessPointPort,
    SSLCertificateId: SSLCertificateId
  ): SetLoadBalancerListenerSSLCertificateInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName, LoadBalancerPort = LoadBalancerPort, SSLCertificateId = SSLCertificateId)
  
    __obj.asInstanceOf[SetLoadBalancerListenerSSLCertificateInput]
  }
}

