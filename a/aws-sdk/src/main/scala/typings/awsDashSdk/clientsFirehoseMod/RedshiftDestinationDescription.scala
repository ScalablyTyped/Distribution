package typings.awsDashSdk.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedshiftDestinationDescription extends js.Object {
  /**
    * The Amazon CloudWatch logging options for your delivery stream.
    */
  var CloudWatchLoggingOptions: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.CloudWatchLoggingOptions] = js.native
  /**
    * The database connection string.
    */
  var ClusterJDBCURL: typings.awsDashSdk.clientsFirehoseMod.ClusterJDBCURL = js.native
  /**
    * The COPY command.
    */
  var CopyCommand: typings.awsDashSdk.clientsFirehoseMod.CopyCommand = js.native
  /**
    * The data processing configuration.
    */
  var ProcessingConfiguration: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.ProcessingConfiguration] = js.native
  /**
    * The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon Redshift. Default value is 3600 (60 minutes).
    */
  var RetryOptions: js.UndefOr[RedshiftRetryOptions] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS credentials. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var RoleARN: typings.awsDashSdk.clientsFirehoseMod.RoleARN = js.native
  /**
    * The configuration for backup in Amazon S3.
    */
  var S3BackupDescription: js.UndefOr[S3DestinationDescription] = js.native
  /**
    * The Amazon S3 backup mode.
    */
  var S3BackupMode: js.UndefOr[RedshiftS3BackupMode] = js.native
  /**
    * The Amazon S3 destination.
    */
  var S3DestinationDescription: typings.awsDashSdk.clientsFirehoseMod.S3DestinationDescription = js.native
  /**
    * The name of the user.
    */
  var Username: typings.awsDashSdk.clientsFirehoseMod.Username = js.native
}

object RedshiftDestinationDescription {
  @scala.inline
  def apply(
    ClusterJDBCURL: ClusterJDBCURL,
    CopyCommand: CopyCommand,
    RoleARN: RoleARN,
    S3DestinationDescription: S3DestinationDescription,
    Username: Username,
    CloudWatchLoggingOptions: CloudWatchLoggingOptions = null,
    ProcessingConfiguration: ProcessingConfiguration = null,
    RetryOptions: RedshiftRetryOptions = null,
    S3BackupDescription: S3DestinationDescription = null,
    S3BackupMode: RedshiftS3BackupMode = null
  ): RedshiftDestinationDescription = {
    val __obj = js.Dynamic.literal(ClusterJDBCURL = ClusterJDBCURL.asInstanceOf[js.Any], CopyCommand = CopyCommand.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any], S3DestinationDescription = S3DestinationDescription.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    if (CloudWatchLoggingOptions != null) __obj.updateDynamic("CloudWatchLoggingOptions")(CloudWatchLoggingOptions.asInstanceOf[js.Any])
    if (ProcessingConfiguration != null) __obj.updateDynamic("ProcessingConfiguration")(ProcessingConfiguration.asInstanceOf[js.Any])
    if (RetryOptions != null) __obj.updateDynamic("RetryOptions")(RetryOptions.asInstanceOf[js.Any])
    if (S3BackupDescription != null) __obj.updateDynamic("S3BackupDescription")(S3BackupDescription.asInstanceOf[js.Any])
    if (S3BackupMode != null) __obj.updateDynamic("S3BackupMode")(S3BackupMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftDestinationDescription]
  }
}

