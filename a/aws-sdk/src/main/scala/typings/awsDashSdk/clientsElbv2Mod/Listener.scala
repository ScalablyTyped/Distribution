package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Listener extends js.Object {
  /**
    * [HTTPS or TLS listener] The default certificate for the listener.
    */
  var Certificates: js.UndefOr[CertificateList] = js.undefined
  /**
    * The default actions for the listener.
    */
  var DefaultActions: js.UndefOr[Actions] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var ListenerArn: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.ListenerArn] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.LoadBalancerArn] = js.undefined
  /**
    * The port on which the load balancer is listening.
    */
  var Port: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.Port] = js.undefined
  /**
    * The protocol for connections from clients to the load balancer.
    */
  var Protocol: js.UndefOr[ProtocolEnum] = js.undefined
  /**
    * [HTTPS or TLS listener] The security policy that defines which ciphers and protocols are supported. The default is the current predefined security policy.
    */
  var SslPolicy: js.UndefOr[SslPolicyName] = js.undefined
}

object Listener {
  @scala.inline
  def apply(
    Certificates: CertificateList = null,
    DefaultActions: Actions = null,
    ListenerArn: ListenerArn = null,
    LoadBalancerArn: LoadBalancerArn = null,
    Port: Int | Double = null,
    Protocol: ProtocolEnum = null,
    SslPolicy: SslPolicyName = null
  ): Listener = {
    val __obj = js.Dynamic.literal()
    if (Certificates != null) __obj.updateDynamic("Certificates")(Certificates)
    if (DefaultActions != null) __obj.updateDynamic("DefaultActions")(DefaultActions)
    if (ListenerArn != null) __obj.updateDynamic("ListenerArn")(ListenerArn)
    if (LoadBalancerArn != null) __obj.updateDynamic("LoadBalancerArn")(LoadBalancerArn)
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    if (Protocol != null) __obj.updateDynamic("Protocol")(Protocol.asInstanceOf[js.Any])
    if (SslPolicy != null) __obj.updateDynamic("SslPolicy")(SslPolicy)
    __obj.asInstanceOf[Listener]
  }
}

