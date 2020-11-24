package typings.agGrid.columnControllerMod

import typings.agGrid.agGridStrings.left
import typings.agGrid.agGridStrings.right
import typings.agGrid.colDefMod.IAggFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnState extends js.Object {
  
  var aggFunc: js.UndefOr[String | IAggFunc] = js.native
  
  var colId: String = js.native
  
  var hide: js.UndefOr[Boolean] = js.native
  
  var pinned: js.UndefOr[Boolean | String | left | right] = js.native
  
  var pivotIndex: js.UndefOr[Double] = js.native
  
  var rowGroupIndex: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object ColumnState {
  
  @scala.inline
  def apply(colId: String): ColumnState = {
    val __obj = js.Dynamic.literal(colId = colId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnState]
  }
  
  @scala.inline
  implicit class ColumnStateOps[Self <: ColumnState] (val x: Self) extends AnyVal {
    
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
    def setColId(value: String): Self = this.set("colId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggFuncFunction1(value: /* input */ js.Array[js.Any] => js.Any): Self = this.set("aggFunc", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAggFunc(value: String | IAggFunc): Self = this.set("aggFunc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggFunc: Self = this.set("aggFunc", js.undefined)
    
    @scala.inline
    def setHide(value: Boolean): Self = this.set("hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    
    @scala.inline
    def setPinned(value: Boolean | String | left | right): Self = this.set("pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinned: Self = this.set("pinned", js.undefined)
    
    @scala.inline
    def setPivotIndex(value: Double): Self = this.set("pivotIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePivotIndex: Self = this.set("pivotIndex", js.undefined)
    
    @scala.inline
    def setRowGroupIndex(value: Double): Self = this.set("rowGroupIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowGroupIndex: Self = this.set("rowGroupIndex", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
