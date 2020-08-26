package typings.antd.treeTreeMod

import typings.rcTree.interfaceMod.Key
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AntTreeNodeDropEvent extends js.Object {
  var dragNode: AntTreeNode = js.native
  var dragNodesKeys: js.Array[Key] = js.native
  var dropPosition: Double = js.native
  var dropToGap: js.UndefOr[Boolean] = js.native
  var event: MouseEvent[HTMLElement, NativeMouseEvent] = js.native
  var node: AntTreeNode = js.native
}

object AntTreeNodeDropEvent {
  @scala.inline
  def apply(
    dragNode: AntTreeNode,
    dragNodesKeys: js.Array[Key],
    dropPosition: Double,
    event: MouseEvent[HTMLElement, NativeMouseEvent],
    node: AntTreeNode
  ): AntTreeNodeDropEvent = {
    val __obj = js.Dynamic.literal(dragNode = dragNode.asInstanceOf[js.Any], dragNodesKeys = dragNodesKeys.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntTreeNodeDropEvent]
  }
  @scala.inline
  implicit class AntTreeNodeDropEventOps[Self <: AntTreeNodeDropEvent] (val x: Self) extends AnyVal {
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
    def setDragNode(value: AntTreeNode): Self = this.set("dragNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragNodesKeysVarargs(value: Key*): Self = this.set("dragNodesKeys", js.Array(value :_*))
    @scala.inline
    def setDragNodesKeys(value: js.Array[Key]): Self = this.set("dragNodesKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setDropPosition(value: Double): Self = this.set("dropPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(value: MouseEvent[HTMLElement, NativeMouseEvent]): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: AntTreeNode): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setDropToGap(value: Boolean): Self = this.set("dropToGap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropToGap: Self = this.set("dropToGap", js.undefined)
  }
  
}

