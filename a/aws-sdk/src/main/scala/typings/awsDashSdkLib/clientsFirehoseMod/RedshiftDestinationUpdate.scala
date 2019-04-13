package typings
package awsDashSdkLib.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedshiftDestinationUpdate extends js.Object {
  /**
    * The Amazon CloudWatch logging options for your delivery stream.
    */
  var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined
  /**
    * The database connection string.
    */
  var ClusterJDBCURL: js.UndefOr[ClusterJDBCURL] = js.undefined
  /**
    * The COPY command.
    */
  var CopyCommand: js.UndefOr[CopyCommand] = js.undefined
  /**
    * The user password.
    */
  var Password: js.UndefOr[Password] = js.undefined
  /**
    * The data processing configuration.
    */
  var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration] = js.undefined
  /**
    * The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon Redshift. Default value is 3600 (60 minutes).
    */
  var RetryOptions: js.UndefOr[RedshiftRetryOptions] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the AWS credentials. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var RoleARN: js.UndefOr[RoleARN] = js.undefined
  /**
    * The Amazon S3 backup mode.
    */
  var S3BackupMode: js.UndefOr[RedshiftS3BackupMode] = js.undefined
  /**
    * The Amazon S3 destination for backup.
    */
  var S3BackupUpdate: js.UndefOr[S3DestinationUpdate] = js.undefined
  /**
    * The Amazon S3 destination. The compression formats SNAPPY or ZIP cannot be specified in RedshiftDestinationUpdate.S3Update because the Amazon Redshift COPY operation that reads from the S3 bucket doesn't support these compression formats.
    */
  var S3Update: js.UndefOr[S3DestinationUpdate] = js.undefined
  /**
    * The name of the user.
    */
  var Username: js.UndefOr[Username] = js.undefined
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
    if (CloudWatchLoggingOptions != null) __obj.updateDynamic("CloudWatchLoggingOptions")(CloudWatchLoggingOptions)
    if (ClusterJDBCURL != null) __obj.updateDynamic("ClusterJDBCURL")(ClusterJDBCURL)
    if (CopyCommand != null) __obj.updateDynamic("CopyCommand")(CopyCommand)
    if (Password != null) __obj.updateDynamic("Password")(Password)
    if (ProcessingConfiguration != null) __obj.updateDynamic("ProcessingConfiguration")(ProcessingConfiguration)
    if (RetryOptions != null) __obj.updateDynamic("RetryOptions")(RetryOptions)
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN)
    if (S3BackupMode != null) __obj.updateDynamic("S3BackupMode")(S3BackupMode.asInstanceOf[js.Any])
    if (S3BackupUpdate != null) __obj.updateDynamic("S3BackupUpdate")(S3BackupUpdate)
    if (S3Update != null) __obj.updateDynamic("S3Update")(S3Update)
    if (Username != null) __obj.updateDynamic("Username")(Username)
    __obj.asInstanceOf[RedshiftDestinationUpdate]
  }
}

