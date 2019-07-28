package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeGenNode extends js.Object {
  /**
    * Properties of the node, in the form of name-value pairs.
    */
  var Args: CodeGenNodeArgs
  /**
    * A node identifier that is unique within the node's graph.
    */
  var Id: CodeGenIdentifier
  /**
    * The line number of the node.
    */
  var LineNumber: js.UndefOr[Integer] = js.undefined
  /**
    * The type of node that this is.
    */
  var NodeType: CodeGenNodeType
}

object CodeGenNode {
  @scala.inline
  def apply(
    Args: CodeGenNodeArgs,
    Id: CodeGenIdentifier,
    NodeType: CodeGenNodeType,
    LineNumber: js.UndefOr[Integer] = js.undefined
  ): CodeGenNode = {
    val __obj = js.Dynamic.literal(Args = Args, Id = Id, NodeType = NodeType)
    if (!js.isUndefined(LineNumber)) __obj.updateDynamic("LineNumber")(LineNumber)
    __obj.asInstanceOf[CodeGenNode]
  }
}

