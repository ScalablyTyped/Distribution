package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAppsResult extends js.Object {
  /**
    *  A list of Amplify apps. 
    */
  var apps: Apps = js.native
  /**
    *  A pagination token. Set to null to start listing apps from start. If non-null, the pagination token is returned in a result. Pass its value in here to list more projects. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListAppsResult {
  @scala.inline
  def apply(apps: Apps, nextToken: NextToken = null): ListAppsResult = {
    val __obj = js.Dynamic.literal(apps = apps.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAppsResult]
  }
}

