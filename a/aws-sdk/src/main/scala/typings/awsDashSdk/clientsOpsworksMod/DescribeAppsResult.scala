package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAppsResult extends js.Object {
  /**
    * An array of App objects that describe the specified apps. 
    */
  var Apps: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.Apps] = js.native
}

object DescribeAppsResult {
  @scala.inline
  def apply(Apps: Apps = null): DescribeAppsResult = {
    val __obj = js.Dynamic.literal()
    if (Apps != null) __obj.updateDynamic("Apps")(Apps.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAppsResult]
  }
}

