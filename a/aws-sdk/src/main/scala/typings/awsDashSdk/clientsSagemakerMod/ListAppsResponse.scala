package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAppsResponse extends js.Object {
  /**
    * The list of apps.
    */
  var Apps: js.UndefOr[AppList] = js.native
  /**
    * If the previous response was truncated, you will receive this token. Use it in your next request to receive the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.NextToken] = js.native
}

object ListAppsResponse {
  @scala.inline
  def apply(Apps: AppList = null, NextToken: NextToken = null): ListAppsResponse = {
    val __obj = js.Dynamic.literal()
    if (Apps != null) __obj.updateDynamic("Apps")(Apps.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAppsResponse]
  }
}

