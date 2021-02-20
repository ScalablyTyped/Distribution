package typings.activexExcel.anon

import typings.activexExcel.Excel.PivotTable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetPivotTableValueChangeEnd extends StObject {
  
  val TargetPivotTable: PivotTable = js.native
  
  val ValueChangeEnd: Double = js.native
  
  val ValueChangeStart: Double = js.native
}
object TargetPivotTableValueChangeEnd {
  
  @scala.inline
  def apply(TargetPivotTable: PivotTable, ValueChangeEnd: Double, ValueChangeStart: Double): TargetPivotTableValueChangeEnd = {
    val __obj = js.Dynamic.literal(TargetPivotTable = TargetPivotTable.asInstanceOf[js.Any], ValueChangeEnd = ValueChangeEnd.asInstanceOf[js.Any], ValueChangeStart = ValueChangeStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetPivotTableValueChangeEnd]
  }
  
  @scala.inline
  implicit class TargetPivotTableValueChangeEndMutableBuilder[Self <: TargetPivotTableValueChangeEnd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetPivotTable(value: PivotTable): Self = StObject.set(x, "TargetPivotTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueChangeEnd(value: Double): Self = StObject.set(x, "ValueChangeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueChangeStart(value: Double): Self = StObject.set(x, "ValueChangeStart", value.asInstanceOf[js.Any])
  }
}
