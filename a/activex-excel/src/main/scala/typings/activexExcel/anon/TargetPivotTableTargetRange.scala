package typings.activexExcel.anon

import typings.activexExcel.Excel.PivotTable
import typings.activexExcel.Excel.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetPivotTableTargetRange extends StObject {
  
  val TargetPivotTable: PivotTable
  
  def TargetRange(Address: String): Range
  def TargetRange(RowIndex: Double): Range
  def TargetRange(RowIndex: Double, ColumnIndex: Double): Range
  @JSName("TargetRange")
  val TargetRange_Original: Range
}
object TargetPivotTableTargetRange {
  
  inline def apply(TargetPivotTable: PivotTable, TargetRange: Range): TargetPivotTableTargetRange = {
    val __obj = js.Dynamic.literal(TargetPivotTable = TargetPivotTable.asInstanceOf[js.Any], TargetRange = TargetRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetPivotTableTargetRange]
  }
  
  extension [Self <: TargetPivotTableTargetRange](x: Self) {
    
    inline def setTargetPivotTable(value: PivotTable): Self = StObject.set(x, "TargetPivotTable", value.asInstanceOf[js.Any])
    
    inline def setTargetRange(value: Range): Self = StObject.set(x, "TargetRange", value.asInstanceOf[js.Any])
  }
}
