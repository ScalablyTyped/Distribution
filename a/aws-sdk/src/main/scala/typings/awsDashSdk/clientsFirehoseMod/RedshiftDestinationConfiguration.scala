package typings.awsDashSdk.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedshiftDestinationConfiguration extends js.Object {
  /**
    * The CloudWatch logging options for your delivery stream.
    */
  var CloudWatchLoggingOptions: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.CloudWatchLoggingOptions] = js.undefined
  /**
    * The database connection string.
    */
  var ClusterJDBCURL: typings.awsDashSdk.clientsFirehoseMod.ClusterJDBCURL
  /**
    * The COPY command.
    */
  var CopyCommand: typings.awsDashSdk.clientsFirehoseMod.CopyCommand
  /**
    * The user password.
    */
  var Password: typings.awsDashSdk.clientsFirehoseMod.Password
  /**
    * The data processing configuration.
    */
  var ProcessingConfiguration: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.ProcessingConfiguration] = js.undefined
  /**
    * The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon Redshift. Default value is 3600 (60 minutes).
    */
  var RetryOptions: js.UndefOr[RedshiftRetryOptions] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the AWS credentials. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var RoleARN: typings.awsDashSdk.clientsFirehoseMod.RoleARN
  /**
    * The configuration for backup in Amazon S3.
    */
  var S3BackupConfiguration: js.UndefOr[S3DestinationConfiguration] = js.undefined
  /**
    * The Amazon S3 backup mode.
    */
  var S3BackupMode: js.UndefOr[RedshiftS3BackupMode] = js.undefined
  /**
    * The configuration for the intermediate Amazon S3 location from which Amazon Redshift obtains data. Restrictions are described in the topic for CreateDeliveryStream. The compression formats SNAPPY or ZIP cannot be specified in RedshiftDestinationConfiguration.S3Configuration because the Amazon Redshift COPY operation that reads from the S3 bucket doesn't support these compression formats.
    */
  var S3Configuration: S3DestinationConfiguration
  /**
    * The name of the user.
    */
  var Username: typings.awsDashSdk.clientsFirehoseMod.Username
}

object RedshiftDestinationConfiguration {
  @scala.inline
  def apply(
    ClusterJDBCURL: ClusterJDBCURL,
    CopyCommand: CopyCommand,
    Password: Password,
    RoleARN: RoleARN,
    S3Configuration: S3DestinationConfiguration,
    Username: Username,
    CloudWatchLoggingOptions: CloudWatchLoggingOptions = null,
    ProcessingConfiguration: ProcessingConfiguration = null,
    RetryOptions: RedshiftRetryOptions = null,
    S3BackupConfiguration: S3DestinationConfiguration = null,
    S3BackupMode: RedshiftS3BackupMode = null
  ): RedshiftDestinationConfiguration = {
    val __obj = js.Dynamic.literal(ClusterJDBCURL = ClusterJDBCURL, CopyCommand = CopyCommand, Password = Password, RoleARN = RoleARN, S3Configuration = S3Configuration, Username = Username)
    if (CloudWatchLoggingOptions != null) __obj.updateDynamic("CloudWatchLoggingOptions")(CloudWatchLoggingOptions)
    if (ProcessingConfiguration != null) __obj.updateDynamic("ProcessingConfiguration")(ProcessingConfiguration)
    if (RetryOptions != null) __obj.updateDynamic("RetryOptions")(RetryOptions)
    if (S3BackupConfiguration != null) __obj.updateDynamic("S3BackupConfiguration")(S3BackupConfiguration)
    if (S3BackupMode != null) __obj.updateDynamic("S3BackupMode")(S3BackupMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftDestinationConfiguration]
  }
}

