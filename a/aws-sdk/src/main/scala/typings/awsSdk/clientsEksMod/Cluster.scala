package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cluster extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the cluster.
    */
  var arn: js.UndefOr[String] = js.undefined
  
  /**
    * The certificate-authority-data for your cluster.
    */
  var certificateAuthority: js.UndefOr[Certificate] = js.undefined
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[String] = js.undefined
  
  /**
    * The configuration used to connect to a cluster for registration.
    */
  var connectorConfig: js.UndefOr[ConnectorConfigResponse] = js.undefined
  
  /**
    * The Unix epoch timestamp in seconds for when the cluster was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The encryption configuration for the cluster.
    */
  var encryptionConfig: js.UndefOr[EncryptionConfigList] = js.undefined
  
  /**
    * The endpoint for your Kubernetes API server.
    */
  var endpoint: js.UndefOr[String] = js.undefined
  
  /**
    * An object representing the health of your local Amazon EKS cluster on an Amazon Web Services Outpost. This object isn't available for clusters on the Amazon Web Services cloud.
    */
  var health: js.UndefOr[ClusterHealth] = js.undefined
  
  /**
    * The ID of your local Amazon EKS cluster on an Amazon Web Services Outpost. This property isn't available for an Amazon EKS cluster on the Amazon Web Services cloud.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The identity provider information for the cluster.
    */
  var identity: js.UndefOr[Identity] = js.undefined
  
  /**
    * The Kubernetes network configuration for the cluster.
    */
  var kubernetesNetworkConfig: js.UndefOr[KubernetesNetworkConfigResponse] = js.undefined
  
  /**
    * The logging configuration for your cluster.
    */
  var logging: js.UndefOr[Logging] = js.undefined
  
  /**
    * The name of the cluster.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * An object representing the configuration of your local Amazon EKS cluster on an Amazon Web Services Outpost. This object isn't available for clusters on the Amazon Web Services cloud.
    */
  var outpostConfig: js.UndefOr[OutpostConfigResponse] = js.undefined
  
  /**
    * The platform version of your Amazon EKS cluster. For more information, see Platform Versions in the  Amazon EKS User Guide .
    */
  var platformVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The VPC configuration used by the cluster control plane. Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more information, see Cluster VPC Considerations and Cluster Security Group Considerations in the Amazon EKS User Guide.
    */
  var resourcesVpcConfig: js.UndefOr[VpcConfigResponse] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes control plane to make calls to Amazon Web Services API operations on your behalf.
    */
  var roleArn: js.UndefOr[String] = js.undefined
  
  /**
    * The current status of the cluster.
    */
  var status: js.UndefOr[ClusterStatus] = js.undefined
  
  /**
    * The metadata that you apply to the cluster to assist with categorization and organization. Each tag consists of a key and an optional value. You define both. Cluster tags do not propagate to any other resources associated with the cluster.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The Kubernetes server version for the cluster.
    */
  var version: js.UndefOr[String] = js.undefined
}
object Cluster {
  
  inline def apply(): Cluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cluster]
  }
  
  extension [Self <: Cluster](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCertificateAuthority(value: Certificate): Self = StObject.set(x, "certificateAuthority", value.asInstanceOf[js.Any])
    
    inline def setCertificateAuthorityUndefined: Self = StObject.set(x, "certificateAuthority", js.undefined)
    
    inline def setClientRequestToken(value: String): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    inline def setConnectorConfig(value: ConnectorConfigResponse): Self = StObject.set(x, "connectorConfig", value.asInstanceOf[js.Any])
    
    inline def setConnectorConfigUndefined: Self = StObject.set(x, "connectorConfig", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setEncryptionConfig(value: EncryptionConfigList): Self = StObject.set(x, "encryptionConfig", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigUndefined: Self = StObject.set(x, "encryptionConfig", js.undefined)
    
    inline def setEncryptionConfigVarargs(value: EncryptionConfig*): Self = StObject.set(x, "encryptionConfig", js.Array(value*))
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setHealth(value: ClusterHealth): Self = StObject.set(x, "health", value.asInstanceOf[js.Any])
    
    inline def setHealthUndefined: Self = StObject.set(x, "health", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIdentity(value: Identity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
    
    inline def setKubernetesNetworkConfig(value: KubernetesNetworkConfigResponse): Self = StObject.set(x, "kubernetesNetworkConfig", value.asInstanceOf[js.Any])
    
    inline def setKubernetesNetworkConfigUndefined: Self = StObject.set(x, "kubernetesNetworkConfig", js.undefined)
    
    inline def setLogging(value: Logging): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOutpostConfig(value: OutpostConfigResponse): Self = StObject.set(x, "outpostConfig", value.asInstanceOf[js.Any])
    
    inline def setOutpostConfigUndefined: Self = StObject.set(x, "outpostConfig", js.undefined)
    
    inline def setPlatformVersion(value: String): Self = StObject.set(x, "platformVersion", value.asInstanceOf[js.Any])
    
    inline def setPlatformVersionUndefined: Self = StObject.set(x, "platformVersion", js.undefined)
    
    inline def setResourcesVpcConfig(value: VpcConfigResponse): Self = StObject.set(x, "resourcesVpcConfig", value.asInstanceOf[js.Any])
    
    inline def setResourcesVpcConfigUndefined: Self = StObject.set(x, "resourcesVpcConfig", js.undefined)
    
    inline def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    inline def setStatus(value: ClusterStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
