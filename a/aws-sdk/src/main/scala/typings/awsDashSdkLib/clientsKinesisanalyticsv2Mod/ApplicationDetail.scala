package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationDetail extends js.Object {
  /**
    * The ARN of the application.
    */
  var ApplicationARN: ResourceARN
  /**
    * Provides details about the application's SQL or Java code and starting parameters.
    */
  var ApplicationConfigurationDescription: js.UndefOr[ApplicationConfigurationDescription] = js.undefined
  /**
    * The description of the application.
    */
  var ApplicationDescription: js.UndefOr[ApplicationDescription] = js.undefined
  /**
    * The name of the application.
    */
  var ApplicationName: awsDashSdkLib.clientsKinesisanalyticsv2Mod.ApplicationName
  /**
    * The status of the application.
    */
  var ApplicationStatus: awsDashSdkLib.clientsKinesisanalyticsv2Mod.ApplicationStatus
  /**
    * Provides the current application version. Kinesis Data Analytics updates the ApplicationVersionId each time you update the application.
    */
  var ApplicationVersionId: awsDashSdkLib.clientsKinesisanalyticsv2Mod.ApplicationVersionId
  /**
    * Describes the application Amazon CloudWatch logging options.
    */
  var CloudWatchLoggingOptionDescriptions: js.UndefOr[CloudWatchLoggingOptionDescriptions] = js.undefined
  /**
    * The current timestamp when the application was created.
    */
  var CreateTimestamp: js.UndefOr[Timestamp] = js.undefined
  /**
    * The current timestamp when the application was last updated.
    */
  var LastUpdateTimestamp: js.UndefOr[Timestamp] = js.undefined
  /**
    * The runtime environment for the application (SQL-1.0 or JAVA-8-FLINK-1.5).
    */
  var RuntimeEnvironment: awsDashSdkLib.clientsKinesisanalyticsv2Mod.RuntimeEnvironment
  /**
    * Specifies the IAM role that the application uses to access external resources.
    */
  var ServiceExecutionRole: js.UndefOr[RoleARN] = js.undefined
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
    val __obj = js.Dynamic.literal(ApplicationARN = ApplicationARN, ApplicationName = ApplicationName, ApplicationStatus = ApplicationStatus.asInstanceOf[js.Any], ApplicationVersionId = ApplicationVersionId, RuntimeEnvironment = RuntimeEnvironment.asInstanceOf[js.Any])
    if (ApplicationConfigurationDescription != null) __obj.updateDynamic("ApplicationConfigurationDescription")(ApplicationConfigurationDescription)
    if (ApplicationDescription != null) __obj.updateDynamic("ApplicationDescription")(ApplicationDescription)
    if (CloudWatchLoggingOptionDescriptions != null) __obj.updateDynamic("CloudWatchLoggingOptionDescriptions")(CloudWatchLoggingOptionDescriptions)
    if (CreateTimestamp != null) __obj.updateDynamic("CreateTimestamp")(CreateTimestamp)
    if (LastUpdateTimestamp != null) __obj.updateDynamic("LastUpdateTimestamp")(LastUpdateTimestamp)
    if (ServiceExecutionRole != null) __obj.updateDynamic("ServiceExecutionRole")(ServiceExecutionRole)
    __obj.asInstanceOf[ApplicationDetail]
  }
}

