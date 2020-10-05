package typings.antd.treeTreeMod

import typings.antd.antdStrings.check
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AntTreeNodeCheckedEvent extends AntTreeNodeBaseEvent {
  var checked: js.UndefOr[Boolean] = js.native
  var checkedNodes: js.UndefOr[js.Array[AntTreeNode]] = js.native
  var event: check = js.native
}

object AntTreeNodeCheckedEvent {
  @scala.inline
  def apply(event: check, nativeEvent: MouseEvent, node: AntTreeNode): AntTreeNodeCheckedEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntTreeNodeCheckedEvent]
  }
  @scala.inline
  implicit class AntTreeNodeCheckedEventOps[Self <: AntTreeNodeCheckedEvent] (val x: Self) extends AnyVal {
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
    def setEvent(value: check): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setCheckedNodesVarargs(value: AntTreeNode*): Self = this.set("checkedNodes", js.Array(value :_*))
    @scala.inline
    def setCheckedNodes(value: js.Array[AntTreeNode]): Self = this.set("checkedNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckedNodes: Self = this.set("checkedNodes", js.undefined)
  }
  
}

