package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDashboardsOutput extends js.Object {
  /**
    * The list of matching dashboards.
    */
  var DashboardEntries: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.DashboardEntries] = js.native
  /**
    * The token that marks the start of the next batch of returned results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.NextToken] = js.native
}

object ListDashboardsOutput {
  @scala.inline
  def apply(DashboardEntries: DashboardEntries = null, NextToken: NextToken = null): ListDashboardsOutput = {
    val __obj = js.Dynamic.literal()
    if (DashboardEntries != null) __obj.updateDynamic("DashboardEntries")(DashboardEntries.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDashboardsOutput]
  }
}

