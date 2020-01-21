package typings.angularCore

import typings.angularCore.helpersMod.HelperFunction
import typings.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNode extends js.Object {
  var node: Node | Null
  var requiredHelpers: js.UndefOr[js.Array[HelperFunction]] = js.undefined
}

object AnonNode {
  @scala.inline
  def apply(node: Node = null, requiredHelpers: js.Array[HelperFunction] = null): AnonNode = {
    val __obj = js.Dynamic.literal()
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (requiredHelpers != null) __obj.updateDynamic("requiredHelpers")(requiredHelpers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNode]
  }
}

