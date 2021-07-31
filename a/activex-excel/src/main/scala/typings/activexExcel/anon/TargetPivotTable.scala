package typings.activexExcel.anon

import typings.activexExcel.Excel.PivotTable
import typings.activexExcel.Excel.Range
import typings.activexExcel.Excel.Worksheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetPivotTable extends StObject {
  
  val Sh: Worksheet
  
  val TargetPivotTable: PivotTable
  
  def TargetRange(Address: String): Range
  def TargetRange(RowIndex: Double): Range
  def TargetRange(RowIndex: Double, ColumnIndex: Double): Range
  @JSName("TargetRange")
  val TargetRange_Original: Range
}
object TargetPivotTable {
  
  @scala.inline
  def apply(Sh: Worksheet, TargetPivotTable: PivotTable, TargetRange: Range): TargetPivotTable = {
    val __obj = js.Dynamic.literal(Sh = Sh.asInstanceOf[js.Any], TargetPivotTable = TargetPivotTable.asInstanceOf[js.Any], TargetRange = TargetRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetPivotTable]
  }
  
  @scala.inline
  implicit class TargetPivotTableMutableBuilder[Self <: TargetPivotTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSh(value: Worksheet): Self = StObject.set(x, "Sh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetPivotTable(value: PivotTable): Self = StObject.set(x, "TargetPivotTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetRange(value: Range): Self = StObject.set(x, "TargetRange", value.asInstanceOf[js.Any])
  }
}
