package typings
package awsDashSdkLib.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/es", "ES")
@js.native
object ESNs extends js.Object {
  
  trait AccessPoliciesStatus extends js.Object {
    /**
         * The access policy configured for the Elasticsearch domain. Access policies may be resource-based, IP-based, or IAM-based. See  Configuring Access Policiesfor more information.
         */
    var Options: PolicyDocument
    /**
         * The status of the access policy for the Elasticsearch domain. See OptionStatus for the status information that's included. 
         */
    var Status: OptionStatus
  }
  
  
  trait AddTagsRequest extends js.Object {
    /**
         *  Specify the ARN for which you want to add the tags.
         */
    var ARN: ARN
    /**
         *  List of Tag that need to be added for the Elasticsearch domain. 
         */
    var TagList: TagList
  }
  
  
  trait AdditionalLimit extends js.Object {
    /**
         *  Name of Additional Limit is specific to a given InstanceType and for each of it's  InstanceRole  etc.  Attributes and their details:   MaximumNumberOfDataNodesSupported This attribute will be present in Master node only to specify how much data nodes upto which given  ESPartitionInstanceType  can support as master node. MaximumNumberOfDataNodesWithoutMasterNode This attribute will be present in Data node only to specify how much data nodes of given  ESPartitionInstanceType  upto which you don't need any master nodes to govern them.  
         */
    var LimitName: js.UndefOr[LimitName] = js.undefined
    /**
         *  Value for given  AdditionalLimit$LimitName  . 
         */
    var LimitValues: js.UndefOr[LimitValueList] = js.undefined
  }
  
  
  trait AdvancedOptions
    extends /* key */ ScalablyTyped.runtime.StringDictionary[java.lang.String]
  
  
  trait AdvancedOptionsStatus extends js.Object {
    /**
         *  Specifies the status of advanced options for the specified Elasticsearch domain.
         */
    var Options: AdvancedOptions
    /**
         *  Specifies the status of OptionStatus for advanced options for the specified Elasticsearch domain.
         */
    var Status: OptionStatus
  }
  
  
  trait CancelElasticsearchServiceSoftwareUpdateRequest extends js.Object {
    /**
         * The name of the domain that you want to stop the latest service software update on.
         */
    var DomainName: DomainName
  }
  
  
  trait CancelElasticsearchServiceSoftwareUpdateResponse extends js.Object {
    /**
         * The current status of the Elasticsearch service software update.
         */
    var ServiceSoftwareOptions: js.UndefOr[ServiceSoftwareOptions] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait CognitoOptions extends js.Object {
    /**
         * Specifies the option to enable Cognito for Kibana authentication.
         */
    var Enabled: js.UndefOr[scala.Boolean] = js.undefined
    /**
         * Specifies the Cognito identity pool ID for Kibana authentication.
         */
    var IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined
    /**
         * Specifies the role ARN that provides Elasticsearch permissions for accessing Cognito resources.
         */
    var RoleArn: js.UndefOr[RoleArn] = js.undefined
    /**
         * Specifies the Cognito user pool ID for Kibana authentication.
         */
    var UserPoolId: js.UndefOr[UserPoolId] = js.undefined
  }
  
  
  trait CognitoOptionsStatus extends js.Object {
    /**
         * Specifies the Cognito options for the specified Elasticsearch domain.
         */
    var Options: CognitoOptions
    /**
         * Specifies the status of the Cognito options for the specified Elasticsearch domain.
         */
    var Status: OptionStatus
  }
  
  
  trait CompatibleVersionsMap extends js.Object {
    /**
         * The current version of Elasticsearch on which a domain is.
         */
    var SourceVersion: js.UndefOr[ElasticsearchVersionString] = js.undefined
    var TargetVersions: js.UndefOr[ElasticsearchVersionList] = js.undefined
  }
  
  
  trait CreateElasticsearchDomainRequest extends js.Object {
    /**
         *  IAM access policy as a JSON-formatted string.
         */
    var AccessPolicies: js.UndefOr[PolicyDocument] = js.undefined
    /**
         *  Option to allow references to indices in an HTTP request body. Must be false when configuring access to individual sub-resources. By default, the value is true. See Configuration Advanced Options for more information.
         */
    var AdvancedOptions: js.UndefOr[AdvancedOptions] = js.undefined
    /**
         * Options to specify the Cognito user and identity pools for Kibana authentication. For more information, see Amazon Cognito Authentication for Kibana.
         */
    var CognitoOptions: js.UndefOr[CognitoOptions] = js.undefined
    /**
         * The name of the Elasticsearch domain that you are creating. Domain names are unique across the domains owned by an account within an AWS region. Domain names must start with a letter or number and can contain the following characters: a-z (lowercase), 0-9, and - (hyphen).
         */
    var DomainName: DomainName
    /**
         * Options to enable, disable and specify the type and size of EBS storage volumes. 
         */
    var EBSOptions: js.UndefOr[EBSOptions] = js.undefined
    /**
         * Configuration options for an Elasticsearch domain. Specifies the instance type and number of instances in the domain cluster. 
         */
    var ElasticsearchClusterConfig: js.UndefOr[ElasticsearchClusterConfig] = js.undefined
    /**
         * String of format X.Y to specify version for the Elasticsearch domain eg. "1.5" or "2.3". For more information, see Creating Elasticsearch Domains in the Amazon Elasticsearch Service Developer Guide.
         */
    var ElasticsearchVersion: js.UndefOr[ElasticsearchVersionString] = js.undefined
    /**
         * Specifies the Encryption At Rest Options.
         */
    var EncryptionAtRestOptions: js.UndefOr[EncryptionAtRestOptions] = js.undefined
    /**
         * Map of LogType and LogPublishingOption, each containing options to publish a given type of Elasticsearch log.
         */
    var LogPublishingOptions: js.UndefOr[LogPublishingOptions] = js.undefined
    /**
         * Specifies the NodeToNodeEncryptionOptions.
         */
    var NodeToNodeEncryptionOptions: js.UndefOr[NodeToNodeEncryptionOptions] = js.undefined
    /**
         * Option to set time, in UTC format, of the daily automated snapshot. Default value is 0 hours. 
         */
    var SnapshotOptions: js.UndefOr[SnapshotOptions] = js.undefined
    /**
         * Options to specify the subnets and security groups for VPC endpoint. For more information, see Creating a VPC in VPC Endpoints for Amazon Elasticsearch Service Domains
         */
    var VPCOptions: js.UndefOr[VPCOptions] = js.undefined
  }
  
  
  trait CreateElasticsearchDomainResponse extends js.Object {
    /**
         * The status of the newly created Elasticsearch domain. 
         */
    var DomainStatus: js.UndefOr[ElasticsearchDomainStatus] = js.undefined
  }
  
  
  trait DeleteElasticsearchDomainRequest extends js.Object {
    /**
         * The name of the Elasticsearch domain that you want to permanently delete.
         */
    var DomainName: DomainName
  }
  
  
  trait DeleteElasticsearchDomainResponse extends js.Object {
    /**
         * The status of the Elasticsearch domain being deleted.
         */
    var DomainStatus: js.UndefOr[ElasticsearchDomainStatus] = js.undefined
  }
  
  
  trait DescribeElasticsearchDomainConfigRequest extends js.Object {
    /**
         * The Elasticsearch domain that you want to get information about.
         */
    var DomainName: DomainName
  }
  
  
  trait DescribeElasticsearchDomainConfigResponse extends js.Object {
    /**
         * The configuration information of the domain requested in the DescribeElasticsearchDomainConfig request.
         */
    var DomainConfig: ElasticsearchDomainConfig
  }
  
  
  trait DescribeElasticsearchDomainRequest extends js.Object {
    /**
         * The name of the Elasticsearch domain for which you want information.
         */
    var DomainName: DomainName
  }
  
  
  trait DescribeElasticsearchDomainResponse extends js.Object {
    /**
         * The current status of the Elasticsearch domain.
         */
    var DomainStatus: ElasticsearchDomainStatus
  }
  
  
  trait DescribeElasticsearchDomainsRequest extends js.Object {
    /**
         * The Elasticsearch domains for which you want information.
         */
    var DomainNames: DomainNameList
  }
  
  
  trait DescribeElasticsearchDomainsResponse extends js.Object {
    /**
         * The status of the domains requested in the DescribeElasticsearchDomains request.
         */
    var DomainStatusList: ElasticsearchDomainStatusList
  }
  
  
  trait DescribeElasticsearchInstanceTypeLimitsRequest extends js.Object {
    /**
         *  DomainName represents the name of the Domain that we are trying to modify. This should be present only if we are querying for Elasticsearch  Limits  for existing domain. 
         */
    var DomainName: js.UndefOr[DomainName] = js.undefined
    /**
         *  Version of Elasticsearch for which  Limits  are needed. 
         */
    var ElasticsearchVersion: ElasticsearchVersionString
    /**
         *  The instance type for an Elasticsearch cluster for which Elasticsearch  Limits  are needed. 
         */
    var InstanceType: ESPartitionInstanceType
  }
  
  
  trait DescribeElasticsearchInstanceTypeLimitsResponse extends js.Object {
    var LimitsByRole: js.UndefOr[LimitsByRole] = js.undefined
  }
  
  
  trait DescribeReservedElasticsearchInstanceOfferingsRequest extends js.Object {
    /**
         * Set this value to limit the number of results returned. If not specified, defaults to 100.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * NextToken should be sent in case if earlier API call produced result containing NextToken. It is used for pagination.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The offering identifier filter value. Use this parameter to show only the available offering that matches the specified reservation identifier.
         */
    var ReservedElasticsearchInstanceOfferingId: js.UndefOr[GUID] = js.undefined
  }
  
  
  trait DescribeReservedElasticsearchInstanceOfferingsResponse extends js.Object {
    /**
         * Provides an identifier to allow retrieval of paginated results.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * List of reserved Elasticsearch instance offerings
         */
    var ReservedElasticsearchInstanceOfferings: js.UndefOr[ReservedElasticsearchInstanceOfferingList] = js.undefined
  }
  
  
  trait DescribeReservedElasticsearchInstancesRequest extends js.Object {
    /**
         * Set this value to limit the number of results returned. If not specified, defaults to 100.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * NextToken should be sent in case if earlier API call produced result containing NextToken. It is used for pagination.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The reserved instance identifier filter value. Use this parameter to show only the reservation that matches the specified reserved Elasticsearch instance ID.
         */
    var ReservedElasticsearchInstanceId: js.UndefOr[GUID] = js.undefined
  }
  
  
  trait DescribeReservedElasticsearchInstancesResponse extends js.Object {
    /**
         * Provides an identifier to allow retrieval of paginated results.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
    /**
         * List of reserved Elasticsearch instances.
         */
    var ReservedElasticsearchInstances: js.UndefOr[ReservedElasticsearchInstanceList] = js.undefined
  }
  
  
  trait DomainInfo extends js.Object {
    /**
         *  Specifies the DomainName.
         */
    var DomainName: js.UndefOr[DomainName] = js.undefined
  }
  
  
  trait EBSOptions extends js.Object {
    /**
         * Specifies whether EBS-based storage is enabled.
         */
    var EBSEnabled: js.UndefOr[scala.Boolean] = js.undefined
    /**
         * Specifies the IOPD for a Provisioned IOPS EBS volume (SSD).
         */
    var Iops: js.UndefOr[IntegerClass] = js.undefined
    /**
         *  Integer to specify the size of an EBS volume.
         */
    var VolumeSize: js.UndefOr[IntegerClass] = js.undefined
    /**
         *  Specifies the volume type for EBS-based storage.
         */
    var VolumeType: js.UndefOr[VolumeType] = js.undefined
  }
  
  
  trait EBSOptionsStatus extends js.Object {
    /**
         *  Specifies the EBS options for the specified Elasticsearch domain.
         */
    var Options: EBSOptions
    /**
         *  Specifies the status of the EBS options for the specified Elasticsearch domain.
         */
    var Status: OptionStatus
  }
  
  
  trait ElasticsearchClusterConfig extends js.Object {
    /**
         * Total number of dedicated master nodes, active and on standby, for the cluster.
         */
    var DedicatedMasterCount: js.UndefOr[IntegerClass] = js.undefined
    /**
         * A boolean value to indicate whether a dedicated master node is enabled. See About Dedicated Master Nodes for more information.
         */
    var DedicatedMasterEnabled: js.UndefOr[scala.Boolean] = js.undefined
    /**
         * The instance type for a dedicated master node.
         */
    var DedicatedMasterType: js.UndefOr[ESPartitionInstanceType] = js.undefined
    /**
         * The number of instances in the specified domain cluster.
         */
    var InstanceCount: js.UndefOr[IntegerClass] = js.undefined
    /**
         * The instance type for an Elasticsearch cluster.
         */
    var InstanceType: js.UndefOr[ESPartitionInstanceType] = js.undefined
    /**
         * A boolean value to indicate whether zone awareness is enabled. See About Zone Awareness for more information.
         */
    var ZoneAwarenessEnabled: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  
  trait ElasticsearchClusterConfigStatus extends js.Object {
    /**
         *  Specifies the cluster configuration for the specified Elasticsearch domain.
         */
    var Options: ElasticsearchClusterConfig
    /**
         *  Specifies the status of the configuration for the specified Elasticsearch domain.
         */
    var Status: OptionStatus
  }
  
  
  trait ElasticsearchDomainConfig extends js.Object {
    /**
         * IAM access policy as a JSON-formatted string.
         */
    var AccessPolicies: js.UndefOr[AccessPoliciesStatus] = js.undefined
    /**
         * Specifies the AdvancedOptions for the domain. See Configuring Advanced Options for more information.
         */
    var AdvancedOptions: js.UndefOr[AdvancedOptionsStatus] = js.undefined
    /**
         * The CognitoOptions for the specified domain. For more information, see Amazon Cognito Authentication for Kibana.
         */
    var CognitoOptions: js.UndefOr[CognitoOptionsStatus] = js.undefined
    /**
         * Specifies the EBSOptions for the Elasticsearch domain.
         */
    var EBSOptions: js.UndefOr[EBSOptionsStatus] = js.undefined
    /**
         * Specifies the ElasticsearchClusterConfig for the Elasticsearch domain.
         */
    var ElasticsearchClusterConfig: js.UndefOr[ElasticsearchClusterConfigStatus] = js.undefined
    /**
         * String of format X.Y to specify version for the Elasticsearch domain.
         */
    var ElasticsearchVersion: js.UndefOr[ElasticsearchVersionStatus] = js.undefined
    /**
         * Specifies the EncryptionAtRestOptions for the Elasticsearch domain.
         */
    var EncryptionAtRestOptions: js.UndefOr[EncryptionAtRestOptionsStatus] = js.undefined
    /**
         * Log publishing options for the given domain.
         */
    var LogPublishingOptions: js.UndefOr[LogPublishingOptionsStatus] = js.undefined
    /**
         * Specifies the NodeToNodeEncryptionOptions for the Elasticsearch domain.
         */
    var NodeToNodeEncryptionOptions: js.UndefOr[NodeToNodeEncryptionOptionsStatus] = js.undefined
    /**
         * Specifies the SnapshotOptions for the Elasticsearch domain.
         */
    var SnapshotOptions: js.UndefOr[SnapshotOptionsStatus] = js.undefined
    /**
         * The VPCOptions for the specified domain. For more information, see VPC Endpoints for Amazon Elasticsearch Service Domains.
         */
    var VPCOptions: js.UndefOr[VPCDerivedInfoStatus] = js.undefined
  }
  
  
  trait ElasticsearchDomainStatus extends js.Object {
    /**
         * The Amazon resource name (ARN) of an Elasticsearch domain. See Identifiers for IAM Entities in Using AWS Identity and Access Management for more information.
         */
    var ARN: ARN
    /**
         *  IAM access policy as a JSON-formatted string.
         */
    var AccessPolicies: js.UndefOr[PolicyDocument] = js.undefined
    /**
         * Specifies the status of the AdvancedOptions
         */
    var AdvancedOptions: js.UndefOr[AdvancedOptions] = js.undefined
    /**
         * The CognitoOptions for the specified domain. For more information, see Amazon Cognito Authentication for Kibana.
         */
    var CognitoOptions: js.UndefOr[CognitoOptions] = js.undefined
    /**
         * The domain creation status. True if the creation of an Elasticsearch domain is complete. False if domain creation is still in progress.
         */
    var Created: js.UndefOr[scala.Boolean] = js.undefined
    /**
         * The domain deletion status. True if a delete request has been received for the domain but resource cleanup is still in progress. False if the domain has not been deleted. Once domain deletion is complete, the status of the domain is no longer returned.
         */
    var Deleted: js.UndefOr[scala.Boolean] = js.undefined
    /**
         * The unique identifier for the specified Elasticsearch domain.
         */
    var DomainId: DomainId
    /**
         * The name of an Elasticsearch domain. Domain names are unique across the domains owned by an account within an AWS region. Domain names start with a letter or number and can contain the following characters: a-z (lowercase), 0-9, and - (hyphen).
         */
    var DomainName: DomainName
    /**
         * The EBSOptions for the specified domain. See Configuring EBS-based Storage for more information.
         */
    var EBSOptions: js.UndefOr[EBSOptions] = js.undefined
    /**
         * The type and number of instances in the domain cluster.
         */
    var ElasticsearchClusterConfig: ElasticsearchClusterConfig
    var ElasticsearchVersion: js.UndefOr[ElasticsearchVersionString] = js.undefined
    /**
         *  Specifies the status of the EncryptionAtRestOptions.
         */
    var EncryptionAtRestOptions: js.UndefOr[EncryptionAtRestOptions] = js.undefined
    /**
         * The Elasticsearch domain endpoint that you use to submit index and search requests.
         */
    var Endpoint: js.UndefOr[ServiceUrl] = js.undefined
    /**
         * Map containing the Elasticsearch domain endpoints used to submit index and search requests. Example key, value: 'vpc','vpc-endpoint-h2dsd34efgyghrtguk5gt6j2foh4.us-east-1.es.amazonaws.com'.
         */
    var Endpoints: js.UndefOr[EndpointsMap] = js.undefined
    /**
         * Log publishing options for the given domain.
         */
    var LogPublishingOptions: js.UndefOr[LogPublishingOptions] = js.undefined
    /**
         * Specifies the status of the NodeToNodeEncryptionOptions.
         */
    var NodeToNodeEncryptionOptions: js.UndefOr[NodeToNodeEncryptionOptions] = js.undefined
    /**
         * The status of the Elasticsearch domain configuration. True if Amazon Elasticsearch Service is processing configuration changes. False if the configuration is active.
         */
    var Processing: js.UndefOr[scala.Boolean] = js.undefined
    /**
         * The current status of the Elasticsearch domain's service software.
         */
    var ServiceSoftwareOptions: js.UndefOr[ServiceSoftwareOptions] = js.undefined
    /**
         * Specifies the status of the SnapshotOptions
         */
    var SnapshotOptions: js.UndefOr[SnapshotOptions] = js.undefined
    /**
         * The status of an Elasticsearch domain version upgrade. True if Amazon Elasticsearch Service is undergoing a version upgrade. False if the configuration is active.
         */
    var UpgradeProcessing: js.UndefOr[scala.Boolean] = js.undefined
    /**
         * The VPCOptions for the specified domain. For more information, see VPC Endpoints for Amazon Elasticsearch Service Domains.
         */
    var VPCOptions: js.UndefOr[VPCDerivedInfo] = js.undefined
  }
  
  
  trait ElasticsearchVersionStatus extends js.Object {
    /**
         *  Specifies the Elasticsearch version for the specified Elasticsearch domain.
         */
    var Options: ElasticsearchVersionString
    /**
         *  Specifies the status of the Elasticsearch version options for the specified Elasticsearch domain.
         */
    var Status: OptionStatus
  }
  
  
  trait EncryptionAtRestOptions extends js.Object {
    /**
         * Specifies the option to enable Encryption At Rest.
         */
    var Enabled: js.UndefOr[scala.Boolean] = js.undefined
    /**
         *  Specifies the KMS Key ID for Encryption At Rest options.
         */
    var KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  }
  
  
  trait EncryptionAtRestOptionsStatus extends js.Object {
    /**
         *  Specifies the Encryption At Rest options for the specified Elasticsearch domain.
         */
    var Options: EncryptionAtRestOptions
    /**
         *  Specifies the status of the Encryption At Rest options for the specified Elasticsearch domain.
         */
    var Status: OptionStatus
  }
  
  
  trait EndpointsMap
    extends /* key */ ScalablyTyped.runtime.StringDictionary[ServiceUrl]
  
  
  trait GetCompatibleElasticsearchVersionsRequest extends js.Object {
    var DomainName: js.UndefOr[DomainName] = js.undefined
  }
  
  
  trait GetCompatibleElasticsearchVersionsResponse extends js.Object {
    /**
         *  A map of compatible Elasticsearch versions returned as part of the  GetCompatibleElasticsearchVersions  operation. 
         */
    var CompatibleElasticsearchVersions: js.UndefOr[CompatibleElasticsearchVersionsList] = js.undefined
  }
  
  
  trait GetUpgradeHistoryRequest extends js.Object {
    var DomainName: DomainName
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait GetUpgradeHistoryResponse extends js.Object {
    /**
         * Pagination token that needs to be supplied to the next call to get the next page of results
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
    /**
         *  A list of  UpgradeHistory  objects corresponding to each Upgrade or Upgrade Eligibility Check performed on a domain returned as part of  GetUpgradeHistoryResponse  object. 
         */
    var UpgradeHistories: js.UndefOr[UpgradeHistoryList] = js.undefined
  }
  
  
  trait GetUpgradeStatusRequest extends js.Object {
    var DomainName: DomainName
  }
  
  
  trait GetUpgradeStatusResponse extends js.Object {
    /**
         *  One of 4 statuses that a step can go through returned as part of the  GetUpgradeStatusResponse  object. The status can take one of the following values:  In Progress Succeeded Succeeded with Issues Failed  
         */
    var StepStatus: js.UndefOr[UpgradeStatus] = js.undefined
    /**
         * A string that describes the update briefly
         */
    var UpgradeName: js.UndefOr[UpgradeName] = js.undefined
    /**
         *  Represents one of 3 steps that an Upgrade or Upgrade Eligibility Check does through:  PreUpgradeCheck Snapshot Upgrade  
         */
    var UpgradeStep: js.UndefOr[UpgradeStep] = js.undefined
  }
  
  
  trait InstanceCountLimits extends js.Object {
    var MaximumInstanceCount: js.UndefOr[MaximumInstanceCount] = js.undefined
    var MinimumInstanceCount: js.UndefOr[MinimumInstanceCount] = js.undefined
  }
  
  
  trait InstanceLimits extends js.Object {
    var InstanceCountLimits: js.UndefOr[InstanceCountLimits] = js.undefined
  }
  
  
  trait Limits extends js.Object {
    /**
         *  List of additional limits that are specific to a given InstanceType and for each of it's  InstanceRole  . 
         */
    var AdditionalLimits: js.UndefOr[AdditionalLimitList] = js.undefined
    var InstanceLimits: js.UndefOr[InstanceLimits] = js.undefined
    /**
         * StorageType represents the list of storage related types and attributes that are available for given InstanceType. 
         */
    var StorageTypes: js.UndefOr[StorageTypeList] = js.undefined
  }
  
  
  trait LimitsByRole
    extends /* key */ ScalablyTyped.runtime.StringDictionary[Limits]
  
  
  trait ListDomainNamesResponse extends js.Object {
    /**
         * List of Elasticsearch domain names.
         */
    var DomainNames: js.UndefOr[DomainInfoList] = js.undefined
  }
  
  
  trait ListElasticsearchInstanceTypesRequest extends js.Object {
    /**
         * DomainName represents the name of the Domain that we are trying to modify. This should be present only if we are querying for list of available Elasticsearch instance types when modifying existing domain. 
         */
    var DomainName: js.UndefOr[DomainName] = js.undefined
    /**
         * Version of Elasticsearch for which list of supported elasticsearch instance types are needed. 
         */
    var ElasticsearchVersion: ElasticsearchVersionString
    /**
         *  Set this value to limit the number of results returned. Value provided must be greater than 30 else it wont be honored. 
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * NextToken should be sent in case if earlier API call produced result containing NextToken. It is used for pagination. 
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListElasticsearchInstanceTypesResponse extends js.Object {
    /**
         *  List of instance types supported by Amazon Elasticsearch service for given  ElasticsearchVersion  
         */
    var ElasticsearchInstanceTypes: js.UndefOr[ElasticsearchInstanceTypeList] = js.undefined
    /**
         * In case if there are more results available NextToken would be present, make further request to the same API with received NextToken to paginate remaining results. 
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListElasticsearchVersionsRequest extends js.Object {
    /**
         *  Set this value to limit the number of results returned. Value provided must be greater than 10 else it wont be honored. 
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListElasticsearchVersionsResponse extends js.Object {
    var ElasticsearchVersions: js.UndefOr[ElasticsearchVersionList] = js.undefined
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListTagsRequest extends js.Object {
    /**
         *  Specify the ARN for the Elasticsearch domain to which the tags are attached that you want to view.
         */
    var ARN: ARN
  }
  
  
  trait ListTagsResponse extends js.Object {
    /**
         *  List of Tag for the requested Elasticsearch domain.
         */
    var TagList: js.UndefOr[TagList] = js.undefined
  }
  
  
  trait LogPublishingOption extends js.Object {
    var CloudWatchLogsLogGroupArn: js.UndefOr[CloudWatchLogsLogGroupArn] = js.undefined
    /**
         *  Specifies whether given log publishing option is enabled or not.
         */
    var Enabled: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  
  trait LogPublishingOptions
    extends /* key */ ScalablyTyped.runtime.StringDictionary[LogPublishingOption]
  
  
  trait LogPublishingOptionsStatus extends js.Object {
    /**
         * The log publishing options configured for the Elasticsearch domain.
         */
    var Options: js.UndefOr[LogPublishingOptions] = js.undefined
    /**
         * The status of the log publishing options for the Elasticsearch domain. See OptionStatus for the status information that's included. 
         */
    var Status: js.UndefOr[OptionStatus] = js.undefined
  }
  
  
  trait NodeToNodeEncryptionOptions extends js.Object {
    /**
         * Specify true to enable node-to-node encryption.
         */
    var Enabled: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  
  trait NodeToNodeEncryptionOptionsStatus extends js.Object {
    /**
         * Specifies the node-to-node encryption options for the specified Elasticsearch domain.
         */
    var Options: NodeToNodeEncryptionOptions
    /**
         * Specifies the status of the node-to-node encryption options for the specified Elasticsearch domain.
         */
    var Status: OptionStatus
  }
  
  
  trait OptionStatus extends js.Object {
    /**
         * Timestamp which tells the creation date for the entity.
         */
    var CreationDate: UpdateTimestamp
    /**
         * Indicates whether the Elasticsearch domain is being deleted.
         */
    var PendingDeletion: js.UndefOr[scala.Boolean] = js.undefined
    /**
         * Provides the OptionState for the Elasticsearch domain.
         */
    var State: OptionState
    /**
         * Timestamp which tells the last updated time for the entity.
         */
    var UpdateDate: UpdateTimestamp
    /**
         * Specifies the latest version for the entity.
         */
    var UpdateVersion: js.UndefOr[UIntValue] = js.undefined
  }
  
  
  trait PurchaseReservedElasticsearchInstanceOfferingRequest extends js.Object {
    /**
         * The number of Elasticsearch instances to reserve.
         */
    var InstanceCount: js.UndefOr[InstanceCount] = js.undefined
    /**
         * A customer-specified identifier to track this reservation.
         */
    var ReservationName: ReservationToken
    /**
         * The ID of the reserved Elasticsearch instance offering to purchase.
         */
    var ReservedElasticsearchInstanceOfferingId: GUID
  }
  
  
  trait PurchaseReservedElasticsearchInstanceOfferingResponse extends js.Object {
    /**
         * The customer-specified identifier used to track this reservation.
         */
    var ReservationName: js.UndefOr[ReservationToken] = js.undefined
    /**
         * Details of the reserved Elasticsearch instance which was purchased.
         */
    var ReservedElasticsearchInstanceId: js.UndefOr[GUID] = js.undefined
  }
  
  
  trait RecurringCharge extends js.Object {
    /**
         * The monetary amount of the recurring charge.
         */
    var RecurringChargeAmount: js.UndefOr[Double] = js.undefined
    /**
         * The frequency of the recurring charge.
         */
    var RecurringChargeFrequency: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait RemoveTagsRequest extends js.Object {
    /**
         * Specifies the ARN for the Elasticsearch domain from which you want to delete the specified tags.
         */
    var ARN: ARN
    /**
         * Specifies the TagKey list which you want to remove from the Elasticsearch domain.
         */
    var TagKeys: StringList
  }
  
  
  trait ReservedElasticsearchInstance extends js.Object {
    /**
         * The currency code for the reserved Elasticsearch instance offering.
         */
    var CurrencyCode: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The duration, in seconds, for which the Elasticsearch instance is reserved.
         */
    var Duration: js.UndefOr[Integer] = js.undefined
    /**
         * The number of Elasticsearch instances that have been reserved.
         */
    var ElasticsearchInstanceCount: js.UndefOr[Integer] = js.undefined
    /**
         * The Elasticsearch instance type offered by the reserved instance offering.
         */
    var ElasticsearchInstanceType: js.UndefOr[ESPartitionInstanceType] = js.undefined
    /**
         * The upfront fixed charge you will paid to purchase the specific reserved Elasticsearch instance offering. 
         */
    var FixedPrice: js.UndefOr[Double] = js.undefined
    /**
         * The payment option as defined in the reserved Elasticsearch instance offering.
         */
    var PaymentOption: js.UndefOr[ReservedElasticsearchInstancePaymentOption] = js.undefined
    /**
         * The charge to your account regardless of whether you are creating any domains using the instance offering.
         */
    var RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined
    /**
         * The customer-specified identifier to track this reservation.
         */
    var ReservationName: js.UndefOr[ReservationToken] = js.undefined
    /**
         * The unique identifier for the reservation.
         */
    var ReservedElasticsearchInstanceId: js.UndefOr[GUID] = js.undefined
    /**
         * The offering identifier.
         */
    var ReservedElasticsearchInstanceOfferingId: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The time the reservation started.
         */
    var StartTime: js.UndefOr[UpdateTimestamp] = js.undefined
    /**
         * The state of the reserved Elasticsearch instance.
         */
    var State: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The rate you are charged for each hour for the domain that is using this reserved instance.
         */
    var UsagePrice: js.UndefOr[Double] = js.undefined
  }
  
  
  trait ReservedElasticsearchInstanceOffering extends js.Object {
    /**
         * The currency code for the reserved Elasticsearch instance offering.
         */
    var CurrencyCode: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The duration, in seconds, for which the offering will reserve the Elasticsearch instance.
         */
    var Duration: js.UndefOr[Integer] = js.undefined
    /**
         * The Elasticsearch instance type offered by the reserved instance offering.
         */
    var ElasticsearchInstanceType: js.UndefOr[ESPartitionInstanceType] = js.undefined
    /**
         * The upfront fixed charge you will pay to purchase the specific reserved Elasticsearch instance offering. 
         */
    var FixedPrice: js.UndefOr[Double] = js.undefined
    /**
         * Payment option for the reserved Elasticsearch instance offering
         */
    var PaymentOption: js.UndefOr[ReservedElasticsearchInstancePaymentOption] = js.undefined
    /**
         * The charge to your account regardless of whether you are creating any domains using the instance offering.
         */
    var RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined
    /**
         * The Elasticsearch reserved instance offering identifier.
         */
    var ReservedElasticsearchInstanceOfferingId: js.UndefOr[GUID] = js.undefined
    /**
         * The rate you are charged for each hour the domain that is using the offering is running.
         */
    var UsagePrice: js.UndefOr[Double] = js.undefined
  }
  
  
  trait ServiceSoftwareOptions extends js.Object {
    /**
         * Timestamp, in Epoch time, until which you can manually request a service software update. After this date, we automatically update your service software.
         */
    var AutomatedUpdateDate: js.UndefOr[DeploymentCloseDateTimeStamp] = js.undefined
    /**
         * True if you are able to cancel your service software version update. False if you are not able to cancel your service software version. 
         */
    var Cancellable: js.UndefOr[scala.Boolean] = js.undefined
    /**
         * The current service software version that is present on the domain.
         */
    var CurrentVersion: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The description of the UpdateStatus.
         */
    var Description: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The new service software version if one is available.
         */
    var NewVersion: js.UndefOr[java.lang.String] = js.undefined
    /**
         * True if you are able to update you service software version. False if you are not able to update your service software version. 
         */
    var UpdateAvailable: js.UndefOr[scala.Boolean] = js.undefined
    /**
         * The status of your service software update. This field can take the following values: ELIGIBLE, PENDING_UPDATE, IN_PROGRESS, COMPLETED, and NOT_ELIGIBLE.
         */
    var UpdateStatus: js.UndefOr[DeploymentStatus] = js.undefined
  }
  
  
  trait SnapshotOptions extends js.Object {
    /**
         * Specifies the time, in UTC format, when the service takes a daily automated snapshot of the specified Elasticsearch domain. Default value is 0 hours.
         */
    var AutomatedSnapshotStartHour: js.UndefOr[IntegerClass] = js.undefined
  }
  
  
  trait SnapshotOptionsStatus extends js.Object {
    /**
         * Specifies the daily snapshot options specified for the Elasticsearch domain.
         */
    var Options: SnapshotOptions
    /**
         * Specifies the status of a daily automated snapshot.
         */
    var Status: OptionStatus
  }
  
  
  trait StartElasticsearchServiceSoftwareUpdateRequest extends js.Object {
    /**
         * The name of the domain that you want to update to the latest service software.
         */
    var DomainName: DomainName
  }
  
  
  trait StartElasticsearchServiceSoftwareUpdateResponse extends js.Object {
    /**
         * The current status of the Elasticsearch service software update.
         */
    var ServiceSoftwareOptions: js.UndefOr[ServiceSoftwareOptions] = js.undefined
  }
  
  
  trait StorageType extends js.Object {
    var StorageSubTypeName: js.UndefOr[StorageSubTypeName] = js.undefined
    /**
         * List of limits that are applicable for given storage type. 
         */
    var StorageTypeLimits: js.UndefOr[StorageTypeLimitList] = js.undefined
    var StorageTypeName: js.UndefOr[StorageTypeName] = js.undefined
  }
  
  
  trait StorageTypeLimit extends js.Object {
    /**
         *  Name of storage limits that are applicable for given storage type. If  StorageType  is ebs, following storage options are applicable  MinimumVolumeSize Minimum amount of volume size that is applicable for given storage type.It can be empty if it is not applicable. MaximumVolumeSize Maximum amount of volume size that is applicable for given storage type.It can be empty if it is not applicable. MaximumIops Maximum amount of Iops that is applicable for given storage type.It can be empty if it is not applicable. MinimumIops Minimum amount of Iops that is applicable for given storage type.It can be empty if it is not applicable.  
         */
    var LimitName: js.UndefOr[LimitName] = js.undefined
    /**
         *  Values for the  StorageTypeLimit$LimitName  . 
         */
    var LimitValues: js.UndefOr[LimitValueList] = js.undefined
  }
  
  
  trait Tag extends js.Object {
    /**
         * Specifies the TagKey, the name of the tag. Tag keys must be unique for the Elasticsearch domain to which they are attached.
         */
    var Key: TagKey
    /**
         * Specifies the TagValue, the value assigned to the corresponding tag key. Tag values can be null and do not have to be unique in a tag set. For example, you can have a key value pair in a tag set of project : Trinity and cost-center : Trinity
         */
    var Value: TagValue
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Attaches tags to an existing Elasticsearch domain. Tags are a set of case-sensitive key value pairs. An Elasticsearch domain may have up to 10 tags. See  Tagging Amazon Elasticsearch Service Domains for more information.
       */
    def addTags(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attaches tags to an existing Elasticsearch domain. Tags are a set of case-sensitive key value pairs. An Elasticsearch domain may have up to 10 tags. See  Tagging Amazon Elasticsearch Service Domains for more information.
       */
    def addTags(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attaches tags to an existing Elasticsearch domain. Tags are a set of case-sensitive key value pairs. An Elasticsearch domain may have up to 10 tags. See  Tagging Amazon Elasticsearch Service Domains for more information.
       */
    def addTags(params: AddTagsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attaches tags to an existing Elasticsearch domain. Tags are a set of case-sensitive key value pairs. An Elasticsearch domain may have up to 10 tags. See  Tagging Amazon Elasticsearch Service Domains for more information.
       */
    def addTags(
      params: AddTagsRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Cancels a scheduled service software update for an Amazon ES domain. You can only perform this operation before the AutomatedUpdateDate and when the UpdateStatus is in the PENDING_UPDATE state.
       */
    def cancelElasticsearchServiceSoftwareUpdate(): awsDashSdkLib.libRequestMod.Request[
        CancelElasticsearchServiceSoftwareUpdateResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
       * Cancels a scheduled service software update for an Amazon ES domain. You can only perform this operation before the AutomatedUpdateDate and when the UpdateStatus is in the PENDING_UPDATE state.
       */
    def cancelElasticsearchServiceSoftwareUpdate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CancelElasticsearchServiceSoftwareUpdateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        CancelElasticsearchServiceSoftwareUpdateResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
       * Cancels a scheduled service software update for an Amazon ES domain. You can only perform this operation before the AutomatedUpdateDate and when the UpdateStatus is in the PENDING_UPDATE state.
       */
    def cancelElasticsearchServiceSoftwareUpdate(params: CancelElasticsearchServiceSoftwareUpdateRequest): awsDashSdkLib.libRequestMod.Request[
        CancelElasticsearchServiceSoftwareUpdateResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
       * Cancels a scheduled service software update for an Amazon ES domain. You can only perform this operation before the AutomatedUpdateDate and when the UpdateStatus is in the PENDING_UPDATE state.
       */
    def cancelElasticsearchServiceSoftwareUpdate(
      params: CancelElasticsearchServiceSoftwareUpdateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CancelElasticsearchServiceSoftwareUpdateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        CancelElasticsearchServiceSoftwareUpdateResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
       * Creates a new Elasticsearch domain. For more information, see Creating Elasticsearch Domains in the Amazon Elasticsearch Service Developer Guide.
       */
    def createElasticsearchDomain(): awsDashSdkLib.libRequestMod.Request[CreateElasticsearchDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new Elasticsearch domain. For more information, see Creating Elasticsearch Domains in the Amazon Elasticsearch Service Developer Guide.
       */
    def createElasticsearchDomain(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateElasticsearchDomainResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateElasticsearchDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new Elasticsearch domain. For more information, see Creating Elasticsearch Domains in the Amazon Elasticsearch Service Developer Guide.
       */
    def createElasticsearchDomain(params: CreateElasticsearchDomainRequest): awsDashSdkLib.libRequestMod.Request[CreateElasticsearchDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new Elasticsearch domain. For more information, see Creating Elasticsearch Domains in the Amazon Elasticsearch Service Developer Guide.
       */
    def createElasticsearchDomain(
      params: CreateElasticsearchDomainRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateElasticsearchDomainResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateElasticsearchDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes the specified Elasticsearch domain and all of its data. Once a domain is deleted, it cannot be recovered.
       */
    def deleteElasticsearchDomain(): awsDashSdkLib.libRequestMod.Request[DeleteElasticsearchDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes the specified Elasticsearch domain and all of its data. Once a domain is deleted, it cannot be recovered.
       */
    def deleteElasticsearchDomain(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteElasticsearchDomainResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteElasticsearchDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes the specified Elasticsearch domain and all of its data. Once a domain is deleted, it cannot be recovered.
       */
    def deleteElasticsearchDomain(params: DeleteElasticsearchDomainRequest): awsDashSdkLib.libRequestMod.Request[DeleteElasticsearchDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes the specified Elasticsearch domain and all of its data. Once a domain is deleted, it cannot be recovered.
       */
    def deleteElasticsearchDomain(
      params: DeleteElasticsearchDomainRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteElasticsearchDomainResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteElasticsearchDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the service-linked role that Elasticsearch Service uses to manage and maintain VPC domains. Role deletion will fail if any existing VPC domains use the role. You must delete any such Elasticsearch domains before deleting the role. See Deleting Elasticsearch Service Role in VPC Endpoints for Amazon Elasticsearch Service Domains.
       */
    def deleteElasticsearchServiceRole(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the service-linked role that Elasticsearch Service uses to manage and maintain VPC domains. Role deletion will fail if any existing VPC domains use the role. You must delete any such Elasticsearch domains before deleting the role. See Deleting Elasticsearch Service Role in VPC Endpoints for Amazon Elasticsearch Service Domains.
       */
    def deleteElasticsearchServiceRole(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns domain configuration information about the specified Elasticsearch domain, including the domain ID, domain endpoint, and domain ARN.
       */
    def describeElasticsearchDomain(): awsDashSdkLib.libRequestMod.Request[DescribeElasticsearchDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns domain configuration information about the specified Elasticsearch domain, including the domain ID, domain endpoint, and domain ARN.
       */
    def describeElasticsearchDomain(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeElasticsearchDomainResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeElasticsearchDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns domain configuration information about the specified Elasticsearch domain, including the domain ID, domain endpoint, and domain ARN.
       */
    def describeElasticsearchDomain(params: DescribeElasticsearchDomainRequest): awsDashSdkLib.libRequestMod.Request[DescribeElasticsearchDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns domain configuration information about the specified Elasticsearch domain, including the domain ID, domain endpoint, and domain ARN.
       */
    def describeElasticsearchDomain(
      params: DescribeElasticsearchDomainRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeElasticsearchDomainResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeElasticsearchDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides cluster configuration information about the specified Elasticsearch domain, such as the state, creation date, update version, and update date for cluster options.
       */
    def describeElasticsearchDomainConfig(): awsDashSdkLib.libRequestMod.Request[DescribeElasticsearchDomainConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides cluster configuration information about the specified Elasticsearch domain, such as the state, creation date, update version, and update date for cluster options.
       */
    def describeElasticsearchDomainConfig(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeElasticsearchDomainConfigResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeElasticsearchDomainConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides cluster configuration information about the specified Elasticsearch domain, such as the state, creation date, update version, and update date for cluster options.
       */
    def describeElasticsearchDomainConfig(params: DescribeElasticsearchDomainConfigRequest): awsDashSdkLib.libRequestMod.Request[DescribeElasticsearchDomainConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides cluster configuration information about the specified Elasticsearch domain, such as the state, creation date, update version, and update date for cluster options.
       */
    def describeElasticsearchDomainConfig(
      params: DescribeElasticsearchDomainConfigRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeElasticsearchDomainConfigResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeElasticsearchDomainConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns domain configuration information about the specified Elasticsearch domains, including the domain ID, domain endpoint, and domain ARN.
       */
    def describeElasticsearchDomains(): awsDashSdkLib.libRequestMod.Request[DescribeElasticsearchDomainsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns domain configuration information about the specified Elasticsearch domains, including the domain ID, domain endpoint, and domain ARN.
       */
    def describeElasticsearchDomains(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeElasticsearchDomainsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeElasticsearchDomainsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns domain configuration information about the specified Elasticsearch domains, including the domain ID, domain endpoint, and domain ARN.
       */
    def describeElasticsearchDomains(params: DescribeElasticsearchDomainsRequest): awsDashSdkLib.libRequestMod.Request[DescribeElasticsearchDomainsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns domain configuration information about the specified Elasticsearch domains, including the domain ID, domain endpoint, and domain ARN.
       */
    def describeElasticsearchDomains(
      params: DescribeElasticsearchDomainsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeElasticsearchDomainsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeElasticsearchDomainsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Describe Elasticsearch Limits for a given InstanceType and ElasticsearchVersion. When modifying existing Domain, specify the  DomainName  to know what Limits are supported for modifying. 
       */
    def describeElasticsearchInstanceTypeLimits(): awsDashSdkLib.libRequestMod.Request[
        DescribeElasticsearchInstanceTypeLimitsResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
       *  Describe Elasticsearch Limits for a given InstanceType and ElasticsearchVersion. When modifying existing Domain, specify the  DomainName  to know what Limits are supported for modifying. 
       */
    def describeElasticsearchInstanceTypeLimits(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeElasticsearchInstanceTypeLimitsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        DescribeElasticsearchInstanceTypeLimitsResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
       *  Describe Elasticsearch Limits for a given InstanceType and ElasticsearchVersion. When modifying existing Domain, specify the  DomainName  to know what Limits are supported for modifying. 
       */
    def describeElasticsearchInstanceTypeLimits(params: DescribeElasticsearchInstanceTypeLimitsRequest): awsDashSdkLib.libRequestMod.Request[
        DescribeElasticsearchInstanceTypeLimitsResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
       *  Describe Elasticsearch Limits for a given InstanceType and ElasticsearchVersion. When modifying existing Domain, specify the  DomainName  to know what Limits are supported for modifying. 
       */
    def describeElasticsearchInstanceTypeLimits(
      params: DescribeElasticsearchInstanceTypeLimitsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeElasticsearchInstanceTypeLimitsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        DescribeElasticsearchInstanceTypeLimitsResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
       * Lists available reserved Elasticsearch instance offerings.
       */
    def describeReservedElasticsearchInstanceOfferings(): awsDashSdkLib.libRequestMod.Request[
        DescribeReservedElasticsearchInstanceOfferingsResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
       * Lists available reserved Elasticsearch instance offerings.
       */
    def describeReservedElasticsearchInstanceOfferings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeReservedElasticsearchInstanceOfferingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        DescribeReservedElasticsearchInstanceOfferingsResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
       * Lists available reserved Elasticsearch instance offerings.
       */
    def describeReservedElasticsearchInstanceOfferings(params: DescribeReservedElasticsearchInstanceOfferingsRequest): awsDashSdkLib.libRequestMod.Request[
        DescribeReservedElasticsearchInstanceOfferingsResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
       * Lists available reserved Elasticsearch instance offerings.
       */
    def describeReservedElasticsearchInstanceOfferings(
      params: DescribeReservedElasticsearchInstanceOfferingsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeReservedElasticsearchInstanceOfferingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        DescribeReservedElasticsearchInstanceOfferingsResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
       * Returns information about reserved Elasticsearch instances for this account.
       */
    def describeReservedElasticsearchInstances(): awsDashSdkLib.libRequestMod.Request[DescribeReservedElasticsearchInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about reserved Elasticsearch instances for this account.
       */
    def describeReservedElasticsearchInstances(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeReservedElasticsearchInstancesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeReservedElasticsearchInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about reserved Elasticsearch instances for this account.
       */
    def describeReservedElasticsearchInstances(params: DescribeReservedElasticsearchInstancesRequest): awsDashSdkLib.libRequestMod.Request[DescribeReservedElasticsearchInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about reserved Elasticsearch instances for this account.
       */
    def describeReservedElasticsearchInstances(
      params: DescribeReservedElasticsearchInstancesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeReservedElasticsearchInstancesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeReservedElasticsearchInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Returns a list of upgrade compatible Elastisearch versions. You can optionally pass a  DomainName  to get all upgrade compatible Elasticsearch versions for that specific domain. 
       */
    def getCompatibleElasticsearchVersions(): awsDashSdkLib.libRequestMod.Request[GetCompatibleElasticsearchVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Returns a list of upgrade compatible Elastisearch versions. You can optionally pass a  DomainName  to get all upgrade compatible Elasticsearch versions for that specific domain. 
       */
    def getCompatibleElasticsearchVersions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCompatibleElasticsearchVersionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCompatibleElasticsearchVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Returns a list of upgrade compatible Elastisearch versions. You can optionally pass a  DomainName  to get all upgrade compatible Elasticsearch versions for that specific domain. 
       */
    def getCompatibleElasticsearchVersions(params: GetCompatibleElasticsearchVersionsRequest): awsDashSdkLib.libRequestMod.Request[GetCompatibleElasticsearchVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Returns a list of upgrade compatible Elastisearch versions. You can optionally pass a  DomainName  to get all upgrade compatible Elasticsearch versions for that specific domain. 
       */
    def getCompatibleElasticsearchVersions(
      params: GetCompatibleElasticsearchVersionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCompatibleElasticsearchVersionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCompatibleElasticsearchVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the complete history of the last 10 upgrades that were performed on the domain.
       */
    def getUpgradeHistory(): awsDashSdkLib.libRequestMod.Request[GetUpgradeHistoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the complete history of the last 10 upgrades that were performed on the domain.
       */
    def getUpgradeHistory(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetUpgradeHistoryResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetUpgradeHistoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the complete history of the last 10 upgrades that were performed on the domain.
       */
    def getUpgradeHistory(params: GetUpgradeHistoryRequest): awsDashSdkLib.libRequestMod.Request[GetUpgradeHistoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the complete history of the last 10 upgrades that were performed on the domain.
       */
    def getUpgradeHistory(
      params: GetUpgradeHistoryRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetUpgradeHistoryResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetUpgradeHistoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the latest status of the last upgrade or upgrade eligibility check that was performed on the domain.
       */
    def getUpgradeStatus(): awsDashSdkLib.libRequestMod.Request[GetUpgradeStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the latest status of the last upgrade or upgrade eligibility check that was performed on the domain.
       */
    def getUpgradeStatus(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetUpgradeStatusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetUpgradeStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the latest status of the last upgrade or upgrade eligibility check that was performed on the domain.
       */
    def getUpgradeStatus(params: GetUpgradeStatusRequest): awsDashSdkLib.libRequestMod.Request[GetUpgradeStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the latest status of the last upgrade or upgrade eligibility check that was performed on the domain.
       */
    def getUpgradeStatus(
      params: GetUpgradeStatusRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetUpgradeStatusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetUpgradeStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the name of all Elasticsearch domains owned by the current user's account. 
       */
    def listDomainNames(): awsDashSdkLib.libRequestMod.Request[ListDomainNamesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the name of all Elasticsearch domains owned by the current user's account. 
       */
    def listDomainNames(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDomainNamesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDomainNamesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * List all Elasticsearch instance types that are supported for given ElasticsearchVersion
       */
    def listElasticsearchInstanceTypes(): awsDashSdkLib.libRequestMod.Request[ListElasticsearchInstanceTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * List all Elasticsearch instance types that are supported for given ElasticsearchVersion
       */
    def listElasticsearchInstanceTypes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListElasticsearchInstanceTypesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListElasticsearchInstanceTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * List all Elasticsearch instance types that are supported for given ElasticsearchVersion
       */
    def listElasticsearchInstanceTypes(params: ListElasticsearchInstanceTypesRequest): awsDashSdkLib.libRequestMod.Request[ListElasticsearchInstanceTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * List all Elasticsearch instance types that are supported for given ElasticsearchVersion
       */
    def listElasticsearchInstanceTypes(
      params: ListElasticsearchInstanceTypesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListElasticsearchInstanceTypesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListElasticsearchInstanceTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * List all supported Elasticsearch versions
       */
    def listElasticsearchVersions(): awsDashSdkLib.libRequestMod.Request[ListElasticsearchVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * List all supported Elasticsearch versions
       */
    def listElasticsearchVersions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListElasticsearchVersionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListElasticsearchVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * List all supported Elasticsearch versions
       */
    def listElasticsearchVersions(params: ListElasticsearchVersionsRequest): awsDashSdkLib.libRequestMod.Request[ListElasticsearchVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * List all supported Elasticsearch versions
       */
    def listElasticsearchVersions(
      params: ListElasticsearchVersionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListElasticsearchVersionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListElasticsearchVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns all tags for the given Elasticsearch domain.
       */
    def listTags(): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns all tags for the given Elasticsearch domain.
       */
    def listTags(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns all tags for the given Elasticsearch domain.
       */
    def listTags(params: ListTagsRequest): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns all tags for the given Elasticsearch domain.
       */
    def listTags(
      params: ListTagsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Allows you to purchase reserved Elasticsearch instances.
       */
    def purchaseReservedElasticsearchInstanceOffering(): awsDashSdkLib.libRequestMod.Request[
        PurchaseReservedElasticsearchInstanceOfferingResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
       * Allows you to purchase reserved Elasticsearch instances.
       */
    def purchaseReservedElasticsearchInstanceOffering(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PurchaseReservedElasticsearchInstanceOfferingResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        PurchaseReservedElasticsearchInstanceOfferingResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
       * Allows you to purchase reserved Elasticsearch instances.
       */
    def purchaseReservedElasticsearchInstanceOffering(params: PurchaseReservedElasticsearchInstanceOfferingRequest): awsDashSdkLib.libRequestMod.Request[
        PurchaseReservedElasticsearchInstanceOfferingResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
       * Allows you to purchase reserved Elasticsearch instances.
       */
    def purchaseReservedElasticsearchInstanceOffering(
      params: PurchaseReservedElasticsearchInstanceOfferingRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PurchaseReservedElasticsearchInstanceOfferingResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        PurchaseReservedElasticsearchInstanceOfferingResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
       * Removes the specified set of tags from the specified Elasticsearch domain.
       */
    def removeTags(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the specified set of tags from the specified Elasticsearch domain.
       */
    def removeTags(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the specified set of tags from the specified Elasticsearch domain.
       */
    def removeTags(params: RemoveTagsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the specified set of tags from the specified Elasticsearch domain.
       */
    def removeTags(
      params: RemoveTagsRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Schedules a service software update for an Amazon ES domain.
       */
    def startElasticsearchServiceSoftwareUpdate(): awsDashSdkLib.libRequestMod.Request[
        StartElasticsearchServiceSoftwareUpdateResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
       * Schedules a service software update for an Amazon ES domain.
       */
    def startElasticsearchServiceSoftwareUpdate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartElasticsearchServiceSoftwareUpdateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        StartElasticsearchServiceSoftwareUpdateResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
       * Schedules a service software update for an Amazon ES domain.
       */
    def startElasticsearchServiceSoftwareUpdate(params: StartElasticsearchServiceSoftwareUpdateRequest): awsDashSdkLib.libRequestMod.Request[
        StartElasticsearchServiceSoftwareUpdateResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
       * Schedules a service software update for an Amazon ES domain.
       */
    def startElasticsearchServiceSoftwareUpdate(
      params: StartElasticsearchServiceSoftwareUpdateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartElasticsearchServiceSoftwareUpdateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        StartElasticsearchServiceSoftwareUpdateResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
       * Modifies the cluster configuration of the specified Elasticsearch domain, setting as setting the instance type and the number of instances. 
       */
    def updateElasticsearchDomainConfig(): awsDashSdkLib.libRequestMod.Request[UpdateElasticsearchDomainConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies the cluster configuration of the specified Elasticsearch domain, setting as setting the instance type and the number of instances. 
       */
    def updateElasticsearchDomainConfig(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateElasticsearchDomainConfigResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateElasticsearchDomainConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies the cluster configuration of the specified Elasticsearch domain, setting as setting the instance type and the number of instances. 
       */
    def updateElasticsearchDomainConfig(params: UpdateElasticsearchDomainConfigRequest): awsDashSdkLib.libRequestMod.Request[UpdateElasticsearchDomainConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies the cluster configuration of the specified Elasticsearch domain, setting as setting the instance type and the number of instances. 
       */
    def updateElasticsearchDomainConfig(
      params: UpdateElasticsearchDomainConfigRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateElasticsearchDomainConfigResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateElasticsearchDomainConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Allows you to either upgrade your domain or perform an Upgrade eligibility check to a compatible Elasticsearch version.
       */
    def upgradeElasticsearchDomain(): awsDashSdkLib.libRequestMod.Request[UpgradeElasticsearchDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Allows you to either upgrade your domain or perform an Upgrade eligibility check to a compatible Elasticsearch version.
       */
    def upgradeElasticsearchDomain(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpgradeElasticsearchDomainResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpgradeElasticsearchDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Allows you to either upgrade your domain or perform an Upgrade eligibility check to a compatible Elasticsearch version.
       */
    def upgradeElasticsearchDomain(params: UpgradeElasticsearchDomainRequest): awsDashSdkLib.libRequestMod.Request[UpgradeElasticsearchDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Allows you to either upgrade your domain or perform an Upgrade eligibility check to a compatible Elasticsearch version.
       */
    def upgradeElasticsearchDomain(
      params: UpgradeElasticsearchDomainRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpgradeElasticsearchDomainResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpgradeElasticsearchDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UpdateElasticsearchDomainConfigRequest extends js.Object {
    /**
         * IAM access policy as a JSON-formatted string.
         */
    var AccessPolicies: js.UndefOr[PolicyDocument] = js.undefined
    /**
         * Modifies the advanced option to allow references to indices in an HTTP request body. Must be false when configuring access to individual sub-resources. By default, the value is true. See Configuration Advanced Options for more information.
         */
    var AdvancedOptions: js.UndefOr[AdvancedOptions] = js.undefined
    /**
         * Options to specify the Cognito user and identity pools for Kibana authentication. For more information, see Amazon Cognito Authentication for Kibana.
         */
    var CognitoOptions: js.UndefOr[CognitoOptions] = js.undefined
    /**
         * The name of the Elasticsearch domain that you are updating. 
         */
    var DomainName: DomainName
    /**
         * Specify the type and size of the EBS volume that you want to use. 
         */
    var EBSOptions: js.UndefOr[EBSOptions] = js.undefined
    /**
         * The type and number of instances to instantiate for the domain cluster.
         */
    var ElasticsearchClusterConfig: js.UndefOr[ElasticsearchClusterConfig] = js.undefined
    /**
         * Map of LogType and LogPublishingOption, each containing options to publish a given type of Elasticsearch log.
         */
    var LogPublishingOptions: js.UndefOr[LogPublishingOptions] = js.undefined
    /**
         * Option to set the time, in UTC format, for the daily automated snapshot. Default value is 0 hours. 
         */
    var SnapshotOptions: js.UndefOr[SnapshotOptions] = js.undefined
    /**
         * Options to specify the subnets and security groups for VPC endpoint. For more information, see Creating a VPC in VPC Endpoints for Amazon Elasticsearch Service Domains
         */
    var VPCOptions: js.UndefOr[VPCOptions] = js.undefined
  }
  
  
  trait UpdateElasticsearchDomainConfigResponse extends js.Object {
    /**
         * The status of the updated Elasticsearch domain. 
         */
    var DomainConfig: ElasticsearchDomainConfig
  }
  
  
  trait UpgradeElasticsearchDomainRequest extends js.Object {
    var DomainName: DomainName
    /**
         *  This flag, when set to True, indicates that an Upgrade Eligibility Check needs to be performed. This will not actually perform the Upgrade. 
         */
    var PerformCheckOnly: js.UndefOr[scala.Boolean] = js.undefined
    /**
         * The version of Elasticsearch that you intend to upgrade the domain to.
         */
    var TargetVersion: ElasticsearchVersionString
  }
  
  
  trait UpgradeElasticsearchDomainResponse extends js.Object {
    var DomainName: js.UndefOr[DomainName] = js.undefined
    /**
         *  This flag, when set to True, indicates that an Upgrade Eligibility Check needs to be performed. This will not actually perform the Upgrade. 
         */
    var PerformCheckOnly: js.UndefOr[scala.Boolean] = js.undefined
    /**
         * The version of Elasticsearch that you intend to upgrade the domain to.
         */
    var TargetVersion: js.UndefOr[ElasticsearchVersionString] = js.undefined
  }
  
  
  trait UpgradeHistory extends js.Object {
    /**
         * UTC Timestamp at which the Upgrade API call was made in "yyyy-MM-ddTHH:mm:ssZ" format.
         */
    var StartTimestamp: js.UndefOr[StartTimestamp] = js.undefined
    /**
         *  A list of  UpgradeStepItem  s representing information about each step performed as pard of a specific Upgrade or Upgrade Eligibility Check. 
         */
    var StepsList: js.UndefOr[UpgradeStepsList] = js.undefined
    /**
         * A string that describes the update briefly
         */
    var UpgradeName: js.UndefOr[UpgradeName] = js.undefined
    /**
         *  The overall status of the update. The status can take one of the following values:  In Progress Succeeded Succeeded with Issues Failed  
         */
    var UpgradeStatus: js.UndefOr[UpgradeStatus] = js.undefined
  }
  
  
  trait UpgradeStepItem extends js.Object {
    /**
         * A list of strings containing detailed information about the errors encountered in a particular step.
         */
    var Issues: js.UndefOr[Issues] = js.undefined
    /**
         * The Floating point value representing progress percentage of a particular step.
         */
    var ProgressPercent: js.UndefOr[Double] = js.undefined
    /**
         *  Represents one of 3 steps that an Upgrade or Upgrade Eligibility Check does through:  PreUpgradeCheck Snapshot Upgrade  
         */
    var UpgradeStep: js.UndefOr[UpgradeStep] = js.undefined
    /**
         *  The status of a particular step during an upgrade. The status can take one of the following values:  In Progress Succeeded Succeeded with Issues Failed  
         */
    var UpgradeStepStatus: js.UndefOr[UpgradeStatus] = js.undefined
  }
  
  
  trait VPCDerivedInfo extends js.Object {
    /**
         * The availability zones for the Elasticsearch domain. Exists only if the domain was created with VPCOptions.
         */
    var AvailabilityZones: js.UndefOr[StringList] = js.undefined
    /**
         * Specifies the security groups for VPC endpoint.
         */
    var SecurityGroupIds: js.UndefOr[StringList] = js.undefined
    /**
         * Specifies the subnets for VPC endpoint.
         */
    var SubnetIds: js.UndefOr[StringList] = js.undefined
    /**
         * The VPC Id for the Elasticsearch domain. Exists only if the domain was created with VPCOptions.
         */
    var VPCId: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait VPCDerivedInfoStatus extends js.Object {
    /**
         *  Specifies the VPC options for the specified Elasticsearch domain.
         */
    var Options: VPCDerivedInfo
    /**
         *  Specifies the status of the VPC options for the specified Elasticsearch domain.
         */
    var Status: OptionStatus
  }
  
  
  trait VPCOptions extends js.Object {
    /**
         * Specifies the security groups for VPC endpoint.
         */
    var SecurityGroupIds: js.UndefOr[StringList] = js.undefined
    /**
         * Specifies the subnets for VPC endpoint.
         */
    var SubnetIds: js.UndefOr[StringList] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type ARN = java.lang.String
  type AdditionalLimitList = js.Array[AdditionalLimit]
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CloudWatchLogsLogGroupArn = java.lang.String
  type CompatibleElasticsearchVersionsList = js.Array[CompatibleVersionsMap]
  type DeploymentCloseDateTimeStamp = stdLib.Date
  type DeploymentStatus = awsDashSdkLib.awsDashSdkLibStrings.PENDING_UPDATE | awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS | awsDashSdkLib.awsDashSdkLibStrings.COMPLETED | awsDashSdkLib.awsDashSdkLibStrings.NOT_ELIGIBLE | awsDashSdkLib.awsDashSdkLibStrings.ELIGIBLE | java.lang.String
  type DomainId = java.lang.String
  type DomainInfoList = js.Array[DomainInfo]
  type DomainName = java.lang.String
  type DomainNameList = js.Array[DomainName]
  type Double = scala.Double
  type ESPartitionInstanceType = awsDashSdkLib.awsDashSdkLibStrings.m3DOTmediumDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.m3DOTlargeDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.m3DOTxlargeDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.m3DOT2xlargeDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.m4DOTlargeDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.m4DOTxlargeDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.m4DOT2xlargeDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.m4DOT4xlargeDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.m4DOT10xlargeDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.t2DOTmicroDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.t2DOTsmallDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.t2DOTmediumDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.r3DOTlargeDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.r3DOTxlargeDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.r3DOT2xlargeDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.r3DOT4xlargeDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.r3DOT8xlargeDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.i2DOTxlargeDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.i2DOT2xlargeDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.d2DOTxlargeDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.d2DOT2xlargeDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.d2DOT4xlargeDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.d2DOT8xlargeDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.c4DOTlargeDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.c4DOTxlargeDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.c4DOT2xlargeDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.c4DOT4xlargeDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.c4DOT8xlargeDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.r4DOTlargeDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.r4DOTxlargeDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.r4DOT2xlargeDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.r4DOT4xlargeDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.r4DOT8xlargeDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.r4DOT16xlargeDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.i3DOTlargeDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.i3DOTxlargeDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.i3DOT2xlargeDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.i3DOT4xlargeDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.i3DOT8xlargeDOTelasticsearch | awsDashSdkLib.awsDashSdkLibStrings.i3DOT16xlargeDOTelasticsearch | java.lang.String
  type ElasticsearchDomainStatusList = js.Array[ElasticsearchDomainStatus]
  type ElasticsearchInstanceTypeList = js.Array[ESPartitionInstanceType]
  type ElasticsearchVersionList = js.Array[ElasticsearchVersionString]
  type ElasticsearchVersionString = java.lang.String
  type GUID = java.lang.String
  type IdentityPoolId = java.lang.String
  type InstanceCount = scala.Double
  type InstanceRole = java.lang.String
  type Integer = scala.Double
  type IntegerClass = scala.Double
  type Issue = java.lang.String
  type Issues = js.Array[Issue]
  type KmsKeyId = java.lang.String
  type LimitName = java.lang.String
  type LimitValue = java.lang.String
  type LimitValueList = js.Array[LimitValue]
  type LogType = awsDashSdkLib.awsDashSdkLibStrings.INDEX_SLOW_LOGS | awsDashSdkLib.awsDashSdkLibStrings.SEARCH_SLOW_LOGS | awsDashSdkLib.awsDashSdkLibStrings.ES_APPLICATION_LOGS | java.lang.String
  type MaxResults = scala.Double
  type MaximumInstanceCount = scala.Double
  type MinimumInstanceCount = scala.Double
  type NextToken = java.lang.String
  type OptionState = awsDashSdkLib.awsDashSdkLibStrings.RequiresIndexDocuments | awsDashSdkLib.awsDashSdkLibStrings.Processing | awsDashSdkLib.awsDashSdkLibStrings.Active | java.lang.String
  type PolicyDocument = java.lang.String
  type RecurringChargeList = js.Array[RecurringCharge]
  type ReservationToken = java.lang.String
  type ReservedElasticsearchInstanceList = js.Array[ReservedElasticsearchInstance]
  type ReservedElasticsearchInstanceOfferingList = js.Array[ReservedElasticsearchInstanceOffering]
  type ReservedElasticsearchInstancePaymentOption = awsDashSdkLib.awsDashSdkLibStrings.ALL_UPFRONT | awsDashSdkLib.awsDashSdkLibStrings.PARTIAL_UPFRONT | awsDashSdkLib.awsDashSdkLibStrings.NO_UPFRONT | java.lang.String
  type RoleArn = java.lang.String
  type ServiceUrl = java.lang.String
  type StartTimestamp = stdLib.Date
  type StorageSubTypeName = java.lang.String
  type StorageTypeLimitList = js.Array[StorageTypeLimit]
  type StorageTypeList = js.Array[StorageType]
  type StorageTypeName = java.lang.String
  type String = java.lang.String
  type StringList = js.Array[java.lang.String]
  type TagKey = java.lang.String
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type UIntValue = scala.Double
  type UpdateTimestamp = stdLib.Date
  type UpgradeHistoryList = js.Array[UpgradeHistory]
  type UpgradeName = java.lang.String
  type UpgradeStatus = awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS | awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED | awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED_WITH_ISSUES | awsDashSdkLib.awsDashSdkLibStrings.FAILED | java.lang.String
  type UpgradeStep = awsDashSdkLib.awsDashSdkLibStrings.PRE_UPGRADE_CHECK | awsDashSdkLib.awsDashSdkLibStrings.SNAPSHOT | awsDashSdkLib.awsDashSdkLibStrings.UPGRADE | java.lang.String
  type UpgradeStepsList = js.Array[UpgradeStepItem]
  type UserPoolId = java.lang.String
  type VolumeType = awsDashSdkLib.awsDashSdkLibStrings.standard | awsDashSdkLib.awsDashSdkLibStrings.gp2 | awsDashSdkLib.awsDashSdkLibStrings.io1 | java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2015-01-01` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

