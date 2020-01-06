package typings.awsDashSdk.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedshiftDestinationUpdate extends js.Object {
  /**
    * The Amazon CloudWatch logging options for your delivery stream.
    */
  var CloudWatchLoggingOptions: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.CloudWatchLoggingOptions] = js.native
  /**
    * The database connection string.
    */
  var ClusterJDBCURL: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.ClusterJDBCURL] = js.native
  /**
    * The COPY command.
    */
  var CopyCommand: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.CopyCommand] = js.native
  /**
    * The user password.
    */
  var Password: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.Password] = js.native
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
  var RoleARN: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.RoleARN] = js.native
  /**
    * The Amazon S3 backup mode.
    */
  var S3BackupMode: js.UndefOr[RedshiftS3BackupMode] = js.native
  /**
    * The Amazon S3 destination for backup.
    */
  var S3BackupUpdate: js.UndefOr[S3DestinationUpdate] = js.native
  /**
    * The Amazon S3 destination. The compression formats SNAPPY or ZIP cannot be specified in RedshiftDestinationUpdate.S3Update because the Amazon Redshift COPY operation that reads from the S3 bucket doesn't support these compression formats.
    */
  var S3Update: js.UndefOr[S3DestinationUpdate] = js.native
  /**
    * The name of the user.
    */
  var Username: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.Username] = js.native
}

object RedshiftDestinationUpdate {
  @scala.inline
  def apply(
    CloudWatchLoggingOptions: CloudWatchLoggingOptions = null,
    ClusterJDBCURL: ClusterJDBCURL = null,
    CopyCommand: CopyCommand = null,
    Password: Password = null,
    ProcessingConfiguration: ProcessingConfiguration = null,
    RetryOptions: RedshiftRetryOptions = null,
    RoleARN: RoleARN = null,
    S3BackupMode: RedshiftS3BackupMode = null,
    S3BackupUpdate: S3DestinationUpdate = null,
    S3Update: S3DestinationUpdate = null,
    Username: Username = null
  ): RedshiftDestinationUpdate = {
    val __obj = js.Dynamic.literal()
    if (CloudWatchLoggingOptions != null) __obj.updateDynamic("CloudWatchLoggingOptions")(CloudWatchLoggingOptions.asInstanceOf[js.Any])
    if (ClusterJDBCURL != null) __obj.updateDynamic("ClusterJDBCURL")(ClusterJDBCURL.asInstanceOf[js.Any])
    if (CopyCommand != null) __obj.updateDynamic("CopyCommand")(CopyCommand.asInstanceOf[js.Any])
    if (Password != null) __obj.updateDynamic("Password")(Password.asInstanceOf[js.Any])
    if (ProcessingConfiguration != null) __obj.updateDynamic("ProcessingConfiguration")(ProcessingConfiguration.asInstanceOf[js.Any])
    if (RetryOptions != null) __obj.updateDynamic("RetryOptions")(RetryOptions.asInstanceOf[js.Any])
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN.asInstanceOf[js.Any])
    if (S3BackupMode != null) __obj.updateDynamic("S3BackupMode")(S3BackupMode.asInstanceOf[js.Any])
    if (S3BackupUpdate != null) __obj.updateDynamic("S3BackupUpdate")(S3BackupUpdate.asInstanceOf[js.Any])
    if (S3Update != null) __obj.updateDynamic("S3Update")(S3Update.asInstanceOf[js.Any])
    if (Username != null) __obj.updateDynamic("Username")(Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftDestinationUpdate]
  }
}

