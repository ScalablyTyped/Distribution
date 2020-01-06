package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApplicationRequest extends js.Object {
  /**
    * Describes application configuration updates.
    */
  var ApplicationConfigurationUpdate: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationConfigurationUpdate] = js.native
  /**
    * The name of the application to update.
    */
  var ApplicationName: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationName = js.native
  /**
    * Describes application Amazon CloudWatch logging option updates. You can only update existing CloudWatch logging options with this action. To add a new CloudWatch logging option, use AddApplicationCloudWatchLoggingOption.
    */
  var CloudWatchLoggingOptionUpdates: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.CloudWatchLoggingOptionUpdates] = js.native
  /**
    * The current application version ID. You can retrieve the application version ID using DescribeApplication.
    */
  var CurrentApplicationVersionId: ApplicationVersionId = js.native
  /**
    * Describes updates to the application's starting parameters.
    */
  var RunConfigurationUpdate: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.RunConfigurationUpdate] = js.native
  /**
    * Describes updates to the service execution role.
    */
  var ServiceExecutionRoleUpdate: js.UndefOr[RoleARN] = js.native
}

object UpdateApplicationRequest {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName,
    CurrentApplicationVersionId: ApplicationVersionId,
    ApplicationConfigurationUpdate: ApplicationConfigurationUpdate = null,
    CloudWatchLoggingOptionUpdates: CloudWatchLoggingOptionUpdates = null,
    RunConfigurationUpdate: RunConfigurationUpdate = null,
    ServiceExecutionRoleUpdate: RoleARN = null
  ): UpdateApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], CurrentApplicationVersionId = CurrentApplicationVersionId.asInstanceOf[js.Any])
    if (ApplicationConfigurationUpdate != null) __obj.updateDynamic("ApplicationConfigurationUpdate")(ApplicationConfigurationUpdate.asInstanceOf[js.Any])
    if (CloudWatchLoggingOptionUpdates != null) __obj.updateDynamic("CloudWatchLoggingOptionUpdates")(CloudWatchLoggingOptionUpdates.asInstanceOf[js.Any])
    if (RunConfigurationUpdate != null) __obj.updateDynamic("RunConfigurationUpdate")(RunConfigurationUpdate.asInstanceOf[js.Any])
    if (ServiceExecutionRoleUpdate != null) __obj.updateDynamic("ServiceExecutionRoleUpdate")(ServiceExecutionRoleUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationRequest]
  }
}

