package typings.agGrid.iExcelCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExcelCell extends js.Object {
  
  var data: ExcelData = js.native
  
  var mergeAcross: js.UndefOr[Double] = js.native
  
  var styleId: String = js.native
}
object ExcelCell {
  
  @scala.inline
  def apply(data: ExcelData, styleId: String): ExcelCell = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], styleId = styleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelCell]
  }
  
  @scala.inline
  implicit class ExcelCellOps[Self <: ExcelCell] (val x: Self) extends AnyVal {
    
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
    def setData(value: ExcelData): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleId(value: String): Self = this.set("styleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeAcross(value: Double): Self = this.set("mergeAcross", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergeAcross: Self = this.set("mergeAcross", js.undefined)
  }
}
