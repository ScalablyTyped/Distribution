package typings.agGrid.colDefMod

import typings.agGrid.columnMod.Column
import typings.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetQuickFilterTextParams extends js.Object {
  
  var colDef: ColDef = js.native
  
  var column: Column = js.native
  
  var data: js.Any = js.native
  
  var node: RowNode = js.native
  
  var value: js.Any = js.native
}
object GetQuickFilterTextParams {
  
  @scala.inline
  def apply(colDef: ColDef, column: Column, data: js.Any, node: RowNode, value: js.Any): GetQuickFilterTextParams = {
    val __obj = js.Dynamic.literal(colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQuickFilterTextParams]
  }
  
  @scala.inline
  implicit class GetQuickFilterTextParamsOps[Self <: GetQuickFilterTextParams] (val x: Self) extends AnyVal {
    
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
    def setColDef(value: ColDef): Self = this.set("colDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn(value: Column): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: RowNode): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
