package typings.agGrid.gridApiMod

import typings.agGrid.columnMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartEditingCellParams extends js.Object {
  
  var charPress: js.UndefOr[String] = js.native
  
  var colKey: String | Column = js.native
  
  var keyPress: js.UndefOr[Double] = js.native
  
  var rowIndex: Double = js.native
  
  var rowPinned: js.UndefOr[String] = js.native
}
object StartEditingCellParams {
  
  @scala.inline
  def apply(colKey: String | Column, rowIndex: Double): StartEditingCellParams = {
    val __obj = js.Dynamic.literal(colKey = colKey.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartEditingCellParams]
  }
  
  @scala.inline
  implicit class StartEditingCellParamsOps[Self <: StartEditingCellParams] (val x: Self) extends AnyVal {
    
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
    def setColKey(value: String | Column): Self = this.set("colKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharPress(value: String): Self = this.set("charPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharPress: Self = this.set("charPress", js.undefined)
    
    @scala.inline
    def setKeyPress(value: Double): Self = this.set("keyPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyPress: Self = this.set("keyPress", js.undefined)
    
    @scala.inline
    def setRowPinned(value: String): Self = this.set("rowPinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowPinned: Self = this.set("rowPinned", js.undefined)
  }
}
