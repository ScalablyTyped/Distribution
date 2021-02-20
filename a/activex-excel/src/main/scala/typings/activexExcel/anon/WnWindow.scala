package typings.activexExcel.anon

import typings.activexExcel.Excel.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WnWindow extends StObject {
  
  val Wn: Window = js.native
}
object WnWindow {
  
  @scala.inline
  def apply(Wn: Window): WnWindow = {
    val __obj = js.Dynamic.literal(Wn = Wn.asInstanceOf[js.Any])
    __obj.asInstanceOf[WnWindow]
  }
  
  @scala.inline
  implicit class WnWindowMutableBuilder[Self <: WnWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWn(value: Window): Self = StObject.set(x, "Wn", value.asInstanceOf[js.Any])
  }
}
