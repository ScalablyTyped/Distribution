package typings.activexExcel.anon

import typings.activexExcel.Excel.PivotTable
import typings.activexExcel.Excel.Worksheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueChangeEnd extends StObject {
  
  var Cancel: Boolean = js.native
  
  val Sh: Worksheet = js.native
  
  val TargetPivotTable: PivotTable = js.native
  
  val ValueChangeEnd: Double = js.native
  
  val ValueChangeStart: Double = js.native
}
object ValueChangeEnd {
  
  @scala.inline
  def apply(
    Cancel: Boolean,
    Sh: Worksheet,
    TargetPivotTable: PivotTable,
    ValueChangeEnd: Double,
    ValueChangeStart: Double
  ): ValueChangeEnd = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Sh = Sh.asInstanceOf[js.Any], TargetPivotTable = TargetPivotTable.asInstanceOf[js.Any], ValueChangeEnd = ValueChangeEnd.asInstanceOf[js.Any], ValueChangeStart = ValueChangeStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueChangeEnd]
  }
  
  @scala.inline
  implicit class ValueChangeEndMutableBuilder[Self <: ValueChangeEnd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSh(value: Worksheet): Self = StObject.set(x, "Sh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetPivotTable(value: PivotTable): Self = StObject.set(x, "TargetPivotTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueChangeEnd(value: Double): Self = StObject.set(x, "ValueChangeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueChangeStart(value: Double): Self = StObject.set(x, "ValueChangeStart", value.asInstanceOf[js.Any])
  }
}
