package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Checked extends StObject {
  
  val Checked: js.Any
  
  val Command: js.Any
}
object Checked {
  
  @scala.inline
  def apply(Checked: js.Any, Command: js.Any): Checked = {
    val __obj = js.Dynamic.literal(Checked = Checked.asInstanceOf[js.Any], Command = Command.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checked]
  }
  
  @scala.inline
  implicit class CheckedMutableBuilder[Self <: Checked] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecked(value: js.Any): Self = StObject.set(x, "Checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommand(value: js.Any): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
  }
}
