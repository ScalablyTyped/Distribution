package typings.activexExcel.anon

import typings.activexExcel.Excel.Window
import typings.activexExcel.Excel.Workbook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Wn extends StObject {
  
  val Wb: Workbook
  
  val Wn: Window
}
object Wn {
  
  @scala.inline
  def apply(Wb: Workbook, Wn: Window): Wn = {
    val __obj = js.Dynamic.literal(Wb = Wb.asInstanceOf[js.Any], Wn = Wn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wn]
  }
  
  @scala.inline
  implicit class WnMutableBuilder[Self <: Wn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWb(value: Workbook): Self = StObject.set(x, "Wb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWn(value: Window): Self = StObject.set(x, "Wn", value.asInstanceOf[js.Any])
  }
}
