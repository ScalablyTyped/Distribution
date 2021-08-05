package typings.activexExcel.anon

import typings.activexExcel.Excel.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WnWindow extends StObject {
  
  val Wn: Window
}
object WnWindow {
  
  inline def apply(Wn: Window): WnWindow = {
    val __obj = js.Dynamic.literal(Wn = Wn.asInstanceOf[js.Any])
    __obj.asInstanceOf[WnWindow]
  }
  
  extension [Self <: WnWindow](x: Self) {
    
    inline def setWn(value: Window): Self = StObject.set(x, "Wn", value.asInstanceOf[js.Any])
  }
}
