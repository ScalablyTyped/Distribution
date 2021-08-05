package typings.activexExcel.anon

import typings.activexExcel.Excel.Workbook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Wb extends StObject {
  
  val Wb: Workbook
}
object Wb {
  
  inline def apply(Wb: Workbook): Wb = {
    val __obj = js.Dynamic.literal(Wb = Wb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wb]
  }
  
  extension [Self <: Wb](x: Self) {
    
    inline def setWb(value: Workbook): Self = StObject.set(x, "Wb", value.asInstanceOf[js.Any])
  }
}
