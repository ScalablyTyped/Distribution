package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateElasticsearchDomainRequest extends js.Object {
  /**
    *  IAM access policy as a JSON-formatted string.
    */
  var AccessPolicies: js.UndefOr[PolicyDocument] = js.undefined
  /**
    *  Option to allow references to indices in an HTTP request body. Must be false when configuring access to individual sub-resources. By default, the value is true. See Configuration Advanced Options for more information.
    */
  var AdvancedOptions: js.UndefOr[typings.awsDashSdk.clientsEsMod.AdvancedOptions] = js.undefined
  /**
    * Options to specify the Cognito user and identity pools for Kibana authentication. For more information, see Amazon Cognito Authentication for Kibana.
    */
  var CognitoOptions: js.UndefOr[typings.awsDashSdk.clientsEsMod.CognitoOptions] = js.undefined
  /**
    * Options to specify configuration that will be applied to the domain endpoint.
    */
  var DomainEndpointOptions: js.UndefOr[typings.awsDashSdk.clientsEsMod.DomainEndpointOptions] = js.undefined
  /**
    * The name of the Elasticsearch domain that you are creating. Domain names are unique across the domains owned by an account within an AWS region. Domain names must start with a lowercase letter and can contain the following characters: a-z (lowercase), 0-9, and - (hyphen).
    */
  var DomainName: typings.awsDashSdk.clientsEsMod.DomainName
  /**
    * Options to enable, disable and specify the type and size of EBS storage volumes. 
    */
  var EBSOptions: js.UndefOr[typings.awsDashSdk.clientsEsMod.EBSOptions] = js.undefined
  /**
    * Configuration options for an Elasticsearch domain. Specifies the instance type and number of instances in the domain cluster. 
    */
  var ElasticsearchClusterConfig: js.UndefOr[typings.awsDashSdk.clientsEsMod.ElasticsearchClusterConfig] = js.undefined
  /**
    * String of format X.Y to specify version for the Elasticsearch domain eg. "1.5" or "2.3". For more information, see Creating Elasticsearch Domains in the Amazon Elasticsearch Service Developer Guide.
    */
  var ElasticsearchVersion: js.UndefOr[ElasticsearchVersionString] = js.undefined
  /**
    * Specifies the Encryption At Rest Options.
    */
  var EncryptionAtRestOptions: js.UndefOr[typings.awsDashSdk.clientsEsMod.EncryptionAtRestOptions] = js.undefined
  /**
    * Map of LogType and LogPublishingOption, each containing options to publish a given type of Elasticsearch log.
    */
  var LogPublishingOptions: js.UndefOr[typings.awsDashSdk.clientsEsMod.LogPublishingOptions] = js.undefined
  /**
    * Specifies the NodeToNodeEncryptionOptions.
    */
  var NodeToNodeEncryptionOptions: js.UndefOr[typings.awsDashSdk.clientsEsMod.NodeToNodeEncryptionOptions] = js.undefined
  /**
    * Option to set time, in UTC format, of the daily automated snapshot. Default value is 0 hours. 
    */
  var SnapshotOptions: js.UndefOr[typings.awsDashSdk.clientsEsMod.SnapshotOptions] = js.undefined
  /**
    * Options to specify the subnets and security groups for VPC endpoint. For more information, see Creating a VPC in VPC Endpoints for Amazon Elasticsearch Service Domains
    */
  var VPCOptions: js.UndefOr[typings.awsDashSdk.clientsEsMod.VPCOptions] = js.undefined
}

object CreateElasticsearchDomainRequest {
  @scala.inline
  def apply(
    DomainName: DomainName,
    AccessPolicies: PolicyDocument = null,
    AdvancedOptions: AdvancedOptions = null,
    CognitoOptions: CognitoOptions = null,
    DomainEndpointOptions: DomainEndpointOptions = null,
    EBSOptions: EBSOptions = null,
    ElasticsearchClusterConfig: ElasticsearchClusterConfig = null,
    ElasticsearchVersion: ElasticsearchVersionString = null,
    EncryptionAtRestOptions: EncryptionAtRestOptions = null,
    LogPublishingOptions: LogPublishingOptions = null,
    NodeToNodeEncryptionOptions: NodeToNodeEncryptionOptions = null,
    SnapshotOptions: SnapshotOptions = null,
    VPCOptions: VPCOptions = null
  ): CreateElasticsearchDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName)
    if (AccessPolicies != null) __obj.updateDynamic("AccessPolicies")(AccessPolicies)
    if (AdvancedOptions != null) __obj.updateDynamic("AdvancedOptions")(AdvancedOptions)
    if (CognitoOptions != null) __obj.updateDynamic("CognitoOptions")(CognitoOptions)
    if (DomainEndpointOptions != null) __obj.updateDynamic("DomainEndpointOptions")(DomainEndpointOptions)
    if (EBSOptions != null) __obj.updateDynamic("EBSOptions")(EBSOptions)
    if (ElasticsearchClusterConfig != null) __obj.updateDynamic("ElasticsearchClusterConfig")(ElasticsearchClusterConfig)
    if (ElasticsearchVersion != null) __obj.updateDynamic("ElasticsearchVersion")(ElasticsearchVersion)
    if (EncryptionAtRestOptions != null) __obj.updateDynamic("EncryptionAtRestOptions")(EncryptionAtRestOptions)
    if (LogPublishingOptions != null) __obj.updateDynamic("LogPublishingOptions")(LogPublishingOptions)
    if (NodeToNodeEncryptionOptions != null) __obj.updateDynamic("NodeToNodeEncryptionOptions")(NodeToNodeEncryptionOptions)
    if (SnapshotOptions != null) __obj.updateDynamic("SnapshotOptions")(SnapshotOptions)
    if (VPCOptions != null) __obj.updateDynamic("VPCOptions")(VPCOptions)
    __obj.asInstanceOf[CreateElasticsearchDomainRequest]
  }
}

