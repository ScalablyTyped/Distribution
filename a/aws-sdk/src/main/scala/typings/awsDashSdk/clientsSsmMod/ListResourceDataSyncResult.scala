package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResourceDataSyncResult extends js.Object {
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.native
  /**
    * A list of your current Resource Data Sync configurations and their statuses.
    */
  var ResourceDataSyncItems: js.UndefOr[ResourceDataSyncItemList] = js.native
}

object ListResourceDataSyncResult {
  @scala.inline
  def apply(NextToken: NextToken = null, ResourceDataSyncItems: ResourceDataSyncItemList = null): ListResourceDataSyncResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ResourceDataSyncItems != null) __obj.updateDynamic("ResourceDataSyncItems")(ResourceDataSyncItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourceDataSyncResult]
  }
}

