package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Node instance data.
  *
  * We have a separate type per NodeType to save memory
  * (TextData | ElementData | ProviderData | PureExpressionData | QueryList<any>)
  *
  * To keep our code monomorphic,
  * we prohibit using `NodeData` directly but enforce the use of accessors (`asElementData`, ...).
  * This way, no usage site can get a `NodeData` from view.nodes and then use it for different
  * purposes.
  */
@js.native
trait NodeData extends js.Object {
  var __brand: js.Any = js.native
}

object NodeData {
  @scala.inline
  def apply(__brand: js.Any): NodeData = {
    val __obj = js.Dynamic.literal(__brand = __brand.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeData]
  }
  @scala.inline
  implicit class NodeDataOps[Self <: NodeData] (val x: Self) extends AnyVal {
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
    def set__brand(value: js.Any): Self = this.set("__brand", value.asInstanceOf[js.Any])
  }
  
}

