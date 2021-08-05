package typings.activexExcel.anon

import typings.activexExcel.Excel.Workbook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelWb extends StObject {
  
  var Cancel: Boolean
  
  val Wb: Workbook
}
object CancelWb {
  
  inline def apply(Cancel: Boolean, Wb: Workbook): CancelWb = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelWb]
  }
  
  extension [Self <: CancelWb](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    inline def setWb(value: Workbook): Self = StObject.set(x, "Wb", value.asInstanceOf[js.Any])
  }
}
