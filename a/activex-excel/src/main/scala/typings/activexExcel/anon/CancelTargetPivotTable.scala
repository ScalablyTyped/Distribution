package typings.activexExcel.anon

import typings.activexExcel.Excel.PivotTable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelTargetPivotTable extends StObject {
  
  var Cancel: Boolean = js.native
  
  val TargetPivotTable: PivotTable = js.native
  
  val ValueChangeEnd: Double = js.native
  
  val ValueChangeStart: Double = js.native
}
object CancelTargetPivotTable {
  
  @scala.inline
  def apply(Cancel: Boolean, TargetPivotTable: PivotTable, ValueChangeEnd: Double, ValueChangeStart: Double): CancelTargetPivotTable = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], TargetPivotTable = TargetPivotTable.asInstanceOf[js.Any], ValueChangeEnd = ValueChangeEnd.asInstanceOf[js.Any], ValueChangeStart = ValueChangeStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelTargetPivotTable]
  }
  
  @scala.inline
  implicit class CancelTargetPivotTableMutableBuilder[Self <: CancelTargetPivotTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetPivotTable(value: PivotTable): Self = StObject.set(x, "TargetPivotTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueChangeEnd(value: Double): Self = StObject.set(x, "ValueChangeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueChangeStart(value: Double): Self = StObject.set(x, "ValueChangeStart", value.asInstanceOf[js.Any])
  }
}
