package typings.angularCore.anon

import typings.angularCore.helpersMod.HelperFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Node extends js.Object {
  var node: typings.typescript.mod.Node | Null = js.native
  var requiredHelpers: js.UndefOr[js.Array[HelperFunction]] = js.native
}

object Node {
  @scala.inline
  def apply(): Node = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNode(value: typings.typescript.mod.Node): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeNull: Self = this.set("node", null)
    @scala.inline
    def setRequiredHelpersVarargs(value: HelperFunction*): Self = this.set("requiredHelpers", js.Array(value :_*))
    @scala.inline
    def setRequiredHelpers(value: js.Array[HelperFunction]): Self = this.set("requiredHelpers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequiredHelpers: Self = this.set("requiredHelpers", js.undefined)
  }
  
}

