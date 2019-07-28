package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeTypeSpecificValue extends js.Object {
  /**
    * A node type to which the parameter value applies.
    */
  var NodeType: js.UndefOr[String] = js.undefined
  /**
    * The parameter value for this node type.
    */
  var Value: js.UndefOr[String] = js.undefined
}

object NodeTypeSpecificValue {
  @scala.inline
  def apply(NodeType: String = null, Value: String = null): NodeTypeSpecificValue = {
    val __obj = js.Dynamic.literal()
    if (NodeType != null) __obj.updateDynamic("NodeType")(NodeType)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[NodeTypeSpecificValue]
  }
}

