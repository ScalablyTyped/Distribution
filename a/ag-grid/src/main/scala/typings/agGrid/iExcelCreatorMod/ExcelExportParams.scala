package typings.agGrid.iExcelCreatorMod

import typings.agGrid.exportParamsMod.ExportParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExcelExportParams
  extends ExportParams[js.Array[js.Array[ExcelCell]]] {
  
  var sheetName: js.UndefOr[String] = js.native
  
  var suppressTextAsCDATA: js.UndefOr[Boolean] = js.native
}
object ExcelExportParams {
  
  @scala.inline
  def apply(): ExcelExportParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcelExportParams]
  }
  
  @scala.inline
  implicit class ExcelExportParamsOps[Self <: ExcelExportParams] (val x: Self) extends AnyVal {
    
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
    def setSheetName(value: String): Self = this.set("sheetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheetName: Self = this.set("sheetName", js.undefined)
    
    @scala.inline
    def setSuppressTextAsCDATA(value: Boolean): Self = this.set("suppressTextAsCDATA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressTextAsCDATA: Self = this.set("suppressTextAsCDATA", js.undefined)
  }
}
