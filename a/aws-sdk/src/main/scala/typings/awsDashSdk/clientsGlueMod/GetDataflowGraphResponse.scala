package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDataflowGraphResponse extends js.Object {
  /**
    * A list of the edges in the resulting DAG.
    */
  var DagEdges: js.UndefOr[typings.awsDashSdk.clientsGlueMod.DagEdges] = js.undefined
  /**
    * A list of the nodes in the resulting DAG.
    */
  var DagNodes: js.UndefOr[typings.awsDashSdk.clientsGlueMod.DagNodes] = js.undefined
}

object GetDataflowGraphResponse {
  @scala.inline
  def apply(DagEdges: DagEdges = null, DagNodes: DagNodes = null): GetDataflowGraphResponse = {
    val __obj = js.Dynamic.literal()
    if (DagEdges != null) __obj.updateDynamic("DagEdges")(DagEdges)
    if (DagNodes != null) __obj.updateDynamic("DagNodes")(DagNodes)
    __obj.asInstanceOf[GetDataflowGraphResponse]
  }
}

