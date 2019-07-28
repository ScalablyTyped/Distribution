package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAppsResult extends js.Object {
  /**
    *  List of Amplify Apps. 
    */
  var apps: Apps
  /**
    *  Pagination token. Set to null to start listing Apps from start. If non-null pagination token is returned in a result, then pass its value in here to list more projects. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListAppsResult {
  @scala.inline
  def apply(apps: Apps, nextToken: NextToken = null): ListAppsResult = {
    val __obj = js.Dynamic.literal(apps = apps)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListAppsResult]
  }
}

