package typings.awsDashSdk.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListClustersResult extends js.Object {
  /**
    * Each ClusterListEntry object contains a cluster's state, a cluster's ID, and other important status information.
    */
  var ClusterListEntries: js.UndefOr[ClusterListEntryList] = js.undefined
  /**
    * HTTP requests are stateless. If you use the automatically generated NextToken value in your next ClusterListEntry call, your list of returned clusters will start from this point in the array.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListClustersResult {
  @scala.inline
  def apply(ClusterListEntries: ClusterListEntryList = null, NextToken: String = null): ListClustersResult = {
    val __obj = js.Dynamic.literal()
    if (ClusterListEntries != null) __obj.updateDynamic("ClusterListEntries")(ClusterListEntries)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListClustersResult]
  }
}

