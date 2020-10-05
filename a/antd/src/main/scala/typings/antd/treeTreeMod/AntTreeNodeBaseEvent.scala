package typings.antd.treeTreeMod

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AntTreeNodeBaseEvent extends js.Object {
  var nativeEvent: MouseEvent = js.native
  var node: AntTreeNode = js.native
}

object AntTreeNodeBaseEvent {
  @scala.inline
  def apply(nativeEvent: MouseEvent, node: AntTreeNode): AntTreeNodeBaseEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntTreeNodeBaseEvent]
  }
  @scala.inline
  implicit class AntTreeNodeBaseEventOps[Self <: AntTreeNodeBaseEvent] (val x: Self) extends AnyVal {
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
    def setNativeEvent(value: MouseEvent): Self = this.set("nativeEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: AntTreeNode): Self = this.set("node", value.asInstanceOf[js.Any])
  }
  
}

