package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyListenerInput extends StObject {
  
  /**
    * [TLS listeners] The name of the Application-Layer Protocol Negotiation (ALPN) policy. You can specify one policy name. The following are the possible values:    HTTP1Only     HTTP2Only     HTTP2Optional     HTTP2Preferred     None    For more information, see ALPN policies in the Network Load Balancers Guide.
    */
  var AlpnPolicy: js.UndefOr[AlpnPolicyName] = js.undefined
  
  /**
    * [HTTPS and TLS listeners] The default certificate for the listener. You must provide exactly one certificate. Set CertificateArn to the certificate ARN but do not set IsDefault.
    */
  var Certificates: js.UndefOr[CertificateList] = js.undefined
  
  /**
    * The actions for the default rule.
    */
  var DefaultActions: js.UndefOr[Actions] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var ListenerArn: typings.awsSdk.clientsElbv2Mod.ListenerArn
  
  /**
    * The port for connections from clients to the load balancer. You cannot specify a port for a Gateway Load Balancer.
    */
  var Port: js.UndefOr[typings.awsSdk.clientsElbv2Mod.Port] = js.undefined
  
  /**
    * The protocol for connections from clients to the load balancer. Application Load Balancers support the HTTP and HTTPS protocols. Network Load Balancers support the TCP, TLS, UDP, and TCP_UDP protocols. You can’t change the protocol to UDP or TCP_UDP if dual-stack mode is enabled. You cannot specify a protocol for a Gateway Load Balancer.
    */
  var Protocol: js.UndefOr[ProtocolEnum] = js.undefined
  
  /**
    * [HTTPS and TLS listeners] The security policy that defines which protocols and ciphers are supported. For more information, see Security policies in the Application Load Balancers Guide or Security policies in the Network Load Balancers Guide.
    */
  var SslPolicy: js.UndefOr[SslPolicyName] = js.undefined
}
object ModifyListenerInput {
  
  inline def apply(ListenerArn: ListenerArn): ModifyListenerInput = {
    val __obj = js.Dynamic.literal(ListenerArn = ListenerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyListenerInput]
  }
  
  extension [Self <: ModifyListenerInput](x: Self) {
    
    inline def setAlpnPolicy(value: AlpnPolicyName): Self = StObject.set(x, "AlpnPolicy", value.asInstanceOf[js.Any])
    
    inline def setAlpnPolicyUndefined: Self = StObject.set(x, "AlpnPolicy", js.undefined)
    
    inline def setAlpnPolicyVarargs(value: AlpnPolicyValue*): Self = StObject.set(x, "AlpnPolicy", js.Array(value*))
    
    inline def setCertificates(value: CertificateList): Self = StObject.set(x, "Certificates", value.asInstanceOf[js.Any])
    
    inline def setCertificatesUndefined: Self = StObject.set(x, "Certificates", js.undefined)
    
    inline def setCertificatesVarargs(value: Certificate*): Self = StObject.set(x, "Certificates", js.Array(value*))
    
    inline def setDefaultActions(value: Actions): Self = StObject.set(x, "DefaultActions", value.asInstanceOf[js.Any])
    
    inline def setDefaultActionsUndefined: Self = StObject.set(x, "DefaultActions", js.undefined)
    
    inline def setDefaultActionsVarargs(value: Action*): Self = StObject.set(x, "DefaultActions", js.Array(value*))
    
    inline def setListenerArn(value: ListenerArn): Self = StObject.set(x, "ListenerArn", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Port): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setProtocol(value: ProtocolEnum): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    inline def setSslPolicy(value: SslPolicyName): Self = StObject.set(x, "SslPolicy", value.asInstanceOf[js.Any])
    
    inline def setSslPolicyUndefined: Self = StObject.set(x, "SslPolicy", js.undefined)
  }
}
