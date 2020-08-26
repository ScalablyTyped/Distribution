package typings.androiduix.PageStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateStack extends js.Object {
  var isRoot: js.UndefOr[Boolean] = js.native
  var pageId: String = js.native
  var stack: js.Array[StateSaved] = js.native
}

object StateStack {
  @scala.inline
  def apply(pageId: String, stack: js.Array[StateSaved]): StateStack = {
    val __obj = js.Dynamic.literal(pageId = pageId.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateStack]
  }
  @scala.inline
  implicit class StateStackOps[Self <: StateStack] (val x: Self) extends AnyVal {
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
    def setPageId(value: String): Self = this.set("pageId", value.asInstanceOf[js.Any])
    @scala.inline
    def setStackVarargs(value: StateSaved*): Self = this.set("stack", js.Array(value :_*))
    @scala.inline
    def setStack(value: js.Array[StateSaved]): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRoot(value: Boolean): Self = this.set("isRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsRoot: Self = this.set("isRoot", js.undefined)
  }
  
}

