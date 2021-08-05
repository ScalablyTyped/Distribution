package typings.activexExcel.anon

import typings.activexExcel.Excel.PivotTable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelTargetPivotTable extends StObject {
  
  var Cancel: Boolean
  
  val TargetPivotTable: PivotTable
  
  val ValueChangeEnd: Double
  
  val ValueChangeStart: Double
}
object CancelTargetPivotTable {
  
  inline def apply(Cancel: Boolean, TargetPivotTable: PivotTable, ValueChangeEnd: Double, ValueChangeStart: Double): CancelTargetPivotTable = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], TargetPivotTable = TargetPivotTable.asInstanceOf[js.Any], ValueChangeEnd = ValueChangeEnd.asInstanceOf[js.Any], ValueChangeStart = ValueChangeStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelTargetPivotTable]
  }
  
  extension [Self <: CancelTargetPivotTable](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    inline def setTargetPivotTable(value: PivotTable): Self = StObject.set(x, "TargetPivotTable", value.asInstanceOf[js.Any])
    
    inline def setValueChangeEnd(value: Double): Self = StObject.set(x, "ValueChangeEnd", value.asInstanceOf[js.Any])
    
    inline def setValueChangeStart(value: Double): Self = StObject.set(x, "ValueChangeStart", value.asInstanceOf[js.Any])
  }
}
