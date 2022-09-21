package typings.activexExcel.anon

import typings.activexExcel.Excel.PivotTable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueChangeStart extends StObject {
  
  val Sh: Any
  
  val TargetPivotTable: PivotTable
  
  val ValueChangeEnd: Double
  
  val ValueChangeStart: Double
}
object ValueChangeStart {
  
  inline def apply(Sh: Any, TargetPivotTable: PivotTable, ValueChangeEnd: Double, ValueChangeStart: Double): ValueChangeStart = {
    val __obj = js.Dynamic.literal(Sh = Sh.asInstanceOf[js.Any], TargetPivotTable = TargetPivotTable.asInstanceOf[js.Any], ValueChangeEnd = ValueChangeEnd.asInstanceOf[js.Any], ValueChangeStart = ValueChangeStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueChangeStart]
  }
  
  extension [Self <: ValueChangeStart](x: Self) {
    
    inline def setSh(value: Any): Self = StObject.set(x, "Sh", value.asInstanceOf[js.Any])
    
    inline def setTargetPivotTable(value: PivotTable): Self = StObject.set(x, "TargetPivotTable", value.asInstanceOf[js.Any])
    
    inline def setValueChangeEnd(value: Double): Self = StObject.set(x, "ValueChangeEnd", value.asInstanceOf[js.Any])
    
    inline def setValueChangeStart(value: Double): Self = StObject.set(x, "ValueChangeStart", value.asInstanceOf[js.Any])
  }
}
