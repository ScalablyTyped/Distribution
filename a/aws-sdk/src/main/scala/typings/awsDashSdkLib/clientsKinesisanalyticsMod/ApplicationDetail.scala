package typings
package awsDashSdkLib.clientsKinesisanalyticsMod

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
  var ApplicationCode: js.UndefOr[ApplicationCode] = js.undefined
  /**
    * Description of the application.
    */
  var ApplicationDescription: js.UndefOr[ApplicationDescription] = js.undefined
  /**
    * Name of the application.
    */
  var ApplicationName: awsDashSdkLib.clientsKinesisanalyticsMod.ApplicationName
  /**
    * Status of the application.
    */
  var ApplicationStatus: awsDashSdkLib.clientsKinesisanalyticsMod.ApplicationStatus
  /**
    * Provides the current application version.
    */
  var ApplicationVersionId: awsDashSdkLib.clientsKinesisanalyticsMod.ApplicationVersionId
  /**
    * Describes the CloudWatch log streams that are configured to receive application messages. For more information about using CloudWatch log streams with Amazon Kinesis Analytics applications, see Working with Amazon CloudWatch Logs. 
    */
  var CloudWatchLoggingOptionDescriptions: js.UndefOr[CloudWatchLoggingOptionDescriptions] = js.undefined
  /**
    * Time stamp when the application version was created.
    */
  var CreateTimestamp: js.UndefOr[Timestamp] = js.undefined
  /**
    * Describes the application input configuration. For more information, see Configuring Application Input. 
    */
  var InputDescriptions: js.UndefOr[InputDescriptions] = js.undefined
  /**
    * Time stamp when the application was last updated.
    */
  var LastUpdateTimestamp: js.UndefOr[Timestamp] = js.undefined
  /**
    * Describes the application output configuration. For more information, see Configuring Application Output. 
    */
  var OutputDescriptions: js.UndefOr[OutputDescriptions] = js.undefined
  /**
    * Describes reference data sources configured for the application. For more information, see Configuring Application Input. 
    */
  var ReferenceDataSourceDescriptions: js.UndefOr[ReferenceDataSourceDescriptions] = js.undefined
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

