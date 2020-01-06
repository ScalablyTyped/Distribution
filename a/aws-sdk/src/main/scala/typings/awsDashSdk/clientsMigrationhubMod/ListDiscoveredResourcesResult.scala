package typings.awsDashSdk.clientsMigrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDiscoveredResourcesResult extends js.Object {
  /**
    * Returned list of discovered resources associated with the given MigrationTask.
    */
  var DiscoveredResourceList: js.UndefOr[typings.awsDashSdk.clientsMigrationhubMod.DiscoveredResourceList] = js.native
  /**
    * If there are more discovered resources than the max result, return the next token to be passed to the next call as a bookmark of where to start from.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object ListDiscoveredResourcesResult {
  @scala.inline
  def apply(DiscoveredResourceList: DiscoveredResourceList = null, NextToken: Token = null): ListDiscoveredResourcesResult = {
    val __obj = js.Dynamic.literal()
    if (DiscoveredResourceList != null) __obj.updateDynamic("DiscoveredResourceList")(DiscoveredResourceList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDiscoveredResourcesResult]
  }
}

