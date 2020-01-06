package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDashboardsInput extends js.Object {
  /**
    * If you specify this parameter, only the dashboards with names starting with the specified string are listed. The maximum length is 255, and valid characters are A-Z, a-z, 0-9, ".", "-", and "_". 
    */
  var DashboardNamePrefix: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.DashboardNamePrefix] = js.native
  /**
    * The token returned by a previous call to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.NextToken] = js.native
}

object ListDashboardsInput {
  @scala.inline
  def apply(DashboardNamePrefix: DashboardNamePrefix = null, NextToken: NextToken = null): ListDashboardsInput = {
    val __obj = js.Dynamic.literal()
    if (DashboardNamePrefix != null) __obj.updateDynamic("DashboardNamePrefix")(DashboardNamePrefix.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDashboardsInput]
  }
}

