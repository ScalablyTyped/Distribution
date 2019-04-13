package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateApplicationRequest extends js.Object {
  /**
    * Describes application configuration updates.
    */
  var ApplicationConfigurationUpdate: js.UndefOr[ApplicationConfigurationUpdate] = js.undefined
  /**
    * The name of the application to update.
    */
  var ApplicationName: awsDashSdkLib.clientsKinesisanalyticsv2Mod.ApplicationName
  /**
    * Describes application Amazon CloudWatch logging option updates. You can only update existing CloudWatch logging options with this action. To add a new CloudWatch logging option, use AddApplicationCloudWatchLoggingOption.
    */
  var CloudWatchLoggingOptionUpdates: js.UndefOr[CloudWatchLoggingOptionUpdates] = js.undefined
  /**
    * The current application version ID. You can retrieve the application version ID using DescribeApplication.
    */
  var CurrentApplicationVersionId: ApplicationVersionId
  /**
    * Describes updates to the application's starting parameters.
    */
  var RunConfigurationUpdate: js.UndefOr[RunConfigurationUpdate] = js.undefined
  /**
    * Describes updates to the service execution role.
    */
  var ServiceExecutionRoleUpdate: js.UndefOr[RoleARN] = js.undefined
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
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName, CurrentApplicationVersionId = CurrentApplicationVersionId)
    if (ApplicationConfigurationUpdate != null) __obj.updateDynamic("ApplicationConfigurationUpdate")(ApplicationConfigurationUpdate)
    if (CloudWatchLoggingOptionUpdates != null) __obj.updateDynamic("CloudWatchLoggingOptionUpdates")(CloudWatchLoggingOptionUpdates)
    if (RunConfigurationUpdate != null) __obj.updateDynamic("RunConfigurationUpdate")(RunConfigurationUpdate)
    if (ServiceExecutionRoleUpdate != null) __obj.updateDynamic("ServiceExecutionRoleUpdate")(ServiceExecutionRoleUpdate)
    __obj.asInstanceOf[UpdateApplicationRequest]
  }
}

