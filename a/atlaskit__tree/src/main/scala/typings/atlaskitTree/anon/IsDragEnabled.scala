package typings.atlaskitTree.anon

import typings.atlaskitTree.atlaskitTreeBooleans.`false`
import typings.atlaskitTree.atlaskitTreeNumbers.`35`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsDragEnabled extends js.Object {
  var isDragEnabled: `false` = js.native
  var isNestingEnabled: `false` = js.native
  var offsetPerLevel: `35` = js.native
  var tree: Children = js.native
  def onCollapse(): Unit = js.native
  def onDragEnd(): Unit = js.native
  def onDragStart(): Unit = js.native
  def onExpand(): Unit = js.native
  def renderItem(): Unit = js.native
}

object IsDragEnabled {
  @scala.inline
  def apply(
    isDragEnabled: `false`,
    isNestingEnabled: `false`,
    offsetPerLevel: `35`,
    onCollapse: () => Unit,
    onDragEnd: () => Unit,
    onDragStart: () => Unit,
    onExpand: () => Unit,
    renderItem: () => Unit,
    tree: Children
  ): IsDragEnabled = {
    val __obj = js.Dynamic.literal(isDragEnabled = isDragEnabled.asInstanceOf[js.Any], isNestingEnabled = isNestingEnabled.asInstanceOf[js.Any], offsetPerLevel = offsetPerLevel.asInstanceOf[js.Any], onCollapse = js.Any.fromFunction0(onCollapse), onDragEnd = js.Any.fromFunction0(onDragEnd), onDragStart = js.Any.fromFunction0(onDragStart), onExpand = js.Any.fromFunction0(onExpand), renderItem = js.Any.fromFunction0(renderItem), tree = tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsDragEnabled]
  }
  @scala.inline
  implicit class IsDragEnabledOps[Self <: IsDragEnabled] (val x: Self) extends AnyVal {
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
    def setIsDragEnabled(value: `false`): Self = this.set("isDragEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsNestingEnabled(value: `false`): Self = this.set("isNestingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsetPerLevel(value: `35`): Self = this.set("offsetPerLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnCollapse(value: () => Unit): Self = this.set("onCollapse", js.Any.fromFunction0(value))
    @scala.inline
    def setOnDragEnd(value: () => Unit): Self = this.set("onDragEnd", js.Any.fromFunction0(value))
    @scala.inline
    def setOnDragStart(value: () => Unit): Self = this.set("onDragStart", js.Any.fromFunction0(value))
    @scala.inline
    def setOnExpand(value: () => Unit): Self = this.set("onExpand", js.Any.fromFunction0(value))
    @scala.inline
    def setRenderItem(value: () => Unit): Self = this.set("renderItem", js.Any.fromFunction0(value))
    @scala.inline
    def setTree(value: Children): Self = this.set("tree", value.asInstanceOf[js.Any])
  }
  
}

