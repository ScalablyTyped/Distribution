package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsOpenSearchServiceDomainDetails extends StObject {
  
  /**
    * IAM policy document that specifies the access policies for the OpenSearch Service domain.
    */
  var AccessPolicies: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Specifies options for fine-grained access control. 
    */
  var AdvancedSecurityOptions: js.UndefOr[AwsOpenSearchServiceDomainAdvancedSecurityOptionsDetails] = js.undefined
  
  /**
    * The ARN of the OpenSearch Service domain.
    */
  var Arn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Details about the configuration of an OpenSearch cluster.
    */
  var ClusterConfig: js.UndefOr[AwsOpenSearchServiceDomainClusterConfigDetails] = js.undefined
  
  /**
    * The domain endpoint.
    */
  var DomainEndpoint: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Additional options for the domain endpoint.
    */
  var DomainEndpointOptions: js.UndefOr[AwsOpenSearchServiceDomainDomainEndpointOptionsDetails] = js.undefined
  
  /**
    * The domain endpoints. Used if the OpenSearch domain resides in a VPC. This is a map of key-value pairs. The key is always vpc. The value is the endpoint.
    */
  var DomainEndpoints: js.UndefOr[FieldMap] = js.undefined
  
  /**
    * The name of the endpoint.
    */
  var DomainName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Details about the configuration for encryption at rest.
    */
  var EncryptionAtRestOptions: js.UndefOr[AwsOpenSearchServiceDomainEncryptionAtRestOptionsDetails] = js.undefined
  
  /**
    * The version of the domain engine.
    */
  var EngineVersion: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the domain.
    */
  var Id: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Configures the CloudWatch Logs to publish for the OpenSearch domain.
    */
  var LogPublishingOptions: js.UndefOr[AwsOpenSearchServiceDomainLogPublishingOptionsDetails] = js.undefined
  
  /**
    * Details about the configuration for node-to-node encryption.
    */
  var NodeToNodeEncryptionOptions: js.UndefOr[AwsOpenSearchServiceDomainNodeToNodeEncryptionOptionsDetails] = js.undefined
  
  /**
    * Information about the status of a domain relative to the latest service software.
    */
  var ServiceSoftwareOptions: js.UndefOr[AwsOpenSearchServiceDomainServiceSoftwareOptionsDetails] = js.undefined
  
  /**
    * Information that OpenSearch Service derives based on VPCOptions for the domain.
    */
  var VpcOptions: js.UndefOr[AwsOpenSearchServiceDomainVpcOptionsDetails] = js.undefined
}
object AwsOpenSearchServiceDomainDetails {
  
  inline def apply(): AwsOpenSearchServiceDomainDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsOpenSearchServiceDomainDetails]
  }
  
  extension [Self <: AwsOpenSearchServiceDomainDetails](x: Self) {
    
    inline def setAccessPolicies(value: NonEmptyString): Self = StObject.set(x, "AccessPolicies", value.asInstanceOf[js.Any])
    
    inline def setAccessPoliciesUndefined: Self = StObject.set(x, "AccessPolicies", js.undefined)
    
    inline def setAdvancedSecurityOptions(value: AwsOpenSearchServiceDomainAdvancedSecurityOptionsDetails): Self = StObject.set(x, "AdvancedSecurityOptions", value.asInstanceOf[js.Any])
    
    inline def setAdvancedSecurityOptionsUndefined: Self = StObject.set(x, "AdvancedSecurityOptions", js.undefined)
    
    inline def setArn(value: NonEmptyString): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setClusterConfig(value: AwsOpenSearchServiceDomainClusterConfigDetails): Self = StObject.set(x, "ClusterConfig", value.asInstanceOf[js.Any])
    
    inline def setClusterConfigUndefined: Self = StObject.set(x, "ClusterConfig", js.undefined)
    
    inline def setDomainEndpoint(value: NonEmptyString): Self = StObject.set(x, "DomainEndpoint", value.asInstanceOf[js.Any])
    
    inline def setDomainEndpointOptions(value: AwsOpenSearchServiceDomainDomainEndpointOptionsDetails): Self = StObject.set(x, "DomainEndpointOptions", value.asInstanceOf[js.Any])
    
    inline def setDomainEndpointOptionsUndefined: Self = StObject.set(x, "DomainEndpointOptions", js.undefined)
    
    inline def setDomainEndpointUndefined: Self = StObject.set(x, "DomainEndpoint", js.undefined)
    
    inline def setDomainEndpoints(value: FieldMap): Self = StObject.set(x, "DomainEndpoints", value.asInstanceOf[js.Any])
    
    inline def setDomainEndpointsUndefined: Self = StObject.set(x, "DomainEndpoints", js.undefined)
    
    inline def setDomainName(value: NonEmptyString): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    inline def setEncryptionAtRestOptions(value: AwsOpenSearchServiceDomainEncryptionAtRestOptionsDetails): Self = StObject.set(x, "EncryptionAtRestOptions", value.asInstanceOf[js.Any])
    
    inline def setEncryptionAtRestOptionsUndefined: Self = StObject.set(x, "EncryptionAtRestOptions", js.undefined)
    
    inline def setEngineVersion(value: NonEmptyString): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setId(value: NonEmptyString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLogPublishingOptions(value: AwsOpenSearchServiceDomainLogPublishingOptionsDetails): Self = StObject.set(x, "LogPublishingOptions", value.asInstanceOf[js.Any])
    
    inline def setLogPublishingOptionsUndefined: Self = StObject.set(x, "LogPublishingOptions", js.undefined)
    
    inline def setNodeToNodeEncryptionOptions(value: AwsOpenSearchServiceDomainNodeToNodeEncryptionOptionsDetails): Self = StObject.set(x, "NodeToNodeEncryptionOptions", value.asInstanceOf[js.Any])
    
    inline def setNodeToNodeEncryptionOptionsUndefined: Self = StObject.set(x, "NodeToNodeEncryptionOptions", js.undefined)
    
    inline def setServiceSoftwareOptions(value: AwsOpenSearchServiceDomainServiceSoftwareOptionsDetails): Self = StObject.set(x, "ServiceSoftwareOptions", value.asInstanceOf[js.Any])
    
    inline def setServiceSoftwareOptionsUndefined: Self = StObject.set(x, "ServiceSoftwareOptions", js.undefined)
    
    inline def setVpcOptions(value: AwsOpenSearchServiceDomainVpcOptionsDetails): Self = StObject.set(x, "VpcOptions", value.asInstanceOf[js.Any])
    
    inline def setVpcOptionsUndefined: Self = StObject.set(x, "VpcOptions", js.undefined)
  }
}
