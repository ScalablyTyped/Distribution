package typings.atlaskitTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeDestinationPosition extends js.Object {
  var index: js.UndefOr[Double] = js.native
  var parentId: ItemId = js.native
}

object TreeDestinationPosition {
  @scala.inline
  def apply(parentId: ItemId): TreeDestinationPosition = {
    val __obj = js.Dynamic.literal(parentId = parentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeDestinationPosition]
  }
  @scala.inline
  implicit class TreeDestinationPositionOps[Self <: TreeDestinationPosition] (val x: Self) extends AnyVal {
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
    def setParentId(value: ItemId): Self = this.set("parentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
  }
  
}

