package typings.agGrid.iRangeControllerMod

import typings.agGrid.columnMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddRangeSelectionParams extends js.Object {
  
  var columnEnd: String | Column = js.native
  
  var columnStart: String | Column = js.native
  
  var floatingEnd: String = js.native
  
  var floatingStart: String = js.native
  
  var rowEnd: Double = js.native
  
  var rowStart: Double = js.native
}
object AddRangeSelectionParams {
  
  @scala.inline
  def apply(
    columnEnd: String | Column,
    columnStart: String | Column,
    floatingEnd: String,
    floatingStart: String,
    rowEnd: Double,
    rowStart: Double
  ): AddRangeSelectionParams = {
    val __obj = js.Dynamic.literal(columnEnd = columnEnd.asInstanceOf[js.Any], columnStart = columnStart.asInstanceOf[js.Any], floatingEnd = floatingEnd.asInstanceOf[js.Any], floatingStart = floatingStart.asInstanceOf[js.Any], rowEnd = rowEnd.asInstanceOf[js.Any], rowStart = rowStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddRangeSelectionParams]
  }
  
  @scala.inline
  implicit class AddRangeSelectionParamsOps[Self <: AddRangeSelectionParams] (val x: Self) extends AnyVal {
    
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
    def setColumnEnd(value: String | Column): Self = this.set("columnEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnStart(value: String | Column): Self = this.set("columnStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingEnd(value: String): Self = this.set("floatingEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingStart(value: String): Self = this.set("floatingStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowEnd(value: Double): Self = this.set("rowEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowStart(value: Double): Self = this.set("rowStart", value.asInstanceOf[js.Any])
  }
}
