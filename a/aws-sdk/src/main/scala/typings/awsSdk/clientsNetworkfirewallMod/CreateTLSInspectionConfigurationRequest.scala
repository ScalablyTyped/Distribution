package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTLSInspectionConfigurationRequest extends StObject {
  
  /**
    * A description of the TLS inspection configuration. 
    */
  var Description: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.Description] = js.undefined
  
  var EncryptionConfiguration: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.EncryptionConfiguration] = js.undefined
  
  /**
    * The object that defines a TLS inspection configuration. This, along with TLSInspectionConfigurationResponse, define the TLS inspection configuration. You can retrieve all objects for a TLS inspection configuration by calling DescribeTLSInspectionConfiguration.  Network Firewall uses a TLS inspection configuration to decrypt traffic. Network Firewall re-encrypts the traffic before sending it to its destination. To use a TLS inspection configuration, you add it to a Network Firewall firewall policy, then you apply the firewall policy to a firewall. Network Firewall acts as a proxy service to decrypt and inspect inbound traffic. You can reference a TLS inspection configuration from more than one firewall policy, and you can use a firewall policy in more than one firewall. For more information about using TLS inspection configurations, see Decrypting SSL/TLS traffic with TLS inspection configurations in the Network Firewall Developer Guide.
    */
  var TLSInspectionConfiguration: typings.awsSdk.clientsNetworkfirewallMod.TLSInspectionConfiguration
  
  /**
    * The descriptive name of the TLS inspection configuration. You can't change the name of a TLS inspection configuration after you create it.
    */
  var TLSInspectionConfigurationName: ResourceName
  
  /**
    * The key:value pairs to associate with the resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateTLSInspectionConfigurationRequest {
  
  inline def apply(
    TLSInspectionConfiguration: TLSInspectionConfiguration,
    TLSInspectionConfigurationName: ResourceName
  ): CreateTLSInspectionConfigurationRequest = {
    val __obj = js.Dynamic.literal(TLSInspectionConfiguration = TLSInspectionConfiguration.asInstanceOf[js.Any], TLSInspectionConfigurationName = TLSInspectionConfigurationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTLSInspectionConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTLSInspectionConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEncryptionConfiguration(value: EncryptionConfiguration): Self = StObject.set(x, "EncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigurationUndefined: Self = StObject.set(x, "EncryptionConfiguration", js.undefined)
    
    inline def setTLSInspectionConfiguration(value: TLSInspectionConfiguration): Self = StObject.set(x, "TLSInspectionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setTLSInspectionConfigurationName(value: ResourceName): Self = StObject.set(x, "TLSInspectionConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
