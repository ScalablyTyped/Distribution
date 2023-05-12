package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTLSInspectionConfigurationResponse extends StObject {
  
  /**
    * The object that defines a TLS inspection configuration. This, along with TLSInspectionConfigurationResponse, define the TLS inspection configuration. You can retrieve all objects for a TLS inspection configuration by calling DescribeTLSInspectionConfiguration.  Network Firewall uses a TLS inspection configuration to decrypt traffic. Network Firewall re-encrypts the traffic before sending it to its destination. To use a TLS inspection configuration, you add it to a Network Firewall firewall policy, then you apply the firewall policy to a firewall. Network Firewall acts as a proxy service to decrypt and inspect inbound traffic. You can reference a TLS inspection configuration from more than one firewall policy, and you can use a firewall policy in more than one firewall. For more information about using TLS inspection configurations, see Decrypting SSL/TLS traffic with TLS inspection configurations in the Network Firewall Developer Guide.
    */
  var TLSInspectionConfiguration: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.TLSInspectionConfiguration] = js.undefined
  
  /**
    * The high-level properties of a TLS inspection configuration. This, along with the TLSInspectionConfiguration, define the TLS inspection configuration. You can retrieve all objects for a TLS inspection configuration by calling DescribeTLSInspectionConfiguration. 
    */
  var TLSInspectionConfigurationResponse: typings.awsSdk.clientsNetworkfirewallMod.TLSInspectionConfigurationResponse
  
  /**
    * A token used for optimistic locking. Network Firewall returns a token to your requests that access the TLS inspection configuration. The token marks the state of the TLS inspection configuration resource at the time of the request.  To make changes to the TLS inspection configuration, you provide the token in your request. Network Firewall uses the token to ensure that the TLS inspection configuration hasn't changed since you last retrieved it. If it has changed, the operation fails with an InvalidTokenException. If this happens, retrieve the TLS inspection configuration again to get a current copy of it with a current token. Reapply your changes as needed, then try the operation again using the new token. 
    */
  var UpdateToken: typings.awsSdk.clientsNetworkfirewallMod.UpdateToken
}
object DescribeTLSInspectionConfigurationResponse {
  
  inline def apply(TLSInspectionConfigurationResponse: TLSInspectionConfigurationResponse, UpdateToken: UpdateToken): DescribeTLSInspectionConfigurationResponse = {
    val __obj = js.Dynamic.literal(TLSInspectionConfigurationResponse = TLSInspectionConfigurationResponse.asInstanceOf[js.Any], UpdateToken = UpdateToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTLSInspectionConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTLSInspectionConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setTLSInspectionConfiguration(value: TLSInspectionConfiguration): Self = StObject.set(x, "TLSInspectionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setTLSInspectionConfigurationResponse(value: TLSInspectionConfigurationResponse): Self = StObject.set(x, "TLSInspectionConfigurationResponse", value.asInstanceOf[js.Any])
    
    inline def setTLSInspectionConfigurationUndefined: Self = StObject.set(x, "TLSInspectionConfiguration", js.undefined)
    
    inline def setUpdateToken(value: UpdateToken): Self = StObject.set(x, "UpdateToken", value.asInstanceOf[js.Any])
  }
}
