package typings
package awsDashSdkLib.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDashboardsOutput extends js.Object {
  /**
    * The list of matching dashboards.
    */
  var DashboardEntries: js.UndefOr[DashboardEntries] = js.undefined
  /**
    * The token that marks the start of the next batch of returned results.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListDashboardsOutput {
  @scala.inline
  def apply(DashboardEntries: DashboardEntries = null, NextToken: NextToken = null): ListDashboardsOutput = {
    val __obj = js.Dynamic.literal()
    if (DashboardEntries != null) __obj.updateDynamic("DashboardEntries")(DashboardEntries)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListDashboardsOutput]
  }
}

