package typings
package awsDashSdkLib.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedshiftDestinationDescription extends js.Object {
  /**
    * The Amazon CloudWatch logging options for your delivery stream.
    */
  var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined
  /**
    * The database connection string.
    */
  var ClusterJDBCURL: awsDashSdkLib.clientsFirehoseMod.ClusterJDBCURL
  /**
    * The COPY command.
    */
  var CopyCommand: awsDashSdkLib.clientsFirehoseMod.CopyCommand
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
  var RoleARN: awsDashSdkLib.clientsFirehoseMod.RoleARN
  /**
    * The configuration for backup in Amazon S3.
    */
  var S3BackupDescription: js.UndefOr[S3DestinationDescription] = js.undefined
  /**
    * The Amazon S3 backup mode.
    */
  var S3BackupMode: js.UndefOr[RedshiftS3BackupMode] = js.undefined
  /**
    * The Amazon S3 destination.
    */
  var S3DestinationDescription: awsDashSdkLib.clientsFirehoseMod.S3DestinationDescription
  /**
    * The name of the user.
    */
  var Username: awsDashSdkLib.clientsFirehoseMod.Username
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
    val __obj = js.Dynamic.literal(ClusterJDBCURL = ClusterJDBCURL, CopyCommand = CopyCommand, RoleARN = RoleARN, S3DestinationDescription = S3DestinationDescription, Username = Username)
    if (CloudWatchLoggingOptions != null) __obj.updateDynamic("CloudWatchLoggingOptions")(CloudWatchLoggingOptions)
    if (ProcessingConfiguration != null) __obj.updateDynamic("ProcessingConfiguration")(ProcessingConfiguration)
    if (RetryOptions != null) __obj.updateDynamic("RetryOptions")(RetryOptions)
    if (S3BackupDescription != null) __obj.updateDynamic("S3BackupDescription")(S3BackupDescription)
    if (S3BackupMode != null) __obj.updateDynamic("S3BackupMode")(S3BackupMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftDestinationDescription]
  }
}

