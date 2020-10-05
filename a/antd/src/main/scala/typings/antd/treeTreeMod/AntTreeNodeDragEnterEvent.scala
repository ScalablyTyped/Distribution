package typings.antd.treeTreeMod

import typings.rcTree.interfaceMod.Key
import typings.react.mod.DragEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AntTreeNodeDragEnterEvent extends AntTreeNodeMouseEvent {
  var expandedKeys: js.Array[Key] = js.native
}

object AntTreeNodeDragEnterEvent {
  @scala.inline
  def apply(event: DragEvent[HTMLElement], expandedKeys: js.Array[Key], node: AntTreeNode): AntTreeNodeDragEnterEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntTreeNodeDragEnterEvent]
  }
  @scala.inline
  implicit class AntTreeNodeDragEnterEventOps[Self <: AntTreeNodeDragEnterEvent] (val x: Self) extends AnyVal {
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
    def setExpandedKeysVarargs(value: Key*): Self = this.set("expandedKeys", js.Array(value :_*))
    @scala.inline
    def setExpandedKeys(value: js.Array[Key]): Self = this.set("expandedKeys", value.asInstanceOf[js.Any])
  }
  
}

