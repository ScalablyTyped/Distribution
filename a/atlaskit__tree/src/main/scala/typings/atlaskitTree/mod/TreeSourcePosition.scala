package typings.atlaskitTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeSourcePosition extends js.Object {
  var index: Double = js.native
  var parentId: ItemId = js.native
}

object TreeSourcePosition {
  @scala.inline
  def apply(index: Double, parentId: ItemId): TreeSourcePosition = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeSourcePosition]
  }
  @scala.inline
  implicit class TreeSourcePositionOps[Self <: TreeSourcePosition] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentId(value: ItemId): Self = this.set("parentId", value.asInstanceOf[js.Any])
  }
  
}

