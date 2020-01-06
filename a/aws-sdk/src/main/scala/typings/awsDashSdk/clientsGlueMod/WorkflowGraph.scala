package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowGraph extends js.Object {
  /**
    * A list of all the directed connections between the nodes belonging to the workflow.
    */
  var Edges: js.UndefOr[EdgeList] = js.native
  /**
    * A list of the the AWS Glue components belong to the workflow represented as nodes.
    */
  var Nodes: js.UndefOr[NodeList] = js.native
}

object WorkflowGraph {
  @scala.inline
  def apply(Edges: EdgeList = null, Nodes: NodeList = null): WorkflowGraph = {
    val __obj = js.Dynamic.literal()
    if (Edges != null) __obj.updateDynamic("Edges")(Edges.asInstanceOf[js.Any])
    if (Nodes != null) __obj.updateDynamic("Nodes")(Nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowGraph]
  }
}

