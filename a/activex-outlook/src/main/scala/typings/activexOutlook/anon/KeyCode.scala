package typings.activexOutlook.anon

import typings.activexOutlook.Outlook.OlShiftState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyCode extends StObject {
  
  val KeyCode: Double = js.native
  
  val Shift: OlShiftState = js.native
}
object KeyCode {
  
  @scala.inline
  def apply(KeyCode: Double, Shift: OlShiftState): KeyCode = {
    val __obj = js.Dynamic.literal(KeyCode = KeyCode.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyCode]
  }
  
  @scala.inline
  implicit class KeyCodeMutableBuilder[Self <: KeyCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyCode(value: Double): Self = StObject.set(x, "KeyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShift(value: OlShiftState): Self = StObject.set(x, "Shift", value.asInstanceOf[js.Any])
  }
}
