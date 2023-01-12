package typings.activexExcel.anon

import typings.activexExcel.Excel.Hyperlink
import typings.activexExcel.Excel.Worksheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShWorksheet extends StObject {
  
  val Sh: Worksheet
  
  val Target: Hyperlink
}
object ShWorksheet {
  
  inline def apply(Sh: Worksheet, Target: Hyperlink): ShWorksheet = {
    val __obj = js.Dynamic.literal(Sh = Sh.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShWorksheet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShWorksheet] (val x: Self) extends AnyVal {
    
    inline def setSh(value: Worksheet): Self = StObject.set(x, "Sh", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Hyperlink): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
  }
}
