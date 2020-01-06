package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAppResponse extends js.Object {
  /**
    * The app's Amazon Resource Name (ARN).
    */
  var AppArn: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.AppArn] = js.native
  /**
    * The name of the app.
    */
  var AppName: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.AppName] = js.native
  /**
    * The type of app.
    */
  var AppType: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.AppType] = js.native
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.CreationTime] = js.native
  /**
    * The domain ID.
    */
  var DomainId: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.DomainId] = js.native
  /**
    * The failure reason.
    */
  var FailureReason: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.FailureReason] = js.native
  /**
    * The timestamp of the last health check.
    */
  var LastHealthCheckTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The timestamp of the last user's activity.
    */
  var LastUserActivityTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The instance type and quantity.
    */
  var ResourceSpec: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.ResourceSpec] = js.native
  /**
    * The status.
    */
  var Status: js.UndefOr[AppStatus] = js.native
  /**
    * The user profile name.
    */
  var UserProfileName: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.UserProfileName] = js.native
}

object DescribeAppResponse {
  @scala.inline
  def apply(
    AppArn: AppArn = null,
    AppName: AppName = null,
    AppType: AppType = null,
    CreationTime: CreationTime = null,
    DomainId: DomainId = null,
    FailureReason: FailureReason = null,
    LastHealthCheckTimestamp: Timestamp = null,
    LastUserActivityTimestamp: Timestamp = null,
    ResourceSpec: ResourceSpec = null,
    Status: AppStatus = null,
    UserProfileName: UserProfileName = null
  ): DescribeAppResponse = {
    val __obj = js.Dynamic.literal()
    if (AppArn != null) __obj.updateDynamic("AppArn")(AppArn.asInstanceOf[js.Any])
    if (AppName != null) __obj.updateDynamic("AppName")(AppName.asInstanceOf[js.Any])
    if (AppType != null) __obj.updateDynamic("AppType")(AppType.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (DomainId != null) __obj.updateDynamic("DomainId")(DomainId.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    if (LastHealthCheckTimestamp != null) __obj.updateDynamic("LastHealthCheckTimestamp")(LastHealthCheckTimestamp.asInstanceOf[js.Any])
    if (LastUserActivityTimestamp != null) __obj.updateDynamic("LastUserActivityTimestamp")(LastUserActivityTimestamp.asInstanceOf[js.Any])
    if (ResourceSpec != null) __obj.updateDynamic("ResourceSpec")(ResourceSpec.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (UserProfileName != null) __obj.updateDynamic("UserProfileName")(UserProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAppResponse]
  }
}

