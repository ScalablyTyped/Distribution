package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElasticsearchDomainStatus extends js.Object {
  /**
    * The Amazon resource name (ARN) of an Elasticsearch domain. See Identifiers for IAM Entities in Using AWS Identity and Access Management for more information.
    */
  var ARN: typings.awsDashSdk.clientsEsMod.ARN
  /**
    *  IAM access policy as a JSON-formatted string.
    */
  var AccessPolicies: js.UndefOr[PolicyDocument] = js.undefined
  /**
    * Specifies the status of the AdvancedOptions
    */
  var AdvancedOptions: js.UndefOr[typings.awsDashSdk.clientsEsMod.AdvancedOptions] = js.undefined
  /**
    * The CognitoOptions for the specified domain. For more information, see Amazon Cognito Authentication for Kibana.
    */
  var CognitoOptions: js.UndefOr[typings.awsDashSdk.clientsEsMod.CognitoOptions] = js.undefined
  /**
    * The domain creation status. True if the creation of an Elasticsearch domain is complete. False if domain creation is still in progress.
    */
  var Created: js.UndefOr[Boolean] = js.undefined
  /**
    * The domain deletion status. True if a delete request has been received for the domain but resource cleanup is still in progress. False if the domain has not been deleted. Once domain deletion is complete, the status of the domain is no longer returned.
    */
  var Deleted: js.UndefOr[Boolean] = js.undefined
  /**
    * The current status of the Elasticsearch domain's endpoint options.
    */
  var DomainEndpointOptions: js.UndefOr[typings.awsDashSdk.clientsEsMod.DomainEndpointOptions] = js.undefined
  /**
    * The unique identifier for the specified Elasticsearch domain.
    */
  var DomainId: typings.awsDashSdk.clientsEsMod.DomainId
  /**
    * The name of an Elasticsearch domain. Domain names are unique across the domains owned by an account within an AWS region. Domain names start with a letter or number and can contain the following characters: a-z (lowercase), 0-9, and - (hyphen).
    */
  var DomainName: typings.awsDashSdk.clientsEsMod.DomainName
  /**
    * The EBSOptions for the specified domain. See Configuring EBS-based Storage for more information.
    */
  var EBSOptions: js.UndefOr[typings.awsDashSdk.clientsEsMod.EBSOptions] = js.undefined
  /**
    * The type and number of instances in the domain cluster.
    */
  var ElasticsearchClusterConfig: typings.awsDashSdk.clientsEsMod.ElasticsearchClusterConfig
  var ElasticsearchVersion: js.UndefOr[ElasticsearchVersionString] = js.undefined
  /**
    *  Specifies the status of the EncryptionAtRestOptions.
    */
  var EncryptionAtRestOptions: js.UndefOr[typings.awsDashSdk.clientsEsMod.EncryptionAtRestOptions] = js.undefined
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
  var LogPublishingOptions: js.UndefOr[typings.awsDashSdk.clientsEsMod.LogPublishingOptions] = js.undefined
  /**
    * Specifies the status of the NodeToNodeEncryptionOptions.
    */
  var NodeToNodeEncryptionOptions: js.UndefOr[typings.awsDashSdk.clientsEsMod.NodeToNodeEncryptionOptions] = js.undefined
  /**
    * The status of the Elasticsearch domain configuration. True if Amazon Elasticsearch Service is processing configuration changes. False if the configuration is active.
    */
  var Processing: js.UndefOr[Boolean] = js.undefined
  /**
    * The current status of the Elasticsearch domain's service software.
    */
  var ServiceSoftwareOptions: js.UndefOr[typings.awsDashSdk.clientsEsMod.ServiceSoftwareOptions] = js.undefined
  /**
    * Specifies the status of the SnapshotOptions
    */
  var SnapshotOptions: js.UndefOr[typings.awsDashSdk.clientsEsMod.SnapshotOptions] = js.undefined
  /**
    * The status of an Elasticsearch domain version upgrade. True if Amazon Elasticsearch Service is undergoing a version upgrade. False if the configuration is active.
    */
  var UpgradeProcessing: js.UndefOr[Boolean] = js.undefined
  /**
    * The VPCOptions for the specified domain. For more information, see VPC Endpoints for Amazon Elasticsearch Service Domains.
    */
  var VPCOptions: js.UndefOr[VPCDerivedInfo] = js.undefined
}

object ElasticsearchDomainStatus {
  @scala.inline
  def apply(
    ARN: ARN,
    DomainId: DomainId,
    DomainName: DomainName,
    ElasticsearchClusterConfig: ElasticsearchClusterConfig,
    AccessPolicies: PolicyDocument = null,
    AdvancedOptions: AdvancedOptions = null,
    CognitoOptions: CognitoOptions = null,
    Created: js.UndefOr[scala.Boolean] = js.undefined,
    Deleted: js.UndefOr[scala.Boolean] = js.undefined,
    DomainEndpointOptions: DomainEndpointOptions = null,
    EBSOptions: EBSOptions = null,
    ElasticsearchVersion: ElasticsearchVersionString = null,
    EncryptionAtRestOptions: EncryptionAtRestOptions = null,
    Endpoint: ServiceUrl = null,
    Endpoints: EndpointsMap = null,
    LogPublishingOptions: LogPublishingOptions = null,
    NodeToNodeEncryptionOptions: NodeToNodeEncryptionOptions = null,
    Processing: js.UndefOr[scala.Boolean] = js.undefined,
    ServiceSoftwareOptions: ServiceSoftwareOptions = null,
    SnapshotOptions: SnapshotOptions = null,
    UpgradeProcessing: js.UndefOr[scala.Boolean] = js.undefined,
    VPCOptions: VPCDerivedInfo = null
  ): ElasticsearchDomainStatus = {
    val __obj = js.Dynamic.literal(ARN = ARN, DomainId = DomainId, DomainName = DomainName, ElasticsearchClusterConfig = ElasticsearchClusterConfig)
    if (AccessPolicies != null) __obj.updateDynamic("AccessPolicies")(AccessPolicies)
    if (AdvancedOptions != null) __obj.updateDynamic("AdvancedOptions")(AdvancedOptions)
    if (CognitoOptions != null) __obj.updateDynamic("CognitoOptions")(CognitoOptions)
    if (!js.isUndefined(Created)) __obj.updateDynamic("Created")(Created)
    if (!js.isUndefined(Deleted)) __obj.updateDynamic("Deleted")(Deleted)
    if (DomainEndpointOptions != null) __obj.updateDynamic("DomainEndpointOptions")(DomainEndpointOptions)
    if (EBSOptions != null) __obj.updateDynamic("EBSOptions")(EBSOptions)
    if (ElasticsearchVersion != null) __obj.updateDynamic("ElasticsearchVersion")(ElasticsearchVersion)
    if (EncryptionAtRestOptions != null) __obj.updateDynamic("EncryptionAtRestOptions")(EncryptionAtRestOptions)
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint)
    if (Endpoints != null) __obj.updateDynamic("Endpoints")(Endpoints)
    if (LogPublishingOptions != null) __obj.updateDynamic("LogPublishingOptions")(LogPublishingOptions)
    if (NodeToNodeEncryptionOptions != null) __obj.updateDynamic("NodeToNodeEncryptionOptions")(NodeToNodeEncryptionOptions)
    if (!js.isUndefined(Processing)) __obj.updateDynamic("Processing")(Processing)
    if (ServiceSoftwareOptions != null) __obj.updateDynamic("ServiceSoftwareOptions")(ServiceSoftwareOptions)
    if (SnapshotOptions != null) __obj.updateDynamic("SnapshotOptions")(SnapshotOptions)
    if (!js.isUndefined(UpgradeProcessing)) __obj.updateDynamic("UpgradeProcessing")(UpgradeProcessing)
    if (VPCOptions != null) __obj.updateDynamic("VPCOptions")(VPCOptions)
    __obj.asInstanceOf[ElasticsearchDomainStatus]
  }
}

