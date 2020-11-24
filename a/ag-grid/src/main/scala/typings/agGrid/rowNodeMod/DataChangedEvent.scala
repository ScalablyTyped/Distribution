package typings.agGrid.rowNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataChangedEvent extends RowNodeEvent {
  
  var newData: js.Any = js.native
  
  var oldData: js.Any = js.native
  
  var update: Boolean = js.native
}
object DataChangedEvent {
  
  @scala.inline
  def apply(newData: js.Any, node: RowNode, oldData: js.Any, `type`: String, update: Boolean): DataChangedEvent = {
    val __obj = js.Dynamic.literal(newData = newData.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], oldData = oldData.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataChangedEvent]
  }
  
  @scala.inline
  implicit class DataChangedEventOps[Self <: DataChangedEvent] (val x: Self) extends AnyVal {
    
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
    def setNewData(value: js.Any): Self = this.set("newData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldData(value: js.Any): Self = this.set("oldData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: Boolean): Self = this.set("update", value.asInstanceOf[js.Any])
  }
}
