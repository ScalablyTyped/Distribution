package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dashboard extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var Arn: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.Arn] = js.native
  /**
    * The time that this dataset was created.
    */
  var CreatedTime: js.UndefOr[Timestamp] = js.native
  /**
    * Dashboard ID.
    */
  var DashboardId: js.UndefOr[RestrictiveResourceId] = js.native
  /**
    * The last time that this dataset was published.
    */
  var LastPublishedTime: js.UndefOr[Timestamp] = js.native
  /**
    * The last time that this dataset was updated.
    */
  var LastUpdatedTime: js.UndefOr[Timestamp] = js.native
  /**
    * A display name for the dataset.
    */
  var Name: js.UndefOr[DashboardName] = js.native
  /**
    * Version.
    */
  var Version: js.UndefOr[DashboardVersion] = js.native
}

object Dashboard {
  @scala.inline
  def apply(
    Arn: Arn = null,
    CreatedTime: Timestamp = null,
    DashboardId: RestrictiveResourceId = null,
    LastPublishedTime: Timestamp = null,
    LastUpdatedTime: Timestamp = null,
    Name: DashboardName = null,
    Version: DashboardVersion = null
  ): Dashboard = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime.asInstanceOf[js.Any])
    if (DashboardId != null) __obj.updateDynamic("DashboardId")(DashboardId.asInstanceOf[js.Any])
    if (LastPublishedTime != null) __obj.updateDynamic("LastPublishedTime")(LastPublishedTime.asInstanceOf[js.Any])
    if (LastUpdatedTime != null) __obj.updateDynamic("LastUpdatedTime")(LastUpdatedTime.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dashboard]
  }
}

