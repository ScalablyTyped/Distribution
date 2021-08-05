package typings.activexExcel.anon

import typings.activexExcel.Excel.PivotTable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetPivotTableValueChangeEnd extends StObject {
  
  val TargetPivotTable: PivotTable
  
  val ValueChangeEnd: Double
  
  val ValueChangeStart: Double
}
object TargetPivotTableValueChangeEnd {
  
  inline def apply(TargetPivotTable: PivotTable, ValueChangeEnd: Double, ValueChangeStart: Double): TargetPivotTableValueChangeEnd = {
    val __obj = js.Dynamic.literal(TargetPivotTable = TargetPivotTable.asInstanceOf[js.Any], ValueChangeEnd = ValueChangeEnd.asInstanceOf[js.Any], ValueChangeStart = ValueChangeStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetPivotTableValueChangeEnd]
  }
  
  extension [Self <: TargetPivotTableValueChangeEnd](x: Self) {
    
    inline def setTargetPivotTable(value: PivotTable): Self = StObject.set(x, "TargetPivotTable", value.asInstanceOf[js.Any])
    
    inline def setValueChangeEnd(value: Double): Self = StObject.set(x, "ValueChangeEnd", value.asInstanceOf[js.Any])
    
    inline def setValueChangeStart(value: Double): Self = StObject.set(x, "ValueChangeStart", value.asInstanceOf[js.Any])
  }
}
