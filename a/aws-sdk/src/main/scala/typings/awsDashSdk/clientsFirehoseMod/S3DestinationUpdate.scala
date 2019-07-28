package typings.awsDashSdk.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3DestinationUpdate extends js.Object {
  /**
    * The ARN of the S3 bucket. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var BucketARN: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.BucketARN] = js.undefined
  /**
    * The buffering option. If no value is specified, BufferingHints object default values are used.
    */
  var BufferingHints: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.BufferingHints] = js.undefined
  /**
    * The CloudWatch logging options for your delivery stream.
    */
  var CloudWatchLoggingOptions: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.CloudWatchLoggingOptions] = js.undefined
  /**
    * The compression format. If no value is specified, the default is UNCOMPRESSED. The compression formats SNAPPY or ZIP cannot be specified for Amazon Redshift destinations because they are not supported by the Amazon Redshift COPY operation that reads from the S3 bucket.
    */
  var CompressionFormat: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.CompressionFormat] = js.undefined
  /**
    * The encryption configuration. If no value is specified, the default is no encryption.
    */
  var EncryptionConfiguration: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.EncryptionConfiguration] = js.undefined
  /**
    * A prefix that Kinesis Data Firehose evaluates and adds to failed records before writing them to S3. This prefix appears immediately following the bucket name.
    */
  var ErrorOutputPrefix: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.ErrorOutputPrefix] = js.undefined
  /**
    * The "YYYY/MM/DD/HH" time format prefix is automatically used for delivered Amazon S3 files. You can specify an extra prefix to be added in front of the time format prefix. If the prefix ends with a slash, it appears as a folder in the S3 bucket. For more information, see Amazon S3 Object Name Format in the Amazon Kinesis Data Firehose Developer Guide.
    */
  var Prefix: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.Prefix] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the AWS credentials. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var RoleARN: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.RoleARN] = js.undefined
}

object S3DestinationUpdate {
  @scala.inline
  def apply(
    BucketARN: BucketARN = null,
    BufferingHints: BufferingHints = null,
    CloudWatchLoggingOptions: CloudWatchLoggingOptions = null,
    CompressionFormat: CompressionFormat = null,
    EncryptionConfiguration: EncryptionConfiguration = null,
    ErrorOutputPrefix: ErrorOutputPrefix = null,
    Prefix: Prefix = null,
    RoleARN: RoleARN = null
  ): S3DestinationUpdate = {
    val __obj = js.Dynamic.literal()
    if (BucketARN != null) __obj.updateDynamic("BucketARN")(BucketARN)
    if (BufferingHints != null) __obj.updateDynamic("BufferingHints")(BufferingHints)
    if (CloudWatchLoggingOptions != null) __obj.updateDynamic("CloudWatchLoggingOptions")(CloudWatchLoggingOptions)
    if (CompressionFormat != null) __obj.updateDynamic("CompressionFormat")(CompressionFormat.asInstanceOf[js.Any])
    if (EncryptionConfiguration != null) __obj.updateDynamic("EncryptionConfiguration")(EncryptionConfiguration)
    if (ErrorOutputPrefix != null) __obj.updateDynamic("ErrorOutputPrefix")(ErrorOutputPrefix)
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN)
    __obj.asInstanceOf[S3DestinationUpdate]
  }
}

