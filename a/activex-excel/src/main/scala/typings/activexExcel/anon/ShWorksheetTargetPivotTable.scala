package typings.activexExcel.anon

import typings.activexExcel.Excel.PivotTable
import typings.activexExcel.Excel.Worksheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShWorksheetTargetPivotTable extends StObject {
  
  val Sh: Worksheet = js.native
  
  val Target: PivotTable = js.native
}
object ShWorksheetTargetPivotTable {
  
  @scala.inline
  def apply(Sh: Worksheet, Target: PivotTable): ShWorksheetTargetPivotTable = {
    val __obj = js.Dynamic.literal(Sh = Sh.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShWorksheetTargetPivotTable]
  }
  
  @scala.inline
  implicit class ShWorksheetTargetPivotTableMutableBuilder[Self <: ShWorksheetTargetPivotTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSh(value: Worksheet): Self = StObject.set(x, "Sh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: PivotTable): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
  }
}
