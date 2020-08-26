package typings.acornWalk.mod

import typings.acorn.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Found[TState] extends js.Object {
  var node: Node = js.native
  var state: TState = js.native
}

object Found {
  @scala.inline
  def apply[TState](node: Node, state: TState): Found[TState] = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Found[TState]]
  }
  @scala.inline
  implicit class FoundOps[Self <: Found[_], TState] (val x: Self with Found[TState]) extends AnyVal {
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
    def setNode(value: Node): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: TState): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

