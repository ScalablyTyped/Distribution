package typings.awsDashSdk.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationDetail extends js.Object {
  /**
    * ARN of the application.
    */
  var ApplicationARN: ResourceARN
  /**
    * Returns the application code that you provided to perform data analysis on any of the in-application streams in your application.
    */
  var ApplicationCode: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsMod.ApplicationCode] = js.undefined
  /**
    * Description of the application.
    */
  var ApplicationDescription: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsMod.ApplicationDescription] = js.undefined
  /**
    * Name of the application.
    */
  var ApplicationName: typings.awsDashSdk.clientsKinesisanalyticsMod.ApplicationName
  /**
    * Status of the application.
    */
  var ApplicationStatus: typings.awsDashSdk.clientsKinesisanalyticsMod.ApplicationStatus
  /**
    * Provides the current application version.
    */
  var ApplicationVersionId: typings.awsDashSdk.clientsKinesisanalyticsMod.ApplicationVersionId
  /**
    * Describes the CloudWatch log streams that are configured to receive application messages. For more information about using CloudWatch log streams with Amazon Kinesis Analytics applications, see Working with Amazon CloudWatch Logs. 
    */
  var CloudWatchLoggingOptionDescriptions: js.UndefOr[
    typings.awsDashSdk.clientsKinesisanalyticsMod.CloudWatchLoggingOptionDescriptions
  ] = js.undefined
  /**
    * Time stamp when the application version was created.
    */
  var CreateTimestamp: js.UndefOr[Timestamp] = js.undefined
  /**
    * Describes the application input configuration. For more information, see Configuring Application Input. 
    */
  var InputDescriptions: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsMod.InputDescriptions] = js.undefined
  /**
    * Time stamp when the application was last updated.
    */
  var LastUpdateTimestamp: js.UndefOr[Timestamp] = js.undefined
  /**
    * Describes the application output configuration. For more information, see Configuring Application Output. 
    */
  var OutputDescriptions: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsMod.OutputDescriptions] = js.undefined
  /**
    * Describes reference data sources configured for the application. For more information, see Configuring Application Input. 
    */
  var ReferenceDataSourceDescriptions: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsMod.ReferenceDataSourceDescriptions] = js.undefined
}

object ApplicationDetail {
  @scala.inline
  def apply(
    ApplicationARN: ResourceARN,
    ApplicationName: ApplicationName,
    ApplicationStatus: ApplicationStatus,
    ApplicationVersionId: ApplicationVersionId,
    ApplicationCode: ApplicationCode = null,
    ApplicationDescription: ApplicationDescription = null,
    CloudWatchLoggingOptionDescriptions: CloudWatchLoggingOptionDescriptions = null,
    CreateTimestamp: Timestamp = null,
    InputDescriptions: InputDescriptions = null,
    LastUpdateTimestamp: Timestamp = null,
    OutputDescriptions: OutputDescriptions = null,
    ReferenceDataSourceDescriptions: ReferenceDataSourceDescriptions = null
  ): ApplicationDetail = {
    val __obj = js.Dynamic.literal(ApplicationARN = ApplicationARN, ApplicationName = ApplicationName, ApplicationStatus = ApplicationStatus.asInstanceOf[js.Any], ApplicationVersionId = ApplicationVersionId)
    if (ApplicationCode != null) __obj.updateDynamic("ApplicationCode")(ApplicationCode)
    if (ApplicationDescription != null) __obj.updateDynamic("ApplicationDescription")(ApplicationDescription)
    if (CloudWatchLoggingOptionDescriptions != null) __obj.updateDynamic("CloudWatchLoggingOptionDescriptions")(CloudWatchLoggingOptionDescriptions)
    if (CreateTimestamp != null) __obj.updateDynamic("CreateTimestamp")(CreateTimestamp)
    if (InputDescriptions != null) __obj.updateDynamic("InputDescriptions")(InputDescriptions)
    if (LastUpdateTimestamp != null) __obj.updateDynamic("LastUpdateTimestamp")(LastUpdateTimestamp)
    if (OutputDescriptions != null) __obj.updateDynamic("OutputDescriptions")(OutputDescriptions)
    if (ReferenceDataSourceDescriptions != null) __obj.updateDynamic("ReferenceDataSourceDescriptions")(ReferenceDataSourceDescriptions)
    __obj.asInstanceOf[ApplicationDetail]
  }
}

