package typings.antd.treeTreeMod

import typings.antd.antdStrings.select_
import typings.rcTree.interfaceMod.DataNode
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AntTreeNodeSelectedEvent extends AntTreeNodeBaseEvent {
  
  var event: select_ = js.native
  
  var selected: js.UndefOr[Boolean] = js.native
  
  var selectedNodes: js.UndefOr[js.Array[DataNode]] = js.native
}
object AntTreeNodeSelectedEvent {
  
  @scala.inline
  def apply(event: select_, nativeEvent: MouseEvent, node: AntTreeNode): AntTreeNodeSelectedEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntTreeNodeSelectedEvent]
  }
  
  @scala.inline
  implicit class AntTreeNodeSelectedEventOps[Self <: AntTreeNodeSelectedEvent] (val x: Self) extends AnyVal {
    
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
    def setEvent(value: select_): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setSelectedNodesVarargs(value: DataNode*): Self = this.set("selectedNodes", js.Array(value :_*))
    
    @scala.inline
    def setSelectedNodes(value: js.Array[DataNode]): Self = this.set("selectedNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedNodes: Self = this.set("selectedNodes", js.undefined)
  }
}
