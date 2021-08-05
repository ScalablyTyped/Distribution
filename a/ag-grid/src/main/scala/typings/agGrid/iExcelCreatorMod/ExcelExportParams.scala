package typings.agGrid.iExcelCreatorMod

import typings.agGrid.exportParamsMod.ExportParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcelExportParams
  extends StObject
     with ExportParams[js.Array[js.Array[ExcelCell]]] {
  
  var sheetName: js.UndefOr[String] = js.undefined
  
  var suppressTextAsCDATA: js.UndefOr[Boolean] = js.undefined
}
object ExcelExportParams {
  
  inline def apply(): ExcelExportParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcelExportParams]
  }
  
  extension [Self <: ExcelExportParams](x: Self) {
    
    inline def setSheetName(value: String): Self = StObject.set(x, "sheetName", value.asInstanceOf[js.Any])
    
    inline def setSheetNameUndefined: Self = StObject.set(x, "sheetName", js.undefined)
    
    inline def setSuppressTextAsCDATA(value: Boolean): Self = StObject.set(x, "suppressTextAsCDATA", value.asInstanceOf[js.Any])
    
    inline def setSuppressTextAsCDATAUndefined: Self = StObject.set(x, "suppressTextAsCDATA", js.undefined)
  }
}
