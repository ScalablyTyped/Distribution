package typings.agGrid.iExcelCreatorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcelCell extends StObject {
  
  var data: ExcelData
  
  var mergeAcross: js.UndefOr[Double] = js.undefined
  
  var styleId: String
}
object ExcelCell {
  
  inline def apply(data: ExcelData, styleId: String): ExcelCell = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], styleId = styleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelCell]
  }
  
  extension [Self <: ExcelCell](x: Self) {
    
    inline def setData(value: ExcelData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMergeAcross(value: Double): Self = StObject.set(x, "mergeAcross", value.asInstanceOf[js.Any])
    
    inline def setMergeAcrossUndefined: Self = StObject.set(x, "mergeAcross", js.undefined)
    
    inline def setStyleId(value: String): Self = StObject.set(x, "styleId", value.asInstanceOf[js.Any])
  }
}
