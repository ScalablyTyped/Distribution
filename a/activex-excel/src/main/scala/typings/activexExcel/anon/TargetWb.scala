package typings.activexExcel.anon

import typings.activexExcel.Excel.PivotTable
import typings.activexExcel.Excel.Workbook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetWb extends StObject {
  
  val Target: PivotTable
  
  val Wb: Workbook
}
object TargetWb {
  
  inline def apply(Target: PivotTable, Wb: Workbook): TargetWb = {
    val __obj = js.Dynamic.literal(Target = Target.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetWb]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetWb] (val x: Self) extends AnyVal {
    
    inline def setTarget(value: PivotTable): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    inline def setWb(value: Workbook): Self = StObject.set(x, "Wb", value.asInstanceOf[js.Any])
  }
}
