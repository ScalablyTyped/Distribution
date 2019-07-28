package typings.awsDashSdk.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListNodesInput extends js.Object {
  /**
    * The maximum number of nodes to list.
    */
  var MaxResults: js.UndefOr[NodeListMaxResults] = js.undefined
  /**
    * The unique identifier of the member who owns the nodes to list.
    */
  var MemberId: ResourceIdString
  /**
    * The unique identifier of the network for which to list nodes.
    */
  var NetworkId: ResourceIdString
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * An optional status specifier. If provided, only nodes currently in this status are listed.
    */
  var Status: js.UndefOr[NodeStatus] = js.undefined
}

object ListNodesInput {
  @scala.inline
  def apply(
    MemberId: ResourceIdString,
    NetworkId: ResourceIdString,
    MaxResults: js.UndefOr[NodeListMaxResults] = js.undefined,
    NextToken: PaginationToken = null,
    Status: NodeStatus = null
  ): ListNodesInput = {
    val __obj = js.Dynamic.literal(MemberId = MemberId, NetworkId = NetworkId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListNodesInput]
  }
}

