package typings.activexExcel.anon

import typings.activexExcel.Excel.PivotTable
import typings.activexExcel.Excel.Workbook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetWb extends StObject {
  
  val Target: PivotTable = js.native
  
  val Wb: Workbook = js.native
}
object TargetWb {
  
  @scala.inline
  def apply(Target: PivotTable, Wb: Workbook): TargetWb = {
    val __obj = js.Dynamic.literal(Target = Target.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetWb]
  }
  
  @scala.inline
  implicit class TargetWbMutableBuilder[Self <: TargetWb] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget(value: PivotTable): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWb(value: Workbook): Self = StObject.set(x, "Wb", value.asInstanceOf[js.Any])
  }
}
