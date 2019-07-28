package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowGraph extends js.Object {
  /**
    * A list of all the directed connections between the nodes belonging to the workflow.
    */
  var Edges: js.UndefOr[EdgeList] = js.undefined
  /**
    * A list of the the AWS Glue components belong to the workflow represented as nodes.
    */
  var Nodes: js.UndefOr[NodeList] = js.undefined
}

object WorkflowGraph {
  @scala.inline
  def apply(Edges: EdgeList = null, Nodes: NodeList = null): WorkflowGraph = {
    val __obj = js.Dynamic.literal()
    if (Edges != null) __obj.updateDynamic("Edges")(Edges)
    if (Nodes != null) __obj.updateDynamic("Nodes")(Nodes)
    __obj.asInstanceOf[WorkflowGraph]
  }
}

