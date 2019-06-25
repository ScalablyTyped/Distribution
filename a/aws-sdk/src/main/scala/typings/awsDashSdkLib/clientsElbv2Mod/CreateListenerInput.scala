package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateListenerInput extends js.Object {
  /**
    * [HTTPS and TLS listeners] The default certificate for the listener. You must provide exactly one certificate. Set CertificateArn to the certificate ARN but do not set IsDefault. To create a certificate list for the listener, use AddListenerCertificates.
    */
  var Certificates: js.UndefOr[CertificateList] = js.undefined
  /**
    * The actions for the default rule. The rule must include one forward action or one or more fixed-response actions. If the action type is forward, you specify a target group. The protocol of the target group must be HTTP or HTTPS for an Application Load Balancer. The protocol of the target group must be TCP, TLS, UDP, or TCP_UDP for a Network Load Balancer. [HTTPS listeners] If the action type is authenticate-oidc, you authenticate users through an identity provider that is OpenID Connect (OIDC) compliant. [HTTPS listeners] If the action type is authenticate-cognito, you authenticate users through the user pools supported by Amazon Cognito. [Application Load Balancer] If the action type is redirect, you redirect specified client requests from one URL to another. [Application Load Balancer] If the action type is fixed-response, you drop specified client requests and return a custom HTTP response.
    */
  var DefaultActions: Actions
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: awsDashSdkLib.clientsElbv2Mod.LoadBalancerArn
  /**
    * The port on which the load balancer is listening.
    */
  var Port: awsDashSdkLib.clientsElbv2Mod.Port
  /**
    * The protocol for connections from clients to the load balancer. For Application Load Balancers, the supported protocols are HTTP and HTTPS. For Network Load Balancers, the supported protocols are TCP, TLS, UDP, and TCP_UDP.
    */
  var Protocol: ProtocolEnum
  /**
    * [HTTPS and TLS listeners] The security policy that defines which ciphers and protocols are supported. The default is the current predefined security policy.
    */
  var SslPolicy: js.UndefOr[SslPolicyName] = js.undefined
}

object CreateListenerInput {
  @scala.inline
  def apply(
    DefaultActions: Actions,
    LoadBalancerArn: LoadBalancerArn,
    Port: Port,
    Protocol: ProtocolEnum,
    Certificates: CertificateList = null,
    SslPolicy: SslPolicyName = null
  ): CreateListenerInput = {
    val __obj = js.Dynamic.literal(DefaultActions = DefaultActions, LoadBalancerArn = LoadBalancerArn, Port = Port, Protocol = Protocol.asInstanceOf[js.Any])
    if (Certificates != null) __obj.updateDynamic("Certificates")(Certificates)
    if (SslPolicy != null) __obj.updateDynamic("SslPolicy")(SslPolicy)
    __obj.asInstanceOf[CreateListenerInput]
  }
}

