package typings.awsDashSdk.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListNodesOutput extends js.Object {
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * An array of NodeSummary objects that contain configuration properties for each node.
    */
  var Nodes: js.UndefOr[NodeSummaryList] = js.undefined
}

object ListNodesOutput {
  @scala.inline
  def apply(NextToken: PaginationToken = null, Nodes: NodeSummaryList = null): ListNodesOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Nodes != null) __obj.updateDynamic("Nodes")(Nodes)
    __obj.asInstanceOf[ListNodesOutput]
  }
}

