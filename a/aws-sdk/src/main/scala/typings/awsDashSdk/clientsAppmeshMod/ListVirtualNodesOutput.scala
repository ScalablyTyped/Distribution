package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListVirtualNodesOutput extends js.Object {
  /**
    * The nextToken value to include in a future ListVirtualNodes
    request. When the results of a ListVirtualNodes request exceed
    limit, you can use this value to retrieve the next page of results. This
    value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  /**
    * The list of existing virtual nodes for the specified service mesh.
    */
  var virtualNodes: VirtualNodeList
}

object ListVirtualNodesOutput {
  @scala.inline
  def apply(virtualNodes: VirtualNodeList, nextToken: String = null): ListVirtualNodesOutput = {
    val __obj = js.Dynamic.literal(virtualNodes = virtualNodes)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListVirtualNodesOutput]
  }
}

