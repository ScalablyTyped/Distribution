package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationDetail extends js.Object {
  /**
    * The ARN of the application.
    */
  var ApplicationARN: ResourceARN = js.native
  /**
    * Provides details about the application's SQL or Java code and starting parameters.
    */
  var ApplicationConfigurationDescription: js.UndefOr[
    typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationConfigurationDescription
  ] = js.native
  /**
    * The description of the application.
    */
  var ApplicationDescription: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationDescription] = js.native
  /**
    * The name of the application.
    */
  var ApplicationName: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationName = js.native
  /**
    * The status of the application.
    */
  var ApplicationStatus: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationStatus = js.native
  /**
    * Provides the current application version. Kinesis Data Analytics updates the ApplicationVersionId each time you update the application.
    */
  var ApplicationVersionId: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationVersionId = js.native
  /**
    * Describes the application Amazon CloudWatch logging options.
    */
  var CloudWatchLoggingOptionDescriptions: js.UndefOr[
    typings.awsDashSdk.clientsKinesisanalyticsv2Mod.CloudWatchLoggingOptionDescriptions
  ] = js.native
  /**
    * The current timestamp when the application was created.
    */
  var CreateTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The current timestamp when the application was last updated.
    */
  var LastUpdateTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The runtime environment for the application (SQL-1.0 or FLINK-1_6).
    */
  var RuntimeEnvironment: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.RuntimeEnvironment = js.native
  /**
    * Specifies the IAM role that the application uses to access external resources.
    */
  var ServiceExecutionRole: js.UndefOr[RoleARN] = js.native
}

object ApplicationDetail {
  @scala.inline
  def apply(
    ApplicationARN: ResourceARN,
    ApplicationName: ApplicationName,
    ApplicationStatus: ApplicationStatus,
    ApplicationVersionId: ApplicationVersionId,
    RuntimeEnvironment: RuntimeEnvironment,
    ApplicationConfigurationDescription: ApplicationConfigurationDescription = null,
    ApplicationDescription: ApplicationDescription = null,
    CloudWatchLoggingOptionDescriptions: CloudWatchLoggingOptionDescriptions = null,
    CreateTimestamp: Timestamp = null,
    LastUpdateTimestamp: Timestamp = null,
    ServiceExecutionRole: RoleARN = null
  ): ApplicationDetail = {
    val __obj = js.Dynamic.literal(ApplicationARN = ApplicationARN.asInstanceOf[js.Any], ApplicationName = ApplicationName.asInstanceOf[js.Any], ApplicationStatus = ApplicationStatus.asInstanceOf[js.Any], ApplicationVersionId = ApplicationVersionId.asInstanceOf[js.Any], RuntimeEnvironment = RuntimeEnvironment.asInstanceOf[js.Any])
    if (ApplicationConfigurationDescription != null) __obj.updateDynamic("ApplicationConfigurationDescription")(ApplicationConfigurationDescription.asInstanceOf[js.Any])
    if (ApplicationDescription != null) __obj.updateDynamic("ApplicationDescription")(ApplicationDescription.asInstanceOf[js.Any])
    if (CloudWatchLoggingOptionDescriptions != null) __obj.updateDynamic("CloudWatchLoggingOptionDescriptions")(CloudWatchLoggingOptionDescriptions.asInstanceOf[js.Any])
    if (CreateTimestamp != null) __obj.updateDynamic("CreateTimestamp")(CreateTimestamp.asInstanceOf[js.Any])
    if (LastUpdateTimestamp != null) __obj.updateDynamic("LastUpdateTimestamp")(LastUpdateTimestamp.asInstanceOf[js.Any])
    if (ServiceExecutionRole != null) __obj.updateDynamic("ServiceExecutionRole")(ServiceExecutionRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationDetail]
  }
}

