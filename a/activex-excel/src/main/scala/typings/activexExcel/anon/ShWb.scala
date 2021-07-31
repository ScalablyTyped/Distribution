package typings.activexExcel.anon

import typings.activexExcel.Excel.Workbook
import typings.activexExcel.Excel.Worksheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShWb extends StObject {
  
  val Sh: Worksheet
  
  val Wb: Workbook
}
object ShWb {
  
  @scala.inline
  def apply(Sh: Worksheet, Wb: Workbook): ShWb = {
    val __obj = js.Dynamic.literal(Sh = Sh.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShWb]
  }
  
  @scala.inline
  implicit class ShWbMutableBuilder[Self <: ShWb] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSh(value: Worksheet): Self = StObject.set(x, "Sh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWb(value: Workbook): Self = StObject.set(x, "Wb", value.asInstanceOf[js.Any])
  }
}
