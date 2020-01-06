package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDataflowGraphResponse extends js.Object {
  /**
    * A list of the edges in the resulting DAG.
    */
  var DagEdges: js.UndefOr[typings.awsDashSdk.clientsGlueMod.DagEdges] = js.native
  /**
    * A list of the nodes in the resulting DAG.
    */
  var DagNodes: js.UndefOr[typings.awsDashSdk.clientsGlueMod.DagNodes] = js.native
}

object GetDataflowGraphResponse {
  @scala.inline
  def apply(DagEdges: DagEdges = null, DagNodes: DagNodes = null): GetDataflowGraphResponse = {
    val __obj = js.Dynamic.literal()
    if (DagEdges != null) __obj.updateDynamic("DagEdges")(DagEdges.asInstanceOf[js.Any])
    if (DagNodes != null) __obj.updateDynamic("DagNodes")(DagNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataflowGraphResponse]
  }
}

