package typings.atAngularCore

import typings.atAngularCore.schematicsMigrationsRendererDashToDashRenderer2HelpersMod.HelperFunction
import typings.typescript.typescriptMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Node extends js.Object {
  var node: Node | Null
  var requiredHelpers: js.UndefOr[js.Array[HelperFunction]] = js.undefined
}

object Anon_Node {
  @scala.inline
  def apply(node: Node = null, requiredHelpers: js.Array[HelperFunction] = null): Anon_Node = {
    val __obj = js.Dynamic.literal()
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (requiredHelpers != null) __obj.updateDynamic("requiredHelpers")(requiredHelpers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Node]
  }
}

