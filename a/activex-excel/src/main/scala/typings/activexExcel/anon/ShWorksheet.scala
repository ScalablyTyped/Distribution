package typings.activexExcel.anon

import typings.activexExcel.Excel.Hyperlink
import typings.activexExcel.Excel.Worksheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShWorksheet extends StObject {
  
  val Sh: Worksheet = js.native
  
  val Target: Hyperlink = js.native
}
object ShWorksheet {
  
  @scala.inline
  def apply(Sh: Worksheet, Target: Hyperlink): ShWorksheet = {
    val __obj = js.Dynamic.literal(Sh = Sh.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShWorksheet]
  }
  
  @scala.inline
  implicit class ShWorksheetMutableBuilder[Self <: ShWorksheet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSh(value: Worksheet): Self = StObject.set(x, "Sh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Hyperlink): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
  }
}
