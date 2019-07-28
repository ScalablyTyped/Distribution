package typings.awsDashSdk.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElasticsearchDestinationDescription extends js.Object {
  /**
    * The buffering options.
    */
  var BufferingHints: js.UndefOr[ElasticsearchBufferingHints] = js.undefined
  /**
    * The Amazon CloudWatch logging options.
    */
  var CloudWatchLoggingOptions: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.CloudWatchLoggingOptions] = js.undefined
  /**
    * The ARN of the Amazon ES domain. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var DomainARN: js.UndefOr[ElasticsearchDomainARN] = js.undefined
  /**
    * The Elasticsearch index name.
    */
  var IndexName: js.UndefOr[ElasticsearchIndexName] = js.undefined
  /**
    * The Elasticsearch index rotation period
    */
  var IndexRotationPeriod: js.UndefOr[ElasticsearchIndexRotationPeriod] = js.undefined
  /**
    * The data processing configuration.
    */
  var ProcessingConfiguration: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.ProcessingConfiguration] = js.undefined
  /**
    * The Amazon ES retry options.
    */
  var RetryOptions: js.UndefOr[ElasticsearchRetryOptions] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the AWS credentials. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var RoleARN: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.RoleARN] = js.undefined
  /**
    * The Amazon S3 backup mode.
    */
  var S3BackupMode: js.UndefOr[ElasticsearchS3BackupMode] = js.undefined
  /**
    * The Amazon S3 destination.
    */
  var S3DestinationDescription: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.S3DestinationDescription] = js.undefined
  /**
    * The Elasticsearch type name.
    */
  var TypeName: js.UndefOr[ElasticsearchTypeName] = js.undefined
}

object ElasticsearchDestinationDescription {
  @scala.inline
  def apply(
    BufferingHints: ElasticsearchBufferingHints = null,
    CloudWatchLoggingOptions: CloudWatchLoggingOptions = null,
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
    if (BufferingHints != null) __obj.updateDynamic("BufferingHints")(BufferingHints)
    if (CloudWatchLoggingOptions != null) __obj.updateDynamic("CloudWatchLoggingOptions")(CloudWatchLoggingOptions)
    if (DomainARN != null) __obj.updateDynamic("DomainARN")(DomainARN)
    if (IndexName != null) __obj.updateDynamic("IndexName")(IndexName)
    if (IndexRotationPeriod != null) __obj.updateDynamic("IndexRotationPeriod")(IndexRotationPeriod.asInstanceOf[js.Any])
    if (ProcessingConfiguration != null) __obj.updateDynamic("ProcessingConfiguration")(ProcessingConfiguration)
    if (RetryOptions != null) __obj.updateDynamic("RetryOptions")(RetryOptions)
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN)
    if (S3BackupMode != null) __obj.updateDynamic("S3BackupMode")(S3BackupMode.asInstanceOf[js.Any])
    if (S3DestinationDescription != null) __obj.updateDynamic("S3DestinationDescription")(S3DestinationDescription)
    if (TypeName != null) __obj.updateDynamic("TypeName")(TypeName)
    __obj.asInstanceOf[ElasticsearchDestinationDescription]
  }
}

