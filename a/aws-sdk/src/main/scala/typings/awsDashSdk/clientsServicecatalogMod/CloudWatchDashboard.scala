package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudWatchDashboard extends js.Object {
  /**
    * The name of the CloudWatch dashboard.
    */
  var Name: js.UndefOr[CloudWatchDashboardName] = js.undefined
}

object CloudWatchDashboard {
  @scala.inline
  def apply(Name: CloudWatchDashboardName = null): CloudWatchDashboard = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[CloudWatchDashboard]
  }
}

