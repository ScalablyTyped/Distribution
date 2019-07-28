package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

object ElasticsearchDomainConfig {
  @scala.inline
  def apply(
    AccessPolicies: AccessPoliciesStatus = null,
    AdvancedOptions: AdvancedOptionsStatus = null,
    CognitoOptions: CognitoOptionsStatus = null,
    EBSOptions: EBSOptionsStatus = null,
    ElasticsearchClusterConfig: ElasticsearchClusterConfigStatus = null,
    ElasticsearchVersion: ElasticsearchVersionStatus = null,
    EncryptionAtRestOptions: EncryptionAtRestOptionsStatus = null,
    LogPublishingOptions: LogPublishingOptionsStatus = null,
    NodeToNodeEncryptionOptions: NodeToNodeEncryptionOptionsStatus = null,
    SnapshotOptions: SnapshotOptionsStatus = null,
    VPCOptions: VPCDerivedInfoStatus = null
  ): ElasticsearchDomainConfig = {
    val __obj = js.Dynamic.literal()
    if (AccessPolicies != null) __obj.updateDynamic("AccessPolicies")(AccessPolicies)
    if (AdvancedOptions != null) __obj.updateDynamic("AdvancedOptions")(AdvancedOptions)
    if (CognitoOptions != null) __obj.updateDynamic("CognitoOptions")(CognitoOptions)
    if (EBSOptions != null) __obj.updateDynamic("EBSOptions")(EBSOptions)
    if (ElasticsearchClusterConfig != null) __obj.updateDynamic("ElasticsearchClusterConfig")(ElasticsearchClusterConfig)
    if (ElasticsearchVersion != null) __obj.updateDynamic("ElasticsearchVersion")(ElasticsearchVersion)
    if (EncryptionAtRestOptions != null) __obj.updateDynamic("EncryptionAtRestOptions")(EncryptionAtRestOptions)
    if (LogPublishingOptions != null) __obj.updateDynamic("LogPublishingOptions")(LogPublishingOptions)
    if (NodeToNodeEncryptionOptions != null) __obj.updateDynamic("NodeToNodeEncryptionOptions")(NodeToNodeEncryptionOptions)
    if (SnapshotOptions != null) __obj.updateDynamic("SnapshotOptions")(SnapshotOptions)
    if (VPCOptions != null) __obj.updateDynamic("VPCOptions")(VPCOptions)
    __obj.asInstanceOf[ElasticsearchDomainConfig]
  }
}

