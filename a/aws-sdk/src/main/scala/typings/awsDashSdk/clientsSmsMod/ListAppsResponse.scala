package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAppsResponse extends js.Object {
  /**
    * A list of application summaries.
    */
  var apps: js.UndefOr[Apps] = js.undefined
  /**
    * The token required to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListAppsResponse {
  @scala.inline
  def apply(apps: Apps = null, nextToken: NextToken = null): ListAppsResponse = {
    val __obj = js.Dynamic.literal()
    if (apps != null) __obj.updateDynamic("apps")(apps)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListAppsResponse]
  }
}

