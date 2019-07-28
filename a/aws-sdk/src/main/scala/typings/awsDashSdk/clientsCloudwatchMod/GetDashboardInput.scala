package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDashboardInput extends js.Object {
  /**
    * The name of the dashboard to be described.
    */
  var DashboardName: typings.awsDashSdk.clientsCloudwatchMod.DashboardName
}

object GetDashboardInput {
  @scala.inline
  def apply(DashboardName: DashboardName): GetDashboardInput = {
    val __obj = js.Dynamic.literal(DashboardName = DashboardName)
  
    __obj.asInstanceOf[GetDashboardInput]
  }
}

