package typings.awsDashSdk.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElasticsearchDestinationUpdate extends js.Object {
  /**
    * The buffering options. If no value is specified, ElasticsearchBufferingHints object default values are used. 
    */
  var BufferingHints: js.UndefOr[ElasticsearchBufferingHints] = js.undefined
  /**
    * The CloudWatch logging options for your delivery stream.
    */
  var CloudWatchLoggingOptions: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.CloudWatchLoggingOptions] = js.undefined
  /**
    * The ARN of the Amazon ES domain. The IAM role must have permissions for DescribeElasticsearchDomain, DescribeElasticsearchDomains, and DescribeElasticsearchDomainConfig after assuming the IAM role specified in RoleARN. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var DomainARN: js.UndefOr[ElasticsearchDomainARN] = js.undefined
  /**
    * The Elasticsearch index name.
    */
  var IndexName: js.UndefOr[ElasticsearchIndexName] = js.undefined
  /**
    * The Elasticsearch index rotation period. Index rotation appends a timestamp to IndexName to facilitate the expiration of old data. For more information, see Index Rotation for the Amazon ES Destination. Default value is OneDay.
    */
  var IndexRotationPeriod: js.UndefOr[ElasticsearchIndexRotationPeriod] = js.undefined
  /**
    * The data processing configuration.
    */
  var ProcessingConfiguration: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.ProcessingConfiguration] = js.undefined
  /**
    * The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon ES. The default value is 300 (5 minutes).
    */
  var RetryOptions: js.UndefOr[ElasticsearchRetryOptions] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data Firehose for calling the Amazon ES Configuration API and for indexing documents. For more information, see Grant Kinesis Data Firehose Access to an Amazon S3 Destination and Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var RoleARN: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.RoleARN] = js.undefined
  /**
    * The Amazon S3 destination.
    */
  var S3Update: js.UndefOr[S3DestinationUpdate] = js.undefined
  /**
    * The Elasticsearch type name. For Elasticsearch 6.x, there can be only one type per index. If you try to specify a new type for an existing index that already has another type, Kinesis Data Firehose returns an error during runtime.
    */
  var TypeName: js.UndefOr[ElasticsearchTypeName] = js.undefined
}

object ElasticsearchDestinationUpdate {
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
    S3Update: S3DestinationUpdate = null,
    TypeName: ElasticsearchTypeName = null
  ): ElasticsearchDestinationUpdate = {
    val __obj = js.Dynamic.literal()
    if (BufferingHints != null) __obj.updateDynamic("BufferingHints")(BufferingHints)
    if (CloudWatchLoggingOptions != null) __obj.updateDynamic("CloudWatchLoggingOptions")(CloudWatchLoggingOptions)
    if (DomainARN != null) __obj.updateDynamic("DomainARN")(DomainARN)
    if (IndexName != null) __obj.updateDynamic("IndexName")(IndexName)
    if (IndexRotationPeriod != null) __obj.updateDynamic("IndexRotationPeriod")(IndexRotationPeriod.asInstanceOf[js.Any])
    if (ProcessingConfiguration != null) __obj.updateDynamic("ProcessingConfiguration")(ProcessingConfiguration)
    if (RetryOptions != null) __obj.updateDynamic("RetryOptions")(RetryOptions)
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN)
    if (S3Update != null) __obj.updateDynamic("S3Update")(S3Update)
    if (TypeName != null) __obj.updateDynamic("TypeName")(TypeName)
    __obj.asInstanceOf[ElasticsearchDestinationUpdate]
  }
}

