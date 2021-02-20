package typings.agGrid.iExcelCreatorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExcelCell extends StObject {
  
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
  implicit class ExcelCellMutableBuilder[Self <: ExcelCell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: ExcelData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeAcross(value: Double): Self = StObject.set(x, "mergeAcross", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeAcrossUndefined: Self = StObject.set(x, "mergeAcross", js.undefined)
    
    @scala.inline
    def setStyleId(value: String): Self = StObject.set(x, "styleId", value.asInstanceOf[js.Any])
  }
}
