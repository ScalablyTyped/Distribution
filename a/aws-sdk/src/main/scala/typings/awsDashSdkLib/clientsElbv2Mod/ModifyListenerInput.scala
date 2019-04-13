package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyListenerInput extends js.Object {
  /**
    * [HTTPS and TLS listeners] The default SSL server certificate. You must provide exactly one certificate. Set CertificateArn to the certificate ARN but do not set IsDefault. To create a certificate list, use AddListenerCertificates.
    */
  var Certificates: js.UndefOr[CertificateList] = js.undefined
  /**
    * The actions for the default rule. The rule must include one forward action or one or more fixed-response actions. If the action type is forward, you specify a target group. The protocol of the target group must be HTTP or HTTPS for an Application Load Balancer. The protocol of the target group must be TCP or TLS for a Network Load Balancer. [HTTPS listeners] If the action type is authenticate-oidc, you authenticate users through an identity provider that is OpenID Connect (OIDC) compliant. [HTTPS listeners] If the action type is authenticate-cognito, you authenticate users through the user pools supported by Amazon Cognito. [Application Load Balancer] If the action type is redirect, you redirect specified client requests from one URL to another. [Application Load Balancer] If the action type is fixed-response, you drop specified client requests and return a custom HTTP response.
    */
  var DefaultActions: js.UndefOr[Actions] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var ListenerArn: awsDashSdkLib.clientsElbv2Mod.ListenerArn
  /**
    * The port for connections from clients to the load balancer.
    */
  var Port: js.UndefOr[Port] = js.undefined
  /**
    * The protocol for connections from clients to the load balancer. Application Load Balancers support the HTTP and HTTPS protocols. Network Load Balancers support the TCP and TLS protocols.
    */
  var Protocol: js.UndefOr[ProtocolEnum] = js.undefined
  /**
    * [HTTPS and TLS listeners] The security policy that defines which protocols and ciphers are supported. For more information, see Security Policies in the Application Load Balancers Guide.
    */
  var SslPolicy: js.UndefOr[SslPolicyName] = js.undefined
}

object ModifyListenerInput {
  @scala.inline
  def apply(
    ListenerArn: ListenerArn,
    Certificates: CertificateList = null,
    DefaultActions: Actions = null,
    Port: js.UndefOr[Port] = js.undefined,
    Protocol: ProtocolEnum = null,
    SslPolicy: SslPolicyName = null
  ): ModifyListenerInput = {
    val __obj = js.Dynamic.literal(ListenerArn = ListenerArn)
    if (Certificates != null) __obj.updateDynamic("Certificates")(Certificates)
    if (DefaultActions != null) __obj.updateDynamic("DefaultActions")(DefaultActions)
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port)
    if (Protocol != null) __obj.updateDynamic("Protocol")(Protocol.asInstanceOf[js.Any])
    if (SslPolicy != null) __obj.updateDynamic("SslPolicy")(SslPolicy)
    __obj.asInstanceOf[ModifyListenerInput]
  }
}

