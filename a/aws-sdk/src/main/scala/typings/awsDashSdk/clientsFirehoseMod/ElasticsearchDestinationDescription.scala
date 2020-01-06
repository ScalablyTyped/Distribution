package typings.awsDashSdk.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticsearchDestinationDescription extends js.Object {
  /**
    * The buffering options.
    */
  var BufferingHints: js.UndefOr[ElasticsearchBufferingHints] = js.native
  /**
    * The Amazon CloudWatch logging options.
    */
  var CloudWatchLoggingOptions: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.CloudWatchLoggingOptions] = js.native
  /**
    * The endpoint to use when communicating with the cluster. Kinesis Data Firehose uses either this ClusterEndpoint or the DomainARN field to send data to Amazon ES.
    */
  var ClusterEndpoint: js.UndefOr[ElasticsearchClusterEndpoint] = js.native
  /**
    * The ARN of the Amazon ES domain. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces. Kinesis Data Firehose uses either ClusterEndpoint or DomainARN to send data to Amazon ES.
    */
  var DomainARN: js.UndefOr[ElasticsearchDomainARN] = js.native
  /**
    * The Elasticsearch index name.
    */
  var IndexName: js.UndefOr[ElasticsearchIndexName] = js.native
  /**
    * The Elasticsearch index rotation period
    */
  var IndexRotationPeriod: js.UndefOr[ElasticsearchIndexRotationPeriod] = js.native
  /**
    * The data processing configuration.
    */
  var ProcessingConfiguration: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.ProcessingConfiguration] = js.native
  /**
    * The Amazon ES retry options.
    */
  var RetryOptions: js.UndefOr[ElasticsearchRetryOptions] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS credentials. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var RoleARN: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.RoleARN] = js.native
  /**
    * The Amazon S3 backup mode.
    */
  var S3BackupMode: js.UndefOr[ElasticsearchS3BackupMode] = js.native
  /**
    * The Amazon S3 destination.
    */
  var S3DestinationDescription: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.S3DestinationDescription] = js.native
  /**
    * The Elasticsearch type name. This applies to Elasticsearch 6.x and lower versions. For Elasticsearch 7.x, there's no value for TypeName.
    */
  var TypeName: js.UndefOr[ElasticsearchTypeName] = js.native
}

object ElasticsearchDestinationDescription {
  @scala.inline
  def apply(
    BufferingHints: ElasticsearchBufferingHints = null,
    CloudWatchLoggingOptions: CloudWatchLoggingOptions = null,
    ClusterEndpoint: ElasticsearchClusterEndpoint = null,
    DomainARN: ElasticsearchDomainARN = null,
    IndexName: ElasticsearchIndexName = null,
    IndexRotationPeriod: ElasticsearchIndexRotationPeriod = null,
    ProcessingConfiguration: ProcessingConfiguration = null,
    RetryOptions: ElasticsearchRetryOptions = null,
    RoleARN: RoleARN = null,
    S3BackupMode: ElasticsearchS3BackupMode = null,
    S3DestinationDescription: S3DestinationDescription = null,
    TypeName: ElasticsearchTypeName = null
  ): ElasticsearchDestinationDescription = {
    val __obj = js.Dynamic.literal()
    if (BufferingHints != null) __obj.updateDynamic("BufferingHints")(BufferingHints.asInstanceOf[js.Any])
    if (CloudWatchLoggingOptions != null) __obj.updateDynamic("CloudWatchLoggingOptions")(CloudWatchLoggingOptions.asInstanceOf[js.Any])
    if (ClusterEndpoint != null) __obj.updateDynamic("ClusterEndpoint")(ClusterEndpoint.asInstanceOf[js.Any])
    if (DomainARN != null) __obj.updateDynamic("DomainARN")(DomainARN.asInstanceOf[js.Any])
    if (IndexName != null) __obj.updateDynamic("IndexName")(IndexName.asInstanceOf[js.Any])
    if (IndexRotationPeriod != null) __obj.updateDynamic("IndexRotationPeriod")(IndexRotationPeriod.asInstanceOf[js.Any])
    if (ProcessingConfiguration != null) __obj.updateDynamic("ProcessingConfiguration")(ProcessingConfiguration.asInstanceOf[js.Any])
    if (RetryOptions != null) __obj.updateDynamic("RetryOptions")(RetryOptions.asInstanceOf[js.Any])
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN.asInstanceOf[js.Any])
    if (S3BackupMode != null) __obj.updateDynamic("S3BackupMode")(S3BackupMode.asInstanceOf[js.Any])
    if (S3DestinationDescription != null) __obj.updateDynamic("S3DestinationDescription")(S3DestinationDescription.asInstanceOf[js.Any])
    if (TypeName != null) __obj.updateDynamic("TypeName")(TypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticsearchDestinationDescription]
  }
}

