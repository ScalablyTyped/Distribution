package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTLSInspectionConfigurationRequest extends StObject {
  
  /**
    * A description of the TLS inspection configuration. 
    */
  var Description: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.Description] = js.undefined
  
  /**
    * A complex type that contains the Amazon Web Services KMS encryption configuration settings for your TLS inspection configuration.
    */
  var EncryptionConfiguration: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.EncryptionConfiguration] = js.undefined
  
  /**
    * The object that defines a TLS inspection configuration. This, along with TLSInspectionConfigurationResponse, define the TLS inspection configuration. You can retrieve all objects for a TLS inspection configuration by calling DescribeTLSInspectionConfiguration.  Network Firewall uses a TLS inspection configuration to decrypt traffic. Network Firewall re-encrypts the traffic before sending it to its destination. To use a TLS inspection configuration, you add it to a Network Firewall firewall policy, then you apply the firewall policy to a firewall. Network Firewall acts as a proxy service to decrypt and inspect inbound traffic. You can reference a TLS inspection configuration from more than one firewall policy, and you can use a firewall policy in more than one firewall. For more information about using TLS inspection configurations, see Decrypting SSL/TLS traffic with TLS inspection configurations in the Network Firewall Developer Guide.
    */
  var TLSInspectionConfiguration: typings.awsSdk.clientsNetworkfirewallMod.TLSInspectionConfiguration
  
  /**
    * The Amazon Resource Name (ARN) of the TLS inspection configuration.
    */
  var TLSInspectionConfigurationArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The descriptive name of the TLS inspection configuration. You can't change the name of a TLS inspection configuration after you create it.
    */
  var TLSInspectionConfigurationName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * A token used for optimistic locking. Network Firewall returns a token to your requests that access the TLS inspection configuration. The token marks the state of the TLS inspection configuration resource at the time of the request.  To make changes to the TLS inspection configuration, you provide the token in your request. Network Firewall uses the token to ensure that the TLS inspection configuration hasn't changed since you last retrieved it. If it has changed, the operation fails with an InvalidTokenException. If this happens, retrieve the TLS inspection configuration again to get a current copy of it with a current token. Reapply your changes as needed, then try the operation again using the new token. 
    */
  var UpdateToken: typings.awsSdk.clientsNetworkfirewallMod.UpdateToken
}
object UpdateTLSInspectionConfigurationRequest {
  
  inline def apply(TLSInspectionConfiguration: TLSInspectionConfiguration, UpdateToken: UpdateToken): UpdateTLSInspectionConfigurationRequest = {
    val __obj = js.Dynamic.literal(TLSInspectionConfiguration = TLSInspectionConfiguration.asInstanceOf[js.Any], UpdateToken = UpdateToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTLSInspectionConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateTLSInspectionConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEncryptionConfiguration(value: EncryptionConfiguration): Self = StObject.set(x, "EncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigurationUndefined: Self = StObject.set(x, "EncryptionConfiguration", js.undefined)
    
    inline def setTLSInspectionConfiguration(value: TLSInspectionConfiguration): Self = StObject.set(x, "TLSInspectionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setTLSInspectionConfigurationArn(value: ResourceArn): Self = StObject.set(x, "TLSInspectionConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setTLSInspectionConfigurationArnUndefined: Self = StObject.set(x, "TLSInspectionConfigurationArn", js.undefined)
    
    inline def setTLSInspectionConfigurationName(value: ResourceName): Self = StObject.set(x, "TLSInspectionConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setTLSInspectionConfigurationNameUndefined: Self = StObject.set(x, "TLSInspectionConfigurationName", js.undefined)
    
    inline def setUpdateToken(value: UpdateToken): Self = StObject.set(x, "UpdateToken", value.asInstanceOf[js.Any])
  }
}
