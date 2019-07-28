package typings.awsDashSdk.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedS3DestinationDescription extends js.Object {
  /**
    * The ARN of the S3 bucket. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var BucketARN: typings.awsDashSdk.clientsFirehoseMod.BucketARN
  /**
    * The buffering option.
    */
  var BufferingHints: typings.awsDashSdk.clientsFirehoseMod.BufferingHints
  /**
    * The Amazon CloudWatch logging options for your delivery stream.
    */
  var CloudWatchLoggingOptions: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.CloudWatchLoggingOptions] = js.undefined
  /**
    * The compression format. If no value is specified, the default is UNCOMPRESSED.
    */
  var CompressionFormat: typings.awsDashSdk.clientsFirehoseMod.CompressionFormat
  /**
    * The serializer, deserializer, and schema for converting data from the JSON format to the Parquet or ORC format before writing it to Amazon S3.
    */
  var DataFormatConversionConfiguration: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.DataFormatConversionConfiguration] = js.undefined
  /**
    * The encryption configuration. If no value is specified, the default is no encryption.
    */
  var EncryptionConfiguration: typings.awsDashSdk.clientsFirehoseMod.EncryptionConfiguration
  /**
    * A prefix that Kinesis Data Firehose evaluates and adds to failed records before writing them to S3. This prefix appears immediately following the bucket name.
    */
  var ErrorOutputPrefix: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.ErrorOutputPrefix] = js.undefined
  /**
    * The "YYYY/MM/DD/HH" time format prefix is automatically used for delivered Amazon S3 files. You can specify an extra prefix to be added in front of the time format prefix. If the prefix ends with a slash, it appears as a folder in the S3 bucket. For more information, see Amazon S3 Object Name Format in the Amazon Kinesis Data Firehose Developer Guide.
    */
  var Prefix: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.Prefix] = js.undefined
  /**
    * The data processing configuration.
    */
  var ProcessingConfiguration: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.ProcessingConfiguration] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the AWS credentials. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var RoleARN: typings.awsDashSdk.clientsFirehoseMod.RoleARN
  /**
    * The configuration for backup in Amazon S3.
    */
  var S3BackupDescription: js.UndefOr[S3DestinationDescription] = js.undefined
  /**
    * The Amazon S3 backup mode.
    */
  var S3BackupMode: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.S3BackupMode] = js.undefined
}

object ExtendedS3DestinationDescription {
  @scala.inline
  def apply(
    BucketARN: BucketARN,
    BufferingHints: BufferingHints,
    CompressionFormat: CompressionFormat,
    EncryptionConfiguration: EncryptionConfiguration,
    RoleARN: RoleARN,
    CloudWatchLoggingOptions: CloudWatchLoggingOptions = null,
    DataFormatConversionConfiguration: DataFormatConversionConfiguration = null,
    ErrorOutputPrefix: ErrorOutputPrefix = null,
    Prefix: Prefix = null,
    ProcessingConfiguration: ProcessingConfiguration = null,
    S3BackupDescription: S3DestinationDescription = null,
    S3BackupMode: S3BackupMode = null
  ): ExtendedS3DestinationDescription = {
    val __obj = js.Dynamic.literal(BucketARN = BucketARN, BufferingHints = BufferingHints, CompressionFormat = CompressionFormat.asInstanceOf[js.Any], EncryptionConfiguration = EncryptionConfiguration, RoleARN = RoleARN)
    if (CloudWatchLoggingOptions != null) __obj.updateDynamic("CloudWatchLoggingOptions")(CloudWatchLoggingOptions)
    if (DataFormatConversionConfiguration != null) __obj.updateDynamic("DataFormatConversionConfiguration")(DataFormatConversionConfiguration)
    if (ErrorOutputPrefix != null) __obj.updateDynamic("ErrorOutputPrefix")(ErrorOutputPrefix)
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    if (ProcessingConfiguration != null) __obj.updateDynamic("ProcessingConfiguration")(ProcessingConfiguration)
    if (S3BackupDescription != null) __obj.updateDynamic("S3BackupDescription")(S3BackupDescription)
    if (S3BackupMode != null) __obj.updateDynamic("S3BackupMode")(S3BackupMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedS3DestinationDescription]
  }
}

