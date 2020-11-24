package typings.activexExcel.anon

import typings.activexExcel.Excel.PivotTable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueChangeStart extends js.Object {
  
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
  implicit class ValueChangeStartOps[Self <: ValueChangeStart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSh(value: js.Any): Self = this.set("Sh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetPivotTable(value: PivotTable): Self = this.set("TargetPivotTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueChangeEnd(value: Double): Self = this.set("ValueChangeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueChangeStart(value: Double): Self = this.set("ValueChangeStart", value.asInstanceOf[js.Any])
  }
}
