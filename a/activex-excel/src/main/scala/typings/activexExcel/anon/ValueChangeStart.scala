package typings.activexExcel.anon

import typings.activexExcel.Excel.PivotTable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueChangeStart extends StObject {
  
  val Sh: js.Any = js.native
  
  val TargetPivotTable: PivotTable = js.native
  
  val ValueChangeEnd: Double = js.native
  
  val ValueChangeStart: Double = js.native
}
object ValueChangeStart {
  
  @scala.inline
  def apply(Sh: js.Any, TargetPivotTable: PivotTable, ValueChangeEnd: Double, ValueChangeStart: Double): ValueChangeStart = {
    val __obj = js.Dynamic.literal(Sh = Sh.asInstanceOf[js.Any], TargetPivotTable = TargetPivotTable.asInstanceOf[js.Any], ValueChangeEnd = ValueChangeEnd.asInstanceOf[js.Any], ValueChangeStart = ValueChangeStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueChangeStart]
  }
  
  @scala.inline
  implicit class ValueChangeStartMutableBuilder[Self <: ValueChangeStart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSh(value: js.Any): Self = StObject.set(x, "Sh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetPivotTable(value: PivotTable): Self = StObject.set(x, "TargetPivotTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueChangeEnd(value: Double): Self = StObject.set(x, "ValueChangeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueChangeStart(value: Double): Self = StObject.set(x, "ValueChangeStart", value.asInstanceOf[js.Any])
  }
}
