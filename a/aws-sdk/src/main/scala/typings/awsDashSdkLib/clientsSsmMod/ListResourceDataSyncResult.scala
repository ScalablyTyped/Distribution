package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResourceDataSyncResult extends js.Object {
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A list of your current Resource Data Sync configurations and their statuses.
    */
  var ResourceDataSyncItems: js.UndefOr[ResourceDataSyncItemList] = js.undefined
}

object ListResourceDataSyncResult {
  @scala.inline
  def apply(NextToken: NextToken = null, ResourceDataSyncItems: ResourceDataSyncItemList = null): ListResourceDataSyncResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ResourceDataSyncItems != null) __obj.updateDynamic("ResourceDataSyncItems")(ResourceDataSyncItems)
    __obj.asInstanceOf[ListResourceDataSyncResult]
  }
}

