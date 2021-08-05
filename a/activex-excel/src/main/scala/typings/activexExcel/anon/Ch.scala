package typings.activexExcel.anon

import typings.activexExcel.Excel.Chart
import typings.activexExcel.Excel.Workbook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ch extends StObject {
  
  val Ch: Chart
  
  val Wb: Workbook
}
object Ch {
  
  inline def apply(Ch: Chart, Wb: Workbook): Ch = {
    val __obj = js.Dynamic.literal(Ch = Ch.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ch]
  }
  
  extension [Self <: Ch](x: Self) {
    
    inline def setCh(value: Chart): Self = StObject.set(x, "Ch", value.asInstanceOf[js.Any])
    
    inline def setWb(value: Workbook): Self = StObject.set(x, "Wb", value.asInstanceOf[js.Any])
  }
}
