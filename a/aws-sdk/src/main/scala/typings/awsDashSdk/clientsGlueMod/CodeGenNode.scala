package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeGenNode extends js.Object {
  /**
    * Properties of the node, in the form of name-value pairs.
    */
  var Args: CodeGenNodeArgs = js.native
  /**
    * A node identifier that is unique within the node's graph.
    */
  var Id: CodeGenIdentifier = js.native
  /**
    * The line number of the node.
    */
  var LineNumber: js.UndefOr[Integer] = js.native
  /**
    * The type of node that this is.
    */
  var NodeType: CodeGenNodeType = js.native
}

object CodeGenNode {
  @scala.inline
  def apply(
    Args: CodeGenNodeArgs,
    Id: CodeGenIdentifier,
    NodeType: CodeGenNodeType,
    LineNumber: Int | Double = null
  ): CodeGenNode = {
    val __obj = js.Dynamic.literal(Args = Args.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], NodeType = NodeType.asInstanceOf[js.Any])
    if (LineNumber != null) __obj.updateDynamic("LineNumber")(LineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeGenNode]
  }
}

