package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDashboardsInput extends js.Object {
  /**
    * The dashboards to be deleted. This parameter is required.
    */
  var DashboardNames: typings.awsDashSdk.clientsCloudwatchMod.DashboardNames
}

object DeleteDashboardsInput {
  @scala.inline
  def apply(DashboardNames: DashboardNames): DeleteDashboardsInput = {
    val __obj = js.Dynamic.literal(DashboardNames = DashboardNames)
  
    __obj.asInstanceOf[DeleteDashboardsInput]
  }
}

