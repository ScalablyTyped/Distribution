package typings.agGrid.sortServiceMod

import typings.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortedRowNode extends js.Object {
  
  var currentPos: Double = js.native
  
  var rowNode: RowNode = js.native
}
object SortedRowNode {
  
  @scala.inline
  def apply(currentPos: Double, rowNode: RowNode): SortedRowNode = {
    val __obj = js.Dynamic.literal(currentPos = currentPos.asInstanceOf[js.Any], rowNode = rowNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortedRowNode]
  }
  
  @scala.inline
  implicit class SortedRowNodeOps[Self <: SortedRowNode] (val x: Self) extends AnyVal {
    
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
    def setCurrentPos(value: Double): Self = this.set("currentPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowNode(value: RowNode): Self = this.set("rowNode", value.asInstanceOf[js.Any])
  }
}
