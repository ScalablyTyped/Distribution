package typings.agGrid.exportParamsMod

import typings.agGrid.columnMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseExportParams extends js.Object {
  
  var allColumns: js.UndefOr[Boolean] = js.native
  
  var columnGroups: js.UndefOr[Boolean] = js.native
  
  var columnKeys: js.UndefOr[js.Array[String | Column]] = js.native
  
  var fileName: js.UndefOr[String] = js.native
  
  var onlySelected: js.UndefOr[Boolean] = js.native
  
  var onlySelectedAllPages: js.UndefOr[Boolean] = js.native
  
  var processCellCallback: js.UndefOr[js.Function1[/* params */ ProcessCellForExportParams, String]] = js.native
  
  var processHeaderCallback: js.UndefOr[js.Function1[/* params */ ProcessHeaderForExportParams, String]] = js.native
  
  var shouldRowBeSkipped: js.UndefOr[js.Function1[/* params */ ShouldRowBeSkippedParams, Boolean]] = js.native
  
  var skipFooters: js.UndefOr[Boolean] = js.native
  
  var skipGroups: js.UndefOr[Boolean] = js.native
  
  var skipHeader: js.UndefOr[Boolean] = js.native
  
  var skipPinnedBottom: js.UndefOr[Boolean] = js.native
  
  var skipPinnedTop: js.UndefOr[Boolean] = js.native
  
  var suppressQuotes: js.UndefOr[Boolean] = js.native
}
object BaseExportParams {
  
  @scala.inline
  def apply(): BaseExportParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseExportParams]
  }
  
  @scala.inline
  implicit class BaseExportParamsOps[Self <: BaseExportParams] (val x: Self) extends AnyVal {
    
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
    def setAllColumns(value: Boolean): Self = this.set("allColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllColumns: Self = this.set("allColumns", js.undefined)
    
    @scala.inline
    def setColumnGroups(value: Boolean): Self = this.set("columnGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnGroups: Self = this.set("columnGroups", js.undefined)
    
    @scala.inline
    def setColumnKeysVarargs(value: (String | Column)*): Self = this.set("columnKeys", js.Array(value :_*))
    
    @scala.inline
    def setColumnKeys(value: js.Array[String | Column]): Self = this.set("columnKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnKeys: Self = this.set("columnKeys", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    
    @scala.inline
    def setOnlySelected(value: Boolean): Self = this.set("onlySelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlySelected: Self = this.set("onlySelected", js.undefined)
    
    @scala.inline
    def setOnlySelectedAllPages(value: Boolean): Self = this.set("onlySelectedAllPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlySelectedAllPages: Self = this.set("onlySelectedAllPages", js.undefined)
    
    @scala.inline
    def setProcessCellCallback(value: /* params */ ProcessCellForExportParams => String): Self = this.set("processCellCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteProcessCellCallback: Self = this.set("processCellCallback", js.undefined)
    
    @scala.inline
    def setProcessHeaderCallback(value: /* params */ ProcessHeaderForExportParams => String): Self = this.set("processHeaderCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteProcessHeaderCallback: Self = this.set("processHeaderCallback", js.undefined)
    
    @scala.inline
    def setShouldRowBeSkipped(value: /* params */ ShouldRowBeSkippedParams => Boolean): Self = this.set("shouldRowBeSkipped", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteShouldRowBeSkipped: Self = this.set("shouldRowBeSkipped", js.undefined)
    
    @scala.inline
    def setSkipFooters(value: Boolean): Self = this.set("skipFooters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipFooters: Self = this.set("skipFooters", js.undefined)
    
    @scala.inline
    def setSkipGroups(value: Boolean): Self = this.set("skipGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipGroups: Self = this.set("skipGroups", js.undefined)
    
    @scala.inline
    def setSkipHeader(value: Boolean): Self = this.set("skipHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipHeader: Self = this.set("skipHeader", js.undefined)
    
    @scala.inline
    def setSkipPinnedBottom(value: Boolean): Self = this.set("skipPinnedBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipPinnedBottom: Self = this.set("skipPinnedBottom", js.undefined)
    
    @scala.inline
    def setSkipPinnedTop(value: Boolean): Self = this.set("skipPinnedTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipPinnedTop: Self = this.set("skipPinnedTop", js.undefined)
    
    @scala.inline
    def setSuppressQuotes(value: Boolean): Self = this.set("suppressQuotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressQuotes: Self = this.set("suppressQuotes", js.undefined)
  }
}
