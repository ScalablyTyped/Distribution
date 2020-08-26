package typings.agGrid.dragAndDropServiceMod

import org.scalablytyped.runtime.StringDictionary
import typings.agGrid.columnMod.Column
import typings.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragItem extends js.Object {
  var columns: js.UndefOr[js.Array[Column]] = js.native
  var rowNode: js.UndefOr[RowNode] = js.native
  var visibleState: js.UndefOr[StringDictionary[Boolean]] = js.native
}

object DragItem {
  @scala.inline
  def apply(): DragItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragItem]
  }
  @scala.inline
  implicit class DragItemOps[Self <: DragItem] (val x: Self) extends AnyVal {
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
    def setColumnsVarargs(value: Column*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[Column]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setRowNode(value: RowNode): Self = this.set("rowNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowNode: Self = this.set("rowNode", js.undefined)
    @scala.inline
    def setVisibleState(value: StringDictionary[Boolean]): Self = this.set("visibleState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibleState: Self = this.set("visibleState", js.undefined)
  }
  
}

