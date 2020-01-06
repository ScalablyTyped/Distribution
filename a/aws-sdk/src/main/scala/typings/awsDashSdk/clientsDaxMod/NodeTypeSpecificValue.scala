package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeTypeSpecificValue extends js.Object {
  /**
    * A node type to which the parameter value applies.
    */
  var NodeType: js.UndefOr[String] = js.native
  /**
    * The parameter value for this node type.
    */
  var Value: js.UndefOr[String] = js.native
}

object NodeTypeSpecificValue {
  @scala.inline
  def apply(NodeType: String = null, Value: String = null): NodeTypeSpecificValue = {
    val __obj = js.Dynamic.literal()
    if (NodeType != null) __obj.updateDynamic("NodeType")(NodeType.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeTypeSpecificValue]
  }
}

