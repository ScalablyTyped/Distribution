package typings.atlaskitTree.mod

import typings.reactBeautifulDnd.mod.DraggableStateSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderItemParams extends js.Object {
  var depth: Double = js.native
  var item: TreeItem = js.native
  var provided: TreeDraggableProvided = js.native
  var snapshot: DraggableStateSnapshot = js.native
  def onCollapse(itemId: ItemId): Unit = js.native
  def onExpand(itemId: ItemId): Unit = js.native
}

object RenderItemParams {
  @scala.inline
  def apply(
    depth: Double,
    item: TreeItem,
    onCollapse: ItemId => Unit,
    onExpand: ItemId => Unit,
    provided: TreeDraggableProvided,
    snapshot: DraggableStateSnapshot
  ): RenderItemParams = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], onCollapse = js.Any.fromFunction1(onCollapse), onExpand = js.Any.fromFunction1(onExpand), provided = provided.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderItemParams]
  }
  @scala.inline
  implicit class RenderItemParamsOps[Self <: RenderItemParams] (val x: Self) extends AnyVal {
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
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: TreeItem): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnCollapse(value: ItemId => Unit): Self = this.set("onCollapse", js.Any.fromFunction1(value))
    @scala.inline
    def setOnExpand(value: ItemId => Unit): Self = this.set("onExpand", js.Any.fromFunction1(value))
    @scala.inline
    def setProvided(value: TreeDraggableProvided): Self = this.set("provided", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnapshot(value: DraggableStateSnapshot): Self = this.set("snapshot", value.asInstanceOf[js.Any])
  }
  
}

