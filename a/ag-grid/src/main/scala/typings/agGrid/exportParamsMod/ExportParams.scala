package typings.agGrid.exportParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportParams[T] extends BaseExportParams {
  
  var customFooter: js.UndefOr[T] = js.native
  
  var customHeader: js.UndefOr[T] = js.native
}
object ExportParams {
  
  @scala.inline
  def apply[T](): ExportParams[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportParams[T]]
  }
  
  @scala.inline
  implicit class ExportParamsOps[Self <: ExportParams[_], T] (val x: Self with ExportParams[T]) extends AnyVal {
    
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
    def setCustomFooter(value: T): Self = this.set("customFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomFooter: Self = this.set("customFooter", js.undefined)
    
    @scala.inline
    def setCustomHeader(value: T): Self = this.set("customHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomHeader: Self = this.set("customHeader", js.undefined)
  }
}
