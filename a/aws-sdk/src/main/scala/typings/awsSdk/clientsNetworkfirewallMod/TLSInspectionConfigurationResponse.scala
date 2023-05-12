package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TLSInspectionConfigurationResponse extends StObject {
  
  /**
    * A list of the certificates associated with the TLS inspection configuration.
    */
  var Certificates: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.Certificates] = js.undefined
  
  /**
    * A description of the TLS inspection configuration. 
    */
  var Description: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.Description] = js.undefined
  
  /**
    * A complex type that contains the Amazon Web Services KMS encryption configuration settings for your TLS inspection configuration.
    */
  var EncryptionConfiguration: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.EncryptionConfiguration] = js.undefined
  
  /**
    * The last time that the TLS inspection configuration was changed.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The number of firewall policies that use this TLS inspection configuration.
    */
  var NumberOfAssociations: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.NumberOfAssociations] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the TLS inspection configuration.
    */
  var TLSInspectionConfigurationArn: ResourceArn
  
  /**
    * A unique identifier for the TLS inspection configuration. This ID is returned in the responses to create and list commands. You provide it to operations such as update and delete.
    */
  var TLSInspectionConfigurationId: ResourceId
  
  /**
    * The descriptive name of the TLS inspection configuration. You can't change the name of a TLS inspection configuration after you create it.
    */
  var TLSInspectionConfigurationName: ResourceName
  
  /**
    * Detailed information about the current status of a TLSInspectionConfiguration. You can retrieve this for a TLS inspection configuration by calling DescribeTLSInspectionConfiguration and providing the TLS inspection configuration name and ARN.
    */
  var TLSInspectionConfigurationStatus: js.UndefOr[ResourceStatus] = js.undefined
  
  /**
    * The key:value pairs to associate with the resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object TLSInspectionConfigurationResponse {
  
  inline def apply(
    TLSInspectionConfigurationArn: ResourceArn,
    TLSInspectionConfigurationId: ResourceId,
    TLSInspectionConfigurationName: ResourceName
  ): TLSInspectionConfigurationResponse = {
    val __obj = js.Dynamic.literal(TLSInspectionConfigurationArn = TLSInspectionConfigurationArn.asInstanceOf[js.Any], TLSInspectionConfigurationId = TLSInspectionConfigurationId.asInstanceOf[js.Any], TLSInspectionConfigurationName = TLSInspectionConfigurationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TLSInspectionConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TLSInspectionConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setCertificates(value: Certificates): Self = StObject.set(x, "Certificates", value.asInstanceOf[js.Any])
    
    inline def setCertificatesUndefined: Self = StObject.set(x, "Certificates", js.undefined)
    
    inline def setCertificatesVarargs(value: TlsCertificateData*): Self = StObject.set(x, "Certificates", js.Array(value*))
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEncryptionConfiguration(value: EncryptionConfiguration): Self = StObject.set(x, "EncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigurationUndefined: Self = StObject.set(x, "EncryptionConfiguration", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setNumberOfAssociations(value: NumberOfAssociations): Self = StObject.set(x, "NumberOfAssociations", value.asInstanceOf[js.Any])
    
    inline def setNumberOfAssociationsUndefined: Self = StObject.set(x, "NumberOfAssociations", js.undefined)
    
    inline def setTLSInspectionConfigurationArn(value: ResourceArn): Self = StObject.set(x, "TLSInspectionConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setTLSInspectionConfigurationId(value: ResourceId): Self = StObject.set(x, "TLSInspectionConfigurationId", value.asInstanceOf[js.Any])
    
    inline def setTLSInspectionConfigurationName(value: ResourceName): Self = StObject.set(x, "TLSInspectionConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setTLSInspectionConfigurationStatus(value: ResourceStatus): Self = StObject.set(x, "TLSInspectionConfigurationStatus", value.asInstanceOf[js.Any])
    
    inline def setTLSInspectionConfigurationStatusUndefined: Self = StObject.set(x, "TLSInspectionConfigurationStatus", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
